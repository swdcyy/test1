package com.kuaishou.live.lite.watchingcount.LiveLiteWatchingCountPresenter;
import b93.d;
import xd3.d;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import or5.b;
import com.kuaishou.android.model.feed.LiveStreamFeed$LiveLiteElementsSwitch;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import wy1.e;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import e93.c;
import hf3.a;
import v51.a;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import z1.k;
import rd3.b;
import or5.d;
import t91.a;
import sj3.l;
import ds5.a;
import mq5.b;
import ga1.d;
import com.kuaishou.live.lite.framework.basicservice.LiveLiteScatterLoadManager;
import com.kuaishou.live.lite.watchingcount.a;
import com.kuaishou.live.lite.anchorinfo.LiveLiteAnchorInfoAreaService;
import eq3.d;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.live.lite.watchingcount.b;
import ec3.f;
import msd.a;
import c93.b;
import e93.a;
import td3.o;
import hx1.a;
import x83.a;
import xp5.i;
import o63.a;
import d93.a;
import d93.b;
import wy1.f;

public class LiveLiteWatchingCountPresenter extends d	// class@000bb0
{
    public a A;
    public a B;
    public a C;
    public c D;
    public l E;
    public b F;
    public LiveLiteAnchorInfoAreaService G;
    public d H;
    public a I;
    public LiveLiteScatterLoadManager J;
    public i K;
    public k L;
    public e M;
    public final f N;
    public d v;
    public a w;
    public a x;
    public o y;
    public a z;

    public void LiveLiteWatchingCountPresenter(){
       super();
       this.N = new d(this);
    }
    public void F8(){
       int b;
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveLiteWatchingCountPresenter liveLiteWatc = LiveLiteWatchingCountPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveLiteWatc, "4")) {
          return;
       }
       super.F8();
       Object obj = PatchProxy.apply(objArray, this, liveLiteWatc, "7");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else if(this.v.j0() != null && this.v.j0().mLiveLiteElementsSwitch != null){
          b = this.v.j0().mLiveLiteElementsSwitch.mEnableLiteOnlineCount;
       }else {
          b = 1;
       }
       if (b == null) {
          b.Z(LiveLogTag.LITE_WATCHING_COUNT, "isEnableWatchingCount is false");
          return;
       }else {
          e obj1 = PatchProxy.apply(objArray, this, liveLiteWatc, "8");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else if(this.v.j0() != null && this.v.j0().mLiveLiteElementsSwitch != null){
             b1 = this.v.j0().mLiveLiteElementsSwitch.mEnableLiteWatchingList;
          }else {
             b1 = null;
          }
          LiveLiteWatchingCountPresenter tv = this.v;
          obj1 = new e(this.D.a(), this.w.u(), tv, this.B, tv.r5(), this.E, this.C, this.F, this.H, this.L.get(), this.J);
          this.M = v13;
          LiveLiteWatchingCountPresenter tG = this.G;
          b = (b1 != null)? 0x7f0d099e: 0x7f0d099d;
          this.P8().xg(new a(tG, v13, b));
          b uob = new b(this, b1);
          if (f.h()) {
             this.J.ll("initWatchingAudienceVC", uob);
          }else {
             uob.invoke();
          }
          return;
       }
    }
    public void X8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteWatchingCountPresenter.class, "2")) {
          return;
       }
       this.w = p0.a(a.class);
       this.v = p0.a(d.class);
       this.C = p0.a(a.class);
       this.F = p0.a(b.class);
       this.B = p0.a(a.class);
       this.x = p0.a(a.class);
       this.y = p0.a(o.class);
       this.z = p0.a(a.class);
       this.A = p0.a(a.class);
       this.J = p0.a(LiveLiteScatterLoadManager.class);
       this.L = p0.c(b.class);
       this.K = p0.a(i.class);
       this.I = p0.a(a.class);
       return;
    }
    public void Y8(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteWatchingCountPresenter.class, "3")) {
          return;
       }
       this.D = p0.a(c.class);
       this.E = p0.a(l.class);
       this.H = p0.a(d.class);
       this.G = p0.a(LiveLiteAnchorInfoAreaService.class);
       return;
    }
    public void Z8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteWatchingCountPresenter.class, "1")) {
          return;
       }
       p0.d(f.class, this.N);
       return;
    }
}
