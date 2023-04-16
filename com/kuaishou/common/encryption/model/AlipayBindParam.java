package com.kuaishou.common.encryption.model.AlipayBindParam;
import com.kuaishou.common.encryption.model.BaseBindParam;
import com.kuaishou.common.encryption.model.AlipayBindParam$a;
import java.lang.String;

public class AlipayBindParam extends BaseBindParam	// class@0016aa
{
    public String authCode;
    public String userId;

    public void AlipayBindParam(){
       super();
    }
    public static AlipayBindParam$a newBuilder(){
       return new AlipayBindParam$a();
    }
    public String getAuthCode(){
       return this.authCode;
    }
    public String getUserId(){
       return this.userId;
    }
    public void setAuthCode(String p0){
       this.authCode = p0;
    }
    public void setUserId(String p0){
       this.userId = p0;
    }
}
