package ck7.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import c97.d;
import kotlin.jvm.internal.a;
import q97.c;

public final class a	// class@000568
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public static final void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, a.class, "2")) {
          return;
       }
       d uod = d.a();
       a.o(uod, "Azeroth.get\(\)");
       uod.f().e("KwaiPoiLog", p0);
       return;
    }
    public static final void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, a.class, "3")) {
          return;
       }
       d uod = d.a();
       a.o(uod, "Azeroth.get\(\)");
       uod.f().i("KwaiPoiLog", p0);
       return;
    }
}
