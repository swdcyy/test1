package mg.d;
import java.lang.Object;
import android.app.Activity;
import com.kwai.feature.post.api.feature.bridge.JsEditAtlasParams;
import f55.g;
import java.lang.String;
import kotlin.jvm.internal.a;
import og.l;
import java.lang.StringBuilder;
import q87.c;
import java.util.ArrayList;
import lnc.i1;
import android.os.Bundle;
import m26.a$a;
import k2b.u1;
import java.util.Objects;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import java.util.Map;
import z36.d$a;
import m26.a;
import com.kuaishou.android.post.PostArguments;
import z36.d;
import com.kuaishou.android.post.StrArg;
import com.kuaishou.android.post.PostPageArg;
import java.util.Iterator;
import java.lang.Iterable;
import qkd.b;
import com.yxcorp.gifshow.models.QMedia;
import java.util.List;
import w46.b;
import om6.k;
import com.yxcorp.gifshow.util.LoadPolicy;
import java.lang.Class;
import brd.a0;
import lnc.y6;
import mg.d$b;
import erd.o;
import brd.t;
import mg.d$c;
import mg.d$d;
import erd.g;
import crd.b;
import com.kwai.feature.post.api.feature.bridge.JsEditDraftParams;
import om6.d;
import mg.d$e;
import mg.d$f;
import mg.d$g;
import com.kwai.feature.post.api.feature.bridge.JsEditSmartAlbumParams;
import z26.c;
import mg.d$h;
import mg.d$i;
import mg.d$j;
import com.kwai.feature.post.api.feature.bridge.JsMediaSceneLaunchParams;
import com.kwai.feature.post.api.mediascene.MediaSceneInitParams;
import y36.b;
import mg.d$k;
import mg.d$l;
import com.kwai.feature.post.api.feature.bridge.JsSaveTempImagesParams;
import java.util.Collection;
import ekd.q;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import kotlin.jvm.internal.Ref$ObjectRef;
import r16.f;
import mg.d$m;
import t45.d;
import brd.z;
import mg.d$n;
import mg.d$o;
import mg.d$p;
import mg.d$q;
import q46.r;
import com.kwai.robust.PatchProxy;
import lnc.p3;
import mg.d$a;
import r26.e;

public final class d	// class@0025f1
{
    public static final d a;

    static {
       d.a = new d();
    }
    public void d(){
       super();
    }
    public static final void b(Activity p0,JsEditAtlasParams p1,g p2){
       String str1;
       Object obj3;
       QMedia qMedia;
       String obj = p0;
       JsEditAtlasParams obj1 = p1;
       Object[] obj2 = p2;
       a.p(obj, "activity");
       a.p(obj1, "params");
       a.p(obj2, "callback");
       Object[] objArray = new Object[0];
       l.D().w("JsEditFun", "JsEditAtlasParams: "+obj1, objArray);
       String str = "param miss images";
       if (obj1.mImagePaths.isEmpty()) {
          i1.a("JsEditFun", "processAlbumMediasAndGotoEdit params error");
          obj2.a(412, str, null);
          return;
       }else {
          a$a uoa = new a$a();
          uoa.m(obj1.mInitCaption);
          boolean b = true;
          uoa.l(b);
          uoa.u(u1.f());
          JsEditAtlasParams mActivityId = obj1.mActivityId;
          Objects.requireNonNull(d.a);
          if (TextUtils.isEmpty(mActivityId)) {
             str1 = "";
          }else {
             JsonObject jsonObject = new JsonObject();
             jsonObject.c0("activityId", mActivityId);
             str1 = jsonObject.toString();
             a.o(str1, "jsonObject.toString\(\)");
          }
          uoa.g(str1);
          uoa.j(obj1.mBridgeSource);
          uoa.o((b ^ obj1.mIsReturnToWeb));
          uoa.t(obj1.mTag);
          a uoa1 = uoa.d(obj1.mArgsMap).f();
          a.o(uoa1, "mixImportParams");
          uoa1.getArgs().getDefaultEditPreviewTab().set(obj1.mDefaultEditPreviewTab);
          ArrayList uArrayList = new ArrayList();
          obj1 = obj1.mImagePaths;
          a.o(obj1, "params.mImagePaths");
          Iterator iterator = obj1.iterator();
          while (true) {
             if (iterator.hasNext()) {
                obj3 = iterator.next();
                if (b.M(obj3)) {
                   qMedia = new QMedia(0, obj3, 0, 0, 0);
                   uArrayList.add(str1);
                }else {
                   break ;
                }
             }else if(uArrayList.isEmpty()){
                obj2.a(412, str, null);
                i1.a("JsEditFun", "processAlbumMediasAndGotoEdit qMedia is empty");
                return;
             }else {
                y6.s(k.class, LoadPolicy.DIALOG).w(new d$b(obj, uArrayList, uoa1)).subscribe(new d$c(obj2), new d$d(obj2));
                return;
             }
          }
          obj = "only support jpg, but this image is "+obj3;
          obj2.a(412, obj, null);
          obj2 = new Object[0];
          l.D().t("JsEditFun", obj, obj2);
          return;
       }
    }
    public static final void c(Activity p0,JsEditDraftParams p1,g p2){
       a.p(p0, "activity");
       a.p(p1, "params");
       a.p(p2, "callback");
       Object[] objArray = new Object[0];
       l.D().w("JsEditFun", "JsEditDraftParams: "+p1, objArray);
       y6.s(d.class, LoadPolicy.DIALOG).C(new d$e(p1, p0)).R(new d$f(p2, p0), new d$g(p2));
    }
    public static final void d(Activity p0,JsEditSmartAlbumParams p1,g p2){
       a.p(p0, "activity");
       a.p(p1, "params");
       a.p(p2, "callback");
       Object[] objArray = new Object[0];
       l.D().w("JsEditFun", "JsEditSmartAlbumParams: "+p1, objArray);
       y6.s(c.class, LoadPolicy.DIALOG).C(new d$h(p1, p0)).R(new d$i(p2, p0), new d$j(p2));
    }
    public static final void e(Activity p0,JsMediaSceneLaunchParams p1,g p2){
       a.p(p0, "activity");
       a.p(p1, "params");
       a.p(p2, "callback");
       Object[] objArray = new Object[0];
       l.D().w("JsEditFun", "launchMediaScene: JsMediaSceneLaunchParams: "+p1, objArray);
       MediaSceneInitParams mediaSceneIn = new MediaSceneInitParams();
       mediaSceneIn.mServerParams = p1.mServerParams;
       mediaSceneIn.mLaunchParams = null;
       y6.s(b.class, LoadPolicy.DIALOG).R(new d$k(p0, mediaSceneIn, p2), new d$l(p2));
    }
    public static final void f(Activity p0,JsSaveTempImagesParams p1,g p2){
       a.p(p1, "params");
       a.p(p2, "callback");
       int i = 0;
       Object[] objArray = new Object[i];
       l.D().w("JsEditFun", "saveTempImages:  activity = "+p0+", params = "+p1+", "+"callback = "+p2, objArray);
       if (p0 == null) {
          Object[] objArray1 = new Object[i];
          l.D().t("JsEditFun", "saveTempImages: activity is null", objArray1);
          return;
       }else {
          JsSaveTempImagesParams imageData = p1.imageData;
          if (q.f(imageData)) {
             PostUtils.D("JsEditFun", "saveTempImages", new IllegalArgumentException("params.imagesData = "+p1.imageData));
             p2.a(412, "params.imagesData = "+p1.imageData, new Bundle());
             return;
          }else {
             Ref$ObjectRef objectRef = new Ref$ObjectRef();
             objectRef.element = null;
             a.m(imageData);
             y6.s(f.class, LoadPolicy.DIALOG).w(new d$m(objectRef, imageData)).observeOn(d.c).map(d$n.b).map(new d$o(objectRef, p1)).buffer(imageData.size()).subscribe(new d$p(p2), new d$q(p2));
             return;
          }
       }
    }
    public final void a(Activity p0,f p1){
       r or = r.b(p0, p1);
       a.o(or, "PostService.getPostServi¡­vity, postWorkPostPlugin\)");
       Objects.requireNonNull(or);
       if (PatchProxy.applyVoid(null, or, r.class, "5")) {
       }else {
          Object[] objArray = new Object[0];
          p3.D().w("PostService", "clearPostWorkListener: size="+or.a.size(), objArray);
          or.a.clear();
       }
       or.a(new d$a(or));
       return;
    }
}
