package com.kuaishou.gifshow.kuaishan.mediascene.router.MediaSceneRouterActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.gifshow.kuaishan.mediascene.router.MediaSceneRouterActivity$a;
import nsd.u;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import android.content.Intent;
import kotlin.jvm.internal.a;
import z80.p;
import com.kwai.feature.post.api.mediascene.MediaSceneInitParams;
import java.lang.Boolean;
import android.net.Uri;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.feature.post.api.mediascene.MediaSceneLaunchParams;
import ekd.x0;
import java.lang.Long;
import java.lang.Integer;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt__CollectionsKt;
import z80.a;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import w46.b;
import y36.b;
import lnc.x6;
import lnc.y6;

public final class MediaSceneRouterActivity extends GifshowActivity	// class@001a92
{
    public static final MediaSceneRouterActivity$a y;

    static {
       MediaSceneRouterActivity.y = new MediaSceneRouterActivity$a(null);
    }
    public void MediaSceneRouterActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, MediaSceneRouterActivity.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onCreate(Bundle p0){
       boolean b;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, MediaSceneRouterActivity.class, str)) {
          return;
       }
       super.onCreate(p0);
       Intent intent = this.getIntent();
       String str1 = "intent";
       a.o(intent, str1);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p op = p.class;
       String[] obj = null;
       Object obj1 = PatchProxy.applyOneRefs(intent, obj, op, str);
       if (obj1 != patchProxyRe) {
          obj = obj1;
       }else {
          a.p(intent, str1);
          Boolean uBoolean = PatchProxy.applyOneRefs(intent, obj, op, "2");
          str = null;
          if (uBoolean != patchProxyRe) {
          }else if(intent != null){
             Uri data1 = intent.getData();
             if (data1 != null) {
                a.o(data1, "uri");
                uBoolean = Boolean.valueOf(TextUtils.equals(data1.getAuthority(), "mediascenerouter"));
             }else {
                uBoolean = obj;
             }
             if (uBoolean == null) {
             label_005a :
                b = false;
             label_005b :
                if (b) {
                   Uri data = intent.getData();
                   if (data != null) {
                      MediaSceneInitParams mediaSceneIn = new MediaSceneInitParams();
                      mediaSceneIn.mServerParams = obj;
                      MediaSceneLaunchParams mediaSceneLa = new MediaSceneLaunchParams();
                      mediaSceneLa.mRequireAlbum = Boolean.parseBoolean(x0.a(data, "requireAlbum"));
                      mediaSceneLa.mRequirePreview = Boolean.parseBoolean(x0.a(data, "requirePreview"));
                      String str2 = x0.a(data, "templateId");
                      if (str2 != null) {
                         mediaSceneLa.mTemplateId = Long.parseLong(str2);
                      }
                      str2 = x0.a(data, "sceneType");
                      a.o(str2, "SafetyUriUtil.getQueryPa¡­nts.KEY_MEDIA_SCENE_TYPE\)");
                      mediaSceneLa.mSceneType = Integer.parseInt(str2);
                      str2 = x0.a(data, "topColor");
                      if (str2 != null) {
                         mediaSceneLa.mTopColor = str2;
                      }
                      str2 = x0.a(data, "bottomColor");
                      if (str2 != null) {
                         mediaSceneLa.mBottomColor = str2;
                      }
                      str2 = x0.a(data, "loadingTitle");
                      int i = 1;
                      if (str2 != null) {
                         String[] stringArray = new String[i];
                         stringArray[str] = str2;
                         mediaSceneLa.mLoadingTitles = CollectionsKt__CollectionsKt.r(stringArray);
                      }
                      str2 = x0.a(data, "loadingSubTitle");
                      if (str2 != null) {
                         obj = new String[i];
                         obj[str] = str2;
                         mediaSceneLa.mLoadingSubTitles = CollectionsKt__CollectionsKt.r(obj);
                      }
                      mediaSceneLa.mReturnOriginPage = Boolean.parseBoolean(x0.a(data, "returnToOriginalPage"));
                      str = x0.a(data, "bizParams");
                      if (str != null) {
                         mediaSceneLa.mBizParams = str;
                      }
                      mediaSceneLa.mUseCommonInterface = Boolean.parseBoolean(x0.a(data, "useCommonInterface"));
                      mediaSceneIn.mLaunchParams = mediaSceneLa;
                      obj = mediaSceneIn;
                   }
                }
             }
          }else {
             goto label_005a ;
          }
          b = uBoolean.booleanValue();
          goto label_005b ;
       }
       if (obj == null) {
          a.D().e("MediaSceneRouterActivity", "failed to parse mediascene initparams", new IllegalArgumentException());
          this.finish();
       }else {
          b uob = y6.r(b.class);
          if (uob != null) {
             uob.JQ(this, obj);
          }
          this.finish();
       }
       return;
    }
}
