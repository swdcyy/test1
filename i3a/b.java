package i3a.b;
import com.yxcorp.gifshow.detail.player.panel.elements.QualityMode;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import le5.f;
import com.kwai.sdk.switchconfig.a;
import uw9.c;
import android.content.SharedPreferences;
import com.yxcorp.gifshow.util.DateUtils;
import uw9.o;
import q87.c;
import java.lang.StringBuilder;
import km8.b;
import com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils;
import l3a.b;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.Set;
import kotlin.jvm.internal.a;
import java.util.LinkedHashSet;
import uw9.j;
import java.util.List;
import com.yxcorp.gifshow.detail.config.MultiRateConfig;
import java.lang.reflect.Type;
import p7c.a;
import com.kuaishou.android.model.mix.VideoMeta;
import com.yxcorp.gifshow.detail.a;
import tl8.d;
import ok.h;
import tl8.e;
import com.kwai.video.player.mid.manifest.v2.KwaiManifest;
import y46.b;
import java.util.ArrayList;
import java.util.Iterator;
import com.yxcorp.gifshow.detail.config.MultiRateConfig$QualityList;
import com.kwai.video.player.mid.manifest.RepInterface;
import a56.a;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import java.lang.IllegalStateException;
import java.lang.Iterable;
import java.lang.CharSequence;
import java.util.Locale;
import java.util.Objects;
import java.util.Collection;
import android.content.SharedPreferences$Editor;
import oe6.g;
import java.lang.Long;
import java.lang.Integer;
import java.util.Calendar;
import java.lang.System;

public final class b	// class@002772
{
    public static boolean a = false;
    public static String b;
    public static QualityMode c;
    public static final b d;

    static {
       b.d = new b();
       b.c = QualityMode.auto;
    }
    public void b(){
       super();
    }
    public static final boolean a(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object[] obj = PatchProxy.apply(objArray, objArray, b.class, "10");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.apply(objArray, objArray, f.class, "27");
       b = (obj != patchProxyRe)? obj.booleanValue(): a.t().d("enableShowCloseAutoPlayTip", false);
       if (!b) {
          return false;
       }else {
          o oo = 5;
          int i = c.o();
          int i1 = c.p();
          int i2 = c.n();
          long longx = c.a.getLong("slideAutoPlayGuideCloseShowTime", 0);
          boolean b1 = DateUtils.J(longx);
          b d = b.d;
          boolean b2 = d.h(longx, 3);
          boolean b3 = d.h(longx, 2);
          if (b1 && i2 >= 1) {
             obj = new Object[false];
             o.C().w("PlayerPanelHelper", "QuickShareElement 命中 每天的频控限制 1", obj);
             return false;
          }else if(!b1){
             c.I(false);
          }
          if (b2 && i1 >= 2) {
             obj = new Object[false];
             o.C().w("PlayerPanelHelper", "QuickShareElement 命中 每周的频控限制 2", obj);
             return false;
          }else if(!b2){
             c.K(false);
          }
          if (b3 && i >= oo) {
             obj = new Object[false];
             o.C().w("PlayerPanelHelper", "QuickShareElement 命中 每月的频控限制 5", obj);
             return false;
          }else if(!b3){
             c.J(false);
          }
          return true;
       }
    }
    public static final boolean b(){
       Object obj = PatchProxy.apply(null, null, b.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (f.a()) {
          return false;
       }
       if (DateUtils.J(c.a.getLong("slideAutoPlayGuideOpenShowTime", 0))) {
          return false;
       }
       if (c.q() >= 3) {
          return false;
       }
       if (b.f()) {
          return false;
       }
       return true;
    }
    public static final String d(){
       Object obj = PatchProxy.apply(null, null, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return c.a.getString(b.d("user")+"recordAccessibilityMode", "original");
    }
    public static final QualityMode e(){
       return b.c;
    }
    public static final boolean f(){
       Object obj = PatchProxy.apply(null, null, b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean booleanx = (f.a())? c.a.getBoolean("autoPlayEnable", false): b.a;
       return booleanx;
    }
    public static final boolean g(){
       Object obj = PatchProxy.apply(null, null, b.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return c.g();
    }
    public static final boolean i(){
       Object obj = PatchProxy.apply(null, null, b.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean a = (NasaExperimentUtils.B())? b.a: c.a.getBoolean("enableFeaturedSlideSaveTraffic", false);
       return a;
    }
    public static final boolean j(){
       Object obj = PatchProxy.apply(null, null, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return c.a.getBoolean("smallWindowEnable", false);
    }
    public static final Set k(QPhoto p0){
       String str3;
       String str4;
       Object obj = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Iterator obj1 = null;
       LinkedHashSet obj2 = PatchProxy.applyOneRefs(obj, obj1, b.class, "15");
       if (obj2 != patchProxyRe) {
          return obj2;
       }
       a.p(obj, "photo");
       obj2 = new LinkedHashSet();
       a obj3 = PatchProxy.applyOneRefs(obj, obj1, j.class, "6");
       if (obj3 != patchProxyRe) {
          obj1 = obj3;
       }else {
          MultiRateConfig multiRateCon = a.a(MultiRateConfig.class);
          KwaiManifest kwaiManifest = e.h(obj.mEntity, VideoMeta.class, a.b);
          str3 = "DetailUtils";
          if (p0.isSerialPayPhoto() && kwaiManifest == null) {
             Object[] objArray = new Object[0];
             o.C().w(str3, "serialPayPhoto no manifest", objArray);
          }else if(multiRateCon != null && (multiRateCon.mQualityList != null && (kwaiManifest == null || kwaiManifest.getRepList() == null))){
             Object[] objArray1 = new Object[0];
             o.C().u(str3, new IllegalStateException("no right data"), objArray1);
          }else {
             multiRateCon = multiRateCon.mQualityList;
             obj1 = PatchProxy.applyTwoRefs(multiRateCon, kwaiManifest, obj1, b.class, "1");
             if (obj1 != patchProxyRe) {
             }else {
                List repList = kwaiManifest.getRepList();
                ArrayList uArrayList = new ArrayList();
                Iterator iterator = multiRateCon.iterator();
                while (iterator.hasNext()) {
                   MultiRateConfig$QualityList qualityList = iterator.next();
                   Iterator iterator1 = repList.iterator();
                   while (true) {
                      if (iterator1.hasNext()) {
                         RepInterface repInterface = iterator1.next();
                         if ((qualityList.mQualityShow).equals(repInterface.getQualityType())) {
                            try{
                               int id = repInterface.getId();
                               MultiRateConfig$QualityList mText = qualityList.mText;
                               String url = repInterface.getUrl();
                               MultiRateConfig$QualityList mDescription = qualityList.mDescription;
                               MultiRateConfig$QualityList mQualityText = qualityList.mQualityText;
                               String qualityType = repInterface.getQualityType();
                               qualityList = qualityList.mResolutionType;
                               if (qualityList == null) {
                                  str4 = "";
                               }
                               a uoa = new a(id, mText, url, mDescription, mQualityText, qualityType, str4);
                               uArrayList.add(iterator1);
                            }catch(java.lang.Exception e0){
                               Log.a("FeedPlayerUtils", e0);
                               goto label_0082 ;
                            }
                         }
                      }else {
                         continue ;
                      }
                   }
                }
                obj1 = uArrayList;
             }
          }
       }
       int i = 1;
       if (obj1 != null) {
          obj1 = obj1.iterator();
          while (obj1.hasNext()) {
             obj3 = obj1.next();
             a g = obj3.g;
             g = (g == null || !g.length())? 1: null;
             if (g) {
                continue ;
             }else {
                obj3 = obj3.g;
                a.o(obj3, "manifestUiModel.mResolutionType");
                Locale default = Locale.getDefault();
                String str = "Locale.getDefault\(\)";
                a.o(default, str);
                Objects.requireNonNull(obj3, "null cannot be cast to non-null type java.lang.String");
                String str1 = obj3.toUpperCase(default);
                String str2 = "\(this as java.lang.String\).toUpperCase\(locale\)";
                a.o(str1, str2);
                Locale default1 = Locale.getDefault();
                a.o(default1, str);
                str3 = ("1080P").toUpperCase(default1);
                a.o(str3, str2);
                if (!a.g(str1, str3)) {
                   default1 = Locale.getDefault();
                   a.o(default1, str);
                   str3 = ("720P").toUpperCase(default1);
                   a.o(str3, str2);
                   if (!a.g(str1, str3)) {
                      default1 = Locale.getDefault();
                      a.o(default1, str);
                      str3 = ("576P").toUpperCase(default1);
                      a.o(str3, str2);
                      if (!a.g(str1, str3)) {
                         default1 = Locale.getDefault();
                         a.o(default1, str);
                         str3 = ("540P").toUpperCase(default1);
                         a.o(str3, str2);
                         if (!a.g(str1, str3)) {
                            default1 = Locale.getDefault();
                            a.o(default1, str);
                            str = ("480P").toUpperCase(default1);
                            a.o(str, str2);
                            if (!a.g(str1, str)) {
                            }
                         }
                      }
                      obj2.add(String.valueOf(QualityMode.lower.getValue()));
                   }
                }
                obj2.add(String.valueOf(QualityMode.higher.getValue()));
             }
          }
       }
       if (i ^ obj2.isEmpty()) {
          obj2.add(String.valueOf(QualityMode.auto.getValue()));
       }
       Log.g("PlayerPanelHelper", "photo="+p0.getBizId()+",qualitySupportList"+obj2);
       return obj2;
    }
    public static final void l(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), null, uob, "8")) {
          return;
       }
       if (f.a()) {
          SharedPreferences$Editor uEditor = c.a.edit();
          uEditor.putBoolean("autoPlayEnable", p0);
          g.a(uEditor);
       }else {
          b.a = p0;
       }
       return;
    }
    public static final void m(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, b.class, "4")) {
          return;
       }
       a.p(p0, "filters");
       c.G(p0);
       return;
    }
    public static final void n(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), null, uob, "6")) {
          return;
       }
       SharedPreferences$Editor uEditor = c.a.edit();
       uEditor.putBoolean("smallWindowEnable", p0);
       g.a(uEditor);
       return;
    }
    public final String c(){
       return b.b;
    }
    public final boolean h(long p0,int p1){
       Calendar obj;
       boolean b;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyTwoRefs(Long.valueOf(p0), Integer.valueOf(p1), this, uob, "11");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = Calendar.getInstance();
       a.o(obj, "calendar");
       obj.setTimeInMillis(System.currentTimeMillis());
       obj.setTimeInMillis(p0);
       b = (obj.get(p1) == obj.get(p1))? true: false;
       return b;
    }
}
