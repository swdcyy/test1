package com.kuaishou.live.common.core.component.multipk.game.vc.LiveMultiPkGameViewModel;
import yh3.a;
import com.kuaishou.live.common.core.component.multipk.game.vc.LiveMultiPkGameViewModel$a;
import nsd.u;
import zs1.b;
import ft1.b;
import kt1.d;
import msd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.multipk.game.vc.LiveMultiPkGameViewModel$gameObserver$1;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import bt1.c;
import pu1.m;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.ViewModel;
import ekd.k1;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ut1.j;
import bt1.a;
import kotlin.Pair;
import java.util.Map;
import java.lang.Integer;
import java.util.List;
import trd.u0;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.Number;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import pu1.d;
import com.kuaishou.live.common.core.component.multipk.utils.LiveMultiPkResourceTypes;

public final class LiveMultiPkGameViewModel extends a	// class@0015eb
{
    public final LiveMultiPkGameViewModel$gameObserver$1 a;
    public final LiveData b;
    public final LiveData c;
    public final LiveData d;
    public final LiveData e;
    public final b f;
    public final b g;
    public final d h;
    public final a i;
    public static final LiveMultiPkGameViewModel$a j;

    static {
       LiveMultiPkGameViewModel.j = new LiveMultiPkGameViewModel$a(null);
    }
    public void LiveMultiPkGameViewModel(b p0,b p1,d p2,a p3){
       a.p(p0, "coreModel");
       a.p(p1, "gameModel");
       a.p(p2, "animModel");
       a.p(p3, "getAnchorUserId");
       super();
       this.f = p0;
       this.g = p1;
       this.h = p2;
       this.i = p3;
       LiveMultiPkGameViewModel$gameObserver$1 ogameObserve = new LiveMultiPkGameViewModel$gameObserver$1(this);
       this.a = ogameObserve;
       MutableLiveData mutableLiveD = new MutableLiveData();
       this.o0(mutableLiveD);
       this.b = mutableLiveD;
       mutableLiveD = new MutableLiveData();
       this.o0(mutableLiveD);
       this.c = mutableLiveD;
       mutableLiveD = new MutableLiveData();
       this.o0(mutableLiveD);
       this.d = mutableLiveD;
       MutableLiveData mutableLiveD1 = new MutableLiveData();
       this.o0(mutableLiveD1);
       this.e = mutableLiveD1;
       p1.i(ogameObserve);
       if (m.m(p0)) {
          this.r0(mutableLiveD).setValue(new Object());
       }
       return;
    }
    public void onCleared(){
       if (PatchProxy.applyVoid(null, this, LiveMultiPkGameViewModel.class, "3")) {
          return;
       }
       super.onCleared();
       this.g.t(this.a);
       k1.n(this);
       return;
    }
    public final boolean u0(){
       Object obj = PatchProxy.apply(null, this, LiveMultiPkGameViewModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (this.f.w().h ^ 0x01);
    }
    public final LiveData v0(){
       return this.e;
    }
    public final Pair w0(a p0){
       Object obj1;
       Pair obj = PatchProxy.applyOneRefs(p0, this, LiveMultiPkGameViewModel.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = this.g.j();
       Integer integer = p0.c().get(Integer.valueOf(i));
       int i1 = 0;
       int i2 = (integer != null)? integer.intValue(): 0;
       Iterator iterator = u0.D1(p0.c()).iterator();
       while (true) {
          if (iterator.hasNext()) {
             obj1 = iterator.next();
             LiveCommonLogTag liveCommonLo = (obj1.getFirst().intValue() != i)? 1: null;
             if (!liveCommonLo) {
                continue ;
             }
          }else {
             obj1 = null;
          }
          if (obj1 != null) {
             Integer second = obj1.getSecond();
             if (second != null) {
                i1 = second.intValue();
             }
          }
          b.d0(LiveCommonLogTag.MULTI_PK, "LiveMultiPkGameViewModel getTeamPkResultType", "leftRank", Integer.valueOf(i2), "rightRank", Integer.valueOf(i1));
          int i3 = 2;
          if (i2 < i1) {
             obj = new Pair(Integer.valueOf(1), Integer.valueOf(i3));
             break ;
          }else if(i2 > i1){
             obj = new Pair(Integer.valueOf(i3), Integer.valueOf(1));
             break ;
          }else {
             obj = new Pair(Integer.valueOf(3), Integer.valueOf(3));
             break ;
          }
       }
       return obj;
    }
    public final d x0(int p0,boolean p1){
       LiveMultiPkResourceTypes pK_RESOURCE_;
       if (p0 != 1) {
          if (p0 != 2) {
             pK_RESOURCE_ = (p1)? LiveMultiPkResourceTypes.PK_RESOURCE_TIE_SMALL: LiveMultiPkResourceTypes.SCORE_LIMIE_RESULT_TIE_SMALL;
          }else if(p1){
             pK_RESOURCE_ = LiveMultiPkResourceTypes.PK_RESOURCE_FAIL_SMALL;
          }else {
             pK_RESOURCE_ = LiveMultiPkResourceTypes.SCORE_LIMIE_RESULT_FAIL_SMALL;
          }
       }else if(p1){
          pK_RESOURCE_ = LiveMultiPkResourceTypes.PK_RESOURCE_WIN_SMALL;
       }else {
          pK_RESOURCE_ = LiveMultiPkResourceTypes.SCORE_LIMIE_RESULT_WIN_SMALL;
       }
       return pK_RESOURCE_;
    }
    public final boolean y0(int p0){
       int i = 1;
       if (p0 != i && p0 != 2) {
          i = false;
       }
       return i;
    }
    public final boolean z0(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveMultiPkGameViewModel.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 != null && p0.c().size() == 2) {
          b = true;
       }
       return b;
    }
}
