package com.cmic.sso.sdk.auth.AuthnHelper$2;
import com.cmic.sso.sdk.e.o$a;
import com.cmic.sso.sdk.auth.AuthnHelper;
import android.content.Context;
import com.cmic.sso.sdk.a;
import java.lang.String;
import com.cmic.sso.sdk.auth.TokenListener;

public class AuthnHelper$2 extends o$a	// class@000f26
{
    public final a a;
    public final String b;
    public final String c;
    public final TokenListener d;
    public final AuthnHelper e;

    public void AuthnHelper$2(AuthnHelper p0,Context p1,a p2,a p3,String p4,String p5,TokenListener p6){
       this.e = p0;
       this.a = p3;
       this.b = p4;
       this.c = p5;
       this.d = p6;
       super(p1, p2);
    }
    public void a(){
       if (AuthnHelper.a(this.e, this.a, this.b, this.c, "loginAuth", 1, this.d)) {
          AuthnHelper.a(this.e, this.a);
       }
       return;
    }
}
