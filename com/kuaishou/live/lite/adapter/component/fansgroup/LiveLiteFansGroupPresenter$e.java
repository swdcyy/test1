package com.kuaishou.live.lite.adapter.component.fansgroup.LiveLiteFansGroupPresenter$e;
import kg1.h;
import com.kuaishou.live.lite.adapter.component.fansgroup.LiveLiteFansGroupPresenter;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.lite.adapter.component.fansgroup.LiveLiteFansGroupDataModel;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.show.fansgroup.LiveFansGroupInfo;
import e93.a;
import com.kwai.framework.model.user.User;
import xp5.g;
import xp5.i;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.kuaishou.live.lite.adapter.component.fansgroup.LiveLiteFansGroupPresenter$e$a;
import com.kuaishou.live.lite.adapter.component.fansgroup.LiveLiteFansGroupPresenter$e$b;
import h73.t;
import com.kuaishou.live.core.show.fansgroup.LiveFansGroupJoinButtonInfo;
import z1.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import e17.i;
import com.kwai.component.fansgroup.utils.FansGroupKswitchUtil;
import l95.b;
import java.util.HashMap;
import java.util.Map;
import l95.c;
import kg1.f;
import android.app.Activity;
import d61.g;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import u07.t$a;
import lnc.a1;
import u07.f;
import h73.p;
import u07.u;
import com.kwai.library.widget.popup.common.c$b;
import h73.s;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import erd.g;
import java.lang.System;
import com.kuaishou.live.lite.adapter.component.fansgroup.LiveLiteFansGroupPresenter$e$c;
import h73.j;
import h73.l;

public final class LiveLiteFansGroupPresenter$e implements h	// class@001d98
{
    public final LiveLiteFansGroupPresenter a;

    public void LiveLiteFansGroupPresenter$e(LiveLiteFansGroupPresenter p0){
       this.a = p0;
       super();
    }
    public boolean a(int p0,String p1,String p2){
       Integer obj1;
       LiveLiteFansGroupPresenter$e a;
       LiveLiteFansGroupPresenter this;
       String str;
       String obj2;
       String str4;
       String str6;
       String str7;
       LiveLiteFansGroupPresenter$e uoe = this;
       Object obj = p1;
       object oobject = p2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(LiveLiteFansGroupPresenter$e.class)) {
          obj1 = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, p2, this, LiveLiteFansGroupPresenter$e.class, "1");
          if (obj1 != patchProxyRe) {
             return obj1.booleanValue();
          }
       }
       a.p(obj, "source");
       obj1 = uoe.a.K.j().getValue();
       boolean b = false;
       if (obj1 == null) {
          b.P(LiveLiteLogTag.LITE_FANS_GROUP.appendTag(uoe.a.v), "fansGroupStatus params error");
          return b;
       }else {
          LiveFansGroupInfo value = uoe.a.K.k().getValue();
          value = (value != null)? value.mLiveFansGroupJoinButtonInfo: null;
          LiveFansGroupInfo liveFansGrou = value;
          a = uoe.a;
          this = a.M;
          if (this != null) {
             User user = LiveLiteFansGroupPresenter.c9(a).I();
             int i = obj1.intValue();
             FeedLogCtx uFeedLogCtx = LiveLiteFansGroupPresenter.d9(uoe.a).c0();
             if (uFeedLogCtx != null) {
                str = uFeedLogCtx.toJsonString();
                if (str != null) {
                label_008d :
                   String str1 = str;
                   LiveLiteFansGroupPresenter$e$a uoe$a = new LiveLiteFansGroupPresenter$e$a(uoe);
                   LiveLiteFansGroupPresenter$e$b uoe$b = new LiveLiteFansGroupPresenter$e$b(uoe);
                   t ot = t.class;
                   int i1 = 2;
                   int i2 = 1;
                   if (PatchProxy.isSupport(ot)) {
                      Object[] objArray = new Object[9];
                      objArray[b] = user;
                      objArray[i2] = Integer.valueOf(i);
                      objArray[i1] = liveFansGrou;
                      objArray[3] = Integer.valueOf(p0);
                      objArray[4] = oobject;
                      objArray[5] = obj;
                      objArray[6] = str1;
                      objArray[7] = uoe$a;
                      objArray[8] = uoe$b;
                      obj2 = PatchProxy.apply(objArray, this, ot, "2");
                      if (obj2 != patchProxyRe) {
                         b = obj2.booleanValue();
                      }
                   }
                   i = (i == i2 || i == i1)? 1: 0;
                   String str2 = "blockReason";
                   obj2 = "CHECK_STATUS";
                   String str3 = "JoinDialog";
                   if (!i) {
                      str4 = str3;
                      this.h(user, liveFansGrou, p1, str1, uoe$a, uoe$b);
                      if (!TextUtils.x(p2)) {
                         i.f(R.style.arg_RES_7f11066a, oobject, true);
                      }
                      if (!PatchProxy.applyVoidOneRefs(obj, this, ot, "15") && FansGroupKswitchUtil.b()) {
                         b uob = new b(true, str4, obj2);
                         uob.g(obj);
                         HashMap hashMap = new HashMap();
                         hashMap.put(str2, "NOT_IN_FANS");
                         uob.d(hashMap);
                         c.a(uob);
                      }
                   }else {
                      str4 = str3;
                      String str5 = 1;
                      if (PatchProxy.isSupport(ot)) {
                         Object obj3 = PatchProxy.applyTwoRefs(Integer.valueOf(p0), obj, this, ot, "9");
                         if (obj3 != patchProxyRe) {
                            i2 = obj3.booleanValue();
                         label_0148 :
                            uoe$b = 1;
                         label_0212 :
                            if (i2) {
                               b.P(LiveLiteLogTag.LITE_FANS_GROUP.appendTag("LiveFansGroupJoinModel"), "[2] Not satisfy min required fans group level");
                            }else {
                            label_0221 :
                               b = false;
                            }
                         }
                      }
                      Integer value1 = this.d.sn().getValue();
                      if (value1 != null) {
                         if (value1.intValue() >= p0) {
                         label_0177 :
                            i2 = false;
                            goto label_0148 ;
                         }
                      }else {
                         i2 = p0;
                      }
                      if (g.h(this.l)) {
                         b.P(LiveLiteLogTag.LITE_FANS_GROUP.appendTag("LiveFansGroupJoinModel"), "activity is finishing or destroyed");
                         goto label_0177 ;
                      }else {
                         t$a uoa = new t$a(this.l);
                         uoa.X0(a1.r(R.string.arg_RES_7f10223e, String.valueOf(p0)));
                         uoa = f.e(uoa);
                         uoa.T0(a1.p(R.string.arg_RES_7f10214c));
                         uoa.R0(a1.p(R.string.cancel));
                         uoa.u0(new p(this, this.i.Bb()));
                         uoa.v(str5);
                         uoa.Y(new s(this, obj));
                         if (PatchProxy.isSupport(ot)) {
                            str6 = str4;
                            str7 = obj2;
                            str3 = str2;
                            if (!PatchProxy.applyVoidThreeRefs(p1, value1, Integer.valueOf(p0), this, t.class, "16")) {
                            label_01e1 :
                               if (FansGroupKswitchUtil.b()) {
                                  b uob1 = new b(true, str6, str7);
                                  uob1.g(obj);
                                  HashMap hashMap1 = new HashMap();
                                  hashMap1.put(str3, "LOW_LEVEL");
                                  hashMap1.put("curLevel", String.valueOf(value1));
                                  hashMap1.put("needLevel", String.valueOf(p0));
                                  uob1.d(hashMap1);
                                  c.a(uob1);
                               }
                            }
                         }else {
                            str6 = str4;
                            str7 = obj2;
                            str3 = str2;
                            boolean b1 = true;
                            goto label_01e1 ;
                         }
                         i2 = true;
                         goto label_0212 ;
                      }
                   }
                   b = true;
                }
             }
             str = "";
             goto label_008d ;
          }else {
             goto label_0221 ;
          }
          return b;
       }
    }
    public void b(int p0,int p1,String p2,String p3,g p4){
       Object[] objArray;
       String str;
       LiveLiteFansGroupPresenter liveLiteFans1;
       Object obj = this;
       int i = p1;
       object oobject = p2;
       object oobject1 = p3;
       LiveLiteFansGroupPresenter$e uoe = LiveLiteFansGroupPresenter$e.class;
       int i1 = 4;
       int i2 = 5;
       if (PatchProxy.isSupport(uoe)) {
          objArray = new Object[i2];
          objArray[0] = Integer.valueOf(p0);
          objArray[1] = Integer.valueOf(p1);
          objArray[2] = oobject;
          objArray[3] = oobject1;
          objArray[i1] = p4;
          if (PatchProxy.applyVoid(objArray, obj, uoe, "2")) {
             return;
          }
       }
       a.p(oobject, "joinSource");
       a.p(oobject1, "rechargeSource");
       long l = System.currentTimeMillis();
       uoe = obj.a;
       LiveLiteFansGroupPresenter m = uoe.M;
       if (m != null) {
          FeedLogCtx uFeedLogCtx = LiveLiteFansGroupPresenter.d9(uoe).c0();
          if (uFeedLogCtx != null) {
             str = uFeedLogCtx.toJsonString();
             if (str != null) {
             label_005a :
                LiveLiteFansGroupPresenter$e$c uoe$c = objArray;
                LiveLiteFansGroupPresenter$e$c uoe$c1 = objArray;
                String str1 = str;
                LiveLiteFansGroupPresenter liveLiteFans = m;
                uoe$c = new LiveLiteFansGroupPresenter$e$c(this, p2, l, p4);
                t ot = t.class;
                if (PatchProxy.isSupport(ot)) {
                   objArray = new Object[]{oobject,Integer.valueOf(p0),Integer.valueOf(p1),oobject1,str1,uoe$c1};
                   liveLiteFans1 = liveLiteFans;
                   if (!PatchProxy.applyVoid(objArray, liveLiteFans1, ot, "1")) {
                   }
                }else {
                   liveLiteFans1 = liveLiteFans;
                }
             }
          }
          str = "";
          goto label_005a ;
       }
    label_00bc :
       return;
    }
}
