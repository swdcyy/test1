package nfd.l1;
import java.lang.Object;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.component.entry.SearchEntryParams;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import lyb.v;

public class l1	// class@001dc9
{

    public void l1(){
       super();
    }
    public static void a(GifshowActivity p0,SearchEntryParams p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, null, l1.class, "1")) {
          return;
       }
       v ov = d.a(-724669335);
       if (!ov.isAvailable()) {
          PatchProxy.onMethodExit(l1.class, "1");
          return;
       }else {
          ov.Yd(p0, p1);
          PatchProxy.onMethodExit(l1.class, "1");
          return;
       }
    }
}
