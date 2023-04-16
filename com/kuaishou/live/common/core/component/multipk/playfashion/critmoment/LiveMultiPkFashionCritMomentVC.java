package com.kuaishou.live.common.core.component.multipk.playfashion.critmoment.LiveMultiPkFashionCritMomentVC;
import au1.a;
import com.kuaishou.live.common.core.component.multipk.playfashion.critmoment.LiveMultiPkFashionCritMomentVC$a;
import nsd.u;
import ft1.b;
import ut1.d;
import kt1.d;
import yt1.e;
import ws1.c;
import ht1.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.multipk.playfashion.critmoment.LiveMultiPkFashionCritMomentVC$critMomentViewModel$2;
import com.kuaishou.live.common.core.component.multipk.playfashion.critmoment.LiveMultiPkFashionCritMomentVC$$special$$inlined$viewModels$1;
import com.kuaishou.live.viewcontroller.ViewController;
import androidx.lifecycle.ViewModelLazy;
import xt1.h;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.common.core.component.multipk.playfashion.critmoment.LiveMultiPkFashionCritMomentVC$$special$$inlined$viewModels$2;
import msd.a;
import com.kwai.robust.PatchProxy;
import com.kuaishou.protobuf.livestream.nano.LiveMultiPkCritMoment;
import com.kuaishou.live.common.core.component.multipk.playfashion.critmoment.LiveMultiPkCritMomentBangsVC;
import com.kuaishou.live.common.core.component.multipk.playfashion.critmoment.LiveMultiPkFashionCritMomentVC$onCreate$$inlined$let$lambda$1;
import st1.a;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.common.core.component.multipk.playfashion.critmoment.LiveMultiPkFashionCritMomentVC$b;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.common.core.component.multipk.playfashion.critmoment.LiveMultiPkFashionCritMomentVC$c;
import com.kuaishou.protobuf.livestream.nano.MultiPKPlayFashionInfo;
import com.kwai.robust.PatchProxyResult;
import xt1.f;
import qrd.p;

public final class LiveMultiPkFashionCritMomentVC extends a	// class@001669
{
    public final p m;
    public final b n;
    public final d o;
    public final d p;
    public final e q;
    public final c r;
    public final a s;
    public static final LiveMultiPkFashionCritMomentVC$a t;

    static {
       LiveMultiPkFashionCritMomentVC.t = new LiveMultiPkFashionCritMomentVC$a(null);
    }
    public void LiveMultiPkFashionCritMomentVC(b p0,d p1,d p2,e p3,c p4,a p5){
       a.p(p0, "gameModel");
       a.p(p1, "countDownModel");
       a.p(p2, "gameAnimModel");
       a.p(p3, "fashionDelegateLive");
       a.p(p4, "pkContainerLayout");
       a.p(p5, "skinManager");
       super(p4);
       this.n = p0;
       this.o = p1;
       this.p = p2;
       this.q = p3;
       this.r = p4;
       this.s = p5;
       this.m = new ViewModelLazy(m0.d(h.class), new LiveMultiPkFashionCritMomentVC$$special$$inlined$viewModels$2(new LiveMultiPkFashionCritMomentVC$$special$$inlined$viewModels$1(this)), new LiveMultiPkFashionCritMomentVC$critMomentViewModel$2(this));
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, LiveMultiPkFashionCritMomentVC.class, "2")) {
          return;
       }
       a uoa = this.j;
       if (uoa != null) {
          a.o(uoa, "it");
          a uoa1 = this.q.g();
          a.o(uoa1, "fashionDelegateLive.logInfo");
          LiveMultiPkCritMomentBangsVC liveMultiPkC = new LiveMultiPkCritMomentBangsVC(uoa, this.n, new LiveMultiPkFashionCritMomentVC$onCreate$$inlined$let$lambda$1(this), this.r, this.q.e(), uoa1, this.s);
          this.z2(v0);
       }
       b.Z(LiveCommonLogTag.MULTI_PK, "LiveMultiPkCritMoment onCreate");
       this.W2().a.observe(this, new LiveMultiPkFashionCritMomentVC$b(this));
       this.W2().b.observe(this, new LiveMultiPkFashionCritMomentVC$c(this));
       return;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, LiveMultiPkFashionCritMomentVC.class, "3")) {
          return;
       }
       b.Z(LiveCommonLogTag.MULTI_PK, "LiveMultiPkCritMoment onDestroy");
       return;
    }
    public Object V2(MultiPKPlayFashionInfo p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveMultiPkFashionCritMomentVC.class, "4");
       if (obj != patchProxyRe) {
       }else {
          a.p(p0, "signalCommonInfo");
          p0 = p0.data;
          obj = PatchProxy.applyOneRefs(p0, null, f.class, "2");
          if (obj != patchProxyRe) {
          }else if(p0 == null){
             obj = LiveMultiPkCritMoment.parseFrom(p0);
          }
       }
       return obj;
    }
    public final h W2(){
       Object obj = PatchProxy.apply(null, this, LiveMultiPkFashionCritMomentVC.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.m.getValue();
    }
}
