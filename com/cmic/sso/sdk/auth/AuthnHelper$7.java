package com.cmic.sso.sdk.auth.AuthnHelper$7;
import com.cmic.sso.sdk.e.o$a;
import com.cmic.sso.sdk.auth.AuthnHelper;
import java.lang.String;
import android.content.Context;
import com.cmic.sso.sdk.a;
import java.lang.Object;
import android.os.SystemClock;
import com.cmic.sso.sdk.d.b;

public class AuthnHelper$7 extends o$a	// class@000f2b
{
    public final String a;
    public final Context b;
    public final a c;
    public final AuthnHelper d;

    public void AuthnHelper$7(AuthnHelper p0,String p1,Context p2,a p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void a(){
       if (("200023").equals(this.a)) {
          SystemClock.sleep(8000);
       }
       new b().a(this.b, this.a, this.c);
       return;
    }
}
