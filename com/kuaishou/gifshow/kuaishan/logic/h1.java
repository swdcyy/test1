package com.kuaishou.gifshow.kuaishan.logic.h1;
import java.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import u80.e;
import java.lang.StringBuilder;
import q87.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import w46.b;
import com.kuaishou.gifshow.kuaishan.logic.KSDownloadHelperX;
import java.util.Objects;
import com.kuaishou.gifshow.kuaishan.logic.KSDownloadHelperX$a;
import kotlin.jvm.internal.a;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import kotlin.Pair;
import java.util.Collection;
import com.kwai.middleware.resourcemanager.download.config.DownloadConfig;
import com.kwai.middleware.resourcemanager.download.BaseResourceDownloadHelper;
import x80.q1;
import java.lang.Runnable;
import ekd.k1;
import x80.r1;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.editorsdk2.EditorSdk2Utils$PreviewSizeLimitation;
import g26.d;
import com.kwai.feature.post.api.feature.kuaishan.model.KSException;
import java.lang.Throwable;
import java.lang.IllegalArgumentException;
import x80.m1;
import erd.o;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import java.util.List;
import java.lang.Boolean;
import com.kuaishou.gifshow.kuaishan.logic.h1$a;
import com.kuaishou.gifshow.kuaishan.logic.KSResourceDownloader;
import com.kuaishou.gifshow.kuaishan.logic.w0;
import com.kuaishou.gifshow.kuaishan.logic.x0;
import com.kuaishou.gifshow.kuaishan.logic.y0;
import x80.c1;
import com.kuaishou.gifshow.kuaishan.logic.z0;
import x80.i1;
import x80.f1;
import com.kuaishou.gifshow.kuaishan.logic.a1;
import java.util.ArrayList;
import java.lang.Iterable;
import t45.d;
import brd.z;
import x80.e1;
import java.io.File;
import java.lang.Integer;
import wkd.b;
import j80.c;
import java.lang.ref.SoftReference;
import i90.a;
import i90.b;
import lnc.g7;
import cjd.e;
import x80.k1;
import x80.u1;
import erd.g;
import x80.w1;
import x80.x1;
import com.kuaishou.gifshow.kuaishan.logic.f1;
import brd.w;
import com.kwai.video.clipkit.mv.EditorSdk2MvCreationResult;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kuaishou.gifshow.kuaishan.logic.o1;
import com.kuaishou.gifshow.kuaishan.logic.r0;
import com.kuaishou.gifshow.kuaishan.network.KSThemeTemplateDetailListResponse;
import oa0.a;
import android.content.SharedPreferences;
import java.lang.System;
import java.io.Serializable;
import qkd.c;
import x80.t1;
import java.util.concurrent.Callable;
import com.kuaishou.gifshow.kuaishan.logic.b1;
import com.kuaishou.gifshow.kuaishan.logic.q0;
import io.reactivex.g;
import x80.o1;
import com.kuaishou.gifshow.kuaishan.utils.e;
import mca.a;
import com.kwai.video.clipkit.mv.ClipMvUtils;
import com.kwai.video.clipkit.mv.ExtraInterface;
import com.kwai.video.clipkit.mv.ConstructSparkParam;
import com.kwai.feature.post.api.feature.kuaishan.model.SparkExternalResInfo;
import com.kwai.video.clipkit.mv.EditorSdk2MvCreationResult$TemplateType;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kwai.video.ksspark.NewSparkTemplateManager$TemplateSummary;
import com.kwai.video.ksspark.NewSparkTemplateManager;
import x80.s1;

public final class h1	// class@001a4d
{
    public static SoftReference a;
    public static int b;
    public static ConcurrentHashMap c;
    public static final HashMap d;

    static {
       h1.c = new ConcurrentHashMap();
       h1.d = new HashMap();
    }
    public void h1(){
       super();
    }
    public static void a(String p0){
       h1 oh1 = h1.class;
       Object obj = null;
       if (PatchProxy.applyVoidOneRefs(p0, obj, oh1, "12")) {
          return;
       }
       Object[] objArray = new Object[0];
       e.D().w("KuaiShanAPI", "cancelAllDownloads\(\) called with: downloadSourceType = ["+p0+"]", objArray);
       if (TextUtils.x(p0)) {
          Object[] objArray1 = new Object[0];
          e.D().t("KuaiShanAPI", "cancelAllDownloads: downloadSourceType is empty", objArray1);
          return;
       }else {
          KSDownloadHelperX kSDownloadHe = KSDownloadHelperX.class;
          if (!PatchProxy.applyVoidOneRefs(p0, obj, kSDownloadHe, "33")) {
             KSDownloadHelperX$a o = KSDownloadHelperX.o;
             Objects.requireNonNull(o);
             if (!PatchProxy.applyVoidOneRefs(p0, o, KSDownloadHelperX$a.class, "13")) {
                String str = "downloadSourceType";
                a.p(p0, str);
                Object[] objArray3 = new Object[0];
                e.D().w("KS_Hodor", "cancelTasksByType\(\) called with: downloadSourceType = ["+p0+']', objArray3);
                KSDownloadHelperX kSDownloadHe1 = o.a();
                Objects.requireNonNull(kSDownloadHe1);
                if (!PatchProxy.applyVoidOneRefs(p0, kSDownloadHe1, kSDownloadHe, "6")) {
                   a.p(p0, str);
                   Object[] objArray4 = new Object[0];
                   e.D().s("KS_Hodor", "cancelTemplateDownloadByType : all tasks with type "+p0, objArray4);
                   LinkedHashMap linkedHashMa = new LinkedHashMap();
                   Iterator iterator = kSDownloadHe1.f.entrySet().iterator();
                   while (iterator.hasNext()) {
                      Map$Entry uEntry = iterator.next();
                      if (TextUtils.n(uEntry.getKey().getSecond(), p0)) {
                         linkedHashMa.put(uEntry.getKey(), uEntry.getValue());
                      }
                   }
                   iterator = linkedHashMa.values().iterator();
                   while (iterator.hasNext()) {
                      kSDownloadHe1.b.b(iterator.next().getId());
                   }
                }
             }
          }
          if (!PatchProxy.applyVoidOneRefs(p0, obj, oh1, "13")) {
             Object[] objArray2 = new Object[0];
             e.D().w("KuaiShanAPI", "cancelAllLoadingSdkProject\(\) called with: downloadSourceType = ["+p0+"]", objArray2);
             k1.o(new q1(p0));
          }
          return;
       }
    }
    public static void b(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, h1.class, "14")) {
          return;
       }
       Object[] objArray = new Object[0];
       e.D().w("KuaiShanAPI", "cancelSingleLoadingSdkProject\(\) called with: templateId = "+p0+"downloadSourceType = ["+p1+"]", objArray);
       k1.o(new r1(p1, p0));
       return;
    }
    public static t c(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, h1.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return h1.d(p0, p1, EditorSdk2Utils$PreviewSizeLimitation.PREVIEW_SIZE_LIMITATION_720P);
    }
    public static t d(String p0,String p1,EditorSdk2Utils$PreviewSizeLimitation p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, h1.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[0];
       e.D().w("KuaiShanAPI", "createKuaiShanProject\(\) called with: downloadSourceType = ["+p0+"], templateId = ["+p1+"]", objArray);
       if (!d.b()) {
          return t.error(new KSException(-17, "kuaishan is incompatible"));
       }
       if (TextUtils.x(p1)) {
          return t.error(new IllegalArgumentException("template id is empty"));
       }
       return h1.h(p1).flatMap(new m1(p0, p2));
    }
    public static t e(String p0,KSTemplateDetailInfo p1,List p2,boolean p3){
       if (PatchProxy.isSupport(h1.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, p2, Boolean.valueOf(p3), null, h1.class, "15");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return h1.f(p0, p1, p2, p3, EditorSdk2Utils$PreviewSizeLimitation.PREVIEW_SIZE_LIMITATION_720P);
    }
    public static t f(String p0,KSTemplateDetailInfo p1,List p2,boolean p3,EditorSdk2Utils$PreviewSizeLimitation p4){
       h1$a obj;
       h1 oh1 = h1.class;
       int i = 0;
       if (PatchProxy.isSupport(oh1)) {
          Object[] objArray = new Object[]{p0,p1,p2,Boolean.valueOf(p3),p4};
          obj = PatchProxy.apply(objArray, null, oh1, "16");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Object[] objArray1 = new Object[i];
       e.D().w("KuaiShanAPI", "doDownload\(\) called with: downloadSourceType = ["+p0+"], templateInfo = ["+p1+"], mediaList = ["+p2+"]", objArray1);
       if (!TextUtils.x(p0)) {
          obj = new h1$a();
          ArrayList uArrayList = new ArrayList();
          uArrayList.add(KSResourceDownloader.d().c(p1).map(w0.b));
          uArrayList.add(KSDownloadHelperX.p(p1).map(x0.b));
          uArrayList.add(KSDownloadHelperX.h(p1, p0, p3).map(y0.b));
          uArrayList.add(h1.l(KSDownloadHelperX.n(p1), p1, p0, p3).map(new c1(obj)).map(z0.b));
          uArrayList.add(t.just(obj).flatMap(new i1(p1, p2, p4)).map(new f1(obj)).map(a1.b));
          z c = d.c;
          t ot = t.concat(uArrayList).subscribeOn(c).observeOn(c);
          return ot.map(new e1(obj));
       }else {
          throw new IllegalArgumentException("downloadSourceType is empty");
       }
    }
    public static File g(int p0){
       h1 oh1 = h1.class;
       if (PatchProxy.isSupport(oh1)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, oh1, "22");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new File(b.a(-1504323719).d(".kuaishan"), "kuaishan_theme_template_data_"+p0);
    }
    public static t h(String p0){
       KSTemplateDetailInfo kSTemplateDe = null;
       SoftReference obj = PatchProxy.applyOneRefs(p0, kSTemplateDe, h1.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = "]";
       Object[] objArray = new Object[0];
       e.D().w("KuaiShanAPI", "getTemplateInfo\(\) called with: templateId = ["+p0+str, objArray);
       obj = h1.a;
       if (obj != null && obj.get() != null) {
          Iterator iterator = h1.a.get().iterator();
          while (true) {
             if (iterator.hasNext()) {
                KSTemplateDetailInfo kSTemplateDe1 = iterator.next();
                if (TextUtils.n(p0, kSTemplateDe1.mTemplateId) && kSTemplateDe1.mUnSupportReason == null) {
                   kSTemplateDe = kSTemplateDe1;
                }
             }
          }
          Object[] objArray1 = new Object[0];
          e.D().w("KuaiShanAPI", "getTemplateInfo\(\) hit cache with templateId = "+p0, objArray1);
          return t.just(kSTemplateDe);
       }
       if (kSTemplateDe != null) {
          goto label_0063 ;
       }else {
          return b.a().n("["+p0+str, g7.j(), 17).map(new e()).map(new k1(p0)).observeOn(d.a).doOnNext(new u1(p0));
       }
    }
    public static t i(int p0){
       boolean[] obj1;
       t ot;
       SoftReference a;
       Object[] objArray2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       h1 oh1 = h1.class;
       Object obj = null;
       if (PatchProxy.isSupport(oh1)) {
          obj1 = PatchProxy.applyOneRefs(Integer.valueOf(p0), obj, oh1, "1");
          if (obj1 != patchProxyRe) {
             return obj1;
          }
       }
       if (p0 > 0) {
          obj1 = new boolean[1];
          Object[] objArray = new Object[0];
          e.D().w("KuaiShanAPI", "getTemplatesInfo\(\) called with: picNum = ["+p0+"]", objArray);
          if (PatchProxy.isSupport(oh1)) {
             ot = PatchProxy.applyOneRefs(Integer.valueOf(p0), obj, oh1, "19");
             if (ot != patchProxyRe) {
             }else {
             label_0056 :
                Object[] objArray1 = new Object[0];
                e.D().w("KuaiShanAPI", "createCacheObservable\(\) called with: picNum = ["+p0+"]", objArray1);
                if (p0 == h1.b) {
                   a = h1.a;
                   if (a != null && (a.get() != null && !h1.a.get().isEmpty())) {
                      objArray2 = new Object[0];
                      e.D().s("KuaiShanAPI", "createCacheObservable: memory cache hit", objArray2);
                      ot = t.just(h1.a.get());
                   }
                }
                objArray2 = new Object[0];
                e.D().s("KuaiShanAPI", "createCacheObservable: no memory cache hit", objArray2);
                h1.a = obj;
                ot = t.empty();
             }
          }else {
             goto label_0056 ;
          }
          h1.b = p0;
          return ot.switchIfEmpty(b.a().e(2, p0, 17, g7.j()).observeOn(d.c).map(new e()).onErrorReturn(new w1(p0, obj1)).map(new x1(p0, obj1)).observeOn(d.a).doOnNext(f1.b));
       }else {
          throw new IllegalArgumentException("Invalid input param, picNum must be a positive integer");
       }
    }
    public static t j(EditorSdk2MvCreationResult p0,KSTemplateDetailInfo p1,List p2,EditorSdk2Utils$PreviewSizeLimitation p3,boolean p4){
       h1 oh1 = h1.class;
       if (PatchProxy.isSupport(oh1)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Boolean.valueOf(p4)};
          Object obj = PatchProxy.apply(objArray, null, oh1, "18");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 == null || p0.getProject() == null) {
          return t.error(new IllegalArgumentException("KuaiShanAPI.initKuaiShanProject: creationResult is null"));
       }else {
          o1 oo1 = new o1(p1, KSDownloadHelperX.n(p1));
          oo1.N0(p3);
          return t.just(p0).observeOn(d.a).flatMap(new r0(oo1, p2, p4));
       }
    }
    public static KSThemeTemplateDetailListResponse k(int p0){
       String obj1;
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       h1 oh1 = h1.class;
       Object[] obj = null;
       if (PatchProxy.isSupport(oh1)) {
          obj1 = PatchProxy.applyOneRefs(Integer.valueOf(p0), obj, oh1, "20");
          if (obj1 != patchProxyRe) {
             return obj1;
          }
       }
       Object[] objArray = new Object[0];
       e.D().w("KuaiShanAPI", "loadCacheFromFile\(\) called", objArray);
       File uFile = h1.g(p0);
       boolean b = uFile.exists();
       e obj2 = PatchProxy.apply(obj, obj, oh1, "23");
       if (obj2 != patchProxyRe) {
          b1 = obj2.booleanValue();
       }else if((System.currentTimeMillis() - a.a.getLong("ks_theme_template_cached_time", 0)) - 0x240c8400 >= 0){
          b1 = true;
       }else {
          b1 = false;
       }
       if (!b || b1) {
          obj2 = e.D();
          obj1 = (b1)? "cache file has expired": "cache file not exist";
          obj = new Object[0];
          obj2.s("KuaiShanAPI", obj1, obj);
          if (b1) {
             uFile.delete();
          }
          return new KSThemeTemplateDetailListResponse();
       }else {
          KSThemeTemplateDetailListResponse kSThemeTempl = c.o(uFile);
          if (kSThemeTempl == null) {
             Object[] objArray1 = new Object[0];
             e.D().A("KuaiShanAPI", "cache file maybe dirty, delete", objArray1);
             uFile.delete();
             return new KSThemeTemplateDetailListResponse();
          }else {
             Object[] objArray2 = new Object[0];
             e.D().s("KuaiShanAPI", "loadCacheFromFile: get data from cached file with list size: "+kSThemeTempl.mTemplatesInfo.size(), objArray2);
             return kSThemeTempl;
          }
       }
    }
    public static t l(String p0,KSTemplateDetailInfo p1,String p2,boolean p3){
       if (PatchProxy.isSupport(h1.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, p2, Boolean.valueOf(p3), null, h1.class, "24");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Object[] objArray = new Object[0];
       e.D().w("KuaiShanAPI", "loadSdkProjectAsync invoked with templatePath", objArray);
       if (TextUtils.x(p2)) {
          p2 = "DEFAULT";
       }
       t ot = (!p1.isShimmer())? t.fromCallable(new t1(p0, p1)).map(b1.b): t.create(new q0(p0, p1, p2, p3));
       return ot.subscribeOn(d.c).doOnError(new o1(p0)).observeOn(d.a);
    }
    public static EditorSdk2MvCreationResult m(String p0,boolean p1,List p2,boolean p3,List p4,boolean p5,String p6,int p7){
       String obj;
       String str1;
       EditorSdk2MvCreationResult uEditorSdk2M;
       Iterator iterator;
       object oobject = p0;
       object oobject1 = p4;
       object oobject2 = p6;
       int i = p7;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       h1 oh1 = h1.class;
       int i1 = 1;
       if (PatchProxy.isSupport(oh1)) {
          Object[] objArray = new Object[]{oobject,Boolean.valueOf(p1),p2,Boolean.valueOf(p3),oobject1,Boolean.valueOf(p5),oobject2,Integer.valueOf(p7)};
          obj = PatchProxy.apply(objArray, null, oh1, "27");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       e.w("Parse template resource from path: "+p0);
       a.u();
       String str = "";
       if (p1) {
          obj = KSDownloadHelperX.l().j(i1);
          str1 = e.m();
       }else {
          str1 = null;
          obj = str;
       }
       if (e.F()) {
          e.w("tryInstallKuaiShanRequiredSo success");
          if (!p1) {
             uEditorSdk2M = ClipMvUtils.createProjectWithTemplate(p0, 0, p5, oobject2, i);
          }else {
             ConstructSparkParam uConstructSp = e.b(p0, e.l(obj), str1, i);
             HashMap hashMap = PatchProxy.applyOneRefs(oobject1, null, e.class, "43");
             if (hashMap != patchProxyRe) {
             }else if(oobject1 == null || p4.isEmpty()){
                hashMap = null;
             }else {
                hashMap = new HashMap();
                Iterator iterator1 = p4.iterator();
                while (iterator1.hasNext()) {
                   SparkExternalResInfo sparkExterna = iterator1.next();
                   hashMap.put(sparkExterna.resId, sparkExterna.resPath);
                }
             }
             uEditorSdk2M = ClipMvUtils.constructSparkWithResMap(uConstructSp, hashMap);
          }
          EditorSdk2MvCreationResult uEditorSdk2M1 = h1.n(uEditorSdk2M, p0, p3);
          if (!PatchProxy.applyVoidThreeRefs(p0, uEditorSdk2M1, p2, null, h1.class, "30")) {
             if (uEditorSdk2M1 == null) {
                e.v(null, "Parse template failed, result is null");
             }else if(uEditorSdk2M1.hasError()){
                e.v(null, "Parse template failed due to: "+uEditorSdk2M1.getErrorReason()+", with error code: "+uEditorSdk2M1.getErrorCode());
             }else if(uEditorSdk2M1.getTemplateType() == EditorSdk2MvCreationResult$TemplateType.TEMPLATE_TYPE_MV){
                str = "AE模板";
             }else if(uEditorSdk2M1.getTemplateType() == EditorSdk2MvCreationResult$TemplateType.TEMPLATE_TYPE_NEW_SPARK){
                str = "新微光模板";
             }
             StringBuilder str2 = "";
             if (p2 != null && !p2.isEmpty()) {
                str2 = str2+"CDNUrl=";
                iterator = p2.iterator();
                while (iterator.hasNext()) {
                   str2 = str2+iterator.next().mUrl+" | ";
                }
                str2 = str2+"\n";
             }
             str2 = str2+"localResPath="+p0+"\n"+"width="+uEditorSdk2M1.getVideoWidth()+"\n"+"height="+uEditorSdk2M1.getVideoHeight()+"\n"+"TemplateType="+str+"\n"+"assetCount=";
             obj = "-1";
             String str3 = (uEditorSdk2M1.getMvAssets() == null)? obj: Integer.valueOf(uEditorSdk2M1.getMvAssets().size());
             str2 = str2+str3+"\n"+"replaceableAssetCount=";
             if (uEditorSdk2M1.getReplaceableMvAssets() != null) {
                Integer integer = Integer.valueOf(uEditorSdk2M1.getReplaceableMvAssets().size());
             }
             str2 = str2+obj+"\n";
             if (uEditorSdk2M1.getThumbnailRenderPosMillis() != null && !uEditorSdk2M1.getThumbnailRenderPosMillis().isEmpty()) {
                str2 = str2+"replaceableAssetTimes=";
                iterator = uEditorSdk2M1.getThumbnailRenderPosMillis().iterator();
                while (iterator.hasNext()) {
                   str2 = str2+iterator.next().intValue()+" | ";
                }
                str2 = str2+"\n";
             }
             e.w(str2);
          }
          return uEditorSdk2M1;
       }else {
          e.v(null, "tryInstallKuaiShanRequiredSo failed");
          return null;
       }
    }
    public static EditorSdk2MvCreationResult n(EditorSdk2MvCreationResult p0,String p1,boolean p2){
       int newSparkFall;
       Throwable throwable;
       if (PatchProxy.isSupport(h1.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), null, h1.class, "29");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = 0;
       Object[] objArray = new Object[i];
       e.D().w("KuaiShanAPI", "postProcessResult\(\) called with: templatePath = ["+p1+"]", objArray);
       if (p0 == null) {
          e.v(null, "EditorSdk2MvCreationResult instance is null, 请联系ClipKit开发同学处理");
          return null;
       }else if(p0.getTemplateType() == EditorSdk2MvCreationResult$TemplateType.TEMPLATE_TYPE_NEW_SPARK){
          NewSparkTemplateManager$TemplateSummary templateSumm = NewSparkTemplateManager.summary(p1);
          if (templateSumm == null) {
             e.v(null, "New spark template fetch summary failed, 请联系KSSpark开发同学处理");
             return null;
          }else if(g7.p()){
             newSparkFall = ClipMvUtils.getNewSparkFallbackTemplateVersion();
          }else {
             newSparkFall = ClipMvUtils.getNewSparkTemplateVersion();
          }
          if (templateSumm.getTemplateVersion() > newSparkFall) {
             i = 1;
          }
          if (i) {
             e.v(null, "Template version = "+templateSumm.getTemplateVersion()+" has exceeded the max version: "+newSparkFall+". 模板版本号不合法，请联系模板后台配置同学处理");
          }
          if (i) {
             throwable = null;
          }
          return throwable;
       }else if(p0.getTemplateType() == EditorSdk2MvCreationResult$TemplateType.TEMPLATE_TYPE_SPARK && p2){
          e.v(null, "Template Type = TEMPLATE_TYPE_SPARK. 模版为老微光模版，除草稿箱外都需过滤，后续版本不再支持");
          return null;
       }else if(p0.getErrorCode()){
          e.v(null, "模板解析出错，error code = "+p0.getErrorCode()+", message = "+p0.getErrorReason());
          return null;
       }else {
          return p0;
       }
    }
    public static void o(String p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, h1.class, "25")) {
          return;
       }
       Object[] objArray = new Object[0];
       e.D().w("KuaiShanAPI", "removeLoadSdkProjectTask invoked with templateId = "+p0+", downloadSourceType = "+p1+", taskId = "+p2, objArray);
       k1.o(new s1(p2, p0, p1));
       return;
    }
}
