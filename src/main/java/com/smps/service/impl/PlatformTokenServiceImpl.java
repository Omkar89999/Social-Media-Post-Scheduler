package com.smps.service.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smps.entity.PlatformToken;
import com.smps.entity.User;
import com.smps.repo.PlatformTokenRepo;
import com.smps.repo.UserRepo;
import com.smps.service.PlatformTokenService;

@Service
public class PlatformTokenServiceImpl implements PlatformTokenService{

	@Autowired
    private PlatformTokenRepo platformTokenRepo;

    @Autowired
    private UserRepo userRepo;

    @Override
    public PlatformToken createToken(PlatformToken platformToken) {
      
        Long userId = platformToken.getUser().getId();


        User user = userRepo.findById(userId)
                .orElseThrow();

        
        platformToken.setExpiresAt(LocalDateTime.now().plusDays(30)); 
        platformToken.setCreatedAt(LocalDateTime.now());
        platformToken.setUser(user);

        return platformTokenRepo.save(platformToken);
    }


	@Override
	public PlatformToken getTokenById(Long tokenId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PlatformToken> getTokensByUser(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PlatformToken updateToken(Long tokenId, String newToken, Long validityInDays) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteToken(Long tokenId) {
		// TODO Auto-generated method stub
		
	}
}

