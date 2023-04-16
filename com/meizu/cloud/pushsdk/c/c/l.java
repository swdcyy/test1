package com.meizu.cloud.pushsdk.c.c.l;
import java.io.Closeable;
import java.lang.Object;
import com.meizu.cloud.pushsdk.c.g.d;
import java.io.InputStream;
import com.meizu.cloud.pushsdk.c.c.m;

public abstract class l implements Closeable	// class@0014e0
{

    public void l(){
       super();
    }
    public abstract d a();
    public final InputStream b(){
       return this.a().d();
    }
    public void close(){
       m.a(this.a());
    }
}
