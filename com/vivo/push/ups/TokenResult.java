package com.vivo.push.ups.TokenResult;
import com.vivo.push.ups.CodeResult;
import java.lang.String;

public class TokenResult extends CodeResult	// class@00109f
{
    public String token;

    public void TokenResult(int p0,String p1){
       super(p0);
       this.token = p1;
    }
    public String getToken(){
       return this.token;
    }
}
