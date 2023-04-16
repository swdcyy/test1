package d11.e;
import k51.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import d11.d;
import xq5.c;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import z12.e;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.concurrent.atomic.AtomicReference;
import brd.t;
import com.yxcorp.gifshow.util.hardware.HeadsetPlugMonitor;
import vnc.c;
import erd.a;
import d11.b;
import brd.x;
import s92.e;
import d11.a;
import s92.e$a;
import erd.o;
import d11.c;
import com.gifshow.tuna.player.poi.e;
import erd.g;
import crd.b;
import lnc.b9;

public class e extends c	// class@001ef4
{
    public b p;
    public a0 q;
    public static String sLivePresenterClassName = "LiveAudienceHeadsetPresenter";

    public void e(){
       super();
    }
    public void E8(){
       e uoe = e.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoe, "2")) {
          return;
       }
       if (this.q.h == null) {
          this.P8();
       }else if(PatchProxy.applyVoid(objArray, this, uoe, "6")){
          uoe = this.q;
          if (uoe.h != null) {
             uoe.y2.P4(new d(this));
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       if (this.q.h == null) {
          this.R8();
       }
       return;
    }
    public void P8(){
       t ot;
       if (PatchProxy.applyVoid(null, this, e.class, "4")) {
          return;
       }
       int i = 0;
       String[] stringArray = new String[i];
       e.c("LiveAudienceHeadsetPresenter", "registerHeadsetPlugMonitor", stringArray);
       if (this.p == null) {
          if (a.t().u("SOURCE_LIVE").d("enableUnRegisterHeadsetStateInFinally", i)) {
             Context context = this.getContext();
             AtomicReference uAtomicRefer = new AtomicReference();
             ot = HeadsetPlugMonitor.d(context, i, uAtomicRefer).doFinally(new c(context, uAtomicRefer));
          }else {
             ot = HeadsetPlugMonitor.b(this.getContext());
          }
          this.p = ot.compose(b.b).switchMap(new e(new a(this))).subscribe(new c(this), e.b);
       }
       return;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, e.class, "5")) {
          return;
       }
       String[] stringArray = new String[0];
       e.c("LiveAudienceHeadsetPresenter", "releaseHeadsetPlugMonitor", stringArray);
       b9.a(this.p);
       this.p = null;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.q = this.q8(a0.class);
       return;
    }
}
