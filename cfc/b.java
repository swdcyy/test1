package cfc.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import lnc.i3;
import java.lang.Number;
import k2b.h;

public class b	// class@00058a
{

    public void b(){
       super();
    }
    public static void a(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), null, uob, "4")) {
          return;
       }
       i3 oi3 = i3.f();
       oi3.c("click_area", Integer.valueOf(p0));
       String str = oi3.toString();
       h oh = h.m("2900078", "FRIENDS_VIEWING_POPUP");
       oh.n(str);
       oh.h();
       return;
    }
}
