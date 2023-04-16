package com.kuaishou.viewbinder.ViewBinderFactoryConfig;
import c35.e;
import java.lang.Object;
import com.yxcorp.gifshow.v3.customizer.viewbinder.AbsDisableNormalPublishPhotoFragmentViewBinder;
import com.yxcorp.gifshow.v3.customizer.viewbinder.AbsPhotoFragmentV3ViewBinder;
import com.yxcorp.gifshow.v3.AbsDefaultEditorActivityViewBinder;
import com.yxcorp.gifshow.v3.customizer.viewbinder.AbsVideoFragmentV3ViewBinder;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import jw8.c;
import jw8.a;
import c35.k;
import hx8.a;
import com.yxcorp.gifshow.activity.share.viewbinder.AbsShareActivityViewBinder;
import r69.m;
import com.yxcorp.gifshow.aicut.ui.loading.AbsAICutLoadingViewBinder;
import zg9.a;
import com.yxcorp.gifshow.camera.record.sidebar.AbsRecordSideBarViewBinder;
import di9.a;
import com.yxcorp.gifshow.camera.record.video.viewbinder.AbsCameraFragmentViewBinder;
import ei9.a;
import com.yxcorp.gifshow.camera.record.video.viewbinder.bottom.AbsRecordBottomBarViewBinder;
import fi9.a;
import com.yxcorp.gifshow.camera.record.viewbinder.AbsCameraActivityViewBinder;
import xob.a;
import com.yxcorp.gifshow.music.cloudmusic.common.viewbinder.AbsCategoryMusicItemViewBinder;
import xob.b;
import com.yxcorp.gifshow.music.cloudmusic.common.viewbinder.AbsSearchMusicItemViewBinder;
import jpb.a;
import com.yxcorp.gifshow.music.cloudmusic.viewbinder.AbsMusicFragmentViewBinder;
import ooc.b;
import ooc.r1;
import uoc.a;
import uoc.b;
import uoc.c;
import uoc.d;
import uoc.e;
import uoc.f;
import uoc.n;
import nvc.a;
import com.yxcorp.gifshow.v3.editor.text.vb.AbsTextEditorFragmentVB;
import iwc.a;
import com.yxcorp.gifshow.v3.mixed.vb.AbsMixImporterViewBinder;
import ywc.a;
import ywc.b;
import sld.i;
import com.yxcrop.gifshow.v3.editor.crop.vb.AbsCropFragmentVB;
import java.util.HashMap;
import com.kwai.robust.PatchProxyResult;
import c35.c;
import com.kuaishou.viewbinder.IViewBinder;
import java.lang.Integer;
import java.util.Objects;
import c35.d;

public class ViewBinderFactoryConfig	// class@00119a
{
    public static final String INIT_INVOKER_ID = "PLUGIN_INIT";
    public static final String INVOKER_ID = "PLUGIN_REG";
    public static boolean isInited;
    public static final e sConfig;

    static {
       ViewBinderFactoryConfig.sConfig = new e();
       ViewBinderFactoryConfig.isInited = false;
    }
    public void ViewBinderFactoryConfig(){
       super();
    }
    public static void doRegister(){
       AbsDisableNormalPublishPhotoFragmentViewBinder uAbsDisableN = AbsDisableNormalPublishPhotoFragmentViewBinder.class;
       AbsPhotoFragmentV3ViewBinder uAbsPhotoFra = AbsPhotoFragmentV3ViewBinder.class;
       AbsDefaultEditorActivityViewBinder uAbsDefaultE = AbsDefaultEditorActivityViewBinder.class;
       if (PatchProxy.applyVoid(null, null, ViewBinderFactoryConfig.class, "5")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, null, c.class, "2")) {
          ViewBinderFactoryConfig.register(a.class, "Default", new c());
       }
       if (!PatchProxy.applyVoid(null, null, a.class, "2")) {
          ViewBinderFactoryConfig.register(AbsShareActivityViewBinder.class, "Default", new a());
       }
       if (!PatchProxy.applyVoid(null, null, m.class, "2")) {
          ViewBinderFactoryConfig.register(AbsAICutLoadingViewBinder.class, "Default", new m());
       }
       if (!PatchProxy.applyVoid(null, null, a.class, "2")) {
          ViewBinderFactoryConfig.register(AbsRecordSideBarViewBinder.class, "Default", new a());
       }
       if (!PatchProxy.applyVoid(null, null, a.class, "2")) {
          ViewBinderFactoryConfig.register(AbsCameraFragmentViewBinder.class, "Default", new a());
       }
       if (!PatchProxy.applyVoid(null, null, a.class, "2")) {
          ViewBinderFactoryConfig.register(AbsRecordBottomBarViewBinder.class, "Default", new a());
       }
       if (!PatchProxy.applyVoid(null, null, a.class, "2")) {
          ViewBinderFactoryConfig.register(AbsCameraActivityViewBinder.class, "Default", new a());
       }
       if (!PatchProxy.applyVoid(null, null, a.class, "2")) {
          ViewBinderFactoryConfig.register(AbsCategoryMusicItemViewBinder.class, "Default", new a());
       }
       if (!PatchProxy.applyVoid(null, null, b.class, "2")) {
          ViewBinderFactoryConfig.register(AbsSearchMusicItemViewBinder.class, "Default", new b());
       }
       if (!PatchProxy.applyVoid(null, null, a.class, "2")) {
          ViewBinderFactoryConfig.register(AbsMusicFragmentViewBinder.class, "Default", new a());
       }
       if (!PatchProxy.applyVoid(null, null, b.class, "2")) {
          ViewBinderFactoryConfig.register(uAbsDefaultE, "Default", new b());
       }
       if (!PatchProxy.applyVoid(null, null, r1.class, "2")) {
          ViewBinderFactoryConfig.register(uAbsDefaultE, "SOCIAL_SIMPLE_PHOTO_SCENARIO", new r1());
       }
       if (!PatchProxy.applyVoid(null, null, a.class, "2")) {
          ViewBinderFactoryConfig.register(uAbsPhotoFra, "Default", new a());
       }
       if (!PatchProxy.applyVoid(null, null, b.class, "2")) {
          ViewBinderFactoryConfig.register(AbsVideoFragmentV3ViewBinder.class, "Default", new b());
       }
       if (!PatchProxy.applyVoid(null, null, c.class, "2")) {
          ViewBinderFactoryConfig.register(AbsVideoFragmentV3ViewBinder.class, "defaultV4", new c());
       }
       if (!PatchProxy.applyVoid(null, null, d.class, "2")) {
          ViewBinderFactoryConfig.register(uAbsDisableN, "DISABLE_NORMAL_PUBLISH_SCENARIO", new d());
       }
       if (!PatchProxy.applyVoid(null, null, e.class, "2")) {
          ViewBinderFactoryConfig.register(AbsVideoFragmentV3ViewBinder.class, "fullScreenPreview", new e());
       }
       if (!PatchProxy.applyVoid(null, null, f.class, "2")) {
          ViewBinderFactoryConfig.register(AbsVideoFragmentV3ViewBinder.class, "photoMovie", new f());
       }
       if (!PatchProxy.applyVoid(null, null, n.class, "2")) {
          ViewBinderFactoryConfig.register(uAbsDisableN, "SOCIAL_SIMPLE_PHOTO_SCENARIO", new n());
       }
       if (!PatchProxy.applyVoid(null, null, a.class, "2")) {
          ViewBinderFactoryConfig.register(AbsTextEditorFragmentVB.class, "Default", new a());
       }
       if (!PatchProxy.applyVoid(null, null, a.class, "2")) {
          ViewBinderFactoryConfig.register(AbsMixImporterViewBinder.class, "noOperation", new a());
       }
       if (!PatchProxy.applyVoid(null, null, a.class, "2")) {
          ViewBinderFactoryConfig.register(uAbsPhotoFra, "ReEdit", new a());
       }
       if (!PatchProxy.applyVoid(null, null, b.class, "2")) {
          ViewBinderFactoryConfig.register(AbsVideoFragmentV3ViewBinder.class, "ReEdit", new b());
       }
       if (!PatchProxy.applyVoid(null, null, i.class, "2")) {
          ViewBinderFactoryConfig.register(AbsCropFragmentVB.class, "Default", new i());
       }
       return;
    }
    public static HashMap getConfig(){
       Object obj = PatchProxy.apply(null, null, ViewBinderFactoryConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       ViewBinderFactoryConfig.doRegister();
       return ViewBinderFactoryConfig.sConfig.a;
    }
    public static IViewBinder getViewBinder(String p0,Class p1,c p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, ViewBinderFactoryConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ViewBinderFactoryConfig.getViewBinder(p0, p1, p2, -1);
    }
    public static IViewBinder getViewBinder(String p0,Class p1,c p2,int p3){
       e obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(ViewBinderFactoryConfig.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, p2, Integer.valueOf(p3), null, ViewBinderFactoryConfig.class, "4");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       ViewBinderFactoryConfig.init();
       obj = ViewBinderFactoryConfig.sConfig;
       Objects.requireNonNull(obj);
       IViewBinder iViewBinder = PatchProxy.applyTwoRefs(p1, p0, obj, e.class, "2");
       if (iViewBinder != patchProxyRe) {
       }else {
          HashMap hashMap = obj.a.get(p1);
          if (hashMap == null) {
             iViewBinder = null;
          }else if(hashMap.get(p0) == null){
             p0 = "Default";
          }
          iViewBinder = hashMap.get(p0);
       }
       if (iViewBinder == null) {
          return null;
       }else {
          return iViewBinder.b.a(p2, p3);
       }
    }
    public static void init(){
       if (PatchProxy.applyVoid(null, null, ViewBinderFactoryConfig.class, "1")) {
          return;
       }
       if (!ViewBinderFactoryConfig.isInited) {
          ViewBinderFactoryConfig.doRegister();
          ViewBinderFactoryConfig.isInited = true;
       }
       return;
    }
    public static void register(Class p0,String p1,k p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, ViewBinderFactoryConfig.class, "6")) {
          return;
       }
       e sConfig = ViewBinderFactoryConfig.sConfig;
       Objects.requireNonNull(sConfig);
       if (!PatchProxy.applyVoidThreeRefs(p0, p2, p1, sConfig, e.class, "1")) {
          HashMap hashMap = sConfig.a.get(p0);
          if (hashMap == null) {
             hashMap = new HashMap();
             sConfig.a.put(p0, hashMap);
          }
          hashMap.put(p1, new d(p0, p2, p1));
       }
       return;
    }
    public static void registerInitializer(){
    }
}
