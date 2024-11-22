package com.smps.service;

import java.util.List;

import com.smps.entity.PlatformToken;

public interface PlatformTokenService {
    PlatformToken createToken(PlatformToken platformToken);
    
    PlatformToken getTokenById(Long tokenId);
    
    List<PlatformToken> getTokensByUser(Long userId);
    
    PlatformToken updateToken(Long tokenId, String newToken, Long validityInDays);
    
    void deleteToken(Long tokenId);
}
