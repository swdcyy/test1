package com.meizu.cloud.pushsdk.d.e.a$a;
import com.meizu.cloud.pushsdk.d.b.a;
import java.lang.String;
import android.content.Context;
import java.lang.Class;
import java.lang.Object;
import com.meizu.cloud.pushsdk.d.f.b;
import java.util.concurrent.TimeUnit;
import com.meizu.cloud.pushsdk.d.e.c;
import java.lang.Boolean;

public class a$a	// class@00151d
{
    public final a a;
    public final String b;
    public final String c;
    public final Context d;
    public c e;
    public boolean f;
    public b g;
    public boolean h;
    public long i;
    public long j;
    public long k;
    public int l;
    public TimeUnit m;

    public void a$a(a p0,String p1,String p2,Context p3,Class p4){
       super();
       this.e = null;
       this.f = false;
       this.g = b.a;
       this.h = false;
       this.i = 600;
       this.j = 300;
       this.k = 15;
       this.l = 10;
       this.m = TimeUnit.SECONDS;
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public a$a a(int p0){
       this.l = p0;
       return this;
    }
    public a$a a(c p0){
       this.e = p0;
       return this;
    }
    public a$a a(b p0){
       this.g = p0;
       return this;
    }
    public a$a a(Boolean p0){
       this.f = p0.booleanValue();
       return this;
    }
}
