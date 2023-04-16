package com.meizu.cloud.pushsdk.d.c.b;
import com.meizu.cloud.pushsdk.d.c.a;
import com.meizu.cloud.pushsdk.d.c.b$a;
import com.meizu.cloud.pushsdk.d.c.a$a;
import java.lang.String;
import com.meizu.cloud.pushsdk.d.c.b$b;
import com.meizu.cloud.pushsdk.d.c.b$1;
import com.meizu.cloud.pushsdk.d.a.c;
import java.lang.Integer;
import java.lang.Object;

public class b extends a	// class@001518
{
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final int i;

    public void b(b$a p0){
       super(p0);
       this.b = b$a.a(p0);
       this.c = b$a.b(p0);
       this.a = b$a.c(p0);
       this.d = b$a.d(p0);
       this.e = b$a.e(p0);
       this.f = b$a.f(p0);
       this.g = b$a.g(p0);
       this.h = b$a.h(p0);
       this.i = b$a.i(p0);
    }
    public static b$a d(){
       return new b$b(null);
    }
    public c e(){
       c uoc = new c();
       uoc.a("en", this.a);
       uoc.a("ti", this.b);
       uoc.a("di", this.c);
       uoc.a("pv", this.d);
       uoc.a("pn", this.e);
       uoc.a("si", this.f);
       uoc.a("ms", this.g);
       uoc.a("ect", this.h);
       uoc.a("br", Integer.valueOf(this.i));
       return this.a(uoc);
    }
}
