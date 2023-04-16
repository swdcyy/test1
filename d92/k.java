package d92.k;
import im8.g;
import k51.c;
import io.reactivex.subjects.PublishSubject;
import d92.k$a;
import d92.k$b;
import d92.k$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import t02.a0;
import d92.l;
import xq5.c;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import f12.d;
import ge5.d;
import joc.o;
import joc.l;
import java.util.concurrent.TimeUnit;
import brd.t;
import d92.j;
import com.gifshow.tuna.player.poi.e;
import erd.g;
import crd.b;
import com.kwai.video.waynelive.listeners.LivePlayerRenderListener;
import com.kwai.video.waynelive.ILivePlayerStatusMonitor;
import com.kwai.video.waynelive.LivePlayerController;
import com.kuaishou.live.core.show.statistics.LivePlayLogger;
import com.yxcorp.gifshow.widget.SwipeLayout;
import tkd.b;
import tkd.d;
import gx5.d;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import d92.k$d;
import com.yxcorp.gifshow.widget.SwipeLayout$b;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import f12.c;
import lnc.w9;
import d92.o;
import java.util.Map;
import java.util.HashMap;
import tj3.e;
import p91.m;

public class k extends c implements g	// class@0024b3
{
    public SwipeLayout$b A;
    public l B;
    public boolean C;
    public p D;
    public o E;
    public LivePlayerRenderListener F;
    public a0 p;
    public LivePlayerController q;
    public e r;
    public m s;
    public LiveSlidePlayService t;
    public c u;
    public Activity v;
    public c w;
    public boolean x;
    public boolean y;
    public boolean z;
    public static String sLivePresenterClassName = "LiveAudienceSwipePresenter";

    public void k(){
       super();
       this.w = PublishSubject.g();
       this.y = true;
       this.z = true;
       this.D = new k$a(this);
       this.E = new k$b(this);
       this.F = new k$c(this);
    }
    public void E8(){
       k ok = k.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ok, "2")) {
          return;
       }
       this.v = this.getActivity();
       if (!PatchProxy.applyVoid(objArray, this, ok, "4")) {
          if (this.p.h == null) {
             this.P8();
          }else {
             l ol = new l(this);
             this.u = ol;
             this.t.P4(ol);
             d uod = this.R8().p();
             if (uod != null) {
                this.B = uod.e;
             }
             ok = this.B;
             if (ok != null) {
                ok.g(this.E);
             }
          }
       }
       this.X7(this.w.throttleFirst(1, TimeUnit.SECONDS).subscribe(new j(this), e.b));
       this.q.addRenderListener(this.F);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, k.class, "3")) {
          return;
       }
       this.y = true;
       if (this.x != null) {
          LivePlayLogger.logFloatingWindowTaskEventOnRightSwipe(this.q.isPlaying(), this.q.isBuffering(), this.C);
       }
       k tu = this.u;
       if (tu != null) {
          this.t.d5(tu);
       }
       tu = this.B;
       if (tu != null) {
          tu.l(this.E);
       }
       this.V8();
       this.q.removeRenderListener(this.F);
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, k.class, "5")) {
          return;
       }
       SwipeLayout swipeLayout = this.S8();
       if (swipeLayout == null || (this.p.c != null && !d.a(-1188553266).VA(this.v.U2(), this.p.c.getUserId()))) {
          k$d uod = new k$d(this);
          this.A = uod;
          swipeLayout.setOnSwipedListener(uod);
       }
    label_0042 :
       return;
    }
    public final d R8(){
       Activity obj = PatchProxy.apply(null, this, k.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getActivity();
       Objects.requireNonNull(obj);
       return c.b(obj);
    }
    public final SwipeLayout S8(){
       Object obj = PatchProxy.apply(null, this, k.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return w9.c(this.getActivity());
    }
    public void V8(){
       if (PatchProxy.applyVoid(null, this, k.class, "6")) {
          return;
       }
       SwipeLayout swipeLayout = this.S8();
       if (swipeLayout != null && this.A != null) {
          swipeLayout.setOnSwipedListener(null);
       }
       this.A = null;
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, k.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new o();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, k.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(k.class, new o());
       }else {
          obj.put(k.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, k.class, "1")) {
          return;
       }
       this.p = this.q8(a0.class);
       this.q = this.r8("LIVE_PLAYER_CONTROLLER");
       this.r = this.r8("LIVE_LOG_REPORTER");
       this.s = this.r8("LIVE_BASIC_CONTEXT");
       this.t = this.r8("LIVE_SLIDE_PLAY_SERVICE");
       return;
    }
}
