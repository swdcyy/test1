package com.kwai.feature.api.danmaku.DanmakuUtil;
import java.lang.String;
import km8.b;
import java.lang.StringBuilder;
import java.lang.Object;
import android.content.SharedPreferences;
import xf6.d;
import com.kwai.feature.api.danmaku.DanmakuUtil$maxDanmakuBodyLength$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kwai.feature.api.danmaku.model.DanmakuInfo;
import nm5.e;
import java.lang.CharSequence;
import android.text.TextUtils;
import lnc.a1;
import kotlin.jvm.internal.a;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.Map$Entry;
import im5.d;
import java.lang.Boolean;
import qm5.c;
import trd.t0;
import com.kwai.corona.startup.model.CoronaBarrageSetting;
import nm5.f;
import ra6.a;
import com.kwai.feature.api.danmaku.model.DanmakuInputHint;
import java.lang.reflect.Type;
import ni5.d;
import com.kwai.corona.startup.model.CoronaBarrageSetting$DanmakuInputHint;
import java.lang.Number;
import qm5.b;
import com.yxcorp.gifshow.image.KwaiImageView;
import nm5.q;
import java.lang.Integer;
import com.kwai.feature.api.danmaku.model.ExtraDanmakuDisplayInfo;
import com.yxcorp.gifshow.model.CDNUrl;
import ekd.j;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import com.kwai.feature.api.danmaku.DanmakuUtil$a;
import ub.b;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import im5.g;
import java.lang.Math;
import o56.a;
import android.content.Context;
import android.graphics.Point;
import com.yxcorp.utility.n;
import lnc.i5;
import com.kwai.feature.api.danmaku.DanmakuExperimentUtils;
import bt7.e;
import java.util.Objects;
import wkd.b;
import te6.b;
import com.kwai.framework.model.user.QCurrentUser;
import com.kwai.framework.model.user.User;
import com.kuaishou.android.model.mix.PhotoMeta;
import mm5.a;
import java.lang.Throwable;
import q2b.h$b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import org.json.JSONArray;
import org.json.JSONObject;
import lnc.i3;
import qrd.l1;
import k2b.e0;
import k2b.u1;
import android.app.Application;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;

public final class DanmakuUtil	// class@000e71
{
    public static final String a;
    public static final String b;
    public static final SharedPreferences c;
    public static int d;
    public static int e;
    public static final p f;
    public static final DanmakuUtil g;

    static {
       DanmakuUtil.g = new DanmakuUtil();
       String str = b.d("user");
       DanmakuUtil.a = str;
       StringBuilder str1 = str;
       str = str1+"SEND_DANMAKU_AT_MUSIC_LABEL_RIGHT_POP";
       DanmakuUtil.b = str;
       SharedPreferences sharedPrefer = b.b("danmakuUtilPref");
       DanmakuUtil.c = sharedPrefer;
       int i = 0;
       if (d.r("ENABLE_DANMAKU_GUIDE_POP")) {
       }else {
          i = sharedPrefer.getInt(str, i);
       }
       DanmakuUtil.d = i;
       DanmakuUtil.e = -1;
       DanmakuUtil.f = s.c(DanmakuUtil$maxDanmakuBodyLength$2.INSTANCE);
    }
    public void DanmakuUtil(){
       super();
    }
    public static final String b(QPhoto p0){
       DanmakuInfo uDanmakuInfo = null;
       Object obj = PatchProxy.applyOneRefs(p0, uDanmakuInfo, DanmakuUtil.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          CommonMeta commonMeta = p0.getCommonMeta();
          if (commonMeta != null) {
             DanmakuInfo uDanmakuInfo1 = e.a(commonMeta);
             if (uDanmakuInfo1 != null) {
                uDanmakuInfo1 = uDanmakuInfo1.mDisableReasonTip;
                if (uDanmakuInfo1 != null) {
                   if (!TextUtils.isEmpty(uDanmakuInfo1)) {
                      uDanmakuInfo = uDanmakuInfo1;
                   }
                   if (uDanmakuInfo != null) {
                   label_0038 :
                      return uDanmakuInfo;
                   }
                }
             }
          }
       }
       uDanmakuInfo = a1.p(R.string.arg_RES_7f103c38);
       a.o(uDanmakuInfo, "CommonUtil.string\(R.stri¡­hoto_not_support_danmaku\)");
       goto label_0038 ;
    }
    public static final Map c(Map p0){
       LinkedHashMap obj = PatchProxy.applyOneRefs(p0, null, DanmakuUtil.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LinkedHashMap();
       if (p0 != null) {
          Iterator iterator = p0.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             if (uEntry.getValue() != null) {
                Object value = uEntry.getValue();
                a.m(value);
                obj.put(uEntry.getKey(), value);
             }
          }
       }
       return obj;
    }
    public static final Map d(d p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, DanmakuUtil.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return DanmakuUtil.f(p0, false, 2, null);
    }
    public static final Map e(d p0,boolean p1){
       DanmakuUtil uDanmakuUtil = DanmakuUtil.class;
       if (PatchProxy.isSupport(uDanmakuUtil)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), null, uDanmakuUtil, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 != null && p0.k() == true) {
          return p0.w().w(p1);
       }else {
          return t0.z();
       }
    }
    public static Map f(d p0,boolean p1,int p2,Object p3){
       if (p2 & 0x02) {
          p1 = false;
       }
       return DanmakuUtil.e(p0, p1);
    }
    public static final String h(QPhoto p0){
       String str1;
       CoronaBarrageSetting$DanmakuInputHint hintOfZh_han;
       String hintOfZh_han1;
       CoronaBarrageSetting uCoronaBarra = CoronaBarrageSetting.class;
       Object obj = PatchProxy.applyOneRefs(p0, null, DanmakuUtil.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = "";
       if (p0 != null) {
          CommonMeta commonMeta = p0.getCommonMeta();
          if (commonMeta != null) {
             DanmakuInfo uDanmakuInfo = e.a(commonMeta);
             if (uDanmakuInfo != null) {
                uDanmakuInfo = uDanmakuInfo.mDanmakuInputHint;
                if (uDanmakuInfo != null) {
                   str1 = PatchProxy.applyOneRefs(uDanmakuInfo, null, f.class, "1");
                   if (str1 != PatchProxyResult.class) {
                   }else {
                      a.p(uDanmakuInfo, "$this$inputHint");
                      if (a.d() == 1) {
                         hintOfZh_han1 = uDanmakuInfo.getHintOfZh_hans();
                      }else if(a.d() == 2){
                         hintOfZh_han1 = uDanmakuInfo.getHintOfZh_hant();
                      }else {
                         hintOfZh_han1 = uDanmakuInfo.getHintOfEn();
                      }
                      str1 = hintOfZh_han1;
                   }
                   if (str1 != null) {
                   label_005a :
                      if (!TextUtils.isEmpty(str1)) {
                         return str1;
                      }else {
                         CoronaBarrageSetting uCoronaBarra1 = d.a(uCoronaBarra);
                         if (uCoronaBarra1 != null) {
                            CoronaBarrageSetting$DanmakuInputHint uDanmakuInpu = PatchProxy.apply(null, uCoronaBarra1, uCoronaBarra, "1");
                            if (uDanmakuInpu != PatchProxyResult.class) {
                            }else if(uCoronaBarra1.mDanmakuInputHint != null){
                               if (a.d() == 1) {
                                  hintOfZh_han = uCoronaBarra1.mDanmakuInputHint.hintOfZh_hans;
                               }else if(a.d() == 2){
                                  hintOfZh_han = uCoronaBarra1.mDanmakuInputHint.hintOfZh_hant;
                               }else {
                                  hintOfZh_han = uCoronaBarra1.mDanmakuInputHint.hintOfEn;
                               }
                               uDanmakuInpu = hintOfZh_han;
                            }else {
                               uDanmakuInpu = str;
                            }
                            if (uDanmakuInpu != null) {
                               str = uDanmakuInpu;
                            }
                         }
                         if (TextUtils.isEmpty(str)) {
                            str = a1.p(R.string.arg_RES_7f10486a);
                            a.o(str, "CommonUtil.string\(R.stri¡­lide_send_friend_danmaku\)");
                         }
                         return str;
                      }
                   }
                }
             }
          }
       }
       str1 = str;
       goto label_005a ;
    }
    public static final long i(d p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, DanmakuUtil.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return DanmakuUtil.k(p0, false, 2, null);
    }
    public static final long j(d p0,boolean p1){
       DanmakuUtil uDanmakuUtil = DanmakuUtil.class;
       if (PatchProxy.isSupport(uDanmakuUtil)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), null, uDanmakuUtil, "3");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       if (p0 != null && p0.k() == true) {
          return p0.q().M(p1);
       }else {
          return -1;
       }
    }
    public static long k(d p0,boolean p1,int p2,Object p3){
       if (p2 & 0x02) {
          p1 = false;
       }
       return DanmakuUtil.j(p0, p1);
    }
    public static final void r(KwaiImageView p0,q p1,int p2){
       if (PatchProxy.isSupport(DanmakuUtil.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), null, DanmakuUtil.class, "13")) {
          return;
       }
       a.p(p0, "iconView");
       ExtraDanmakuDisplayInfo uExtraDanmak = (p1 != null)? p1.a(): null;
       if (uExtraDanmak == null || j.h(p1.a().getCdnUrl())) {
          p0.setVisibility(8);
          return;
       }else {
          ExtraDanmakuDisplayInfo uExtraDanmak1 = p1.a();
          ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
          layoutParams.height = p2;
          float f = (float)0;
          int i = (uExtraDanmak1.getWidth() - f > 0 && uExtraDanmak1.getHeight() - f > 0)? (int)((uExtraDanmak1.getWidth() / uExtraDanmak1.getHeight()) * (float)layoutParams.height): p2;
          layoutParams.width = i;
          p0.setLayoutParams(layoutParams);
          p0.setVisibility(0);
          CDNUrl[] cdnUrl = uExtraDanmak1.getCdnUrl();
          a.m(cdnUrl);
          p0.Y(cdnUrl, null, new DanmakuUtil$a(layoutParams, p2, p0));
          return;
       }
    }
    public final int a(int p0,int p1){
       g obj;
       int i;
       float f;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       DanmakuUtil uDanmakuUtil = DanmakuUtil.class;
       if (PatchProxy.isSupport(uDanmakuUtil)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uDanmakuUtil, "16");
          if (obj != patchProxyRe) {
             return obj.intValue();
          }
       }
       if (PatchProxy.isSupport(uDanmakuUtil)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p1), this, uDanmakuUtil, "17");
          if (obj != patchProxyRe) {
             i = obj.intValue();
          label_0060 :
             if (PatchProxy.isSupport(uDanmakuUtil)) {
                Object obj1 = PatchProxy.applyOneRefs(Integer.valueOf(p1), this, uDanmakuUtil, "18");
                if (obj1 != patchProxyRe) {
                   f = obj1.floatValue();
                label_00a7 :
                   return Math.min((int)Math.floor((double)((float)(p0 + i) / (f + (float)i))), 4);
                }
             }
             g f1 = g.f;
             float f2 = 0x3f600000;
             if (p1 != f1.d()) {
                if (p1 == f1.c()) {
                   f2 = 0x3f800000;
                }else if(p1 == f1.a()){
                   f2 = 0x3f900000;
                }else if(p1 == f1.b()){
                   f2 = 0x3fa00000;
                }
             }
             f = (float)a1.e(28.00f) * f2;
             goto label_00a7 ;
          }
       }
       obj = g.f;
       float f3 = 6.00f;
       if (p1 != obj.d() && (p1 != obj.c() && (p1 != obj.a() && p1 != obj.b()))) {
          f3 = 5.00f;
       }
    label_005c :
       i = a1.e(f3);
       goto label_0060 ;
    }
    public final int g(){
       int i1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Application obj = PatchProxy.apply(objArray, this, DanmakuUtil.class, "14");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       if (DanmakuUtil.e == -1) {
          obj = a.B;
          Point y = n.s(obj).y;
          int i = a1.d(0x7f070bf1) + i5.b(obj);
          DanmakuExperimentUtils u = DanmakuExperimentUtils.U;
          if (!u.q()) {
             i1 = a1.e(264.00f);
             DanmakuUtil.e = i1;
             this.p(i1, (y - i));
             return DanmakuUtil.e;
          }else {
             int i2 = a1.d(0x7f070fdf) + n.A(obj);
             e b = e.b;
             a.o(obj, "context");
             int i3 = (((a1.e(b.e(obj)) * 4) + (a1.e(((float)70 + b.c(obj, true))) + b.d())) + (a1.e(44.00f) + a1.e(14.00f))) + a1.e(12.00f);
             int i4 = y - i;
             double d = (double)i4;
             Objects.requireNonNull(u);
             Number number = PatchProxy.apply(objArray, u, DanmakuExperimentUtils.class, "38");
             if (number == patchProxyRe) {
                number = DanmakuExperimentUtils.J.getValue();
             }
             d = d * number.doubleValue();
             double d1 = (double)((i4 - i2) - i3) * 0x3fe999999999999a;
             if (d - d1 < 0) {
                i1 = (int)d;
             }else if(d1 - (double)a1.e(62.00f) > 0){
                i1 = (int)d1;
             }else {
                i1 = 0;
             }
             DanmakuUtil.e = i1;
             this.p(i1, i4);
          }
       }
       return DanmakuUtil.e;
    }
    public final int l(){
       Object obj = PatchProxy.apply(null, this, DanmakuUtil.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = DanmakuUtil.f.getValue();
       }
       return obj.intValue();
    }
    public final String m(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DanmakuUtil.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.n(p0, false);
    }
    public final String n(String p0,boolean p1){
       DanmakuUtil uDanmakuUtil = DanmakuUtil.class;
       if (PatchProxy.isSupport(uDanmakuUtil)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uDanmakuUtil, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 != null) {
          String str = b.a(-1427269270).B(p0);
          if (!TextUtils.isEmpty(str)) {
             return "file://"+str;
          }else if(p1){
             return null;
          }else {
             return p0;
          }
       }else {
          return null;
       }
    }
    public final boolean o(QPhoto p0){
       QCurrentUser obj = PatchProxy.applyOneRefs(p0, this, DanmakuUtil.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = QCurrentUser.ME;
       a.o(obj, "QCurrentUser.ME");
       boolean b = false;
       if (obj.isLogined() && p0 != null) {
          User user = p0.getUser();
          if (user != null && user.isFollowingOrFollowRequesting() == true) {
             user = (p0.getRealRelationType() == 1)? 1: 0;
             PhotoMeta photoMeta = p0.getPhotoMeta();
             photoMeta = (photoMeta != null && photoMeta.mPhotoFollowingIntensify == 2)? 1: 0;
             if (user || photoMeta) {
                b = true;
             }
          }
       }
    label_004d :
       return b;
    }
    public final void p(int p0,int p1){
       DanmakuUtil uDanmakuUtil = DanmakuUtil.class;
       if (PatchProxy.isSupport(uDanmakuUtil) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uDanmakuUtil, "15")) {
          return;
       }
       a.i(a.a, "DanmakuUtil", "Danmaku Content Area: "+p0, null, null, null, null, 60, null);
       h$b uob = h$b.e(7, "DANMAKU_SHOW_MAX_LINE");
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "DANMAKU_SHOW_MAX_LINE";
       JSONArray jSONArray = new JSONArray();
       DanmakuUtil g = DanmakuUtil.g;
       g f = g.f;
       jSONArray.put(new JSONObject().put("small", g.a(p0, f.d())));
       jSONArray.put(new JSONObject().put("normal", g.a(p0, f.c())));
       jSONArray.put(new JSONObject().put("large", g.a(p0, f.a())));
       jSONArray.put(new JSONObject().put("largest", g.a(p0, f.b())));
       String str = jSONArray.toString();
       a.o(str, "JSONArray\(\).apply {\n    ¡­T\)\)\)\n        }.toString\(\)");
       i3 oi3 = i3.f();
       oi3.d("max_line", str);
       oi3.c("video_height", Integer.valueOf(g.q(p1)));
       oi3.c("area_height", Integer.valueOf(g.q(p0)));
       uElementPack.params = oi3.e();
       uob.k(uElementPack);
       a.o(uob, "LogEventBuilder.TaskEven¡­   .build\(\)\n      }\n    }");
       u1.p0("", null, uob);
       return;
    }
    public final int q(int p0){
       Application obj;
       DanmakuUtil uDanmakuUtil = DanmakuUtil.class;
       if (PatchProxy.isSupport(uDanmakuUtil)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uDanmakuUtil, "19");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       obj = a.b();
       a.o(obj, "AppEnv.getAppContext\(\)");
       Resources resources = obj.getResources();
       a.o(resources, "AppEnv.getAppContext\(\).resources");
       return (int)((float)p0 / c.c(resources).density);
    }
}
