package cud.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.System;
import zsd.d;
import java.nio.charset.Charset;

public final class b	// class@001436
{

    public static final void a(byte[] p0,int p1,byte[] p2,int p3,int p4){
       a.q(p0, "src");
       a.q(p2, "dest");
       System.arraycopy(p0, p1, p2, p3, p4);
    }
    public static final String b(byte[] p0){
       a.q(p0, "$receiver");
       return new String(p0, d.a);
    }
}
