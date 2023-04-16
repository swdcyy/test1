package com.kwai.dva.dex2oat.util.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.plugin.dva.util.b;
import kotlin.jvm.internal.a;
import qj7.d;

public final class a	// class@000d1e
{
    public static final a a;
    public static String b;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final String a(){
       String obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.b;
       if (obj != null) {
          return obj;
       }
       Object[] objArray = new Object[0];
       Object obj1 = b.b("dalvik.system.VMRuntime", "getCurrentInstructionSet", objArray);
       Object obj2 = obj1;
       d.c(a.C("getCurrentInstructionSet: ", obj2));
       a.b = obj2;
       a.o(obj1, "callStaticMethod<String>¡­ctionSet = this\n        }");
       return obj2;
    }
}
