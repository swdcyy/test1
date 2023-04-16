package a12.b;
import a51.c;
import xq5.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d12.p;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;

public class b extends c	// class@00000f
{
    public LiveSlidePlayService v;
    public final c w;
    public static String sLivePresenterClassName = "LiveBasicAdapterPresenter";

    public void b(c p0){
       super();
       this.w = p0;
    }
    public void E8(){
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "2")) {
          return;
       }
       super.E8();
       if (!PatchProxy.applyVoid(objArray, this, uob, "3") && p.b(this.getActivity())) {
          this.v.P4(this.w);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.v = this.r8("LIVE_SLIDE_PLAY_SERVICE");
       return;
    }
}
