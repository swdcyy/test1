package com.kuaishou.live.lite.tempplay.LiveLiteTempPlayPresenter;
import b93.d;
import vd3.c;
import com.kuaishou.live.lite.tempplay.LiveLiteTempPlayPresenter$a;
import com.kuaishou.live.lite.tempplay.LiveLiteTempPlayPresenter$e;
import com.kuaishou.live.lite.tempplay.LiveLiteTempPlayPresenter$tagController$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.tempplay.c;
import kotlin.jvm.internal.a;
import xp5.i;
import com.kuaishou.live.lite.framework.basicservice.LiveLiteScatterLoadManager;
import com.kuaishou.live.lite.layoutmanager.LayoutViewType;
import vb3.p;
import com.kuaishou.live.viewcontroller.ViewController;
import vb3.n;
import com.kuaishou.live.lite.tempplay.LiveLiteTempPlayPresenter$b;
import z1.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import or5.b;
import com.kuaishou.android.model.feed.LiveStreamFeed$LiveLiteElementsSwitch;
import eq3.d;
import qd3.o;
import com.kuaishou.live.lite.tempplay.LiveLiteTempPlayService;
import td3.o;
import com.kuaishou.live.lite.tempplay.LiveLiteTempPlayPresenter$c;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.lite.tempplay.LiveLiteTempPlayPresenter$d;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import vx1.c;
import c93.b;
import or5.d;
import v51.a;
import vq5.d;
import d93.a;
import d93.b;
import qd3.r;

public final class LiveLiteTempPlayPresenter extends d	// class@000b84
{
    public LiveLiteScatterLoadManager A;
    public o B;
    public o C;
    public List D;
    public final c E;
    public final r F;
    public final c G;
    public final LiveLiteTempPlayService H;
    public final p I;
    public n v;
    public i w;
    public d x;
    public a y;
    public d z;

    public void LiveLiteTempPlayPresenter(){
       super();
       this.E = new c();
       this.F = new LiveLiteTempPlayPresenter$a(this);
       this.G = new c();
       this.H = new LiveLiteTempPlayPresenter$e(this);
       this.I = s.c(new LiveLiteTempPlayPresenter$tagController$2(this));
    }
    public void F8(){
       boolean b;
       LiveLiteTempPlayPresenter liveLiteTemp = LiveLiteTempPlayPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveLiteTemp, "5")) {
          return;
       }
       super.F8();
       LiveLiteTempPlayPresenter tw = this.w;
       if (tw == null) {
          a.S("logPackageProvider");
       }
       LiveLiteTempPlayPresenter tA = this.A;
       String str = "mLiveLiteScatterLoadManager";
       if (tA == null) {
          a.S(str);
       }
       c uoc = new c(tw, tA);
       tw = this.v;
       if (tw == null) {
          a.S("viewProviderService");
       }
       tw.c(LayoutViewType.TempPlayArea, uoc);
       this.G.e(new LiveLiteTempPlayPresenter$b(this, uoc));
       d obj = PatchProxy.apply(objArray, this, liveLiteTemp, "7");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          liveLiteTemp = this.x;
          if (liveLiteTemp == null) {
             a.S("infoService");
          }
          LiveStreamFeed liveStreamFe = liveLiteTemp.j0();
          if (liveStreamFe != null) {
             liveStreamFe = liveStreamFe.mLiveLiteElementsSwitch;
             if (liveStreamFe != null && liveStreamFe.mEnableLiteProfitArea == null) {
                b = false;
             }
          }
          b = true;
       }
       if (b) {
          obj = this.P8();
          tw = this.H;
          tA = this.A;
          if (tA == null) {
             a.S(str);
          }
          LiveLiteTempPlayPresenter tB = this.B;
          if (tB == null) {
             a.S("liteUserStatusManager");
          }
          o oo = new o(tw, tA, tB);
          obj.xg(oo);
          this.C = oo;
          this.E.e(new LiveLiteTempPlayPresenter$c(oo));
          LiveData liveData = oo.W2();
          liveData.observe(this, new LiveLiteTempPlayPresenter$d(this, uoc));
       }
       this.c9().b();
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, LiveLiteTempPlayPresenter.class, "6")) {
          return;
       }
       this.c9().c();
       return;
    }
    public void X8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteTempPlayPresenter.class, "3")) {
          return;
       }
       a.p(p0, "provider");
       this.w = p0.a(i.class);
       this.x = p0.a(d.class);
       this.y = p0.a(a.class);
       this.z = p0.a(d.class);
       this.B = p0.a(o.class);
       this.A = p0.a(LiveLiteScatterLoadManager.class);
       return;
    }
    public void Y8(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteTempPlayPresenter.class, "4")) {
          return;
       }
       a.p(p0, "provider");
       this.v = p0.a(n.class);
       return;
    }
    public void Z8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteTempPlayPresenter.class, "2")) {
          return;
       }
       a.p(p0, "register");
       p0.d(LiveLiteTempPlayService.class, this.H);
       p0.d(r.class, this.F);
       return;
    }
    public final c c9(){
       Object obj = PatchProxy.apply(null, this, LiveLiteTempPlayPresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.I.getValue();
    }
}
