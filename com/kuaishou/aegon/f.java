package com.kuaishou.aegon.f;
import io.b$a;
import java.lang.Object;
import com.kuaishou.aegon.Aegon;
import java.lang.Long;

public final class f implements b$a	// class@0007a7
{
    public static final f a;

    static {
       f.a = new f();
    }
    public void f(){
       super();
    }
    public final Object get(){
       return Long.valueOf(Aegon.nativeGetHttpCacheUsedBytes());
    }
}
