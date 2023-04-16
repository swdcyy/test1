package com.cmic.sso.sdk.auth.AuthnHelper$6;
import java.lang.Runnable;
import com.cmic.sso.sdk.auth.AuthnHelper;
import com.cmic.sso.sdk.auth.TokenListener;
import org.json.JSONObject;
import java.lang.Object;

public class AuthnHelper$6 implements Runnable	// class@000f2a
{
    public final TokenListener a;
    public final JSONObject b;
    public final AuthnHelper c;

    public void AuthnHelper$6(AuthnHelper p0,TokenListener p1,JSONObject p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void run(){
       this.a.onGetTokenComplete(this.b);
    }
}
