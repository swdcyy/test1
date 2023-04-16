package com.yxcorp.gifshow.growth.push.permission.PushPermissionManager;
import com.yxcorp.gifshow.growth.push.permission.PushPermissionManager$a;
import nsd.u;
import java.lang.Object;
import com.yxcorp.gifshow.growth.push.permission.PushPermissionManager$permissionRecord$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.util.LinkedHashMap;
import android.app.Activity;
import jqa.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import cra.w;
import java.lang.StringBuilder;
import java.lang.System;
import q87.c;
import java.lang.Boolean;
import android.content.Context;
import lnc.m5;
import java.lang.Integer;
import com.yxcorp.gifshow.growth.push.permission.CommonGrowthUpPushGuideConfig;
import java.lang.CharSequence;
import e17.i;
import kotlin.jvm.internal.a;
import q2b.h$b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import k2b.e0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import qrd.l1;
import com.google.gson.JsonElement;
import k2b.u1;
import com.kwai.sdk.switchconfig.a;
import java.lang.Long;
import java.lang.Number;
import com.yxcorp.gifshow.util.DateUtils;
import java.lang.Math;
import com.yxcorp.gifshow.growth.push.permission.PushPermissionRecord;
import java.util.Map;
import iqa.b;
import jqa.a;
import com.kwai.framework.activitycontext.ActivityContext;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import android.os.Build$VERSION;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import kzc.d;
import lnc.a1;
import u07.t$a;
import com.kwai.library.widget.popup.common.c$b;
import com.yxcorp.gifshow.growth.push.permission.PushPermissionManager$c;
import u07.u;
import com.yxcorp.gifshow.growth.push.permission.PushPermissionManager$d;
import com.yxcorp.gifshow.growth.push.permission.PushPermissionManager$e;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.yxcorp.gifshow.growth.push.permission.PushPermissionManager$f;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import vma.a;
import com.yxcorp.gifshow.growth.push.model.PushPermissionValidPlayConfig;
import java.util.Set;
import com.yxcorp.gifshow.growth.push.permission.PushPermissionManager$b;
import com.kwai.framework.activitycontext.ActivityContext$b;

public class PushPermissionManager	// class@0014b2
{
    public int a;
    public long b;
    public final p c;
    public long d;
    public boolean e;
    public GrowthUpNotifyGuideConfig f;
    public a g;
    public CommonGrowthUpPushGuideConfig h;
    public final Map i;
    public boolean j;
    public boolean k;
    public static final PushPermissionManager$a l;

    static {
       PushPermissionManager.l = new PushPermissionManager$a(null);
    }
    public void PushPermissionManager(){
       super();
       this.b = 5;
       this.c = s.c(PushPermissionManager$permissionRecord$2.INSTANCE);
       this.i = new LinkedHashMap();
    }
    public final void a(Activity p0){
       boolean b;
       String str1;
       CommonGrowthUpPushGuideConfig uCommonGrowt;
       CommonGrowthUpPushGuideConfig toast;
       Object obj = this;
       Object obj1 = p0;
       b uob = b.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       PushPermissionManager pushPermissi = PushPermissionManager.class;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, pushPermissi, "8")) {
          return;
       }
       Object[] objArray = new Object[0];
       w.C().w("PushPermissionManager", "mIsFeedElementCheckingPermission="+obj.k+"时间间隔="+(System.currentTimeMillis() - obj.d), objArray);
       int i = (obj.k != null)? 22: 11;
       obj.k(0);
       obj.j(0);
       if (obj1 != null) {
          Object obj2 = PatchProxy.applyOneRefs(obj1, obj, pushPermissi, "9");
          if (obj2 != patchProxyRe) {
             b = obj2.booleanValue();
          }else if(m5.b(p0) && ((System.currentTimeMillis() - obj.d) - (long)0x493e0 <= 0 && obj.e != null)){
             b = true;
          }else {
             b = false;
          }
          obj2 = (b)? obj1: null;
          if (obj2 != null) {
             pushPermissi = obj.a;
             PushPermissionManager f = obj.f;
             PushPermissionManager h = obj.h;
             String str = "";
             if (PatchProxy.isSupport(uob)) {
                str1 = str;
                Object obj3 = PatchProxy.applyThreeRefs(Integer.valueOf(pushPermissi), f, h, null, b.class, "9");
                if (obj3 != patchProxyRe) {
                   uCommonGrowt = obj3;
                }else if(b.d(pushPermissi)){
                   if (f != null) {
                      toast = f.toast;
                      if (toast != null) {
                      label_00c3 :
                         uCommonGrowt = toast;
                      }
                   }
                }else if(h != null){
                   toast = h.toast;
                   if (toast != null) {
                      goto label_00c3 ;
                   }
                }
                uCommonGrowt = str1;
             }else {
                str1 = str;
                goto label_00b0 ;
             }
             i.d(R.style.arg_RES_7f11066a, uCommonGrowt);
             if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(i), uCommonGrowt, null, b.class, "10")) {
                a.p(obj1, "activity");
                h$b uob1 = h$b.e(7, "PUSH_AUTHORITY_TOAST");
                ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
                v3 = obj1 instanceof e0;
                e0 uoe0 = (!pushPermissi)? null: obj1;
                String str2 = (uoe0 != null)? uoe0.o(): null;
                urlPackage.page2 = str2;
                uob1.u(urlPackage);
                a.o(uob1, "it");
                uob1.k(new ClientEvent$ElementPackage());
                JsonObject jsonObject = new JsonObject();
                b.a(jsonObject, i);
                jsonObject.c0("toast_text", uCommonGrowt);
                uob1.b().params = jsonObject.toString();
                int i1 = (!pushPermissi)? 0: obj1;
                u1.p0(str1, i1, uob1);
             }
             obj.d = 0;
             obj.e = false;
          }
       }
       return;
    }
    public final boolean b(CommonGrowthUpPushGuideConfig p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PushPermissionManager.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (a.t().d("pushPermissionGuide", b) && (p0 != null && p0.pushButtonOn == 1)) {
          b = true;
       }
    label_0028 :
       return b;
    }
    public final boolean c(){
       Object obj = PatchProxy.apply(null, this, PushPermissionManager.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b(this.f);
    }
    public final int d(long p0){
       PushPermissionManager pushPermissi = PushPermissionManager.class;
       if (PatchProxy.isSupport(pushPermissi)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, pushPermissi, "5");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return Math.abs(DateUtils.r(System.currentTimeMillis(), p0));
    }
    public final PushPermissionRecord e(){
       Object obj = PatchProxy.apply(null, this, PushPermissionManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.getValue();
    }
    public final boolean f(int p0){
       String obj1;
       Object[] objArray;
       Object[] objArray1;
       StringBuilder str1;
       Object obj = this;
       int i = p0;
       PushPermissionManager pushPermissi = PushPermissionManager.class;
       if (PatchProxy.isSupport(pushPermissi)) {
          obj1 = PatchProxy.applyOneRefs(Integer.valueOf(p0), obj, pushPermissi, "15");
          if (obj1 != PatchProxyResult.class) {
             return obj1.booleanValue();
          }
       }
       pushPermissi = obj.g;
       if (pushPermissi != null) {
          boolean i1 = 0;
          if (i > -1) {
             b uob = obj.i.get(Integer.valueOf(p0));
             if (uob != null && uob.a()) {
                objArray = new Object[i1];
                w.C().w("PushPermissionManager", "刚才触发展示，现在通过频控 page="+i, objArray);
                return i1;
             }else {
                objArray1 = new Object[i1];
                w.C().w("PushPermissionManager", "isHitFrequency page="+i, objArray1);
             }
          }
          a frequencyY = pushPermissi.frequencyY;
          a frequencyN = pushPermissi.frequencyN;
          long l = 0;
          if (!frequencyY - l || !frequencyN - l) {
             return true;
          }else {
             int pushPermissi1 = this.e().getPushPermissionShowTimes();
             l = (long)pushPermissi1;
             boolean b = (l - frequencyY >= 0)? true: false;
             String str = "短周期=";
             objArray1 = new Object[0];
             w.C().w("PushPermissionManager", str+pushPermissi1+"  "+"Y="+frequencyY+"  短周期 频控结果="+b+"  page="+i, objArray1);
             if (b) {
                return true;
             }else {
                obj1 = " N=";
                if (pushPermissi.frequencyM - (long)0x186a0 >= 0) {
                   i1 = (l - frequencyN >= 0)? true: false;
                   Object[] objArray2 = new Object[0];
                   w.C().w("PushPermissionManager", "生命周期 短周期="+pushPermissi1+obj1+frequencyN+" page="+i, objArray2);
                }else {
                   long pushPermissi2 = this.e().getPushPermissionShowTimesLongPeriod();
                   str1 = (pushPermissi2 - frequencyN >= 0)? 1: null;
                   Object[] objArray3 = new Object[0];
                   w.C().w("PushPermissionManager", "长周期="+pushPermissi2+obj1+frequencyN+" page="+i, objArray3);
                   i1 = str1;
                }
                w ow = w.C();
                str1 = str+b+" 长周期="+i1+" 频控结果=";
                boolean b1 = (b && i1)? true: false;
                objArray = new Object[0];
                ow.w("PushPermissionManager", str1+b1+" page="+i, objArray);
                return i1;
             }
          }
       }else {
          return true;
       }
    }
    public final void g(boolean p0,int p1){
       PushPermissionManager pushPermissi = PushPermissionManager.class;
       if (PatchProxy.isSupport(pushPermissi) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), this, pushPermissi, "17")) {
          return;
       }
       Object[] objArray = new Object[0];
       w.C().w("PushPermissionManager", "forceOpen="+p0+" page="+p1, objArray);
       return;
    }
    public final void h(int p0,boolean p1){
       Object[] objArray;
       PushPermissionManager pushPermissi = PushPermissionManager.class;
       if (PatchProxy.isSupport(pushPermissi) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, pushPermissi, "18")) {
          return;
       }
       ActivityContext uActivityCon = ActivityContext.g();
       String str = "ActivityContext.getInstance\(\)";
       a.o(uActivityCon, str);
       if (!m5.b(uActivityCon.e())) {
          b uob = b.class;
          Activity uActivity = null;
          if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), uActivity, uob, "11")) {
             uActivityCon = ActivityContext.g();
             a.o(uActivityCon, str);
             Activity uActivity1 = uActivityCon.e();
             if (uActivity1 != null) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "AUTHORITY_POPUP";
                uElementPack.params = b.a(new JsonObject(), p0).toString();
                if (uActivity1 instanceof e0) {
                   uActivity = uActivity1;
                }
                u1.D0("", uActivity, 3, uElementPack, null, null);
             }
          }
          p0 = 0;
          if (p1) {
             if (!this.e().getLastPushPermissionAlertTime()) {
                this.e().setLastPushPermissionAlertTimeLongPeriod(System.currentTimeMillis());
                this.e().setLastPushPermissionAlertTime(System.currentTimeMillis());
             }
             this.e().setPushPermissionShowTimesLongPeriod((this.e().getPushPermissionShowTimesLongPeriod() + 1));
             this.e().setPushPermissionShowTimes((this.e().getPushPermissionShowTimes() + 1));
             this.m();
             objArray = new Object[p0];
             w.C().w("PushPermissionManager", "弹窗/element 马上出现  after + 1"+"pushPermissionShowTimes="+this.e().getPushPermissionShowTimes()+"  "+"pushPermissionShowTimesLongPeriod="+this.e().getPushPermissionShowTimesLongPeriod(), objArray);
          }else {
             objArray = new Object[p0];
             w.C().w("PushPermissionManager", "element 强制出现 不计数了 短周期次数="+this.e().getPushPermissionShowTimes()+"长周期次数="+this.e().getPushPermissionShowTimesLongPeriod(), objArray);
          }
       }
       return;
    }
    public final void i(){
       if (PatchProxy.applyVoid(null, this, PushPermissionManager.class, "13")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "PushPermissionManager";
       w.C().w(str, "打开设置了", objArray);
       ActivityContext uActivityCon = ActivityContext.g();
       a.o(uActivityCon, "ActivityContext.getInstance\(\)");
       Activity uActivity = uActivityCon.e();
       if (uActivity != null) {
          int sDK_INT = Build$VERSION.SDK_INT;
          Object[] objArray1 = new Object[i];
          w.C().w(str, "SDK="+sDK_INT, objArray1);
          if (sDK_INT >= 26) {
             Intent intent = new Intent();
             intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
             intent.putExtra("android.provider.extra.APP_PACKAGE", uActivity.getPackageName());
             intent.putExtra("android.provider.extra.CHANNEL_ID", uActivity.getApplicationInfo().uid);
             uActivity.startActivity(intent);
          }else {
             b.f(uActivity);
          }
       }
       return;
    }
    public final void j(boolean p0){
       PushPermissionManager pushPermissi = PushPermissionManager.class;
       if (PatchProxy.isSupport(pushPermissi) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, pushPermissi, "2")) {
          return;
       }
       this.j = p0;
       if (p0) {
          this.d = System.currentTimeMillis();
       }
       return;
    }
    public final void k(boolean p0){
       PushPermissionManager pushPermissi = PushPermissionManager.class;
       if (PatchProxy.isSupport(pushPermissi) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, pushPermissi, "3")) {
          return;
       }
       this.k = p0;
       if (p0) {
          this.d = System.currentTimeMillis();
       }
       return;
    }
    public final void l(int p0){
       CommonGrowthUpPushGuideConfig uCommonGrowt;
       CommonGrowthUpPushGuideConfig uCommonGrowt1;
       CommonGrowthUpPushGuideConfig uCommonGrowt2;
       CommonGrowthUpPushGuideConfig buttonCopy;
       CommonGrowthUpPushGuideConfig popUp;
       boolean b;
       String str1;
       PushPermissionManager pushPermissi = PushPermissionManager.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       if (PatchProxy.isSupport(pushPermissi) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, pushPermissi, "12")) {
          return;
       }
       this.a = p0;
       b uob1 = this.i.get(Integer.valueOf(p0));
       ActivityContext uActivityCon = ActivityContext.g();
       a.o(uActivityCon, "ActivityContext.getInstance\(\)");
       d uod = new d(uActivityCon.e());
       uod.Z0(100);
       PushPermissionManager tf = this.f;
       PushPermissionManager th = this.h;
       if (PatchProxy.isSupport(uob)) {
          uCommonGrowt = PatchProxy.applyThreeRefs(Integer.valueOf(p0), tf, th, null, b.class, "8");
          if (uCommonGrowt != patchProxyRe) {
          label_0089 :
             uod.X0(uCommonGrowt);
             tf = this.f;
             PushPermissionManager th1 = this.h;
             if (PatchProxy.isSupport(uob)) {
                uCommonGrowt1 = PatchProxy.applyThreeRefs(Integer.valueOf(p0), tf, th1, null, b.class, "6");
                if (uCommonGrowt1 != patchProxyRe) {
                label_00d5 :
                   uod.z0(uCommonGrowt1);
                   tf = this.f;
                   th1 = this.h;
                   if (PatchProxy.isSupport(uob)) {
                      uCommonGrowt2 = PatchProxy.applyThreeRefs(Integer.valueOf(p0), tf, th1, null, b.class, "7");
                      if (uCommonGrowt2 != patchProxyRe) {
                      label_0121 :
                         uod.T0(uCommonGrowt2);
                         uod.w0(false);
                         uod.A(false);
                         uod.u0(new PushPermissionManager$c(this));
                         uod.s0(PushPermissionManager$d.b);
                         uod.L(PushPermissionManager$e.b);
                         uod.Y(new PushPermissionManager$f(this, uob1));
                         return;
                      }
                   }
                   String str = 0x7f1013a6;
                   if (b.d(p0)) {
                      if (tf != null) {
                         buttonCopy = tf.buttonCopy;
                         if (buttonCopy != null) {
                         label_010a :
                            a.o(buttonCopy, "configFeed?.buttonCopy ?\x20\x02e_notification_push_open\)\x00");
                         }
                      }
                      buttonCopy = a1.p(str);
                      goto label_010a ;
                   }else if(th1 != null){
                      buttonCopy = th1.buttonCopy;
                      if (buttonCopy != null) {
                      label_011b :
                         a.o(buttonCopy, "configSearch?.buttonCopy\x20\x02e_notification_push_open\)\x00");
                      }
                   }
                   buttonCopy = a1.p(str);
                   goto label_011b ;
                   uCommonGrowt2 = buttonCopy;
                   goto label_0121 ;
                }
             }
             Integer integer = 0x7f10407b;
             if (b.d(p0)) {
                if (tf != null) {
                   popUp = tf.popUp;
                   if (popUp != null) {
                   label_00be :
                      a.o(popUp, "configFeed?.popUp ?: Com\x20\x02sh_setting_window_title2\)\x00");
                   }
                }
                popUp = a1.p(integer);
                goto label_00be ;
             }else if(th1 != null){
                popUp = th1.popUp;
                if (popUp != null) {
                label_00cf :
                   a.o(popUp, "configSearch?.popUp ?: C\x20\x02sh_setting_window_title2\)\x00");
                }
             }
             popUp = a1.p(integer);
             goto label_00cf ;
             uCommonGrowt1 = popUp;
             goto label_00d5 ;
          }
       }
       b = 0x7f104070;
       if (b.d(p0)) {
          if (tf != null) {
             popUp = tf.title;
             if (popUp != null) {
             label_0072 :
                a.o(popUp, "configFeed?.title ?: Com\x20\x02tring.push_notifications\)\x00");
             }
          }
          str1 = a1.p(b);
          goto label_0072 ;
       }else if(th != null){
          str1 = th.title;
          if (str1 != null) {
          label_0083 :
             a.o(str1, "configSearch?.title ?: C\x20\x02tring.push_notifications\)\x00");
          }
       }
       str1 = a1.p(b);
       goto label_0083 ;
       uCommonGrowt = popUp;
       goto label_0089 ;
    }
    public final void m(){
       if (PatchProxy.applyVoid(null, this, PushPermissionManager.class, "6")) {
          return;
       }
       a.u(this.e());
       return;
    }
    public final void onPushPermissionElementEvent(int p0,String p1,int p2){
       if (PatchProxy.isSupport(PushPermissionManager.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, Integer.valueOf(p2), this, PushPermissionManager.class, "16")) {
          return;
       }
       b uob = this.i.get(Integer.valueOf(p2));
       if (uob != null) {
          String str = 22;
          int i = 1;
          if (p0) {
             if (p0 != i) {
                if (p0 != 2) {
                   if (p0 == 3) {
                      b.b(str, 44);
                      uob.f(i);
                      uob.i(0);
                      uob.j(p1);
                      PushPermissionValidPlayConfig pushPermissi = this.e().getValidPlayConfigMap().get(Integer.valueOf(p2));
                      if (pushPermissi != null) {
                         pushPermissi.setValidPlayTimes(0);
                      }
                      pushPermissi = this.e().getValidPlayConfigMap().get(Integer.valueOf(p2));
                      if (pushPermissi != null) {
                         pushPermissi.setLastValidPlayTime(System.currentTimeMillis());
                      }
                      this.m();
                      this.g(uob.a(), p2);
                   }
                }else {
                   uob.h(0);
                   if (uob.a != null) {
                      uob.f(0);
                   }else {
                      uob.j("");
                   }
                }
             }else {
                uob.h(i);
                uob.c().clear();
                this.h(str, (uob.a() ^ i));
                uob.i(i);
                this.g(i, p2);
             }
          }else {
             this.k(i);
             this.e = i;
             b.b(str, 33);
             uob.i(0);
             this.g(0, p2);
             ActivityContext.i(new PushPermissionManager$b(this));
          }
          Object[] objArray = new Object[0];
          w.C().w("PushPermissionManager", " onPushPermissionElementEvent="+p0+" page="+p2, objArray);
       }
       return;
    }
}
