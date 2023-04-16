package de0.a$a;
import de0.a;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ce0.b;

public final class a$a	// class@001f7d
{

    public static void a(a p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, a$a.class, "1")) {
          return;
       }
       a.p(p1, "msg");
       b.C().v("PendantCore", p1, p2);
       return;
    }
    public static void b(a p0,String p1,Throwable p2,int p3,Object p4){
       p0.log(p1, null);
    }
}
