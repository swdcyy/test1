package com.kuaishou.live.audience.component.gift.gift.audience.selfgiftmock.LiveAudienceSelfSendGiftMockPresenter$mSelfGiftEffectMockService$1$b;
import erd.g;
import com.kuaishou.live.audience.component.gift.gift.audience.selfgiftmock.LiveAudienceSelfSendGiftMockPresenter$mSelfGiftEffectMockService$1;
import lm1.i;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.retrofit.model.KwaiException;
import java.lang.StringBuilder;
import com.kuaishou.live.audience.component.gift.gift.audience.selfgiftmock.LiveAudienceSelfSendGiftMockPresenter;
import com.yxcorp.utility.Log;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Set;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import lk1.a$a;
import qrd.l1;
import crd.b;
import rm1.b;

public final class LiveAudienceSelfSendGiftMockPresenter$mSelfGiftEffectMockService$1$b implements g	// class@000aef
{
    public final LiveAudienceSelfSendGiftMockPresenter$mSelfGiftEffectMockService$1 b;
    public final i c;
    public final Ref$ObjectRef d;

    public void LiveAudienceSelfSendGiftMockPresenter$mSelfGiftEffectMockService$1$b(LiveAudienceSelfSendGiftMockPresenter$mSelfGiftEffectMockService$1 p0,i p1,Ref$ObjectRef p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       KwaiException kwaiExceptio;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceSelfSendGiftMockPresenter$mSelfGiftEffectMockService$1$b.class, "1")) {
       }else {
          int i = 0x18a89;
          String str = "";
          if (p0 instanceof KwaiException) {
             kwaiExceptio = p0;
             KwaiException mErrorCode = kwaiExceptio.mErrorCode;
             kwaiExceptio = kwaiExceptio.mErrorMessage;
             if (kwaiExceptio != null) {
                str = kwaiExceptio;
             }
             kwaiExceptio = mErrorCode;
          }
          this.b.c.V8(this.c, "CLIENT_AFTER_SEND_REQUEST_RESULT", '['+this.b.c.p+"][LiveSelfGiftEffectMockService]"+"message"+str+",request error:"+Log.f(p0), kwaiExceptio);
          b.I(LiveLogTag.LIVE_SELF_GIFT_MOCK, "requestAfterGiftSendInfoError", p0);
          Set set = this.b.r();
          ArrayList uArrayList = new ArrayList(u.Y(set, 10));
          Iterator iterator = set.iterator();
          while (iterator.hasNext()) {
             a$a uoa = iterator.next();
             if (p0 != null) {
                uoa.b(p0);
             }
             uArrayList.add(l1.a);
          }
          this.b.c.v.a(this.d.element);
       }
       return;
    }
}
