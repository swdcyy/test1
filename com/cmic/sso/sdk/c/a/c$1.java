package com.cmic.sso.sdk.c.a.c$1;
import com.cmic.sso.sdk.c.d.c;
import com.cmic.sso.sdk.c.a.c;
import com.cmic.sso.sdk.c.c.c;
import com.cmic.sso.sdk.a;
import java.lang.Object;
import com.cmic.sso.sdk.c.d.a;
import java.lang.StringBuilder;
import java.lang.String;
import com.cmic.sso.sdk.e.c;
import com.cmic.sso.sdk.c.d.b;
import com.cmic.sso.sdk.c.a;
import java.lang.CharSequence;
import android.text.TextUtils;

public class c$1 implements c	// class@000f3c
{
    public final c a;
    public final a b;
    public final c c;
    public final c d;

    public void c$1(c p0,c p1,a p2,c p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void a(a p0){
       if (this.a.j()) {
          c.a("RetryAndRedirectInterceptor", "retry: "+this.a.a());
          this.d.b(this.a, this.c, this.b);
       }else {
          this.c.a(p0);
       }
       return;
    }
    public void a(b p0){
       if (p0.d()) {
          this.d.b(c.a(this.d).a(this.a, p0, this.b), this.c, this.b);
       }else if(!TextUtils.isEmpty(c.a(this.d).a())){
          this.d.b(c.a(this.d).b(this.a, p0, this.b), this.c, this.b);
       }else {
          this.c.a(p0);
       }
       return;
    }
}
