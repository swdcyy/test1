package foa.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.String;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import kotlin.jvm.internal.a;
import foa.b$a;
import foa.b$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import qw6.a;
import lnc.u1;
import com.kwai.library.kwaiplayerkit.framework.KwaiPlayerKitView;
import com.kwai.video.wayne.player.main.IWaynePlayer;
import com.kwai.robust.PatchProxyResult;
import px6.b;
import mx6.a;
import com.kwai.video.wayne.player.main.IMediaPlayerApi;
import android.view.View;
import android.content.Context;
import com.kwai.library.kwaiplayerkit.domain.play.ui.DefaultFrameUiModule;
import com.kwai.library.kwaiplayerkit.framework.module.ui.UiModule;
import qrd.l1;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.detail.event.PlayEvent;
import com.yxcorp.gifshow.entity.QPhoto;
import foa.a;
import java.lang.Enum;

public final class b extends PresenterV2	// class@0029a4
{
    public KwaiPlayerKitView p;
    public boolean q;
    public SlidePlayViewModel r;
    public PhotoDetailParam s;
    public final b$a t;
    public final b$b u;
    public final String v;
    public final Fragment w;

    public void b(String p0,Fragment p1){
       a.p(p0, "url");
       a.p(p1, "fragment");
       super();
       this.v = p0;
       this.w = p1;
       this.t = new b$a(this);
       this.u = new b$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.w.getParentFragment());
       this.r = slidePlayVie;
       if (slidePlayVie != null) {
          slidePlayVie.o0(this.w, this.t);
       }
       u1.a(this);
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       b tp = this.p;
       if (tp != null) {
          tp.release();
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "9")) {
          return;
       }
       b tp = this.p;
       if (tp != null) {
          tp.reset();
       }
       u1.b(this);
       return;
    }
    public final IWaynePlayer P8(){
       Object[] objArray = null;
       b obj = PatchProxy.apply(objArray, this, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.p;
       if (obj != null) {
          obj = obj.getPlayerKitContext();
          if (obj != null) {
             a uoa = obj.e(a.class);
             if (uoa != null) {
                objArray = uoa.getPlayer();
             }
          }
       }
       return objArray;
    }
    public final String R8(){
       return this.v;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, b.class, "8")) {
          return;
       }
       IWaynePlayer iWaynePlayer = this.P8();
       if (iWaynePlayer != null) {
          iWaynePlayer.pause();
       }
       return;
    }
    public final void V8(){
       if (PatchProxy.applyVoid(null, this, b.class, "7")) {
          return;
       }
       IWaynePlayer iWaynePlayer = this.P8();
       if (iWaynePlayer != null) {
          iWaynePlayer.start();
       }
       return;
    }
    public void doBindView(View p0){
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uob, "3")) {
          return;
       }
       a.p(p0, "rootView");
       if (!PatchProxy.applyVoid(null, this, uob, "5") && this.getContext() != null) {
          Context context = this.getContext();
          a.m(context);
          a.o(context, "context!!");
          KwaiPlayerKitView kwaiPlayerKi = new KwaiPlayerKitView(context);
          kwaiPlayerKi.c();
          DefaultFrameUiModule uDefaultFram = kwaiPlayerKi.getPlayerKitContext().i(DefaultFrameUiModule.class);
          if (uDefaultFram != null) {
             kwaiPlayerKi.d(uDefaultFram);
          }
          this.p = kwaiPlayerKi;
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.s = this.q8(PhotoDetailParam.class);
       return;
    }
    public final void onAudioConflictListener(PlayEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "10")) {
          return;
       }
       a.p(p0, "event");
       b ts = this.s;
       if (ts != null) {
          PhotoDetailParam mPhoto = ts.mPhoto;
          if (mPhoto != null && p0.a.equals(mPhoto)) {
             p0 = p0.b;
             if (p0 != null) {
                int i = a.a[p0.ordinal()];
                if (i != 1) {
                   if (i == 2) {
                      this.V8();
                   }
                }else {
                   this.S8();
                }
             }
          }
       }
       return;
    }
}
