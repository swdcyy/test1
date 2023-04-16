package com.kuaishou.live.common.core.component.gift.domain.effect.LiveGiftEffectManager$1;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import com.kuaishou.live.common.core.component.gift.domain.effect.LiveGiftEffectManager;
import java.lang.Object;
import java.lang.String;
import di1.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import gi1.c;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import com.kuaishou.android.live.log.b;
import java.lang.Boolean;
import com.kuaishou.livestream.message.nano.LiveCommonEffectInfo;
import java.lang.Integer;
import kz2.a;
import com.kuaishou.live.effect.resource.download.common.e;
import gi1.a;
import gi1.b;
import h03.a;
import g03.a;
import java.lang.Long;
import hi1.f;
import java.util.HashMap;
import java.util.Map;
import hi1.i;
import hi1.a;
import com.kuaishou.live.common.core.component.gift.domain.effect.task.combo.LiveEffectRechargeGiftComboTask;
import pz2.c;
import com.kuaishou.live.basic.model.QLiveMessage;
import fk1.a;
import ci1.b;
import com.kuaishou.live.core.show.gift.GiftMessage;
import ci1.a;
import ki1.a;
import com.kuaishou.live.common.core.component.gift.data.message.BroadcastGiftMessage;
import ii1.a;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a$a;

public final class LiveGiftEffectManager$1 implements Model$a	// class@00118e
{
    public final LiveGiftEffectManager b;

    public void LiveGiftEffectManager$1(LiveGiftEffectManager p0){
       this.b = p0;
       super();
    }
    public void F(String p0,Object p1,Object p2){
       PatchProxyResult this;
       a a;
       a obj1;
       a this1;
       a uoa1;
       LiveGiftEffectManager this1;
       int i2;
       a uoa3;
       HashMap obj2;
       Object[] objArray1;
       f obj5;
       object oobject;
       LiveEffectRechargeGiftComboTask obj6;
       Object obj = p2;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, obj, this, LiveGiftEffectManager$1.class, "1")) {
       }else {
          a.p(p0, "source");
          if (obj) {
             LiveGiftEffectManager$1 b = this.b;
             Objects.requireNonNull(b);
             c uoc = c.class;
             this = PatchProxyResult.class;
             LiveGiftEffectManager liveGiftEffe = LiveGiftEffectManager.class;
             if (!PatchProxy.applyVoidOneRefs(obj, b, liveGiftEffe, "2")) {
                b.S(b.c, "[handleEffectMessage][giftMessage]", "message", obj);
                a = obj.a;
                String str = "5";
                String str1 = "4";
                String str2 = "3";
                int i = 0;
                if (a != null) {
                   obj1 = PatchProxy.applyOneRefs(a, b, liveGiftEffe, str2);
                   if (obj1 != this) {
                      obj1.booleanValue();
                   label_0197 :
                      this1 = 2;
                   }else {
                      b.V(b.c, "[tryConsumeCommonEffect]", "effectiveKey", a.effectiveKey, "streamMerge", Boolean.valueOf(a.streamMerge), "extraInfo", a.extraInfo, "isFaceFollowingEffect", Boolean.valueOf(a.isFaceFollowingEffect));
                      LiveGiftEffectManager j = b.j;
                      LiveGiftEffectManager f = b.f;
                      LiveGiftEffectManager g = b.g;
                      int i3 = 3;
                      int i4 = 5;
                      if (PatchProxy.isSupport(uoc)) {
                         Object[] objArray = new Object[i4];
                         objArray[i] = a;
                         objArray[1] = j;
                         objArray[2] = f;
                         objArray[i3] = g;
                         objArray[4] = Integer.valueOf(2);
                         obj2 = null;
                         e obj3 = PatchProxy.apply(objArray, obj2, uoc, str1);
                         if (obj3 != this) {
                            this1 = 0;
                         label_00ae :
                            i = 2;
                         }else {
                         label_00b2 :
                            obj3 = e.b();
                            long l = obj3.C1(a.effectiveKey);
                            LiveGiftEffectManager obj4 = PatchProxy.applyOneRefs(j, obj2, uoc, "7");
                            b uob = (obj4 != this)? obj4: new b(j);
                            LiveCommonEffectInfo effectBiz = a.effectBiz;
                            i4 = 6;
                            i = 2;
                            if (effectBiz == i) {
                               a uoa4 = obj3.Bl();
                               if (PatchProxy.isSupport(uoc)) {
                                  objArray1 = new Object[i4];
                                  objArray1[0] = a;
                                  objArray1[1] = Long.valueOf(l);
                                  objArray1[i] = f;
                                  objArray1[i3] = uob;
                                  objArray1[4] = uoa4;
                                  objArray1[5] = g;
                                  obj5 = PatchProxy.apply(objArray1, null, uoc, "6");
                                  if (obj5 != this) {
                                     obj3 = obj5;
                                     this1 = 0;
                                  }
                               }else {
                                  c uoc1 = null;
                               }
                               obj2 = new HashMap();
                               obj2.put("ORDER_NO_EXTRA_INFO_KEY", a.extraInfo);
                               obj5 = new f(a, l, obj2, uob, uoa4, f, g);
                               obj3 = v19;
                               goto label_00ae ;
                            }else {
                               LiveGiftEffectManager liveGiftEffe1 = g;
                               int this2 = 0;
                               int i5 = 4;
                               if (effectBiz == i5) {
                                  a uoa5 = obj3.Bl();
                                  if (PatchProxy.isSupport(uoc)) {
                                     objArray1 = new Object[]{a,Long.valueOf(l),oobject,uoa5,liveGiftEffe1,uob,Integer.valueOf(i)};
                                     oobject = null;
                                     i = 2;
                                     obj6 = PatchProxy.apply(objArray1, oobject, uoc, str);
                                     if (obj6 != this) {
                                        obj3 = obj6;
                                     }
                                  }else {
                                     obj4 = 2;
                                  }
                                  this1 = 2;
                                  obj6 = new LiveEffectRechargeGiftComboTask(a, l, null, uoa5, liveGiftEffe1, uob, 2);
                                  obj3 = v18;
                               label_0187 :
                                  if (obj3 == null) {
                                     b.P(b.c, "[tryConsumeCommonEffect][not gift effect]");
                                  }else {
                                     b.j.o1(obj3);
                                  }
                               }else {
                                  this1 = 2;
                                  obj1 = new a(a, l, null, obj3.Bl());
                                  obj3 = i;
                                  goto label_0187 ;
                               }
                            }
                         }
                      }else {
                         obj2 = null;
                         goto label_00b2 ;
                      }
                      this1 = 2;
                      goto label_0187 ;
                   }
                }else {
                   goto label_0197 ;
                }
                obj1 = obj.b;
                if (obj1 != null) {
                   i = obj.a();
                   if (!PatchProxy.isSupport(liveGiftEffe) || !PatchProxy.applyVoidTwoRefs(obj1, Integer.valueOf(i), b, liveGiftEffe, str1)) {
                      if (i == this1 && a.c(obj1, false)) {
                         this1 = b.e;
                         Objects.requireNonNull(this1);
                         if (!PatchProxy.applyVoidOneRefs(obj1, this1, b.class, str2)) {
                            a.a(obj1);
                         }
                      }
                      this1 = b.j;
                      e uoe1 = e.b();
                      a.o(uoe1, "LiveEffectResourceLoader.getInstance\(\)");
                      a uoa2 = uoe1.Bl();
                      if (PatchProxy.isSupport(uoc)) {
                         i2 = i;
                         uoa3 = PatchProxy.applyFourRefs(obj1, Integer.valueOf(i), this1, uoa2, null, c.class, "1");
                         if (uoa3 != this) {
                         label_020c :
                            a.o(uoa3, "LiveGiftEffectTaskFactor¡­ectResourceProvider\n    \)");
                            b.j.o1(uoa3);
                         }
                      }else {
                         i2 = i;
                      }
                      if (i2 == 1) {
                         obj1.mRank = 0x7ffffbb3;
                      }
                      uoa3 = new a(obj1, c.a(this1, i2), i2, uoa2);
                      goto label_020c ;
                   }
                }
                this1 = obj.c;
                if (this1 != null) {
                   int i1 = obj.a();
                   if (!PatchProxy.isSupport(liveGiftEffe) || !PatchProxy.applyVoidTwoRefs(this1, Integer.valueOf(i1), b, liveGiftEffe, str)) {
                      liveGiftEffe = b.j;
                      e uoe = e.b();
                      a.o(uoe, "LiveEffectResourceLoader.getInstance\(\)");
                      a uoa = uoe.Bl();
                      if (PatchProxy.isSupport(uoc)) {
                         uoa1 = PatchProxy.applyFourRefs(this1, Integer.valueOf(i1), liveGiftEffe, uoa, null, c.class, "2");
                         if (uoa1 != this) {
                         label_026c :
                            a.o(uoa1, "LiveGiftEffectTaskFactor¡­ectResourceProvider\n    \)");
                            b.j.o1(uoa1);
                         }
                      }
                      this1.mRank = (i1 == 1)? 0x7ffffbb3: 0x7ffff7fd;
                      uoa1 = new a(this1, c.a(liveGiftEffe, i1), uoa);
                      goto label_026c ;
                   }
                }
             }
          }
       }
       return;
    }
    public void w0(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveGiftEffectManager$1.class, "2")) {
       }else {
          a.p(p0, "source");
          Model$a$a.b(this, p0, p1, p2);
       }
       return;
    }
}
