package eob.p;
import ru5.b;
import java.lang.Object;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.android.model.mix.Location;
import brd.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import eob.t;
import androidx.fragment.app.FragmentActivity;
import eob.m;
import erd.o;
import n3d.a;
import eob.o;
import com.kwai.feature.api.social.moment.model.MomentLocateParam;
import eob.n;
import com.yxcorp.gifshow.moment_downloader.lazyfragment.ReminderMomentContainerFragment;

public class p implements b	// class@002798
{

    public void p(){
       super();
    }
    public t Gw(GifshowActivity p0,boolean p1,Location p2){
       if (PatchProxy.isSupport2(p.class, "1")) {
          Object obj = PatchProxy.applyThreeRefsWithListener(p0, Boolean.valueOf(p1), p2, this, p.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       PatchProxy.onMethodExit(p.class, "1");
       return b.a(-992634779).a(p0, p1).map(new m(p0, p2));
    }
    public t H10(GifshowActivity p0,boolean p1,a p2){
       if (PatchProxy.isSupport(p.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Boolean.valueOf(p1), p2, this, p.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return b.a(-992634779).a(p0, p1).map(new o(p0, p2));
    }
    public t Rt(GifshowActivity p0,boolean p1,MomentLocateParam p2){
       if (PatchProxy.isSupport(p.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Boolean.valueOf(p1), p2, this, p.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return b.a(-992634779).a(p0, p1).map(new n(p0, p2));
    }
    public boolean isAvailable(){
       return true;
    }
    public Class pm(){
       return ReminderMomentContainerFragment.class;
    }
}
