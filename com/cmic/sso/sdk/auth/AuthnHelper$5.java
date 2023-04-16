package com.cmic.sso.sdk.auth.AuthnHelper$5;
import com.cmic.sso.sdk.auth.b;
import com.cmic.sso.sdk.auth.AuthnHelper;
import com.cmic.sso.sdk.auth.AuthnHelper$a;
import java.lang.Object;
import java.lang.String;
import com.cmic.sso.sdk.a;
import org.json.JSONObject;
import android.os.Handler;
import java.lang.Runnable;

public class AuthnHelper$5 implements b	// class@000f29
{
    public final AuthnHelper$a a;
    public final AuthnHelper b;

    public void AuthnHelper$5(AuthnHelper p0,AuthnHelper$a p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(String p0,String p1,a p2,JSONObject p3){
       AuthnHelper.c(this.b).removeCallbacks(this.a);
       this.b.callBackResult(p0, p1, p2, p3);
    }
}
