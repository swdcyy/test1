package com.kuaishou.live.audience.component.gift.gift.audience.selfgiftmock.LiveAudienceSelfSendGiftMockPresenter$mSelfGiftEffectMockService$1;
import lk1.a;
import com.kuaishou.live.audience.component.gift.gift.audience.selfgiftmock.LiveAudienceSelfSendGiftMockPresenter;
import java.lang.Object;
import java.util.Set;
import com.google.common.collect.o;
import java.lang.String;
import kotlin.jvm.internal.a;
import lk1.a$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import lm1.i;
import java.lang.Integer;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import kotlin.jvm.internal.Ref$ObjectRef;
import ai1.d;
import ai1.c;
import brd.t;
import cjd.e;
import erd.o;
import com.kuaishou.live.audience.component.gift.gift.audience.selfgiftmock.LiveAudienceSelfSendGiftMockPresenter$mSelfGiftEffectMockService$1$a;
import com.kuaishou.live.audience.component.gift.gift.audience.selfgiftmock.LiveAudienceSelfSendGiftMockPresenter$mSelfGiftEffectMockService$1$b;
import erd.g;
import crd.b;
import com.kuaishou.live.audience.component.gift.gift.audience.selfgiftmock.LiveAudienceSelfSendGiftMockPresenter$mSelfGiftEffectMockService$1$requestMockSelfGiftEffect$3;
import java.util.Objects;
import rm1.b;
import java.util.concurrent.CopyOnWriteArrayList;
import msd.a;
import lp3.e;
import lp3.c;
import lp3.b;

public final class LiveAudienceSelfSendGiftMockPresenter$mSelfGiftEffectMockService$1 implements a	// class@000af1
{
    public final Set b;
    public final LiveAudienceSelfSendGiftMockPresenter c;

    public void LiveAudienceSelfSendGiftMockPresenter$mSelfGiftEffectMockService$1(LiveAudienceSelfSendGiftMockPresenter p0){
       this.c = p0;
       super();
       Set set = o.g();
       a.o(set, "Sets.newConcurrentHashSet\(\)");
       this.b = set;
    }
    public void Gc(a$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceSelfSendGiftMockPresenter$mSelfGiftEffectMockService$1.class, "2")) {
          return;
       }
       a.p(p0, "listener");
       this.b.add(p0);
       return;
    }
    public void Li(i p0,String p1,String p2,int p3,String p4,String p5){
       LiveAudienceSelfSendGiftMockPresenter$mSelfGiftEffectMockService$1 omSelfGiftEf = LiveAudienceSelfSendGiftMockPresenter$mSelfGiftEffectMockService$1.class;
       if (PatchProxy.isSupport(omSelfGiftEf)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),p4,p5};
          if (PatchProxy.applyVoid(objArray, this, omSelfGiftEf, "1")) {
             return;
          }
       }
       a.p(p1, "liveStreamId");
       a.p(p2, "comboKey");
       a.p(p4, "giftSendInfo");
       b.Z(LiveLogTag.LIVE_SELF_GIFT_MOCK, "startRequestAfterGiftSendInfo");
       Ref$ObjectRef objectRef = new Ref$ObjectRef();
       objectRef.element = null;
       b uob = c.b().b(p1, p2, p3, p4, p5).map(new e()).subscribe(new LiveAudienceSelfSendGiftMockPresenter$mSelfGiftEffectMockService$1$a(this, p0, objectRef), new LiveAudienceSelfSendGiftMockPresenter$mSelfGiftEffectMockService$1$b(this, p0, objectRef));
       objectRef.element = uob;
       LiveAudienceSelfSendGiftMockPresenter v = this.c.v;
       LiveAudienceSelfSendGiftMockPresenter$mSelfGiftEffectMockService$1$requestMockSelfGiftEffect$3 omSelfGiftEf1 = new LiveAudienceSelfSendGiftMockPresenter$mSelfGiftEffectMockService$1$requestMockSelfGiftEffect$3(this, objectRef);
       Objects.requireNonNull(v);
       if (!PatchProxy.applyVoidTwoRefs(uob, omSelfGiftEf1, v, b.class, "1")) {
          a.p(omSelfGiftEf1, "fallback");
          if (v.b != null) {
             v.a.add(uob);
          }else {
             omSelfGiftEf1.invoke();
          }
       }
       return;
    }
    public void create(e p0){
       b.a(this, p0);
    }
    public void destroy(){
       b.b(this);
    }
    public final Set r(){
       return this.b;
    }
    public void wk(a$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceSelfSendGiftMockPresenter$mSelfGiftEffectMockService$1.class, "3")) {
          return;
       }
       a.p(p0, "listener");
       this.b.remove(p0);
       return;
    }
}
