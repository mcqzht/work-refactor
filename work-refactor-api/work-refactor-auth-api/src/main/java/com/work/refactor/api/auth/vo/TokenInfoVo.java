package com.work.refactor.api.auth.vo;

/**
 * TokenInfoVo
 *
 * @author zhoug
 * @date 2024/12/11 23:36
 */


public class TokenInfoVo {
    /** token */
    private String accessToken;
    /** 刷新token */
    private String refreshToken;
    /** 有效期 */
    private long expiresIn;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public long getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(long expiresIn) {
        this.expiresIn = expiresIn;
    }

    @Override
    public String toString() {
        return "TokenInfoVo{" +
                "accessToken='" + accessToken + '\'' +
                ", refreshToken='" + refreshToken + '\'' +
                ", expiresIn=" + expiresIn +
                '}';
    }
}
