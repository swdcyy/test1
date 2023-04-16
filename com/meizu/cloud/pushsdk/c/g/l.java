package com.meizu.cloud.pushsdk.c.g.l;
import java.io.Closeable;
import java.io.Flushable;
import com.meizu.cloud.pushsdk.c.g.b;

public interface abstract l implements Closeable, Flushable	// class@0014f8
{

    void a(b p0,long p1);
    void close();
    void flush();
}
