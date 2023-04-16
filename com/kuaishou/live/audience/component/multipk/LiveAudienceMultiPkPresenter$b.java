package com.kuaishou.live.audience.component.multipk.LiveAudienceMultiPkPresenter$b;
import rs1.b;
import com.kuaishou.live.audience.component.multipk.LiveAudienceMultiPkPresenter;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import trd.t0;
import rs1.h;
import kotlin.Pair;
import java.lang.Integer;
import qrd.r0;
import java.lang.Long;
import ic3.a$a;
import kotlin.jvm.internal.a;
import java.util.concurrent.CopyOnWriteArraySet;
import com.kuaishou.live.lite.pk.MultiPkGameState;
import java.lang.Number;
import java.util.Objects;
import com.kuaishou.live.common.core.component.multipk.game.vc.LiveMultiPkGameController;
import ct1.b;
import com.kuaishou.live.common.core.component.multipk.game.cohesion.rank.LiveMultiPkCohesionRankVC;
import dt1.b;
import androidx.lifecycle.LiveData;
import java.lang.Boolean;
import ct1.a;
import com.kuaishou.protobuf.livestream.nano.CohesionPkInfo;
import com.yxcorp.gifshow.models.Gift;
import ct1.a$a;
import com.kwai.framework.model.user.UserInfo;
import lp3.e;
import lp3.c;
import lp3.b;

public final class LiveAudienceMultiPkPresenter$b implements b	// class@000bb6
{
    public final LiveAudienceMultiPkPresenter b;

    public void LiveAudienceMultiPkPresenter$b(LiveAudienceMultiPkPresenter p0){
       this.b = p0;
       super();
    }
    public boolean Aa(){
       return this.b.N;
    }
    public Map E8(){
       LiveAudienceMultiPkPresenter$b obj = PatchProxy.apply(null, this, LiveAudienceMultiPkPresenter$b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       if (obj.z == null) {
          return t0.z();
       }
       int i = LiveAudienceMultiPkPresenter.W8(obj).a3();
       long l = LiveAudienceMultiPkPresenter.W8(this.b).Y2();
       if (!i) {
          return t0.z();
       }
       Pair[] pairArray = new Pair[]{r0.a("play_type", Integer.valueOf(i)),r0.a("pk_time", Long.valueOf(l))};
       return t0.j0(pairArray);
    }
    public void Fe(a$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceMultiPkPresenter$b.class, "6")) {
          return;
       }
       a.p(p0, "multiPKListener");
       this.b.O.remove(p0);
       return;
    }
    public void I8(a$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceMultiPkPresenter$b.class, "5")) {
          return;
       }
       a.p(p0, "multiPKListener");
       this.b.O.add(p0);
       return;
    }
    public String M9(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceMultiPkPresenter$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveAudienceMultiPkPresenter.W8(this.b).Z2();
    }
    public MultiPkGameState Si(){
       LiveAudienceMultiPkPresenter$b obj = PatchProxy.apply(null, this, LiveAudienceMultiPkPresenter$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       if (obj.z == null) {
          return null;
       }
       return LiveAudienceMultiPkPresenter.W8(obj).X2();
    }
    public int Uh(){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       h obj = PatchProxy.apply(objArray, this, LiveAudienceMultiPkPresenter$b.class, "8");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = LiveAudienceMultiPkPresenter.W8(this.b);
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, h.class, "13");
       if (obj1 != patchProxyRe) {
          i = obj1.intValue();
       }else {
          obj = obj.k;
          if (obj != null) {
             Object obj2 = PatchProxy.apply(objArray, obj, LiveMultiPkGameController.class, "10");
             if (obj2 != patchProxyRe) {
                i = obj2.intValue();
             }else {
                LiveMultiPkGameController r = obj.r;
                if (r != null) {
                   obj2 = PatchProxy.apply(objArray, r, b.class, "3");
                   if (obj2 != patchProxyRe) {
                      i = obj2.intValue();
                   }else {
                      b j = r.j;
                      if (j != null) {
                         obj2 = PatchProxy.apply(objArray, j, LiveMultiPkCohesionRankVC.class, "4");
                         if (obj2 != patchProxyRe) {
                            i = obj2.intValue();
                         }else {
                            LiveMultiPkCohesionRankVC l = j.l;
                            Objects.requireNonNull(l);
                            Object obj3 = PatchProxy.apply(objArray, l, b.class, "1");
                            if (obj3 != patchProxyRe) {
                               i = obj3.intValue();
                            }else if(a.g(l.b.getValue(), Boolean.TRUE)){
                               Gift gift = a.a.a(l.f);
                               if (gift != null) {
                                  gift = gift.mId;
                               }
                            }
                         }
                      }
                   }
                }
             }
          }
          i = -1;
       }
       return i;
    }
    public boolean Vf(){
       LiveAudienceMultiPkPresenter$b obj = PatchProxy.apply(null, this, LiveAudienceMultiPkPresenter$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b;
       if (obj.z == null) {
          return false;
       }
       return LiveAudienceMultiPkPresenter.W8(obj).c3();
    }
    public UserInfo Y6(){
       LiveAudienceMultiPkPresenter$b obj = PatchProxy.apply(null, this, LiveAudienceMultiPkPresenter$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       if (obj.z == null) {
          return null;
       }
       return LiveAudienceMultiPkPresenter.W8(obj).W2();
    }
    public void create(e p0){
       b.a(this, p0);
    }
    public void destroy(){
       b.b(this);
    }
}
