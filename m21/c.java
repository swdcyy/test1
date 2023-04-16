package m21.c;
import k51.c;
import java.util.ArrayList;
import m21.c$a;
import t02.a0;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import brd.t;
import ry1.b;
import m21.c$b;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.audience.component.pendant.carousel.LiveCarouselPendantViewController;
import xq5.c;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import android.app.Activity;
import androidx.viewpager.widget.ViewPager;
import com.kuaishou.live.audience.component.pendant.carousel.LiveCarouselPendantView;
import android.view.View;
import va1.i0;
import pq5.c;

public final class c extends c	// class@003111
{
    public a0 p;
    public b q;
    public c r;
    public LiveCarouselPendantView s;
    public LiveCarouselPendantViewController t;
    public final ArrayList u;
    public KwaiDialogFragment v;
    public c w;
    public final a x;
    public static String sLivePresenterClassName = "LiveCarouselPendantViewPresenter";

    public void c(){
       super();
       this.u = new ArrayList();
       this.x = new c$a(this);
    }
    public static final a0 P8(c p0){
       p0 = p0.p;
       if (p0 == null) {
          a.S("mLivePlayCallerContext");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       c tq = this.q;
       if (tq == null) {
          a.S("mLiveAudienceStatusObtainService");
       }
       this.X7(tq.W().subscribe(new c$b(this)));
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c.class, "3")) {
          return;
       }
       c tt = this.t;
       if (tt != null) {
          tt.b();
       }
       this.u.clear();
       this.v = objArray;
       tt = this.p;
       String str = "mLivePlayCallerContext";
       if (tt == null) {
          a.S(str);
       }
       if (tt.g != null) {
          tt = this.w;
          if (tt != null) {
             c tp = this.p;
             if (tp == null) {
                a.S(str);
             }
             tp.y2.d5(tt);
          }
       }
       Activity activity = this.getActivity();
       c ts = this.s;
       if (ts != null) {
          objArray = ts.getMViewPager();
       }
       i0.e(activity, objArray);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       Object obj = this.q8(a0.class);
       a.o(obj, "inject\(LivePlayCallerContext::class.java\)");
       this.p = obj;
       obj = this.r8("LIVE_AUDIENCE_STATUS_OBTAIN_SERVICE");
       a.o(obj, "inject\(LiveAccessIds.LIV¡­CE_STATUS_OBTAIN_SERVICE\)");
       this.q = obj;
       obj = this.q8(c.class);
       a.o(obj, "inject\(LiveRightPendantC¡­ainerService::class.java\)");
       this.r = obj;
       return;
    }
}
