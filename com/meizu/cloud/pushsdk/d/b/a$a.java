package com.meizu.cloud.pushsdk.d.b.a$a;
import java.lang.String;
import android.content.Context;
import java.lang.Class;
import java.lang.Object;
import com.meizu.cloud.pushsdk.d.b.d;
import com.meizu.cloud.pushsdk.d.b.b;
import com.meizu.cloud.pushsdk.d.b.h;
import java.util.concurrent.TimeUnit;
import com.meizu.cloud.pushsdk.c.c.e;
import com.meizu.cloud.pushsdk.c.c.a;
import java.lang.StringBuilder;
import com.meizu.cloud.pushsdk.d.f.c;
import com.meizu.cloud.pushsdk.d.b.f;

public class a$a	// class@001505
{
    public final String a;
    public final Context b;
    public f c;
    public d d;
    public b e;
    public h f;
    public int g;
    public int h;
    public int i;
    public long j;
    public long k;
    public TimeUnit l;
    public SSLSocketFactory m;
    public HostnameVerifier n;
    public a o;

    public void a$a(String p0,Context p1,Class p2){
       super();
       this.c = null;
       this.d = d.b;
       this.e = b.a;
       this.f = h.b;
       this.g = 5;
       this.h = 250;
       this.i = 5;
       this.j = 0x9c40;
       this.k = 0x9c40;
       this.l = TimeUnit.SECONDS;
       this.o = new e();
       this.a = p0;
       this.b = p1;
    }
    public a$a a(int p0){
       this.g = p0;
       return this;
    }
    public a$a a(a p0){
       if (p0 != null) {
          this.o = p0;
          Object[] objArray = new Object[0];
          c.c(a$a.class.getSimpleName(), "set new call "+p0, objArray);
       }
       return this;
    }
    public a$a a(b p0){
       this.e = p0;
       return this;
    }
    public a$a a(f p0){
       this.c = p0;
       return this;
    }
    public a$a b(int p0){
       this.h = p0;
       return this;
    }
    public a$a c(int p0){
       this.i = p0;
       return this;
    }
}
