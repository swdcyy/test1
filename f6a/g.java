package f6a.g;
import f6a.f;
import f6a.g$b;
import java.util.BitSet;
import f6a.g$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import v5a.a$b;
import com.yxcorp.gifshow.entity.QPhoto;
import v5a.a;
import wc6.d;
import com.kwai.video.wayne.player.builder.WayneBuildData;
import kotlin.jvm.internal.a;
import com.kwai.library.kwaiplayerkit.framework.KwaiPlayerKitView;
import wx6.d;
import com.kwai.components.playerkit.QPhotoPlayerKitDataSource;
import rx6.b;
import msd.l;
import px6.a;
import com.kwai.video.wayne.player.main.IWaynePlayer;
import com.kwai.video.wayne.player.main.IMediaPlayerApi;
import px6.b;
import mx6.c;
import tx6.a;
import sd5.g;
import android.telephony.PhoneStateListener;
import com.yxcorp.gifshow.detail.slideplay.nasa.NasaPanoramaDetailFragment;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import brd.t;
import f6a.g$c;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import org.greenrobot.eventbus.a;
import com.yxcorp.gifshow.detail.event.PlayEvent;
import com.yxcorp.gifshow.detail.event.PlayEvent$Status;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.graphics.Bitmap;
import com.kwai.library.kwaiplayerkit.domain.play.ui.DefaultFrameUiModule;
import android.view.View;
import com.kwai.library.kwaiplayerkit.framework.module.ui.UiModule;
import com.kwai.framework.player.ui.impl.PlayerKitContentFrame;
import java.lang.NullPointerException;
import android.view.MotionEvent;
import java.lang.Boolean;
import ekd.m1;
import java.lang.Long;
import java.lang.Integer;
import mx6.a;

public final class g extends f	// class@0022d4
{
    public KwaiPlayerKitView K;
    public d L;
    public final g$b M;
    public final BitSet N;
    public final g$a O;

    public void g(){
       super();
       this.M = new g$b(this);
       this.N = new BitSet();
       this.O = new g$a(this);
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, g.class, "3")) {
          return;
       }
       super.E8();
       a uoa = new a$b(this.Y8()).a();
       uoa.c().setBizFt(":ks-features:ft-feed:detail");
       g tK = this.K;
       if (tK == null) {
          a.S("mPlayerKitView");
       }
       tK.c();
       tK = this.K;
       if (tK == null) {
          a.S("mPlayerKitView");
       }
       g tL = this.L;
       if (tL == null) {
          a.S("mSessionKeyGenerator");
       }
       tK.setSessionKeyGenerator(tL);
       tK = this.K;
       if (tK == null) {
          a.S("mPlayerKitView");
       }
       QPhotoPlayerKitDataSource qPhotoPlayer = QPhotoPlayerKitDataSource.g(uoa);
       a.o(qPhotoPlayer, "QPhotoPlayerKitDataSourc¡­uildData\(playerBuildData\)");
       tK.g(qPhotoPlayer, objArray);
       IWaynePlayer iWaynePlayer = this.k9();
       if (iWaynePlayer != null) {
          iWaynePlayer.setInteractiveMode(2);
       }
       iWaynePlayer = this.k9();
       int i = 1;
       boolean b = (iWaynePlayer != null && iWaynePlayer.isPlaying() == i)? true: false;
       this.b9(b);
       iWaynePlayer = this.k9();
       if (iWaynePlayer != null && iWaynePlayer.isPlaying() == i) {
          this.m9(i);
       }else {
          iWaynePlayer = this.k9();
          if (iWaynePlayer != null && iWaynePlayer.isPaused() == i) {
             this.l9(i);
          }
       }
       g tK1 = this.K;
       if (tK1 == null) {
          a.S("mPlayerKitView");
       }
       a uoa1 = tK1.getPlayerKitContext().d(c.class);
       if (uoa1 != null) {
          uoa1.d(this.M);
       }
       g.d.a(this.O);
       this.X7(this.X8().Vg().l().subscribe(new g$c(this)));
       PatchProxy.onMethodExit(g.class, "3");
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoidWithListener(null, this, g.class, "4")) {
          return;
       }
       super.J8();
       a uoa = a.d();
       QPhoto qPhoto = this.Y8();
       IWaynePlayer iWaynePlayer = this.k9();
       PlayEvent$Status pAUSE = (iWaynePlayer != null && iWaynePlayer.isPaused() == true)? PlayEvent$Status.PAUSE: PlayEvent$Status.RESUME;
       uoa.k(new PlayEvent(qPhoto, pAUSE, 1, "PanoramaPlayerKit"));
       g tK = this.K;
       if (tK == null) {
          a.S("mPlayerKitView");
       }
       tK.release();
       g.d.b(this.O);
       PatchProxy.onMethodExit(g.class, "4");
       return;
    }
    public long V8(){
       g og = g.class;
       IWaynePlayer obj = PatchProxy.applyWithListener(null, this, og, "10");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.k9();
       long currentPosit = (obj != null)? obj.getCurrentPosition(): 0;
       PatchProxy.onMethodExit(og, "10");
       return currentPosit;
    }
    public Bitmap W8(){
       g obj = PatchProxy.applyWithListener(null, this, g.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.K;
       if (obj == null) {
          a.S("mPlayerKitView");
       }
       View obj1 = obj.getPlayerKitContext().i(DefaultFrameUiModule.class);
       a.m(obj1);
       obj1 = obj1.k();
       if (obj1 != null) {
          PatchProxy.onMethodExit(g.class, "13");
          return obj1.C();
       }else {
          PatchProxy.onMethodExit(g.class, "13");
          throw new NullPointerException("null cannot be cast to non-null type com.kwai.framework.player.ui.impl.PlayerKitContentFrame");
       }
    }
    public float Z8(){
       g og = g.class;
       IWaynePlayer obj = PatchProxy.applyWithListener(null, this, og, "12");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       obj = this.k9();
       float f = (obj != null)? (float)obj.getOrientationDegrees(): 0;
       PatchProxy.onMethodExit(og, "12");
       return f;
    }
    public long a9(){
       g og = g.class;
       IWaynePlayer obj = PatchProxy.applyWithListener(null, this, og, "9");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.k9();
       long duration = (obj != null)? obj.getDuration(): 0;
       PatchProxy.onMethodExit(og, "9");
       return duration;
    }
    public void c9(){
       if (PatchProxy.applyVoidWithListener(null, this, g.class, "14")) {
          return;
       }
       if (!this.e9()) {
          PatchProxy.onMethodExit(g.class, "14");
          return;
       }else {
          IWaynePlayer iWaynePlayer = this.k9();
          if (iWaynePlayer != null) {
             if (iWaynePlayer.isPlaying()) {
                this.l9(1);
             }else {
                this.m9(1);
             }
          }
          PatchProxy.onMethodExit(g.class, "14");
          return;
       }
    }
    public boolean d9(MotionEvent p0){
       IWaynePlayer obj = PatchProxy.applyOneRefsWithListener(p0, this, g.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "event");
       obj = this.k9();
       boolean b = true;
       if (obj == null || obj.handleTouchEvent(p0) != b) {
          b = false;
       }
       PatchProxy.onMethodExit(g.class, "6");
       return b;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, g.class, "2")) {
          return;
       }
       super.doBindView(p0);
       p0 = m1.f(p0, R.id.panorama_detail_playerkit_view);
       a.o(p0, "bindWidget\(rootView, R.i¡­ma_detail_playerkit_view\)");
       this.K = p0;
       PatchProxy.onMethodExit(g.class, "2");
       return;
    }
    public boolean e9(){
       g og = g.class;
       IWaynePlayer obj = PatchProxy.applyWithListener(null, this, og, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.k9();
       boolean b = true;
       if (obj == null || obj.isPrepared() != b) {
          b = false;
       }
       PatchProxy.onMethodExit(og, "8");
       return b;
    }
    public void h9(long p0){
       if (PatchProxy.isSupport2(g.class, "11") && PatchProxy.applyVoidOneRefsWithListener(Long.valueOf(p0), this, g.class, "11")) {
          return;
       }
       IWaynePlayer iWaynePlayer = this.k9();
       if (iWaynePlayer != null) {
          iWaynePlayer.seekTo(p0);
       }
       PatchProxy.onMethodExit(g.class, "11");
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoidWithListener(null, this, g.class, "1")) {
          return;
       }
       super.j8();
       Object obj = this.r8("INJECT_KEY_SESSION_GEN");
       a.o(obj, "inject\(NasaPanoramaDetai¡­t.INJECT_KEY_SESSION_GEN\)");
       this.L = obj;
       PatchProxy.onMethodExit(g.class, "1");
       return;
    }
    public void j9(int p0){
       if (PatchProxy.isSupport2(g.class, "7") && PatchProxy.applyVoidOneRefsWithListener(Integer.valueOf(p0), this, g.class, "7")) {
          return;
       }
       IWaynePlayer iWaynePlayer = this.k9();
       if (iWaynePlayer != null) {
          iWaynePlayer.setInteractiveMode(p0);
       }
       PatchProxy.onMethodExit(g.class, "7");
       return;
    }
    public final IWaynePlayer k9(){
       Object[] objArray = null;
       g obj = PatchProxy.applyWithListener(objArray, this, g.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.K;
       if (obj == null) {
          a.S("mPlayerKitView");
       }
       a uoa = obj.getPlayerKitContext().e(a.class);
       if (uoa != null) {
          objArray = uoa.getPlayer();
       }
       PatchProxy.onMethodExit(g.class, "5");
       return objArray;
    }
    public final void l9(int p0){
       if (PatchProxy.isSupport2(g.class, "16") && PatchProxy.applyVoidOneRefsWithListener(Integer.valueOf(p0), this, g.class, "16")) {
          return;
       }
       this.N.set(p0);
       g tK = this.K;
       if (tK == null) {
          a.S("mPlayerKitView");
       }
       a uoa = tK.getPlayerKitContext().e(a.class);
       if (uoa != null) {
          uoa.pause();
       }
       PatchProxy.onMethodExit(g.class, "16");
       return;
    }
    public final void m9(int p0){
       if (PatchProxy.isSupport2(g.class, "15") && PatchProxy.applyVoidOneRefsWithListener(Integer.valueOf(p0), this, g.class, "15")) {
          return;
       }
       this.N.clear(p0);
       if (!this.N.cardinality()) {
          g tK = this.K;
          if (tK == null) {
             a.S("mPlayerKitView");
          }
          a uoa = tK.getPlayerKitContext().e(a.class);
          if (uoa != null) {
             uoa.start();
          }
       }
       PatchProxy.onMethodExit(g.class, "15");
       return;
    }
}
