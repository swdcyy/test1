package a02.b;
import a51.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import bo1.f;
import lp3.c;
import lp3.i;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class b extends c	// class@000016
{
    public i v;
    public static String sLivePresenterClassName = "LiveAudienceMultiInteractPresenter";

    public void b(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       super.E8();
       b tv = this.v;
       if (tv == null) {
          a.S("serviceManager");
       }
       c uoc = tv.a(f.class);
       a.o(uoc, "serviceManager.getServic¡­chDogService::class.java\)");
       uoc.start();
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       super.J8();
       b tv = this.v;
       if (tv == null) {
          a.S("serviceManager");
       }
       c uoc = tv.a(f.class);
       a.o(uoc, "serviceManager.getServic¡­chDogService::class.java\)");
       uoc.stop();
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       Object obj = this.r8("LIVE_SERVICE_MANAGER");
       a.o(obj, "inject\(LiveAccessIds.LIVE_SERVICE_MANAGER\)");
       this.v = obj;
       return;
    }
}
