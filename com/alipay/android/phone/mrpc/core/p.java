package com.alipay.android.phone.mrpc.core.p;
import com.alipay.android.phone.mrpc.core.u;
import com.alipay.android.phone.mrpc.core.HttpUrlHeader;
import java.lang.String;

public final class p extends u	// class@000e56
{
    public int c;
    public String d;
    public long e;
    public long f;
    public String g;
    public HttpUrlHeader h;

    public void p(HttpUrlHeader p0,int p1,String p2,byte[] p3){
       super();
       this.h = p0;
       this.c = p1;
       this.d = p2;
       this.a = p3;
    }
    public final HttpUrlHeader a(){
       return this.h;
    }
    public final void a(long p0){
       this.e = p0;
    }
    public final void a(String p0){
       this.g = p0;
    }
    public final void b(long p0){
       this.f = p0;
    }
}
