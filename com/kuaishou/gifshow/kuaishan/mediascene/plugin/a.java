package com.kuaishou.gifshow.kuaishan.mediascene.plugin.a;
import y36.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import z80.a;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.video.editorsdk2.EditorSdk2Utils$PreviewSizeLimitation;
import com.kuaishou.gifshow.kuaishan.logic.h1;
import u80.e;
import brd.t;
import com.kuaishou.gifshow.kuaishan.logic.d1;
import com.kuaishou.gifshow.kuaishan.logic.e1;
import erd.g;
import crd.b;
import java.util.HashMap;
import com.yxcorp.gifshow.activity.GifshowActivity;
import fg6.a;
import com.kwai.feature.post.api.mediascene.MediaSceneInitParams;
import com.google.gson.Gson;
import android.app.Activity;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import java.util.ArrayList;
import g90.a;
import z80.s;
import java.util.Objects;
import wkd.b;
import e90.b;
import t45.d;
import brd.z;
import cjd.e;
import erd.o;
import z80.r0;
import z80.s0;
import brd.w;
import java.lang.Boolean;
import g26.d;
import b90.c;
import com.kwai.feature.post.api.mediascene.MediaSceneConfig;
import com.kwai.feature.post.api.mediascene.MediaSceneLaunchParams;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import z80.c;
import java.io.File;
import com.kuaishou.gifshow.kuaishan.mediascene.plugin.a$a;
import java.util.concurrent.Callable;
import com.kuaishou.gifshow.kuaishan.mediascene.plugin.a$b;
import com.kuaishou.gifshow.kuaishan.mediascene.plugin.a$c;
import com.kwai.feature.post.api.mediascene.MediaSceneServerParams;

public class a implements a	// class@001a90
{

    public void a(){
       super();
    }
    public void Ae(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "5")) {
          return;
       }
       a.p(p0, "templateId");
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("MediaScenePluginImpl", "preloadMediaSceneData, templateId="+p0, objArray);
       String str = "MediaSceneRepo";
       EditorSdk2Utils$PreviewSizeLimitation pREVIEW_SIZE = EditorSdk2Utils$PreviewSizeLimitation.PREVIEW_SIZE_LIMITATION_1440P;
       if (!PatchProxy.applyVoidThreeRefs(str, p0, pREVIEW_SIZE, null, h1.class, "9")) {
          Object[] objArray1 = new Object[i];
          e.D().w("KuaiShanAPI", "preloadKuaishanProject, templateId="+p0+", downloadSourceType="+str+", limitation="+pREVIEW_SIZE, objArray1);
          h1.d.put(p0, h1.d(str, p0, pREVIEW_SIZE).subscribe(d1.b, e1.b));
       }
       return;
    }
    public void CF(GifshowActivity p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "2")) {
          return;
       }
       a.p(p0, "activity");
       a.p(p1, "launchJsonString");
       Object[] objArray = new Object[0];
       a.D().w("MediaScenePluginImpl", "launchMediaScenePage invoked", objArray);
       MediaSceneInitParams mediaSceneIn = a.a.h(p1, MediaSceneInitParams.class);
       a.o(mediaSceneIn, "initParams");
       this.JQ(p0, mediaSceneIn);
       return;
    }
    public List Cj(int p0){
       s obj;
       ArrayList uArrayList;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "12");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       if (p0 != 4) {
          uArrayList = new ArrayList();
       }else {
          Object[] objArray = null;
          uArrayList = PatchProxy.apply(objArray, new a(), a.class, "1");
          if (uArrayList != patchProxyRe) {
          }else {
             uArrayList = new ArrayList();
             obj = s.d;
             Objects.requireNonNull(obj);
             t ot = PatchProxy.apply(objArray, obj, s.class, "16");
             if (ot != patchProxyRe) {
             }else {
                Object[] objArray1 = new Object[0];
                a.D().w("MediaScenePublishUtil", "requestTopicText\(\) invoked", objArray1);
                ot = b.a(-2124071004).a().subscribeOn(d.b).map(new e()).observeOn(d.a).map(r0.b).onErrorResumeNext(s0.b);
                a.o(ot, "Singleton.get\(MediaScene¡­t.onComplete\(\)\n        }\)");
             }
             uArrayList.add(ot);
          }
       }
       return uArrayList;
    }
    public boolean E00(){
       Object obj = PatchProxy.apply(null, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return d.b();
    }
    public void JQ(Activity p0,MediaSceneInitParams p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "8")) {
          return;
       }
       a.p(p0, "activity");
       a.p(p1, "initParams");
       Object[] objArray = new Object[0];
       a.D().w("MediaScenePluginImpl", "launchMediaScenePage invoked", objArray);
       c.b.c(p0, s.d.a(p1), p1.mLaunchParams);
       return;
    }
    public void JV(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "6")) {
          return;
       }
       a.p(p0, "templateId");
       String str = "clearPreloadData, templateId=";
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("MediaScenePluginImpl", str+p0, objArray);
       if (!PatchProxy.applyVoidOneRefs(p0, null, h1.class, "10")) {
          Object[] objArray1 = new Object[i];
          e.D().w("KuaiShanAPI", str+p0, objArray1);
          if (TextUtils.x(p0)) {
             PostUtils.D("KuaiShanAPI", "", new IllegalArgumentException("clearPreloadData with empty templateId"));
          }else {
             HashMap d = h1.d;
             b uob = d.get(p0);
             if (uob != null && !uob.isDisposed()) {
                uob.dispose();
             }
             d.remove(p0);
          }
       }
       return;
    }
    public void NR(GifshowActivity p0,String p1,List p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "11")) {
          return;
       }
       a.p(p0, "activity");
       a.p(p1, "initParams");
       a.p(p2, "preTasks");
       MediaSceneConfig mediaSceneCo = this.m70(p1);
       if (mediaSceneCo != null) {
          c.j.i(p2);
          s.d.b(p0, mediaSceneCo);
       }
       return;
    }
    public void PP(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       t.fromCallable(new a$a(new File(PostUtils.f(), "media_scene_template").getAbsolutePath(), new File(PostUtils.f(), "media_scene_config.json").getAbsolutePath())).subscribeOn(d.c).observeOn(d.a).subscribe(new a$b(this), a$c.b);
       return;
    }
    public boolean e30(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "launchJsonString");
       Object[] objArray = new Object[0];
       a.D().w("MediaScenePluginImpl", "verifyServerParams invoked with data: "+p0, objArray);
       MediaSceneServerParams mediaSceneSe = a.a.h(p0, MediaSceneServerParams.class);
       if (mediaSceneSe.mPoiId > 0 && mediaSceneSe.mTemplateId > 0) {
          return true;
       }
       return 0;
    }
    public void i60(Activity p0,MediaSceneLaunchParams p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "4")) {
          return;
       }
       a.p(p0, "activity");
       a.p(p1, "launchParams");
       Object[] objArray = new Object[0];
       a.D().w("MediaScenePluginImpl", "launchMediaScenePage with launchParams: "+p1, objArray);
       c.b.c(p0, null, p1);
       return;
    }
    public boolean isAvailable(){
       return true;
    }
    public final MediaSceneConfig m70(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = a.a.h(p0, MediaSceneInitParams.class);
       a.o(p0, "Gsons.KWAI_GSON.fromJson¡­neInitParams::class.java\)");
       return s.d.a(p0);
    }
    public void vE(Activity p0,String p1,List p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "3")) {
          return;
       }
       a.p(p0, "activity");
       a.p(p1, "launchJsonString");
       a.p(p2, "preTasks");
       c.j.i(p2);
       MediaSceneInitParams mediaSceneIn = a.a.h(p1, MediaSceneInitParams.class);
       a.o(mediaSceneIn, "initParams");
       this.JQ(p0, mediaSceneIn);
       return;
    }
    public void wl(GifshowActivity p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "10")) {
          return;
       }
       a.p(p0, "activity");
       a.p(p1, "initParams");
       MediaSceneConfig mediaSceneCo = this.m70(p1);
       if (mediaSceneCo != null) {
          s.d.b(p0, mediaSceneCo);
       }
       return;
    }
}
