package com.kuaishou.common.encryption.model.WechatBindParam;
import com.kuaishou.common.encryption.model.BaseBindParam;
import com.kuaishou.common.encryption.model.WechatBindParam$a;
import java.lang.String;

public class WechatBindParam extends BaseBindParam	// class@0016c5
{
    public String accessToken;
    public long expiresInSeconds;
    public String refreshToken;

    public void WechatBindParam(){
       super();
    }
    public static WechatBindParam$a newBuilder(){
       return new WechatBindParam$a();
    }
    public String getAccessToken(){
       return this.accessToken;
    }
    public long getExpiresInSeconds(){
       return this.expiresInSeconds;
    }
    public String getRefreshToken(){
       return this.refreshToken;
    }
}
