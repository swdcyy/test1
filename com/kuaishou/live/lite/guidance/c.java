package com.kuaishou.live.lite.guidance.c;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager;
import z1.k;
import com.kuaishou.live.lite.guidance.c$a;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveLiteCommonGuideConfig;
import java.lang.Object;
import java.util.PriorityQueue;
import java.util.ArrayList;
import java.lang.String;
import com.google.common.base.Optional;
import v91.n;
import com.kuaishou.live.basic.model.LiveMessageFrequencyConfig$FrequencyConfig;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import brd.t;
import wa1.e;
import lb3.f;
import erd.g;
import crd.b;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import lb3.b;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage;
import java.lang.Long;
import e93.f;
import lb3.g;
import java.lang.Runnable;
import java.util.Map;
import com.kuaishou.livestream.message.nano.LiveCommonGuideConfig;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.live.lite.guidance.b;
import d61.k0$a;
import d61.k0;
import v91.b;
import x51.b;
import msd.p;
import java.lang.Integer;
import v91.h;
import java.lang.StringBuilder;
import v91.j;
import com.kwai.framework.model.user.QCurrentUser;
import java.util.Arrays;
import java.lang.Iterable;
import v91.a;
import com.google.common.collect.ImmutableMap;
import java.lang.Thread;
import android.os.Looper;
import o56.a;
import java.lang.RuntimeException;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager$b;
import lb3.h;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lb3.d;
import ok.o;
import qk.y;
import lb3.e;
import java.util.Iterator;
import lb3.i;
import lb3.j;
import lb3.c;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public class c implements LiveLiteGuidanceMessageQueueManager	// class@0009a3
{
    public final LiveMessageFrequencyConfig$FrequencyConfig a;
    public final k b;
    public final b c;
    public final c$a d;
    public Map e;
    public long f;
    public final PriorityQueue g;
    public final List h;
    public final List i;
    public b j;
    public String k;
    public boolean l;

    public void c(k p0,c$a p1,LiveConfigStartupResponse$LiveLiteCommonGuideConfig p2){
       super();
       this.f = 0x3a98;
       this.g = new PriorityQueue();
       this.h = new ArrayList();
       this.i = new ArrayList();
       this.k = "IDLE";
       this.l = true;
       this.b = p0;
       this.d = p1;
       this.a = n.d("guidance_message_frequency_config_biz_id").orNull();
       if (p2 != null) {
          this.e = p2.mCommonGuideConfig;
          this.f = p2.mCoolDownDuration;
       }
       b.P(LiveLiteLogTag.LITE_GUIDANCE.appendTag("LiveLiteGuidanceMessageQueueServiceImpl"), "LiveLiteGuidanceMessageQueueServiceImpl Init");
       this.c = e.a().subscribe(new f(this));
       return;
    }
    public boolean a(String p0,LiveLiteGuidanceMessageQueueManager$a p1){
       boolean b;
       LiveLiteLogTag lITE_GUIDANC;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, uoc, "2");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       this.f();
       String obj1 = PatchProxy.applyTwoRefs(p0, p1, this, uoc, "6");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          b uob = this.i(p0);
          obj1 = "LiveLiteGuidanceMessageQueueServiceImpl";
          if (uob == null) {
             b.S(LiveLiteLogTag.LITE_GUIDANCE.appendTag(obj1), "updateGuidanceMessage£ºthe message does not exist in the queue", "messageId", p0);
             b = false;
          }else {
             LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage iLiveLiteGui = uob.a();
             if (this.h(iLiveLiteGui.l())) {
                if (p1.a() != null) {
                   f.g(iLiveLiteGui.l());
                   f.k("GuidanceMessageQueue", new g(this), iLiveLiteGui.l(), p1.a().longValue());
                   lITE_GUIDANC = LiveLiteLogTag.LITE_GUIDANCE;
                   lITE_GUIDANC.appendTag(obj1);
                   b.T(lITE_GUIDANC, "updateGuidanceMessage£ºcurrent message has been updated", "bizMessage", iLiveLiteGui.a(), "newDuration", p1.a());
                }
             }else if(p1.a() != null){
                iLiveLiteGui.d(p1.a().longValue());
                lITE_GUIDANC = LiveLiteLogTag.LITE_GUIDANCE;
                lITE_GUIDANC.appendTag(obj1);
                b.T(lITE_GUIDANC, "updateGuidanceMessage£ºcurrent message has been updated", "bizMessage", iLiveLiteGui.a(), "newDuration", p1.a());
             }
             b = true;
          }
       }
       return b;
    }
    public LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.f();
       b uob = this.i(p0);
       if (uob == null) {
          return null;
       }
       return uob.a();
    }
    public boolean c(LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, uoc, "4");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       this.f();
       String obj1 = PatchProxy.applyOneRefs(p0, this, uoc, "9");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          b uob = this.i(p0.l());
          obj1 = "LiveLiteGuidanceMessageQueueServiceImpl";
          if (uob == null) {
             b.S(LiveLiteLogTag.LITE_GUIDANCE.appendTag(obj1), "removeGuidanceMessage£ºthe message does not exist in the queue", "messageId", p0.l());
             b = false;
          }else if(this.h(p0.l())){
             f.g(p0.l());
             this.i.remove(p0.l());
             this.g();
          }else if(this.h.contains(uob)){
             f.g(uob.a().l());
             this.i.remove(p0.l());
             this.h.remove(uob);
          }else {
             this.g.remove(uob);
          }
          b.S(LiveLiteLogTag.LITE_GUIDANCE.appendTag(obj1), "removeGuidanceMessage£ºthe message has been remove", "bizMessage", p0.a());
          b = true;
       }
       return b;
    }
    public boolean d(LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage p0){
       boolean b;
       String str2;
       Object obj = this;
       Object obj1 = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       String obj2 = PatchProxy.applyOneRefs(obj1, obj, uoc, "1");
       if (obj2 != patchProxyRe) {
          return obj2.booleanValue();
       }
       this.f();
       b obj3 = PatchProxy.applyOneRefs(obj1, obj, uoc, "5");
       if (obj3 != patchProxyRe) {
          b = obj3.booleanValue();
       }else {
          String str = "bizMessage";
          String str1 = "LiveLiteGuidanceMessageQueueServiceImpl";
          if (obj.i(p0.l()) != null) {
             b.S(LiveLiteLogTag.LITE_GUIDANCE.appendTag(str1), "addGuidanceMessage£ºcurrent message already exist", str, p0.a());
          }else {
             uoc = obj.e;
             if (uoc == null || uoc.isEmpty()) {
                b.S(LiveLiteLogTag.LITE_GUIDANCE.appendTag(str1), "addGuidanceMessage£ºcommon guide configs is Empty", str, p0.a());
             }else {
                Object obj4 = obj.e.get(p0.g());
                if (obj4 == null) {
                   b.S(LiveLiteLogTag.LITE_GUIDANCE.appendTag(str1), "addGuidanceMessage£ºguide config is null", str, p0.a());
                }else {
                   b uob = obj.e(obj4, obj1, k0.a(obj.b.get(), b.a).orNull());
                   obj3 = PatchProxy.applyThreeRefs(p0, obj4, uob, this, c.class, "21");
                   if (obj3 != patchProxyRe) {
                      str2 = str1;
                      obj2 = str;
                   }else {
                      str2 = str1;
                      obj2 = str;
                      b uob1 = new b(p0, obj4.priority, uob, obj4.commonGuideBizType, b.b().a(), obj4.enableInterrupt, obj4.disableGlobalFrequency);
                   }
                   if (!uob.b()) {
                      b.S(LiveLiteLogTag.LITE_GUIDANCE.appendTag(str2), "addGuidanceMessage£ºcurrent frequency control is not satisfied", obj2, p0.a());
                   }else {
                      b.S(LiveLiteLogTag.LITE_GUIDANCE.appendTag(str2), "addGuidanceMessage£ºadd success", obj2, p0.a());
                      obj.g.add(obj3);
                      this.j();
                      b = true;
                   }
                }
             }
          }
          b = false;
       }
       return b;
    }
    public final b e(LiveCommonGuideConfig p0,LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage p1,String p2){
       c this;
       c a;
       String str;
       h oh;
       j oj;
       c uoc = this;
       LiveCommonGuideConfig liveCommonGu = p0;
       Object obj = p2;
       c uoc1 = c.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveMessageFrequencyConfig$FrequencyConfig obj1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, c.class, "20");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       obj1 = n.d(liveCommonGu.bizFrequencyKey).orNull();
       LiveMessageFrequencyConfig$FrequencyConfig uFrequencyCo = n.d(liveCommonGu.subBizFrequencyKey).orNull();
       b uob = p1.f().invoke(obj1, uFrequencyCo);
       this = uoc.a;
       if (this != null && (!obj || liveCommonGu.disableGlobalFrequency != null)) {
          List list = LiveLiteLogTag.LITE_GUIDANCE.appendTag("LiveLiteGuidanceMessageQueueServiceImpl");
          a = uoc.a;
          if (a == null) {
             a = "null";
          }
          if (obj1 == null) {
             str = "null ";
          }
          LiveMessageFrequencyConfig$FrequencyConfig uFrequencyCo1 = str;
          String str1 = (uFrequencyCo == null)? "null": uFrequencyCo;
          String str2 = (!obj)? "null": obj;
          b.X(list, "buildGuidanceFrequencyConsumer: ", ImmutableMap.of("frequencyConfig", a, "bizFrequencyConfig", uFrequencyCo1, "subBizFrequencyConfig", str1, "liveStreamId", str2, "disableGlobalFrequency", Boolean.valueOf(liveCommonGu.disableGlobalFrequency)));
          return uob;
       }else {
          b[] uobArray = new b[3];
          int i = 0;
          LiveMessageFrequencyConfig$FrequencyConfig this1 = this.mAppearTimesByLiveStream;
          if (PatchProxy.isSupport(uoc1)) {
             oh = PatchProxy.applyTwoRefs(obj, Integer.valueOf(this1), uoc, uoc1, "22");
             if (oh != patchProxyRe) {
             label_007e :
                uobArray[i] = oh;
                i = 1;
                this1 = uoc.a.mAppearTimesByColdTime;
                if (PatchProxy.isSupport(uoc1)) {
                   oj = PatchProxy.applyOneRefs(Integer.valueOf(this1), uoc, uoc1, "23");
                   if (oj != patchProxyRe) {
                   label_00ba :
                      uobArray[i] = oj;
                      uobArray[2] = uob;
                      return a.a(Arrays.asList(uobArray));
                   }
                }
                oj = new j("frequency_by_user_id_"+QCurrentUser.me().getId(), -1, this1);
                goto label_00ba ;
             }
          }
          oh = new h("frequency_by_stream_id_"+obj, this1);
          goto label_007e ;
       }
    }
    public final void f(){
       if (PatchProxy.applyVoid(null, this, c.class, "24")) {
          return;
       }
       if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
          if (!a.d()) {
             b.P(LiveLiteLogTag.LITE_GUIDANCE.appendTag("LiveLiteGuidanceMessageQueueServiceImpl"), "LiveLiteGuidanceMessageQueueService call not in main thread");
          }else {
             throw new RuntimeException("LiveLiteGuidanceMessageQueueService not in main thread");
          }
       }
       return;
    }
    public final void g(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c.class, "18")) {
          return;
       }
       c tj = this.j;
       String str = "LiveLiteGuidanceMessageQueueServiceImpl";
       if (tj == null) {
          b.P(LiveLiteLogTag.LITE_GUIDANCE.appendTag(str), "finishConsumeGuidanceMessage£ºmCurrentConsumingGuidanceMessage is null");
          return;
       }else {
          LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage iLiveLiteGui = tj.a();
          this.j = objArray;
          this.k = "COOLING";
          b uob = this.g.peek();
          if (uob != null && uob.b()) {
             this.k = "IDLE";
             iLiveLiteGui.h().j(iLiveLiteGui);
             this.j();
          }else {
             f.k("ConsumingGuidanceMessage", new h(this), "UiThreadCoolingToken", this.f);
             this.i.add("UiThreadCoolingToken");
             iLiveLiteGui.h().j(iLiveLiteGui);
          }
          b.S(LiveLiteLogTag.LITE_GUIDANCE.appendTag(str), "finishConsumeGuidanceMessage£ºfinish consume", "bizMessage", iLiveLiteGui.a());
          return;
       }
    }
    public final boolean h(String p0){
       c obj = PatchProxy.applyOneRefs(p0, this, c.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.j;
       boolean b = (obj != null && TextUtils.n(obj.a().l(), p0))? true: false;
       return b;
    }
    public final b i(String p0){
       c tj;
       b obj = PatchProxy.applyOneRefs(p0, this, c.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.h(p0)) {
          tj = this.j;
       }else {
          obj = y.y(this.h, new d(p0)).orNull();
          tj = (obj == null)? y.y(this.g, new e(p0)).orNull(): obj;
       }
       return tj;
    }
    public final void j(){
       boolean b;
       boolean b1;
       boolean b2;
       LiveLiteLogTag lITE_GUIDANC;
       LiveLiteLogTag liveLiteLogT;
       String str5;
       LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage iLiveLiteGui1;
       ClientEvent$ElementPackage uElementPack;
       i3 oi3;
       ClientContent$ContentPackage uContentPack;
       c j;
       LiveLiteLogTag lITE_GUIDANC1;
       b uob = this;
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, uob, uoc, "10")) {
          return;
       }
       String str = "LiveLiteGuidanceMessageQueueServiceImpl";
       if (uob.l == null) {
          b.S(LiveLiteLogTag.LITE_GUIDANCE.appendTag(str), "tryConsumeGuidanceMessage£º", "enableQueueScheduling", Boolean.FALSE);
          return;
       }else if(uob.g.isEmpty()){
          b.P(LiveLiteLogTag.LITE_GUIDANCE.appendTag(str), "tryConsumeGuidanceMessage£ºthe current guidance queue is empty");
          return;
       }else {
          Iterator iterator = uob.g.iterator();
          while (iterator.hasNext()) {
             PatchProxyResult patchProxyRe = PatchProxyResult.class;
             b obj = PatchProxy.applyOneRefs(iterator, uob, uoc, "11");
             int i = 0;
             if (obj != patchProxyRe) {
                b = obj.booleanValue();
             }else {
                obj = iterator.next();
                String str1 = null;
                String str2 = "bizMessage";
                if (obj.a().e() - str1 <= 0) {
                   b.S(LiveLiteLogTag.LITE_GUIDANCE.appendTag(str), "findFirstValidMessageAndConsume£ºshow Duration less than zero", str2, obj.a().a());
                   iterator.remove();
                }else if(!obj.c().b()){
                   b.S(LiveLiteLogTag.LITE_GUIDANCE.appendTag(str), "findFirstValidMessageAndConsume£ºfrequency control is not satisfied", str2, obj.a().a());
                   iterator.remove();
                }else {
                   LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage iLiveLiteGui = obj.a();
                   b obj1 = PatchProxy.applyOneRefs(obj, uob, uoc, "12");
                   if (obj1 != patchProxyRe) {
                      b1 = obj1.booleanValue();
                   }else {
                      LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage iLiveLiteGui2 = obj.a();
                      long l = iLiveLiteGui2.c();
                      long l1 = iLiveLiteGui2.b();
                      long l2 = b.b().a();
                      if (l - str1 > 0 && l2 - l < 0) {
                         l = l - l2;
                         l = l + 200;
                         f.k("GuidanceMessageQueue.consumeMessage", new i(uob, obj, iLiveLiteGui2), iLiveLiteGui2.l(), l);
                         uob.h.add(obj);
                         uob.i.add(obj.a().l());
                         lITE_GUIDANC1 = LiveLiteLogTag.LITE_GUIDANCE;
                         lITE_GUIDANC1.appendTag(str);
                         b.U(lITE_GUIDANC1, "consumeMessageTimeIsValid: it\'s not time to show", "delayTime", Long.valueOf(l), "currentTime", Long.valueOf(l2), "bizMessage", iLiveLiteGui2.a());
                      }else if(l1 - str1 > 0 && l2 - l1 > 0){
                         lITE_GUIDANC1 = LiveLiteLogTag.LITE_GUIDANCE;
                         lITE_GUIDANC1.appendTag(str);
                         b.T(lITE_GUIDANC1, "consumeMessageTimeIsValid: exceed ValidShowingEndTimeStamp, drop the message", "bizMessage", iLiveLiteGui2.a(), "currentTime", Long.valueOf(l2));
                      }else {
                         b1 = true;
                      }
                      b1 = false;
                   }
                   if (!b1) {
                      iterator.remove();
                   }else {
                      String str3 = iLiveLiteGui.g();
                      obj1 = PatchProxy.applyOneRefs(str3, uob, uoc, "14");
                      b = (obj1 != patchProxyRe)? obj1.booleanValue(): uob.d.b(str3);
                      if (b) {
                         b.S(LiveLiteLogTag.LITE_GUIDANCE.appendTag(str), "tryConsumeGuidanceMessage£ºsubBizType already shown in live room", "message", iLiveLiteGui.a());
                         iterator.remove();
                      }else {
                         String str4 = "IDLE";
                         if (!TextUtils.n(uob.k, str4)) {
                            b = obj.b();
                            if (PatchProxy.isSupport(uoc)) {
                               obj1 = PatchProxy.applyOneRefs(Boolean.valueOf(b), uob, uoc, "13");
                               if (obj1 != patchProxyRe) {
                                  b2 = obj1.booleanValue();
                               }else {
                               label_019b :
                                  lITE_GUIDANC = LiveLiteLogTag.LITE_GUIDANCE;
                                  lITE_GUIDANC.appendTag(str);
                                  LiveLiteLogTag liveLiteLogT1 = lITE_GUIDANC;
                                  b.T(liveLiteLogT1, "enableInterrupt£º", "current state", uob.k, "newMessageEnableInterrupt", Boolean.valueOf(b));
                                  if (b) {
                                     j = uob.j;
                                     if (j == null || !j.b()) {
                                        b2 = true;
                                     }
                                  }
                                  b2 = false;
                               }
                            }else {
                               goto label_019b ;
                            }
                            if (!b2) {
                               lITE_GUIDANC = LiveLiteLogTag.LITE_GUIDANCE;
                               lITE_GUIDANC.appendTag(str);
                               liveLiteLogT = lITE_GUIDANC;
                               b.U(liveLiteLogT, "findFirstValidMessageAndConsume£ºthe current status is not IDLE and the message is common", "currentState", uob.k, "enableInterrupt", Boolean.valueOf(obj.b()), "bizMessage", obj.a().a());
                            }
                         }
                         if (PatchProxy.applyVoidOneRefs(obj, uob, uoc, "15")) {
                            i = 1;
                         }else {
                            str3 = "CONSUMING";
                            if (TextUtils.n(uob.k, "COOLING")) {
                               str5 = "UiThreadCoolingToken";
                               f.g(str5);
                               uob.i.remove(str5);
                            }else if(TextUtils.n(uob.k, str3)){
                               j = uob.j;
                               if (j != null) {
                                  str5 = j.a().l();
                                  f.g(str5);
                                  uob.i.remove(str5);
                                  if (!PatchProxy.applyVoid(objArray, uob, uoc, "19")) {
                                     j = uob.j;
                                     if (j == null) {
                                        b.P(LiveLiteLogTag.LITE_GUIDANCE.appendTag(str), "replaceCurrentConsumingGuidanceMessage£ºmCurrentConsumingGuidanceMessage is null");
                                     }else {
                                        iLiveLiteGui1 = j.a();
                                        uob.j = objArray;
                                        uob.k = str4;
                                        b.S(LiveLiteLogTag.LITE_GUIDANCE.appendTag(str), "replaceCurrentConsumingGuidanceMessage£ºreplace finish consume", str2, iLiveLiteGui1.a());
                                        iLiveLiteGui1.h().j(iLiveLiteGui1);
                                     }
                                  }
                               }
                            }
                            if (PatchProxy.applyVoidOneRefs(obj, uob, uoc, "16")) {
                               i = 1;
                            }else {
                               iLiveLiteGui1 = obj.a();
                               uob.j = obj;
                               uob.k = str3;
                               obj.c().a();
                               str3 = obj.a().g();
                               if (!PatchProxy.applyVoidOneRefs(str3, uob, uoc, "17")) {
                                  uob.d.a(str3);
                               }
                               f.k("GuidanceMessageInternal", new j(uob, iLiveLiteGui1), iLiveLiteGui1.l(), iLiveLiteGui1.e());
                               uob.i.add(iLiveLiteGui1.l());
                               b.S(LiveLiteLogTag.LITE_GUIDANCE.appendTag(str), "consumeGuidanceMessageInternal£ºconsume message", str2, iLiveLiteGui1.a());
                               if (!iLiveLiteGui1.k() && uob.b.get() != null) {
                                  ClientContent$LiveStreamPackage liveStreamPa = uob.b.get();
                                  str4 = obj.a().g();
                                  obj1 = obj.e;
                                  str1 = obj.a().l();
                                  String extraInfo = obj.a().getExtraInfo();
                                  c uoc1 = c.class;
                                  if (PatchProxy.isSupport(uoc1)) {
                                     Object[] objArray1 = new Object[5];
                                     objArray1[i] = liveStreamPa;
                                     objArray1[1] = str4;
                                     objArray1[2] = obj1;
                                     objArray1[3] = str1;
                                     objArray1[4] = extraInfo;
                                     if (!PatchProxy.applyVoid(objArray1, objArray, uoc1, "1")) {
                                     }
                                  }else {
                                     i = 1;
                                  }
                               }else {
                                  i = 1;
                               }
                               iLiveLiteGui1.h().i(iLiveLiteGui1);
                            }
                            lITE_GUIDANC = LiveLiteLogTag.LITE_GUIDANCE;
                            lITE_GUIDANC.appendTag(str);
                            liveLiteLogT = lITE_GUIDANC;
                            b.T(liveLiteLogT, "consumeGuidanceMessage£ºthe current guidance queue has been consume", "bizMessage", obj.a().a(), "currentState", uob.k);
                         }
                         iterator.remove();
                         b = true;
                      }
                   }
                }
                b = false;
             }
             if (b) {
                break ;
             }
          }
          return;
       }
    }
}
