package com.tachikoma.component.imageview.model.TKImageLoadParam;
import com.tachikoma.core.component.TKBaseNativeModule;
import gx4.f;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.tkruntime.v8.V8Function;
import ln8.a;
import java.lang.Boolean;
import com.tkruntime.v8.V8Value;
import com.tkruntime.v8.JsValueRef;
import tx4.y;
import java.util.HashMap;
import java.lang.Number;
import iq8.n;

public class TKImageLoadParam extends TKBaseNativeModule	// class@000d09
{
    public int blurRadius;
    public String borderColor;
    public int borderRadius;
    public double borderWidth;
    public String bundleId;
    public int cdnResizeMode;
    public String cdnUrl;
    public TKImageLoadParam$a controller;
    public JsValueRef f;
    public boolean fadeEnabled;
    public String fallbackImage;
    public boolean g;
    public String iconName;
    public V8Function loadCallback;
    public int pathType;
    public String placeHolder;
    public boolean progressiveEnabled;
    public String resize;
    public int resizeHeight;
    public int resizeWidth;
    public String rootDir;
    public TKIcon tKIcon;
    public HashMap thumbnailPixelSize;
    public String tintColor;
    public String uri;
    public int viewMode;
    public static int UNSET = 255;

    public void TKImageLoadParam(f p0){
       super(p0);
       this.pathType = 0;
       this.fadeEnabled = true;
       this.cdnResizeMode = 1;
       int uNSET = TKImageLoadParam.UNSET;
       this.borderRadius = uNSET;
       this.borderWidth = (double)uNSET;
       this.g = false;
       this.rootDir = this.getRootDir();
    }
    public boolean isNeedCallback(){
       boolean b = (this.loadCallback != null || this.g != null)? true: false;
       return b;
    }
    public void setBlurRadius(int p0){
       this.blurRadius = p0;
    }
    public void setCDNUrl(String p0){
       this.cdnUrl = p0;
       this.pathType = 1;
    }
    public void setCdnResizeMode(int p0){
       this.cdnResizeMode = p0;
    }
    public void setContentMode(String p0){
       this.resize = p0;
    }
    public void setFadeEnabled(boolean p0){
       this.fadeEnabled = p0;
    }
    public void setFallbackImage(String p0){
       this.fallbackImage = p0;
    }
    public void setHasCallback(boolean p0){
       this.g = p0;
    }
    public void setIconName(String p0){
       this.iconName = p0;
       this.pathType = 2;
    }
    public void setImageLoadCallback(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKImageLoadParam.class, "2")) {
          return;
       }
       if (!p0 instanceof V8Function) {
          return;
       }
       if (a.c.booleanValue()) {
          p0.setFunctionName("TKImageView_setImageLoadCallback");
       }
       p0 = y.b(p0, this);
       y.c(this.f);
       this.f = p0;
       if (p0 != null) {
          this.loadCallback = p0.get();
       }
       return;
    }
    public void setPlaceholder(String p0){
       this.placeHolder = p0;
    }
    public void setProgressiveEnabled(boolean p0){
       this.progressiveEnabled = p0;
    }
    public void setThumbnailPixelSize(HashMap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKImageLoadParam.class, "3")) {
          return;
       }
       if (p0 != null && !p0.isEmpty()) {
          Object obj = p0.get("width");
          if (obj instanceof Number) {
             this.resizeWidth = n.b(obj.intValue());
          }
          p0 = p0.get("height");
          if (p0 instanceof Number) {
             this.resizeHeight = n.b(p0.intValue());
          }
       }
    label_0040 :
       return;
    }
    public void setTintColor(String p0){
       this.tintColor = p0;
    }
    public void setUri(String p0){
       this.uri = p0;
       this.pathType = 0;
    }
    public void setViewMode(int p0){
       this.viewMode = p0;
    }
    public void unRetainAllJsObj(){
       if (PatchProxy.applyVoid(null, this, TKImageLoadParam.class, "1")) {
          return;
       }
       super.unRetainAllJsObj();
       y.c(this.f);
       return;
    }
}
