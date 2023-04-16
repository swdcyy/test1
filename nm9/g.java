package nm9.g;
import ev5.b;
import java.lang.Object;
import android.content.Context;
import com.kwai.feature.api.social.common.jsbridge.model.FaceDetectParams;
import f55.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.util.Map;
import fg6.a;
import com.google.gson.Gson;
import java.util.HashMap;
import android.os.Bundle;
import u36.b;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a0;
import ca9.b;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import com.trello.rxlifecycle3.android.ActivityEvent;
import gr8.b;
import gr8.c;
import brd.f0;
import nm9.e;
import nm9.c;
import erd.g;
import crd.b;
import com.kwai.feature.api.social.common.jsbridge.model.ImageCacheParams;
import java.util.List;
import ekd.q;
import com.kwai.robust.PatchProxyResult;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.Collection;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.net.Uri;
import ekd.w0;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.drawee.backends.pipeline.Fresco;
import kb.c;
import java.lang.Boolean;
import tc.h;
import com.facebook.cache.common.CacheKey;
import vc.j;
import com.facebook.cache.disk.f;
import sa.a;
import sa.b;
import android.util.Base64;
import com.kwai.feature.api.social.common.jsbridge.model.ImageCacheResult;
import java.io.IOException;
import java.io.File;
import nm9.f;
import nm9.d;
import com.kwai.feature.api.social.common.jsbridge.model.LaunchPageParams;
import com.kwai.feature.api.social.common.jsbridge.model.RemarkNameParams;
import java.util.Iterator;
import lu7.f;
import com.kwai.feature.api.social.common.jsbridge.model.RemarkNameSyncParams;
import com.kwai.feature.api.social.common.jsbridge.model.RemarkNameSyncResult;
import ev5.a;

public class g implements b	// class@0031e0
{

    public void g(){
       super();
    }
    public void A2(Context p0,FaceDetectParams p1,g p2){
       HashMap hashMap;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, g.class, "4")) {
          return;
       }
       GifshowActivity gifshowActiv = ActivityContext.g().e();
       if (gifshowActiv == null) {
          return;
       }
       String str = a.a.q(p1.getServerParams());
       String imagePath = p1.getImagePath();
       try{
          hashMap = new HashMap();
          hashMap.put("KEY_SERVER_PARAMS", str);
          hashMap.put("KEY_AVATAR_IMAGE_PATH", imagePath);
       }catch(java.lang.Exception e0){
          p2.a(-1, "parseParams error", null);
       }
       b.s(b.class, LoadPolicy.DIALOG).g(c.c(gifshowActiv.m(), ActivityEvent.DESTROY)).R(new e(gifshowActiv, imagePath, hashMap, p2), new c(p2));
       return;
    }
    public void N2(Context p0,ImageCacheParams p1,g p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, g.class, "5")) {
          return;
       }
       List uris = p1.getUris();
       Map options = p1.getOptions();
       String str = "base64";
       String str1 = (!q.h(options))? options.get("resultType"): str;
       ImageRequest imageRequest = PatchProxy.applyOneRefs(uris, null, g.class, "9");
       if (imageRequest != PatchProxyResult.class) {
       }else if(q.f(uris) || TextUtils.x(uris.get(false).mUrl)){
          Uri uri = w0.f(uris.get(false).mUrl);
          if (uri != null) {
             imageRequest = ImageRequestBuilder.k(uri).a();
          }
       }
       imageRequest = null;
       boolean b = Fresco.getImagePipeline().isInBitmapMemoryCache(imageRequest);
       if (!b) {
          c uoc = Fresco.getImagePipeline().isInDiskCache(imageRequest);
          if (uoc != null && uoc.getResult() != null) {
             b = uoc.getResult().booleanValue();
          }
       }
       if (b) {
          if (imageRequest != null) {
             a uoa = j.j().l().c(Fresco.getImagePipeline().getCacheKeyFactory().b(imageRequest, null));
             if (uoa instanceof b) {
                if (TextUtils.n(str1, str)) {
                   try{
                      p2.onSuccess(new ImageCacheResult(true, Base64.encodeToString(uoa.read(), 2)));
                   }catch(java.io.IOException e7){
                      e7.printStackTrace();
                      p2.a(-1, e7.getMessage(), null);
                   }
                }else if(TextUtils.n(str1, "path")){
                   p2.onSuccess(new ImageCacheResult(true, uoa.c().getPath()));
                }
             }
          }else {
             p2.onSuccess(new ImageCacheResult(false, null));
          }
       }
    }
    public final void Na(g p0,GifshowActivity p1,HashMap p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, g.class, "8")) {
          return;
       }
       b.s(b.class, LoadPolicy.DIALOG).g(c.c(p1.m(), ActivityEvent.DESTROY)).R(new f(p1, p2, p0), new d(p0));
       return;
    }
    public void P7(Context p0,LaunchPageParams p1,g p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, g.class, "6")) {
          return;
       }
       if (p0 instanceof GifshowActivity) {
          String serverParams = p1.getServerParams();
          String imgPath = p1.getImgPath();
          try{
             super();
             this.put("KEY_SERVER_PARAMS", serverParams);
             this.put("KEY_AVATAR_IMAGE_PATH", imgPath);
          }catch(java.lang.Exception e0){
             p2.a(-1, "params exception", null);
          }
          this.Na(p2, p0, this);
       }else {
          p2.a(-1, "launch LiveAvatarPage fail", null);
       }
       return;
    }
    public void W2(Context p0,RemarkNameParams p1,g p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, g.class, "2")) {
          return;
       }
       List userIds = p1.getUserIds();
       if (q.f(userIds)) {
          p2.a(-1, "params-error", null);
          return;
       }else {
          HashMap hashMap = new HashMap();
          Iterator iterator = userIds.iterator();
          while (iterator.hasNext()) {
             String str = iterator.next();
             String str1 = f.b(str, null);
             if (str1 != null) {
                hashMap.put(str, str1);
             }
          }
          p2.onSuccess(hashMap);
          return;
       }
    }
    public void d9(Context p0,RemarkNameSyncParams p1,g p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, g.class, "3")) {
          return;
       }
       p2.onSuccess(new RemarkNameSyncResult(f.b(p1.getUserId(), p1.getUserName())));
       return;
    }
    public String getNameSpace(){
       return a.a(this);
    }
    public void j1(Context p0,LaunchPageParams p1,g p2){
       String this;
       HashMap hashMap;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, g.class, "7")) {
          return;
       }
       if (p0 instanceof GifshowActivity) {
          String serverParams = p1.getServerParams();
          this = p1.getImgPath();
          String moodId = p1.getMoodId();
          try{
             hashMap = new HashMap();
             hashMap.put("KEY_SERVER_PARAMS", serverParams);
             hashMap.put("KEY_AVATAR_IMAGE_PATH", this);
             hashMap.put("KEY_MOOD_ID", moodId);
          }catch(java.lang.Exception e0){
             p2.a(-1, "params exception", null);
          }
          this.Na(p2, p0, hashMap);
       }else {
          p2.a(-1, "launch LiveAvatarPage fail", null);
       }
       return;
    }
}
