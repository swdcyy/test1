package com.kuaishou.live.common.core.component.gift.domain.giftsend.logger.LiveGiftSendResultObserverForLogger;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import om1.a;
import xp5.i;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import oj1.b;
import yg1.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a$a;
import lj1.d;
import lj1.b;
import k2b.u1;
import com.yxcorp.gifshow.models.Gift;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.sort.LiveGiftSortType;
import lm1.f;
import lj1.c;
import java.util.List;
import com.kwai.framework.model.user.UserInfo;
import lm1.e;
import lm1.c;
import rm1.j;
import rm1.j$a;
import java.lang.Integer;
import com.yxcorp.gifshow.model.response.WalletResponse;
import java.lang.Throwable;
import zb6.a;
import lm1.g;
import com.yxcorp.gifshow.model.response.LiveSendNoPanelGiftResponse;
import com.google.gson.JsonElement;
import lm1.d;
import java.lang.StringBuilder;

public final class LiveGiftSendResultObserverForLogger implements Model$a	// class@001255
{
    public final b b;
    public final a c;
    public final i d;

    public void LiveGiftSendResultObserverForLogger(a p0,i p1){
       a.p(p0, "sendGiftTraceService");
       a.p(p1, "logProvider");
       super();
       this.c = p0;
       this.d = p1;
       this.b = new b(p0, p1);
    }
    public void F(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveGiftSendResultObserverForLogger.class, "4")) {
       }else {
          a.p(p0, "source");
          Model$a$a.a(this, p0, p1, p2);
       }
       return;
    }
    public void w0(String p0,Object p1,Object p2){
       UserInfo userInfo;
       String str2;
       int i4;
       f obj2;
       String str4;
       j$a a;
       WalletResponse obj3;
       Map uod21;
       Throwable uod21;
       WalletResponse walletRespon;
       long l;
       Object obj = this;
       f uof = p2;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, uof, this, LiveGiftSendResultObserverForLogger.class, "1")) {
       }else {
          a.p(p0, "source");
          if (uof) {
             d uod = uof.c();
             b uob = (uod != null)? uod.b(): null;
             LiveGiftSendResultObserverForLogger liveGiftSend = LiveGiftSendResultObserverForLogger.class;
             int i = 1;
             if (!PatchProxy.applyVoidOneRefs(uof, obj, liveGiftSend, "2")) {
                d b uod2 = uof.c();
                uod2 = (uod2 != null)? uod2.b(): null;
                String str = u1.f();
                Gift gift = (uod2 != null)? uod2.d(): null;
                LiveGiftSendResultObserverForLogger b = obj.b;
                int i1 = (uof.b() == i)? 7: 8;
                Map obj1 = PatchProxy.applyOneRefs(uod2, obj, liveGiftSend, "3");
                if (obj1 == PatchProxyResult.class) {
                   if (uod2 != null) {
                      obj1 = uod2.c();
                      if (obj1 != null) {
                         obj1 = obj1.get("gift_host_tab_sort_type");
                      label_0087 :
                         if (!obj1 instanceof LiveGiftSortType) {
                            obj1 = null;
                         }
                      }
                   }
                   obj1 = null;
                   goto label_0087 ;
                }
                int i2 = 0;
                if (uod2 != null) {
                   c uoc = uod2.i();
                   if (uoc != null) {
                      List list = uoc.b();
                      if (list != null) {
                         userInfo = list.get(i2);
                      label_00aa :
                         if (uod2 != null) {
                            String str1 = uod2.h();
                            if (str1 != null) {
                               str2 = str1;
                            label_00b8 :
                               boolean b1 = (uod2 != null && uod2.m() == i)? true: false;
                               int i3 = 0;
                               if (uod2 != null) {
                                  uoc = uod2.i();
                                  if (uoc != null && uoc.c() == i) {
                                     i4 = 1;
                                  label_00d8 :
                                     int i5 = (uod2 != null)? uod2.e(): 0;
                                     int i6 = (uod2 != null)? uod2.f(): 0;
                                     int i7 = 0;
                                     int i8 = (uod2 != null)? uod2.a(): 0;
                                     String str3 = (uod2 != null)? uod2.k(): 0;
                                     f uof1 = new f(userInfo, gift, str2, b1, i3, i4, i5, i6, i7, i8, str3, 0);
                                     d uod3 = uof.c();
                                     uod3 = (uod3 != null)? uod3.f: 0;
                                     Map map = null;
                                     Map map1 = null;
                                     if (uod2 != null) {
                                        Map map2 = uod2.c();
                                        if (map2 != null) {
                                           obj2 = map2.get("extra_info");
                                        label_013f :
                                           if (!obj2 instanceof String) {
                                              obj2 = null;
                                           }
                                           if (obj2 != null) {
                                              str4 = obj2;
                                              obj2 = v8;
                                           }else {
                                              obj2 = v8;
                                              str4 = "";
                                           }
                                           c uoc1 = new c(str, uod3, map, map1, str4);
                                           a = j.a;
                                           if (uod2 != null) {
                                              str1 = uod2.g();
                                              if (str1 != null) {
                                              label_0161 :
                                                 str = a.a(str1);
                                                 if (uod2 != null) {
                                                    Map map3 = uod2.c();
                                                    if (map3 != null) {
                                                       obj3 = map3.get("gift_index");
                                                    label_0175 :
                                                       if (!obj3 instanceof Integer) {
                                                          obj3 = null;
                                                       }
                                                       int i9 = (obj3 != null)? obj3.intValue(): 0;
                                                       if (uod2 != null) {
                                                          uod21 = uod2.c();
                                                          if (uod21 != null) {
                                                             uod21 = uod21.get("pager_index");
                                                          label_0194 :
                                                             if (!uod21 instanceof Integer) {
                                                                uod21 = null;
                                                             }
                                                             int uod211 = (uod21 != null)? uod21.intValue(): 0;
                                                             e uoe = new e(str, i9, uod211);
                                                             uod2 = uof.c();
                                                             obj3 = (uod2 != null)? uod2.d(): null;
                                                             uod2 = uof.c();
                                                             uod21 = (uod2 != null)? uod2.c(): null;
                                                             int i10 = a.b(uod21);
                                                             uod2 = uof.c();
                                                             if (uod2 != null) {
                                                                uod21 = uod2.c();
                                                                if (uod21 != null) {
                                                                   String uod212 = a.i(uod21);
                                                                   if (uod212 != null) {
                                                                      str2 = uod212;
                                                                   label_01e0 :
                                                                      uod2 = uof.c();
                                                                      if (uod2 != null) {
                                                                         WalletResponse uod22 = uod2.d();
                                                                         if (uod22 != null) {
                                                                            walletRespon = uod22.mCsLogCorrelateInfo;
                                                                         label_01f3 :
                                                                            g og = new g(obj3, null, i10, str2, walletRespon);
                                                                            b.c(i1, "", 0, obj1, 0, new d(obj2, i2, uoe, uod22.mCsLogCorrelateInfo));
                                                                         }
                                                                      }
                                                                      walletRespon = null;
                                                                      goto label_01f3 ;
                                                                   }
                                                                }
                                                             }
                                                             str2 = "";
                                                             goto label_01e0 ;
                                                          }
                                                       }
                                                       uod21 = null;
                                                       goto label_0194 ;
                                                    }
                                                 }
                                                 obj3 = null;
                                                 goto label_0175 ;
                                              }
                                           }
                                           str1 = "";
                                           goto label_0161 ;
                                        }
                                     }
                                     obj2 = null;
                                     goto label_013f ;
                                  }
                               }
                               i4 = 0;
                               goto label_00d8 ;
                            }
                         }
                         str2 = "";
                         goto label_00b8 ;
                      }
                   }
                }
                userInfo = null;
                goto label_00aa ;
             }
             if (uob != null) {
                obj.b.d(uob, "CLIENT_CLICK_SEND_GIFT", "[LiveGiftSendLogger] isComboSend = "+uob.m(), i);
                d uod1 = uof.c();
                if (uod1 != null) {
                   obj.b.d(uob, uod1.e, uof.d(), uof.b());
                }
             }
          }
       }
       return;
    }
}
