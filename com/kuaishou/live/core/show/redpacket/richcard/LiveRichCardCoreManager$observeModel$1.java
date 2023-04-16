package com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager$observeModel$1;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager;
import java.lang.Object;
import java.lang.String;
import bi2.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a$a;
import com.kuaishou.live.core.show.redpacket.richcard.core.LiveRichCardStateManager;
import pp.c;
import java.util.List;
import msd.a;
import java.lang.Boolean;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.show.redpacket.richcard.http.EffectInfo;
import com.kuaishou.live.core.show.redpacket.richcard.http.RichCardInfo;
import java.lang.Long;
import java.util.Objects;
import zs6.a;
import com.kuaishou.live.core.show.redpacket.richcard.handler.RichCardEffectHandler;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.HashSet;
import d61.l0;
import yh2.d;
import java.io.File;
import java.lang.StringBuilder;
import com.kwai.kds.krn.api.resource.ResourceDir;
import com.yxcorp.gifshow.util.v;
import js6.b;
import java.lang.StackTraceElement;
import java.lang.Exception;
import q87.c;
import java.net.URI;
import java.net.URL;
import java.lang.Number;
import com.google.gson.JsonObject;
import com.yxcorp.download.DownloadTask$DownloadBizExtra;
import com.yxcorp.download.DownloadTask$DownloadBizExtra$SubSolutionType;
import com.yxcorp.download.DownloadTask$DownloadRequest;
import com.yxcorp.download.DownloadTask$DownloadTaskType;
import com.yxcorp.download.DownloadManager;
import com.yxcorp.download.b;
import uw1.f;
import com.kuaishou.live.common.core.component.gift.base.model.Model;
import com.kuaishou.live.core.show.redpacket.richcard.http.UsingCardInfo;
import java.lang.Integer;
import ei2.a;
import uw1.m;

public final class LiveRichCardCoreManager$observeModel$1 implements Model$a	// class@000f51
{
    public final LiveRichCardCoreManager b;

    public void LiveRichCardCoreManager$observeModel$1(LiveRichCardCoreManager p0){
       this.b = p0;
       super();
    }
    public void F(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveRichCardCoreManager$observeModel$1.class, "2")) {
       }else {
          a.p(p0, "source");
          Model$a$a.a(this, p0, p1, p2);
       }
       return;
    }
    public void w0(String p0,Object p1,Object p2){
       RichCardInfo richCardInfo;
       f uof1;
       g og2;
       UsingCardInfo usingCardInf;
       Integer integer1;
       LiveRichCardStateManager h1;
       RichCardEffectHandler c;
       String format;
       String bundleId1;
       RichCardEffectHandler d;
       int i1;
       Object[] objArray;
       JsonObject obj1;
       DownloadTask$DownloadBizExtra uDownloadBiz;
       DownloadTask$DownloadRequest uDownloadReq;
       b[] uobArray;
       CharSequence uCharSequenc;
       LiveRichCardCoreManager$observeModel$1 oobserveMode = this;
       g og = p1;
       g og1 = p2;
       if (PatchProxy.applyVoidThreeRefs(p0, og, og1, this, LiveRichCardCoreManager$observeModel$1.class, "1")) {
       }else {
          String str = "source";
          a.p(p0, str);
          LiveRichCardStateManager h = LiveRichCardStateManager.h;
          c uoc = h.f();
          uoc.appendTag(oobserveMode.b.m());
          c uoc1 = uoc;
          b.V(uoc1, "[observeModel]", "source", p0, "newValue", og1, "isCurrentFragmentOnScreen", oobserveMode.b.o().invoke(), "isInAutoGrabing", Boolean.valueOf(oobserveMode.b.v));
          if (og1) {
             Integer integer = null;
             if (og1.d() == 7) {
                boolean i = og1.d();
                if (!og || (i != og.d() && oobserveMode.b.o().invoke().booleanValue())) {
                   oobserveMode.b.f("[observeModel][onChangeValue][state == RichCardState.UNUSED_CARD]");
                   EffectInfo uEffectInfo = og1.c();
                   if (uEffectInfo != null) {
                      LiveRichCardCoreManager k = oobserveMode.b.k;
                      richCardInfo = og1.b();
                      Long longx = (richCardInfo != null)? richCardInfo.getFreeCardShowEndTime(): integer;
                      Objects.requireNonNull(k);
                      a uoa = a.class;
                      RichCardEffectHandler richCardEffe = RichCardEffectHandler.class;
                      PatchProxyResult patchProxyRe = PatchProxyResult.class;
                      if (!PatchProxy.applyVoidTwoRefs(uEffectInfo, longx, k, richCardEffe, "2")) {
                         b.Z(h.f(), "开始尝试展示暴富红包特效");
                         if (longx == null) {
                            b.P(h.f().appendTag(k.a), "[tryShowEffect]: cardId is null");
                            k.k.invoke();
                         }else if(TextUtils.x(uEffectInfo.getKrnUrl()) || TextUtils.x(uEffectInfo.getMp4Url())){
                            b.S(h.f().appendTag(k.a), "[tryShowEffect]: effectInfo is null", "effectInfo", uEffectInfo);
                            d.a("特效相关字端有问题");
                            k.k.invoke();
                         }else {
                            long l = longx.longValue();
                            LiveRichCardStateManager liveRichCard = LiveRichCardStateManager.class;
                            String int str2 = "7";
                            if (PatchProxy.isSupport(liveRichCard)) {
                               String obj = PatchProxy.applyOneRefs(Long.valueOf(l), h, liveRichCard, str2);
                               if (obj != patchProxyRe) {
                                  i = obj.booleanValue();
                               label_011b :
                                  if (i) {
                                     d.a("特效已经展示过");
                                     k.k.invoke();
                                  }else {
                                     obj = uEffectInfo.getMp4Url();
                                     String bundleId = uEffectInfo.getBundleId();
                                     str2 = PatchProxy.applyTwoRefs(obj, bundleId, integer, uoa, str2);
                                     String str3 = "/resourceDownload/";
                                     if (str2 != patchProxyRe) {
                                     }else {
                                        try{
                                           File str21 = new File(ResourceDir.a()+str3+bundleId);
                                           if (str21.exists()) {
                                              File[] uFileArray = str21.listFiles();
                                              str2 = uFileArray.length;
                                              int i2 = 0;
                                              while (true) {
                                                 if (i2 < str2) {
                                                    object oobject = uFileArray[i2];
                                                    File[] uFileArray1 = uFileArray;
                                                    if ((oobject.getName()).startsWith(v.h(obj))) {
                                                       str2 = oobject.getAbsolutePath();
                                                    }else {
                                                       i2 = i2 + 1;
                                                       uFileArray = uFileArray1;
                                                    }
                                                 }
                                              }
                                           }
                                        }catch(java.lang.Exception e0){
                                           Object[] objArray1 = new Object[0];
                                           b.c.t("KrnResourceDownload", e0.getStackTrace().toString(), objArray1);
                                        }
                                        str2 = "";
                                     }
                                     obj = PatchProxy.applyOneRefs(str2, k, richCardEffe, "3");
                                     if (obj != patchProxyRe) {
                                     }else if(TextUtils.x(str2)){
                                        uCharSequenc = null;
                                     }else {
                                        try{
                                           uCharSequenc = new File(str2).toURI().toURL().toString();
                                           a.o(uCharSequenc, "file.toURI\(\).toURL\(\).toString\(\)");
                                        }catch(java.lang.Exception e0){
                                        }
                                     }
                                  }
                               }
                            }
                            i = LiveRichCardStateManager.g.b(new HashSet()).contains(Long.valueOf(l));
                            goto label_011b ;
                         }
                      }
                   }
                }
             }
          label_02e3 :
             if (og1.d() == 10 && (oobserveMode.b.o().invoke().booleanValue() && oobserveMode.b.v == null)) {
                if (og == null || 10 != og.d()) {
                   oobserveMode.b.h.clear();
                }
                if (oobserveMode.b.h() != null) {
                   if (!oobserveMode.b.q()) {
                      f uof = oobserveMode.b.h();
                      a.m(uof);
                      if (!uof.c()) {
                      label_0338 :
                         uof1 = 0;
                      label_0339 :
                         oobserveMode.b.f("[observeModel][onChangeValue][state == RichCardState.USING]");
                         d.a("暴富模式使用中，尝试开启倒计时");
                         if (oobserveMode.b.h() != null) {
                            og2 = oobserveMode.b.o.a();
                            if (og2 != null) {
                               richCardInfo = og2.b();
                               if (richCardInfo != null) {
                                  usingCardInf = richCardInfo.getUsingCardInfo();
                                  if (usingCardInf == null || usingCardInf.getCardCanUseRemainCount()) {
                                  }
                               }else {
                               }
                            }else {
                            }
                         }
                         c uoc2 = LiveRichCardStateManager.h.f();
                         uoc2.appendTag(oobserveMode.b.m());
                         uoc1 = uoc2;
                         uof = oobserveMode.b.h();
                         String str1 = (uof != null)? uof.a(): uof1;
                         og2 = oobserveMode.b.o.a();
                         if (og2 != null) {
                            richCardInfo = og2.b();
                            if (richCardInfo != null) {
                               usingCardInf = richCardInfo.getUsingCardInfo();
                               if (usingCardInf != null) {
                                  integer1 = Integer.valueOf(usingCardInf.getCardCanUseRemainCount());
                               label_03b4 :
                                  b.T(uoc1, "走到了错误的地方", "holder_Id", str1, "cardCanUseRemainCount", integer1);
                               }
                            }
                         }
                         integer1 = uof1;
                         goto label_03b4 ;
                      }
                   }
                   uof1 = null;
                   oobserveMode.b.w(uof1);
                   goto label_0339 ;
                }else {
                   goto label_0338 ;
                }
             }
          label_03bd :
             if (og1.d() == 5) {
                LiveRichCardCoreManager.a(oobserveMode.b).c();
                if (og != null && og.d() == 10) {
                   oobserveMode.b.l().D0();
                }
                oobserveMode.b.v();
             }
          }
       }
       return;
    }
}
