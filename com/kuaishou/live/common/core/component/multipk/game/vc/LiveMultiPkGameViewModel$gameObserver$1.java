package com.kuaishou.live.common.core.component.multipk.game.vc.LiveMultiPkGameViewModel$gameObserver$1;
import bt1.c;
import com.kuaishou.live.common.core.component.multipk.game.vc.LiveMultiPkGameViewModel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import pu1.d;
import pu1.m;
import zs1.b;
import com.kuaishou.live.common.core.component.multipk.utils.LiveMultiPkResourceTypes;
import kt1.e;
import msd.a;
import kt1.d;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import yh3.a;
import bt1.a;
import kotlin.jvm.internal.a;
import kotlin.Pair;
import java.lang.Number;
import java.util.Map;
import ft1.b;
import java.lang.Integer;
import ut1.k;
import cu1.d;
import lnc.a1;
import com.yxcorp.utility.TextUtils;
import kt1.c;
import fg6.a;
import com.google.gson.Gson;
import java.lang.Throwable;
import com.kuaishou.live.common.core.component.multipk.game.vc.anim.LiveMultiPkGameAnimType;
import com.kuaishou.live.common.core.component.multipk.game.vc.LiveMultiPkGameViewModel$gameObserver$1$onGamePunish$$inlined$let$lambda$1;
import bt1.b;

public final class LiveMultiPkGameViewModel$gameObserver$1 implements c	// class@0015ea
{
    public final LiveMultiPkGameViewModel b;

    public void LiveMultiPkGameViewModel$gameObserver$1(LiveMultiPkGameViewModel p0){
       this.b = p0;
       super();
    }
    public void Y0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveMultiPkGameViewModel$gameObserver$1.class, "1")) {
          return;
       }
       if (this.b.u0()) {
          LiveMultiPkGameViewModel$gameObserver$1 tb = this.b;
          LiveMultiPkGameViewModel h = tb.h;
          Objects.requireNonNull(tb);
          LiveMultiPkResourceTypes liveMultiPkR = PatchProxy.apply(objArray, tb, LiveMultiPkGameViewModel.class, "6");
          if (liveMultiPkR != PatchProxyResult.class) {
          }else if(m.a.i(tb.f)){
             liveMultiPkR = LiveMultiPkResourceTypes.COHESION_PK_START_ANIM;
          }else {
             liveMultiPkR = LiveMultiPkResourceTypes.PK_RESOURCE_VS;
          }
          h.c(liveMultiPkR, objArray, objArray);
          b.Z(LiveCommonLogTag.MULTI_PK, "LiveMultiPkGameViewModel onGameVote, show vote start anim");
       }
       return;
    }
    public void Z1(){
       if (PatchProxy.applyVoid(null, this, LiveMultiPkGameViewModel$gameObserver$1.class, "3")) {
          return;
       }
       LiveMultiPkGameViewModel$gameObserver$1 tb = this.b;
       tb.r0(tb.v0()).setValue(new Object());
       return;
    }
    public void e2(a p0){
       String str1;
       LiveMultiPkResourceTypes cOHESION_PK_;
       LiveMultiPkResourceTypes liveMultiPkR;
       LiveMultiPkGameViewModel liveMultiPkG = LiveMultiPkGameViewModel.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiPkGameViewModel$gameObserver$1.class, "2")) {
          return;
       }
       a.p(p0, "gameInfo");
       if (this.b.u0()) {
          LiveMultiPkGameViewModel$gameObserver$1 tb = this.b;
          Objects.requireNonNull(tb);
          Object obj = PatchProxy.applyOneRefs(p0, tb, liveMultiPkG, "7");
          String str = null;
          boolean b = true;
          if (obj != patchProxyRe) {
          }else if(tb.z0(p0)){
             obj = PatchProxy.applyOneRefs(p0, tb, liveMultiPkG, "8");
             if (obj != patchProxyRe) {
             }else if(!tb.z0(p0)){
                obj = str;
             }else {
                int i1 = tb.y0(p0.d()) ^ b;
                int i2 = tb.w0(p0).getFirst().intValue();
                if (i2 != b) {
                   if (i2 != 2) {
                      liveMultiPkR = (i1)? LiveMultiPkResourceTypes.FINAL_TIE: LiveMultiPkResourceTypes.SCORE_LIMIE_RESULT_TIE;
                   }else if(i1){
                      liveMultiPkR = LiveMultiPkResourceTypes.FINAL_LOSE;
                   }else {
                      liveMultiPkR = LiveMultiPkResourceTypes.SCORE_LIMIE_RESULT_LOSE;
                   }
                }else if(i1){
                   liveMultiPkR = LiveMultiPkResourceTypes.FINAL_WIN;
                }else {
                   liveMultiPkR = LiveMultiPkResourceTypes.SCORE_LIMIE_RESULT_WIN;
                }
             }
          }else {
             obj = PatchProxy.applyOneRefs(p0, tb, liveMultiPkG, "9");
             if (obj != patchProxyRe) {
             }else {
                Integer integer = p0.c().get(Integer.valueOf(tb.g.j()));
                b.c0(LiveCommonLogTag.MULTI_PK, "LiveMultiPkGameViewModel  getSoloVoteEndAnimResource", "rank", integer);
                if (integer != null && integer.intValue() == b) {
                   liveMultiPkR = LiveMultiPkResourceTypes.VOTE_RANK_1;
                }else if(integer != null && integer.intValue() == 2){
                   liveMultiPkR = LiveMultiPkResourceTypes.VOTE_RANK_2;
                }else if(integer != null && integer.intValue() == 3){
                   liveMultiPkR = LiveMultiPkResourceTypes.VOTE_RANK_3;
                }else if(integer != null && integer.intValue() == 4){
                   liveMultiPkR = LiveMultiPkResourceTypes.VOTE_RANK_4;
                }else {
                   liveMultiPkR = LiveMultiPkResourceTypes.FINAL_LOSE;
                }
             }
          }
          obj = liveMultiPkR;
          if (obj != null) {
             tb = this.b;
             Objects.requireNonNull(tb);
             Object obj1 = PatchProxy.applyOneRefs(p0, tb, liveMultiPkG, "10");
             if (obj1 != patchProxyRe) {
             }else if(m.a.i(tb.f)){
                e uoe = PatchProxy.applyOneRefs(p0, tb, liveMultiPkG, "11");
                if (uoe != patchProxyRe) {
                }else {
                   k ok = d.g(p0.d, tb.i.invoke(), b);
                   if (ok != null) {
                      if (!ok.g()) {
                         str1 = a1.p(R.string.arg_RES_7f101f92);
                         a.o(str1, "CommonUtil.string\(R.stri¡­_cohesion_nobody_support\)");
                      }else {
                         str1 = a1.r(R.string.arg_RES_7f101f97, TextUtils.N(ok.g()));
                         a.o(str1, "CommonUtil.string\(\n     ¡­it.teamScore\)\n          \)");
                      }
                   }else {
                      str1 = "";
                   }
                   int i = tb.w0(p0).getFirst().intValue();
                   if (i != b) {
                      cOHESION_PK_ = (i != 2)? LiveMultiPkResourceTypes.COHESION_PK_RESULT_TIE_BOTTOM_BACKGROUND: LiveMultiPkResourceTypes.COHESION_PK_RESULT_LOSE_BOTTOM_BACKGROUND;
                      liveMultiPkR = str;
                   }else {
                      cOHESION_PK_ = LiveMultiPkResourceTypes.COHESION_PK_RESULT_WIN_BOTTOM_BACKGROUND;
                      liveMultiPkR = LiveMultiPkResourceTypes.COHESION_PK_RESULT_HEART;
                   }
                   str = a.a.q(new c(cOHESION_PK_, liveMultiPkR, str1));
                   uoe = new e(LiveMultiPkGameAnimType.WITH_BOTTOM_AREA, str);
                }
                obj1 = uoe;
             }else {
                obj1 = new e(LiveMultiPkGameAnimType.NORMAL, str);
             }
             this.b.h.c(obj, obj1, new LiveMultiPkGameViewModel$gameObserver$1$onGamePunish$$inlined$let$lambda$1(this, p0));
          }
       }
       return;
    }
    public void i2(){
       b.b(this);
    }
}
