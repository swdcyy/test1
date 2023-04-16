package com.kuaishou.aegon.l;
import io.b$a;
import java.lang.Object;
import com.kuaishou.aegon.Aegon;
import java.lang.Boolean;

public final class l implements b$a	// class@0007b0
{
    public static final l a;

    static {
       l.a = new l();
    }
    public void l(){
       super();
    }
    public final Object get(){
       return Boolean.valueOf(Aegon.nativeIsIPv6Available());
    }
}
