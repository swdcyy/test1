package com.kwai.feature.api.danmaku.model.ExtraDanmakuDisplayInfo;
import java.io.Serializable;
import java.lang.Object;
import com.kwai.feature.api.danmaku.model.ExtraDanmakuDisplayInfo$widthOfPx$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.feature.api.danmaku.model.ExtraDanmakuDisplayInfo$heightOfPx$2;
import com.kwai.feature.api.danmaku.model.ExtraDanmakuDisplayInfo$resPath$2;
import java.lang.String;
import com.yxcorp.gifshow.model.CDNUrl;
import android.graphics.drawable.Drawable;
import msd.l;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Boolean;
import xf6.l;
import com.kwai.feature.api.danmaku.DanmakuUtil;
import kotlin.jvm.internal.a;
import com.kuaishou.webkit.URLUtil;
import android.net.Uri;
import java.io.File;
import zsd.u;
import mm5.a;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Throwable;

public final class ExtraDanmakuDisplayInfo implements Serializable	// class@000e86
{
    public String activityId;
    public Drawable b;
    public String body;
    public Boolean c;
    public CDNUrl[] cdnUrl;
    public l fetchImgCallback;
    public boolean hasTriedToGetLottieDrawable;
    public float height;
    public final p heightOfPx$delegate;
    public String key;
    public Drawable lottieDrawable;
    public String lottieImagesPath;
    public final p resPath$delegate;
    public Drawable tempLottieDrawable;
    public String type;
    public float width;
    public final p widthOfPx$delegate;

    public void ExtraDanmakuDisplayInfo(){
       super();
       this.type = "img";
       this.widthOfPx$delegate = s.c(new ExtraDanmakuDisplayInfo$widthOfPx$2(this));
       this.heightOfPx$delegate = s.c(new ExtraDanmakuDisplayInfo$heightOfPx$2(this));
       this.resPath$delegate = s.c(new ExtraDanmakuDisplayInfo$resPath$2(this));
    }
    public final String getActivityId(){
       return this.activityId;
    }
    public final String getBody(){
       return this.body;
    }
    public final CDNUrl[] getCdnUrl(){
       return this.cdnUrl;
    }
    public final Drawable getDrawable(){
       return this.b;
    }
    public final l getFetchImgCallback(){
       return this.fetchImgCallback;
    }
    public final boolean getHasTriedToGetLottieDrawable(){
       return this.hasTriedToGetLottieDrawable;
    }
    public final float getHeight(){
       return this.height;
    }
    public final int getHeightOfPx(){
       Object obj = PatchProxy.apply(null, this, ExtraDanmakuDisplayInfo.class, "3");
       if (obj == PatchProxyResult.class) {
          obj = this.heightOfPx$delegate.getValue();
       }
       return obj.intValue();
    }
    public final Boolean getImageDrawableResult(){
       return this.c;
    }
    public final String getKey(){
       return this.key;
    }
    public final String getLottieImagesPath(){
       return this.lottieImagesPath;
    }
    public final String getResPath(){
       Object obj = PatchProxy.apply(null, this, ExtraDanmakuDisplayInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.resPath$delegate.getValue();
    }
    public final String getType(){
       return this.type;
    }
    public final String getWarmResPath(){
       object oobject;
       Object[] objArray = null;
       Uri obj = PatchProxy.apply(objArray, this, ExtraDanmakuDisplayInfo.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.isValidCDNUrl()) {
          return objArray;
       }
       boolean b = l.c("FORCE_DANMAKU_WARM_RES", false);
       ExtraDanmakuDisplayInfo tcdnUrl = this.cdnUrl;
       a.m(tcdnUrl);
       String str = DanmakuUtil.g.n(tcdnUrl[0].getUrl(), b);
       if (str == null) {
          if (!b) {
             ExtraDanmakuDisplayInfo tcdnUrl1 = this.cdnUrl;
             a.m(tcdnUrl1);
             str = tcdnUrl1[0].getUrl();
          }else {
             str = objArray;
          }
       }
       if (URLUtil.isFileUrl(str)) {
          obj = Uri.parse(str);
          a.o(obj, "Uri.parse\(path\)");
          String path = obj.getPath();
          if (path != null) {
             a.o(path, "Uri.parse\(path\).path ?: return null");
             File uFile = new File(path);
             if (uFile.exists() && uFile.isDirectory()) {
                this.lottieImagesPath = path;
                File[] uFileArray = uFile.listFiles();
                if (uFileArray != null) {
                   int len = uFileArray.length;
                   int i = 0;
                   while (true) {
                      if (i < len) {
                         oobject = uFileArray[i];
                         a.o(oobject, "it");
                         String name = oobject.getName();
                         a.o(name, "it.name");
                         if (u.H1(name, ".json", false, 2, objArray)) {
                         label_0096 :
                            if (oobject != null) {
                               objArray = oobject.getPath();
                               break ;
                            }
                         }else {
                            i = i + 1;
                         }
                      }else {
                         oobject = objArray;
                         goto label_0096 ;
                      }
                   }
                }
             }
          }
          return objArray;
       }
    label_009d :
       return str;
    }
    public final float getWidth(){
       return this.width;
    }
    public final int getWidthOfPx(){
       Object obj = PatchProxy.apply(null, this, ExtraDanmakuDisplayInfo.class, "2");
       if (obj == PatchProxyResult.class) {
          obj = this.widthOfPx$delegate.getValue();
       }
       return obj.intValue();
    }
    public final boolean isAnim(){
       Object obj = PatchProxy.apply(null, this, ExtraDanmakuDisplayInfo.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.g(this.type, "gif");
    }
    public final boolean isImage(){
       Object obj = PatchProxy.apply(null, this, ExtraDanmakuDisplayInfo.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.g(this.type, "img");
    }
    public final boolean isValidCDNUrl(){
       ExtraDanmakuDisplayInfo tcdnUrl = this.cdnUrl;
       int i = 0;
       if (tcdnUrl != null) {
          int i1 = (!tcdnUrl.length)? 1: 0;
          if (!i1) {
          label_000f :
             return (i ^ 0x01);
          }
       }
       i = 1;
       goto label_000f ;
    }
    public final void release(){
       if (PatchProxy.applyVoid(null, this, ExtraDanmakuDisplayInfo.class, "8")) {
          return;
       }
       a.i(a.a, "ExtraDanmakuDisplayInfo", "release", null, null, null, null, 60, null);
       this.b = null;
       this.fetchImgCallback = null;
       this.lottieDrawable = null;
       this.hasTriedToGetLottieDrawable = false;
       return;
    }
    public final void setActivityId(String p0){
       this.activityId = p0;
    }
    public final void setBody(String p0){
       this.body = p0;
    }
    public final void setCdnUrl(CDNUrl[] p0){
       this.cdnUrl = p0;
    }
    public final void setDrawable(Drawable p0){
       this.b = p0;
    }
    public final void setFetchImgCallback(l p0){
       this.fetchImgCallback = p0;
    }
    public final void setHasTriedToGetLottieDrawable(boolean p0){
       this.hasTriedToGetLottieDrawable = p0;
    }
    public final void setHeight(float p0){
       this.height = p0;
    }
    public final void setImageDrawableResult(Boolean p0){
       this.c = p0;
    }
    public final void setKey(String p0){
       this.key = p0;
    }
    public final void setLottieImagesPath(String p0){
       this.lottieImagesPath = p0;
    }
    public final void setType(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ExtraDanmakuDisplayInfo.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.type = p0;
       return;
    }
    public final void setWidth(float p0){
       this.width = p0;
    }
}
