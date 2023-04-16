package com.kuaishou.live.common.core.component.multipk.game.cohesion.rank.LiveMultiPkCohesionRankVC;
import com.kuaishou.live.viewcontroller.ViewController;
import zs1.b;
import com.kuaishou.protobuf.livestream.nano.CohesionPkInfo;
import ps1.e;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.multipk.game.cohesion.rank.LiveMultiPkCohesionRankVC$b;
import dt1.b;
import com.kuaishou.live.common.core.component.multipk.game.cohesion.rank.LiveMultiPkCohesionRankVC$rankModel$1;
import zs1.f;
import msd.a;
import com.kuaishou.live.common.core.component.multipk.game.cohesion.rank.LiveMultiPkCohesionRankVC$rankViewModel$2;
import com.kuaishou.live.common.core.component.multipk.game.cohesion.rank.LiveMultiPkCohesionRankVC$$special$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import dt1.e;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.common.core.component.multipk.game.cohesion.rank.LiveMultiPkCohesionRankVC$$special$$inlined$viewModels$2;
import com.kuaishou.live.common.core.component.multipk.game.cohesion.rank.LiveMultiPkCohesionRankEntryView;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import android.view.View;
import java.util.Objects;
import du1.d;
import dt1.c;
import com.kuaishou.livestream.message.nano.LivePkMessages$SCLivePkCohesionGiftSendCompletionNotice;
import lf3.g;
import brd.t;
import dt1.d;
import erd.g;
import crd.b;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import dt1.g;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import dt1.h;
import dt1.i;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import lnc.b9;
import o63.d;

public final class LiveMultiPkCohesionRankVC extends ViewController	// class@0015db
{
    public d j;
    public final LiveMultiPkCohesionRankVC$b k;
    public b l;
    public final p m;
    public LiveMultiPkCohesionRankEntryView n;
    public final b o;
    public final CohesionPkInfo p;
    public final e q;

    public void LiveMultiPkCohesionRankVC(b p0,CohesionPkInfo p1,e p2){
       a.p(p0, "coreModel");
       a.p(p2, "pkDelegate");
       super();
       this.o = p0;
       this.p = p1;
       this.q = p2;
       this.k = new LiveMultiPkCohesionRankVC$b(this);
       this.l = new b(new LiveMultiPkCohesionRankVC$rankModel$1(this), p1, p0.u(), p2);
       this.m = new ViewModelLazy(m0.d(e.class), new LiveMultiPkCohesionRankVC$$special$$inlined$viewModels$2(new LiveMultiPkCohesionRankVC$$special$$inlined$viewModels$1(this)), new LiveMultiPkCohesionRankVC$rankViewModel$2(this));
    }
    public static final LiveMultiPkCohesionRankEntryView V2(LiveMultiPkCohesionRankVC p0){
       p0 = p0.n;
       if (p0 == null) {
          a.S("rankEntryView");
       }
       return p0;
    }
    public void F2(){
       LiveMultiPkCohesionRankVC liveMultiPkC = LiveMultiPkCohesionRankVC.class;
       Object[] objArray = null;
       String str = "2";
       if (PatchProxy.applyVoid(objArray, this, liveMultiPkC, str)) {
          return;
       }
       LiveMultiPkCohesionRankEntryView liveMultiPkC1 = new LiveMultiPkCohesionRankEntryView(this.D2());
       this.n = liveMultiPkC1;
       this.R2(liveMultiPkC1);
       LiveMultiPkCohesionRankVC tl = this.l;
       Objects.requireNonNull(tl);
       if (!PatchProxy.applyVoid(objArray, tl, b.class, str) && !tl.h.e()) {
          c uoc = new c(tl);
          tl.d = uoc;
          a.m(uoc);
          tl.g.u0(962, LivePkMessages$SCLivePkCohesionGiftSendCompletionNotice.class, uoc);
          t ot = tl.h.v5();
          b uob = (ot != null)? ot.subscribe(new d(tl)): objArray;
          tl.a = uob;
       }
       e uoe = PatchProxy.apply(objArray, this, liveMultiPkC, "1");
       if (uoe == PatchProxyResult.class) {
          uoe = this.m.getValue();
       }
       if (!PatchProxy.applyVoidOneRefs(uoe, this, liveMultiPkC, "5")) {
          uoe.a.observe(this, new g(this));
          uoe.b.observe(this, new h(this));
          liveMultiPkC = this.n;
          if (liveMultiPkC == null) {
             a.S("rankEntryView");
          }
          liveMultiPkC.setOnClickListener(new i(uoe));
       }
       return;
    }
    public void J2(){
       String str = "3";
       if (PatchProxy.applyVoid(null, this, LiveMultiPkCohesionRankVC.class, str)) {
          return;
       }
       LiveMultiPkCohesionRankVC tl = this.l;
       Objects.requireNonNull(tl);
       if (!PatchProxy.applyVoid(null, tl, b.class, str)) {
          b d = tl.d;
          if (d != null) {
             tl.g.o(962, d);
          }
          b9.a(tl.a);
       }
       tl = this.j;
       if (tl != null) {
          tl.L();
          this.j = null;
       }
       return;
    }
}
