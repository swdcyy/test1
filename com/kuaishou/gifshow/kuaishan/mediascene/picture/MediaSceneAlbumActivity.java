package com.kuaishou.gifshow.kuaishan.mediascene.picture.MediaSceneAlbumActivity;
import com.yxcorp.gifshow.albumwrapper.AlbumGifshowActivity;
import java.lang.String;
import java.lang.Object;
import android.content.res.Resources;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import java.util.List;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.util.Collection;
import com.yxcorp.gifshow.models.QMedia;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.gifshow.kuaishan.mediascene.picture.MediaScenePictureHelper;
import java.util.Objects;
import kotlin.Pair;
import android.os.Bundle;
import android.graphics.Bitmap$CompressFormat;
import java.lang.StringBuilder;
import z80.c;
import java.io.File;
import z80.a;
import q87.c;
import ekd.a0;
import android.net.Uri;
import ekd.w0;
import android.os.Parcelable;
import android.content.Intent;
import com.kuaishou.gifshow.kuaishan.mediascene.picture.MediaSceneImageCropActivity;
import android.content.Context;
import lnc.a1;
import f90.a;
import n3d.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.IllegalArgumentException;

public final class MediaSceneAlbumActivity extends AlbumGifshowActivity	// class@001a86
{

    public void MediaSceneAlbumActivity(){
       super();
    }
    public static void A3(MediaSceneAlbumActivity p0,boolean p1,String p2,int p3,Object p4){
       p0.z3(p1, null);
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, MediaSceneAlbumActivity.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public boolean w3(List p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       MediaSceneAlbumActivity mediaSceneAl = MediaSceneAlbumActivity.class;
       String obj = PatchProxy.applyOneRefs(p0, this, mediaSceneAl, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       a.p(p0, "mediaList");
       int i = 2;
       String str = null;
       boolean b = false;
       if (p0.isEmpty()) {
          MediaSceneAlbumActivity.A3(this, b, str, i, str);
          return true;
       }else {
          QMedia path = p0.get(b).path;
          if (TextUtils.x(path)) {
             MediaSceneAlbumActivity.A3(this, b, str, i, str);
             return true;
          }else {
             obj = "imagePath";
             a.o(path, obj);
             if (!PatchProxy.applyVoidOneRefs(path, this, mediaSceneAl, "2")) {
                MediaScenePictureHelper b1 = MediaScenePictureHelper.b;
                Objects.requireNonNull(b1);
                MediaScenePictureHelper mediaScenePi = MediaScenePictureHelper.class;
                Pair pair = PatchProxy.applyTwoRefs(this, path, b1, mediaScenePi, "6");
                if (pair != patchProxyRe) {
                }else {
                   a.p(this, "activity");
                   a.p(path, obj);
                   Bundle uBundle = PatchProxy.applyOneRefs(path, b1, mediaScenePi, "7");
                   if (uBundle != patchProxyRe) {
                   }else {
                      uBundle = new Bundle();
                      uBundle.putString("crop", "true");
                      uBundle.putInt("aspectX", 12);
                      uBundle.putInt("aspectY", 10);
                      int i1 = 1280;
                      uBundle.putInt("outputX", i1);
                      uBundle.putInt("outputY", i1);
                      uBundle.putString("outputFormat", Bitmap$CompressFormat.PNG.toString());
                      uBundle.putBoolean("return-data", b);
                      uBundle.putBoolean("darkTheme", true);
                      uBundle.putBoolean("imageReverse", b);
                      StringBuilder str1 = c.j.w().getAbsolutePath()+"/";
                      String str2 = PatchProxy.applyOneRefs(path, b1, mediaScenePi, "8");
                      if (str2 != patchProxyRe) {
                      }else {
                         Object[] objArray = new Object[b];
                         a.D().s("MediaScenePictureHelper", "getClipImageName\(\) called with: media = ["+path+']', objArray);
                         if (TextUtils.x(path) ^ true) {
                            str2 = a0.c(path+"_"+i1+"_"+"croppedImage")+".png";
                         }else {
                            throw new IllegalArgumentException("imagePath is empty".toString());
                         }
                      }
                      String str3 = str1+str2;
                      uBundle.putString("KEY_CROPPED_IMAGE_PATH", str3);
                      uBundle.putParcelable("output", w0.c(new File(str3)));
                   }
                   Intent intent = new Intent(this, MediaSceneImageCropActivity.class);
                   intent.setData(w0.c(new File(path)));
                   intent.putExtras(uBundle);
                   intent.putExtra("margin_side", a1.e(10.00f));
                   pair = new Pair(intent, uBundle);
                }
                this.t1(pair.getFirst(), 200, new a(this, pair.getSecond()));
             }
             return true;
          }
       }
    }
    public final void z3(boolean p0,String p1){
       MediaSceneAlbumActivity mediaSceneAl = MediaSceneAlbumActivity.class;
       if (PatchProxy.isSupport(mediaSceneAl) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, mediaSceneAl, "3")) {
          return;
       }
       int i = 0;
       if (p0) {
          Intent intent = (p1 == null || !p1.length())? 1: null;
          if (!intent) {
             intent = new Intent();
             intent.putExtra("KEY_CROPPED_IMAGE_PATH", p1);
             this.setResult(-1, intent);
             this.finish();
             return;
          }
       }
       this.setResult(i);
       this.finish();
       return;
    }
}
