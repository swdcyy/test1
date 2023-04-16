package nh.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import tkd.b;
import tkd.d;
import vt5.g;

public final class c	// class@00270c
{
    public static final c a;

    static {
       c.a = new c();
    }
    public void c(){
       super();
    }
    public static final boolean a(){
       Object obj = PatchProxy.apply(null, null, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return d.a(0x348c642a).EL();
    }
}
