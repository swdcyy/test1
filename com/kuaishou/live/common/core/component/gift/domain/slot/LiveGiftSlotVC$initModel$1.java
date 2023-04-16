package com.kuaishou.live.common.core.component.gift.domain.slot.LiveGiftSlotVC$initModel$1;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import tj1.f;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import com.kuaishou.live.common.core.component.gift.domain.slot.manager.LiveGiltSlotDisplayManager;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.lifecycle.Lifecycle;
import com.kuaishou.live.viewcontroller.ViewController;
import androidx.lifecycle.Lifecycle$State;
import com.kuaishou.live.common.core.component.gift.log.LiveGiftTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.content.Context;
import android.view.View;
import ha1.a;
import k51.d;
import com.kuaishou.live.lite.layoutmanager.LayoutViewType;
import java.lang.Enum;
import qrd.l1;
import gk1.d;
import com.kuaishou.live.common.core.component.gift.domain.slot.view.LiveGiftSlotItemView;
import vj1.a;
import com.kuaishou.live.lite.gesture.LiveLiteGestureService;
import yj1.c;
import com.kuaishou.live.common.core.component.gift.giftNaming.springNaming.LiveGiftSpringNamingModel;
import java.util.Objects;
import gk1.b;
import yj1.b;
import com.kuaishou.live.common.core.component.gift.domain.slot.manager.LiveGiftSlotQueueManager;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.gift.domain.slot.manager.a;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.kuaishou.live.common.core.component.gift.domain.slot.data.GiftSlotMessage;
import java.util.Map;
import xj1.a;
import com.kuaishou.live.basic.model.QLiveMessage;
import fk1.a;
import java.lang.Boolean;
import java.lang.Math;
import ak1.a;
import com.kuaishou.live.common.core.component.gift.domain.slot.data.a;
import java.util.Comparator;
import java.util.Collections;
import com.kuaishou.live.common.core.component.gift.domain.slot.manager.a$a;
import com.kuaishou.live.common.core.component.gift.domain.slot.manager.b;
import java.lang.StringBuilder;
import com.kuaishou.live.common.core.component.gift.domain.slot.manager.a$b;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import ek1.b;
import yb6.d;
import com.kuaishou.live.common.core.component.gift.domain.slot.config.slotqueue.LiveGiftSlotQueueConfig;
import ek1.e;
import java.lang.Integer;
import java.lang.Number;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a$a;

public final class LiveGiftSlotVC$initModel$1 implements Model$a	// class@00125a
{
    public final f b;

    public void LiveGiftSlotVC$initModel$1(f p0){
       this.b = p0;
       super();
    }
    public void F(String p0,Object p1,Object p2){
       LiveGiltSlotDisplayManager liveGiltSlot2;
       String str4;
       Iterator iterator;
       a a;
       a uoa4;
       LiveGiftSlotQueueManager c2;
       b b4;
       a$b obj1;
       LiveGiftSlotVC$initModel$1 oinitModel$1 = this;
       Iterator obj = p2;
       LiveGiltSlotDisplayManager liveGiltSlot = LiveGiltSlotDisplayManager.class;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, obj, this, LiveGiftSlotVC$initModel$1.class, "1")) {
       }else {
          a.p(p0, "source");
          if (obj) {
             LiveGiftSlotVC$initModel$1 b = oinitModel$1.b;
             if (b.o == null) {
                Object[] objArray = null;
                String str = "1";
                if (!PatchProxy.applyVoid(objArray, b, f.class, "10")) {
                   if (b.getLifecycle().getCurrentState() == Lifecycle$State.DESTROYED) {
                      b.Z(LiveGiftTag.GIFT_SLOT, "[LiveGiftSlotVC][initVCIfNeed], currentState is DESTROYED");
                   }else if(b.m != null){
                      int i2 = (b.I != null)? 0x7f0d0b43: 0x7f0d0b42;
                      View view = a.a(b, b.D2(), i2);
                      view.setTag(d.a, LayoutViewType.GiftSlot.name());
                      b.R2(view);
                      d uod = new d(b.A, b.q, b.A2(0x7f0a1d7f), b.v, b.p.y, b.o, b.H);
                      b.m = view;
                      d uod1 = new d(b.A, b.q, b.A2(0x7f0a1d0e), b.v, b.p.a(), b.o, b.H);
                      b.n = view;
                      f m = b.m;
                      if (m != null) {
                         b.z2(m);
                         b.j.add(m);
                      }
                      m = b.n;
                      if (m != null) {
                         b.z2(m);
                         b.j.add(m);
                      }
                      f l1 = b.l;
                      if (l1 == null) {
                         a.S("displayManager");
                      }
                      Objects.requireNonNull(l1);
                      if (!PatchProxy.applyVoid(objArray, l1, liveGiltSlot, str)) {
                         for (i2 = 0; i2 < l1.d.a().size(); i2 = i2 + 1) {
                            l1.d.a().get(i2).b3(l1.g);
                         }
                      }
                   }
                }
                LiveGiltSlotDisplayManager liveGiltSlot1 = f.V2(oinitModel$1.b);
                Objects.requireNonNull(liveGiltSlot1);
                String str1 = "5";
                if (!PatchProxy.applyVoidOneRefs(obj, liveGiltSlot1, liveGiltSlot, str1)) {
                   LiveGiltSlotDisplayManager c = liveGiltSlot1.c;
                   Objects.requireNonNull(c);
                   LiveGiftSlotQueueManager liveGiftSlot = LiveGiftSlotQueueManager.class;
                   a uoa = a.class;
                   if (PatchProxy.applyVoidOneRefs(obj, c, liveGiftSlot, str)) {
                   label_0147 :
                      liveGiltSlot2 = liveGiltSlot1;
                   }else if(q.f(obj)){
                      b.Z(LiveGiftTag.GIFT_SLOT, "[LiveGiftSlotQueueManager][appendMessages], messages is null");
                      goto label_0147 ;
                   }else {
                      obj = obj.iterator();
                      String str2 = "3";
                      String str3 = "2";
                      boolean b1 = true;
                      while (obj.hasNext()) {
                         GiftSlotMessage giftSlotMess = obj.next();
                         if (giftSlotMess == null || giftSlotMess.mSlotPos <= b1) {
                            continue ;
                         }else {
                            LiveGiftSlotQueueManager c1 = c.c;
                            GiftSlotMessage mMergeKey = giftSlotMess.mMergeKey;
                            Objects.requireNonNull(c1);
                            a uoa1 = PatchProxy.applyOneRefs(mMergeKey, c1, uoa, str2);
                            if (uoa1 == PatchProxyResult.class) {
                               uoa1 = c1.d.get(mMergeKey);
                            }
                            if (uoa1 != null) {
                               boolean b2 = a.c(giftSlotMess, b1);
                               a uoa2 = a.class;
                               if (PatchProxy.isSupport(uoa2) && PatchProxy.applyVoidTwoRefs(giftSlotMess, Boolean.valueOf(b2), uoa1, uoa2, str)) {
                                  liveGiltSlot2 = liveGiltSlot1;
                                  str4 = str1;
                                  iterator = obj;
                               }else {
                                  a = uoa1.a;
                                  a uoa3 = uoa2;
                                  iterator = obj;
                                  a.mExpireDate = Math.max(a.mExpireDate, giftSlotMess.mExpireDate);
                                  a = uoa1.a;
                                  giftSlotMess.mExpireDate = a.mExpireDate;
                                  a.mTime = Math.min(a.mTime, giftSlotMess.mTime);
                                  QLiveMessage mTime = uoa1.a.mTime;
                                  giftSlotMess.mTime = mTime;
                                  if (!b2) {
                                     liveGiltSlot2 = liveGiltSlot1;
                                     str4 = str1;
                                     long l = uoa1.c + (long)giftSlotMess.mRank;
                                     uoa1.c = l;
                                  }else {
                                     liveGiltSlot2 = liveGiltSlot1;
                                     str4 = str1;
                                  }
                                  uoa1.e = mTime;
                                  uoa1.f = giftSlotMess.mExpireDate;
                                  uoa4 = uoa3;
                                  if (!PatchProxy.applyVoidOneRefs(giftSlotMess, uoa1, uoa4, "8")) {
                                     uoa1.g.add(giftSlotMess);
                                     uoa1.h.c(1);
                                  }
                                  if (!PatchProxy.applyVoid(null, uoa1, uoa4, str3)) {
                                     Collections.sort(uoa1.g, a.b);
                                  }
                               }
                            }else {
                               liveGiltSlot2 = liveGiltSlot1;
                               str4 = str1;
                               iterator = obj;
                               c2 = c.c;
                               uoa4 = new a(giftSlotMess, a.c(giftSlotMess, true), c.d);
                               Objects.requireNonNull(c2);
                               if (!PatchProxy.applyVoidOneRefs(uoa4, c2, uoa, str)) {
                                  c2.c.add(uoa4);
                                  c2.d.put(c2.a.a(uoa4), uoa4);
                                  c2.b.c(c2.a.b(uoa4));
                               }
                            }
                            liveGiltSlot1 = liveGiltSlot2;
                            obj = iterator;
                            str1 = str4;
                            Boolean uBoolean = null;
                         }
                      }
                      liveGiltSlot2 = liveGiltSlot1;
                      boolean b3 = true;
                      try{
                         c2 = c.c;
                         if (!PatchProxy.applyVoidOneRefs(c2, c, liveGiftSlot, str3)) {
                            b4 = b.b;
                            Objects.requireNonNull(c2);
                            if (!PatchProxy.applyVoidOneRefs(b4, c2, uoa, "7")) {
                               Collections.sort(c2.c, b4);
                            }
                         }
                      }catch(java.lang.Exception e0){
                         c2 = c.c;
                         str1 = PatchProxy.applyOneRefs(c2, null, a.class, str1);
                         if (str1 != PatchProxyResult.class) {
                         }else {
                            str1 = "giftSlotCrashLog&";
                            obj1 = c2.a();
                         label_027f :
                            if (obj1.hasNext()) {
                               a uoa6 = obj1.next();
                               str1 = str1+"g:"+uoa6.c().mGiftId+"|r:"+uoa6.h()+"|t:"+uoa6.g()+"&";
                               goto label_027f ;
                            }else {
                               b.c0(LiveGiftTag.GIFT_SLOT, "[LiveGiftSlotUtil][buildGiftSlotMessageStr]", "result:", str1);
                               str1 = str1;
                            }
                         }
                         ExceptionHandler.handleCaughtException(new IllegalStateException(str1));
                      }
                      c2 = c.e;
                      LiveGiftSlotQueueManager c3 = c.c;
                      Objects.requireNonNull(c2);
                      if (PatchProxy.applyOneRefs(c3, c2, b.class, str) != PatchProxyResult.class) {
                      }else {
                         a$b int str5 = PatchProxy.applyOneRefs(c3, c2, b.class, str3);
                         if (str5 != PatchProxyResult.class) {
                            c3 = str5;
                         }else {
                            str5 = c3.a();
                            int i1 = 0;
                            while (str5.hasNext()) {
                               a uoa5 = str5.next();
                               if (!uoa5.e()) {
                                  str5.remove(uoa5);
                               }else if(uoa5.a() - d.a() < 0){
                                  str5.remove(uoa5);
                               }else {
                                  i1 = i1 + 1;
                                  if (i1 > c2.a.a) {
                                     str5.remove(uoa5);
                                  }
                               }
                            }
                         }
                         str5 = c2.b.a();
                         if (PatchProxy.applyOneRefs(c3, c2, b.class, str2) != PatchProxyResult.class) {
                         }else {
                            b b5 = c2.b;
                            if (b5.c < b5.a) {
                               b3 = false;
                            }
                            if (b3) {
                               c2.c.a(c3);
                            }
                         }
                         b4 = c2.b;
                         if (PatchProxy.isSupport(b.class)) {
                            obj1 = PatchProxy.applyThreeRefs(Integer.valueOf(str5), b4, "trimSlotMsgListIfNeed", c2, b.class, "4");
                            if (obj1 != PatchProxyResult.class) {
                               obj1.intValue();
                            }
                         }
                         int i = b4.a();
                         if (str5 != i) {
                            b.e0(LiveGiftTag.GIFT_SLOT, "[LiveGiftSlotTrimLogic][trimIfNeed]", "trimTag", "trimSlotMsgListIfNeed", "beforeTrimmedNum", Integer.valueOf(str5), "afterTrimmedNum", Integer.valueOf(i));
                         }
                      }
                   }
                   liveGiltSlot2.e();
                }
             }
          }
       }
       return;
    }
    public void w0(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveGiftSlotVC$initModel$1.class, "2")) {
       }else {
          a.p(p0, "source");
          Model$a$a.b(this, p0, p1, p2);
       }
       return;
    }
}
