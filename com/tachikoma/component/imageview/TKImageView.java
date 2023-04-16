package com.tachikoma.component.imageview.TKImageView;
import com.tachikoma.component.imageview.model.TKImageLoadParam$b;
import com.tachikoma.core.component.e;
import gx4.f;
import com.tachikoma.component.imageview.model.TKImageLoadParam;
import com.tachikoma.core.bridge.d;
import com.tachikoma.core.component.TKBaseNativeModule;
import java.lang.String;
import com.tachikoma.component.imageview.model.TKImageLoadParam$a;
import org.json.JSONObject;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Exception;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import vn8.t;
import crd.b;
import un8.w;
import java.util.Objects;
import vn8.p;
import java.lang.ExceptionInInitializerError;
import com.tachikoma.core.component.TKBaseNativeModule$DestroyReason;
import java.lang.Boolean;
import com.tachikoma.component.imageview.TKImageView$a;
import java.lang.Runnable;
import iq8.x;
import com.tachikoma.component.imageview.model.TKImageLoadParam$c;
import java.lang.Long;
import com.tkruntime.v8.JsValueRef;
import com.tkruntime.v8.V8Object;
import tx4.y;
import com.tkruntime.v8.V8Function;
import java.util.Map;
import com.tachikoma.core.bridge.c;
import java.lang.Throwable;
import wp8.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.HashMap;
import com.tkruntime.v8.V8Array;
import ln8.a;
import com.tkruntime.v8.V8Value;
import java.util.List;
import java.lang.Integer;
import java.lang.Double;
import gx4.c;
import zp8.a;
import android.os.Build$VERSION;

public class TKImageView extends e implements TKImageLoadParam$b	// class@000cfe
{
    public int A;
    public int B;
    public int C;
    public double D;
    public String E;
    public V8Function F;
    public JsValueRef G;
    public String cdnUrl;
    public boolean fade;
    public String fallbackImage;
    public String iconName;
    public JsValueRef mOnErrorRef;
    public JsValueRef mOnLoadRef;
    public V8Function onImageSet;
    public JsValueRef onImageSetRef;
    public V8Function onerror;
    public V8Function onload;
    public String placeholder;
    public String src;
    public String tintColor;
    public TKImageLoadParam v;
    public int viewMode;
    public t w;
    public final TKImageLoadParam$a x;
    public int y;
    public int z;

    public void TKImageView(f p0){
       super(p0);
       int uNSET = TKImageLoadParam.UNSET;
       this.y = uNSET;
       this.z = uNSET;
       this.A = uNSET;
       this.B = uNSET;
       this.C = uNSET;
       this.D = (double)uNSET;
       TKImageLoadParam tKImageLoadP = new TKImageLoadParam(p0);
       this.v = tKImageLoadP;
       tKImageLoadP.bundleId = this.getTKJSContext().e();
       TKImageLoadParam$a uoa = new TKImageLoadParam$a();
       this.x = uoa;
       uoa.c = this;
       uoa.d = false;
       this.v.controller = uoa;
    }
    public JSONObject collectViewAttrs(){
       JSONObject obj = PatchProxy.apply(null, this, TKImageView.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.collectViewAttrs();
       try{
          obj.put("cdnUrl", this.v.cdnUrl);
          obj.put("uri", this.v.uri);
          obj.put("iconName", this.v.iconName);
          obj.put("viewMode", this.v.viewMode);
       }catch(java.lang.Exception e1){
          e1.printStackTrace();
       }
       return obj;
    }
    public View createViewInstance(Context p0){
       return this.createViewInstance(p0);
    }
    public ImageView createViewInstance(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TKImageView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getImageLoader().f(p0);
    }
    public void destroyOnUIThread(){
       if (PatchProxy.applyVoid(null, this, TKImageView.class, "4")) {
          return;
       }
       TKImageLoadParam$a b = this.x.b;
       if (b != null && !b.isDisposed()) {
          this.x.b.dispose();
       }
       this.x.d = true;
       return;
    }
    public t getImageLoader(){
       p op;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       String str = "2";
       w obj = PatchProxy.apply(objArray, this, TKImageView.class, str);
       if (obj != patchProxyRe) {
          return obj;
       }
       if (this.w == null) {
          obj = w.b();
          Objects.requireNonNull(obj);
          w ow = PatchProxy.apply(objArray, obj, w.class, str);
          if (ow != patchProxyRe) {
          }else if(obj.c == null){
             Object obj1 = PatchProxy.apply(objArray, obj, w.class, "3");
             if (obj1 != patchProxyRe) {
                op = obj1;
             }else {
                Class.forName("com.yxcorp.gifshow.image.KwaiImageView");
                op = new p();
             }
             obj.c = op;
             if (op == null) {
                throw new ExceptionInInitializerError("please implements IImageLoadPlugin interface first");
             }
          }
          ow = obj.c;
          this.w = ow;
       }
       return this.w;
    }
    public void onDestroy(TKBaseNativeModule$DestroyReason p0,boolean p1){
       TKImageView tKImageView = TKImageView.class;
       if (PatchProxy.isSupport(tKImageView) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, tKImageView, "3")) {
          return;
       }
       super.onDestroy(p0, p1);
       if (p1) {
          this.destroyOnUIThread();
       }else {
          x.f(new TKImageView$a(this));
       }
       return;
    }
    public void onImageSet(boolean p0,TKImageLoadParam$c p1,long p2){
       if (PatchProxy.isSupport(TKImageView.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), p1, Long.valueOf(p2), this, TKImageView.class, "22")) {
          return;
       }
       TKImageView tonImageSetR = this.onImageSetRef;
       if (tonImageSetR != null && (tonImageSetR.get() == null || (!p2 - this.x.a && y.a(this.onImageSetRef.get())))) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),p1.a()};
          this.onImageSetRef.get().call(null, objArray);
       }
    label_0068 :
       return;
    }
    public void onLoadFail(String p0,Throwable p1,TKImageLoadParam$c p2,long p3){
       if (PatchProxy.isSupport(TKImageView.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Long.valueOf(p3), this, TKImageView.class, "20")) {
          return;
       }
       if (p3 - this.x.a) {
          return;
       }
       if (p1 != null && !TextUtils.x(p1.getMessage())) {
          p0 = p1.getMessage();
       }
       TKImageView tv = this.v;
       if (tv != null) {
          TKImageLoadParam loadCallback = tv.loadCallback;
          if (loadCallback != null && y.a(loadCallback)) {
             Object[] objArray = new Object[]{Boolean.FALSE,p0,p2.a()};
             this.v.loadCallback.call(null, objArray);
          }
       }
       tv = this.mOnErrorRef;
       if (tv != null && y.a(tv.get())) {
          HashMap hashMap = new HashMap();
          hashMap.put("message", p0);
          Object[] objArray1 = new Object[]{hashMap};
          this.mOnErrorRef.get().call(null, objArray1);
       }
    label_009f :
       return;
    }
    public void onLoadProgress(float p0){
    }
    public void onLoadStart(){
    }
    public void onLoadSuccess(TKImageLoadParam$c p0,long p1){
       TKImageView tKImageView = TKImageView.class;
       if (PatchProxy.isSupport(tKImageView) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, tKImageView, "19")) {
          return;
       }
       if (p1 - this.x.a) {
          return;
       }
       TKImageView tv = this.v;
       int i = 1;
       if (tv != null) {
          TKImageLoadParam loadCallback = tv.loadCallback;
          if (loadCallback != null && y.a(loadCallback)) {
             Object[] objArray = new Object[]{Boolean.TRUE,"",p0.a()};
             this.v.loadCallback.call(null, objArray);
          }
       }
       tv = this.mOnLoadRef;
       if (tv != null && y.a(tv.get())) {
          Object[] objArray1 = new Object[i];
          objArray1[0] = p0.a();
          this.mOnLoadRef.get().call(null, objArray1);
       }
    label_0085 :
       return;
    }
    public void onPrefetch(boolean p0){
       TKImageView tKImageView = TKImageView.class;
       if (PatchProxy.isSupport(tKImageView) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, tKImageView, "21")) {
          return;
       }
       if (this.v != null) {
          tKImageView = this.G;
          if (tKImageView != null && y.a(tKImageView.get())) {
             Object[] objArray = new Object[]{Boolean.valueOf(p0)};
             this.G.get().call(null, objArray);
          }
       }
       return;
    }
    public void prefetch(V8Array p0,V8Function p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TKImageView.class, "10")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (a.c.booleanValue() && p1 != null) {
          p1.setFunctionName("TKImageView_prefetchURLs_callback");
       }
       y.c(this.G);
       this.F = p1;
       this.G = y.b(p1, this);
       this.getImageLoader().i(p0.getList(), this.v);
       return;
    }
    public void setBorderColor(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKImageView.class, "17")) {
          return;
       }
       if (!TextUtils.x(p0) && p0.equals(this.E)) {
          return;
       }
       this.E = p0;
       this.getImageLoader().d(this.getView(), p0);
       return;
    }
    public void setBorderRadius(int p0){
       TKImageView tKImageView = TKImageView.class;
       if (PatchProxy.isSupport(tKImageView) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, tKImageView, "18")) {
          return;
       }
       if (this.y == p0) {
          return;
       }
       super.setBorderRadius(p0);
       this.y = p0;
       this.getImageLoader().c(this.getView(), p0);
       return;
    }
    public void setBorderWidth(double p0){
       TKImageView tKImageView = TKImageView.class;
       if (PatchProxy.isSupport(tKImageView) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, tKImageView, "16")) {
          return;
       }
       if (!this.D - p0) {
          return;
       }
       super.setBorderWidth(p0);
       this.D = p0;
       this.getImageLoader().a(this.getView(), p0);
       return;
    }
    public void setBottomLeftRadius(int p0){
       TKImageView tKImageView = TKImageView.class;
       if (PatchProxy.isSupport(tKImageView) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, tKImageView, "15")) {
          return;
       }
       if (this.C == p0) {
          return;
       }
       super.setBottomLeftRadius(p0);
       this.C = p0;
       this.getImageLoader().h(this.getView(), 3, p0);
       return;
    }
    public void setBottomRightRadius(int p0){
       TKImageView tKImageView = TKImageView.class;
       if (PatchProxy.isSupport(tKImageView) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, tKImageView, "14")) {
          return;
       }
       if (this.B == p0) {
          return;
       }
       super.setBottomRightRadius(p0);
       this.B = p0;
       this.getImageLoader().h(this.getView(), 4, p0);
       return;
    }
    public void setCDNUrls(String p0,String p1,String p2,V8Function p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, TKImageView.class, "8")) {
          return;
       }
       if (a.c.booleanValue() && p3 != null) {
          p3.setFunctionName("TKImageView_setCDNUrls_callback");
       }
       boolean b = (TextUtils.x(this.v.cdnUrl) || !(this.v.cdnUrl).equals(p0))? true: false;
       TKImageView tv = this.v;
       tv.pathType = 1;
       tv.cdnUrl = p0;
       tv.placeHolder = p1;
       tv.fallbackImage = p2;
       tv.setImageLoadCallback(p3);
       TKImageView tx = this.x;
       long l = tx.a + 1;
       tx.a = l;
       this.getImageLoader().e(this.getView(), this.v, l, b);
       return;
    }
    public void setCdnUrl(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKImageView.class, "25")) {
          return;
       }
       int i = 1;
       boolean b = (TextUtils.x(this.v.cdnUrl) || !(this.v.cdnUrl).equals(p0))? true: false;
       TKImageView tv = this.v;
       tv.pathType = i;
       tv.controller = this.x;
       tv.cdnUrl = p0;
       TKImageView tx = this.x;
       long l = 1 + tx.a;
       tx.a = l;
       this.getImageLoader().e(this.getView(), this.v, l, b);
       return;
    }
    public void setContentMode(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKImageView.class, "11")) {
          return;
       }
       this.getImageLoader().b(this.getView(), p0);
       return;
    }
    public void setFade(boolean p0){
       this.v.fadeEnabled = p0;
    }
    public void setFallbackImage(String p0){
       this.v.fallbackImage = p0;
    }
    public void setIconName(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKImageView.class, "28")) {
          return;
       }
       boolean b = (TextUtils.x(this.v.iconName) || !(this.v.iconName).equals(p0))? true: false;
       TKImageView tv = this.v;
       tv.pathType = 2;
       tv.iconName = p0;
       TKImageView tx = this.x;
       long l = tx.a + 1;
       tx.a = l;
       this.getImageLoader().e(this.getView(), this.v, l, b);
       return;
    }
    public void setIconName(String p0,int p1,String p2,String p3,V8Function p4){
       Object obj = this;
       object oobject = p0;
       object oobject1 = p2;
       object oobject2 = p3;
       object oobject3 = p4;
       TKImageView tKImageView = TKImageView.class;
       if (PatchProxy.isSupport(tKImageView)) {
          Object[] objArray = new Object[]{oobject,Integer.valueOf(p1),oobject1,oobject2,oobject3};
          if (PatchProxy.applyVoid(objArray, obj, tKImageView, "9")) {
             return;
          }
       }
       if (a.c.booleanValue() && oobject3 != null) {
          oobject3.setFunctionName("TKImageView_setIconName_callback");
       }
       boolean b = (TextUtils.x(obj.v.iconName) || !(obj.v.iconName).equals(oobject))? true: false;
       tKImageView = obj.v;
       tKImageView.pathType = 2;
       tKImageView.iconName = oobject;
       tKImageView.viewMode = p1;
       tKImageView.placeHolder = oobject1;
       tKImageView.fallbackImage = oobject2;
       tKImageView.setImageLoadCallback(oobject3);
       TKImageView x = obj.x;
       long l = x.a + 1;
       x.a = l;
       this.getImageLoader().e(this.getView(), obj.v, l, b);
       return;
    }
    public void setObjectFit(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKImageView.class, "29")) {
          return;
       }
       if (TextUtils.x(p0)) {
          return;
       }
       Objects.requireNonNull(p0);
       int i = -1;
       String str = "contain";
       switch (p0.hashCode()){
           case 0x2ff583:
             if (p0.equals("fill")) {
                i = 0;
             }
             break;
           case 0x33af38:
             if (p0.equals("none")) {
                i = 1;
             }
             break;
           case 0x5a753b7:
             if (p0.equals("cover")) {
                i = 2;
             }
             break;
           case 0x38b724d4:
             if (p0.equals(str)) {
                i = 3;
             }
             break;
           default:
       }
    label_0049 :
       p0 = "center";
       switch (i){
           case 0:
             str = "stretch";
             break;
           case 2:
             str = "cover";
             break;
           case 3:
           default:
          label_004e :
             str = p0;
       }
       this.getImageLoader().b(this.getView(), str);
       return;
    }
    public void setOnError(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKImageView.class, "31")) {
          return;
       }
       if (a.c.booleanValue() && p0 != null) {
          p0.setFunctionName("TKImageView_onerror");
       }
       this.onerror = p0;
       y.c(this.mOnErrorRef);
       this.mOnErrorRef = y.b(p0, this);
       this.v.setHasCallback(true);
       return;
    }
    public void setOnImageSet(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKImageView.class, "26")) {
          return;
       }
       if (a.c.booleanValue() && p0 != null) {
          p0.setFunctionName("TKImageView_onImageSet");
       }
       y.c(this.onImageSetRef);
       this.onImageSet = p0;
       this.onImageSetRef = y.b(p0, this);
       return;
    }
    public void setOnLoad(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKImageView.class, "30")) {
          return;
       }
       if (a.c.booleanValue() && p0 != null) {
          p0.setFunctionName("TKImageView_onload");
       }
       this.onload = p0;
       y.c(this.mOnLoadRef);
       this.mOnLoadRef = y.b(p0, this);
       this.v.setHasCallback(true);
       return;
    }
    public void setPlaceHolder(String p0){
       this.v.placeHolder = p0;
    }
    public void setSrc(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKImageView.class, "24")) {
          return;
       }
       int i = 0;
       boolean b = (TextUtils.x(this.v.uri) || !(this.v.uri).equals(p0))? true: false;
       TKImageView tv = this.v;
       tv.pathType = i;
       tv.controller = this.x;
       tv.uri = p0;
       TKImageView tx = this.x;
       long l = 1 + tx.a;
       tx.a = l;
       this.getImageLoader().e(this.getView(), this.v, l, b);
       return;
    }
    public void setTintColor(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKImageView.class, "27")) {
          return;
       }
       if (!TextUtils.x(p0) && p0.equals(this.tintColor)) {
          return;
       }
       this.tintColor = p0;
       this.v.tintColor = p0;
       this.getImageLoader().g(this.getView(), p0);
       return;
    }
    public void setTopLeftRadius(int p0){
       TKImageView tKImageView = TKImageView.class;
       if (PatchProxy.isSupport(tKImageView) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, tKImageView, "12")) {
          return;
       }
       if (this.z == p0) {
          return;
       }
       super.setTopLeftRadius(p0);
       this.z = p0;
       this.getImageLoader().h(this.getView(), 1, p0);
       return;
    }
    public void setTopRightRadius(int p0){
       TKImageView tKImageView = TKImageView.class;
       if (PatchProxy.isSupport(tKImageView) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, tKImageView, "13")) {
          return;
       }
       if (this.A == p0) {
          return;
       }
       super.setTopRightRadius(p0);
       this.A = p0;
       this.getImageLoader().h(this.getView(), 2, p0);
       return;
    }
    public void setUri(String p0,String p1,String p2,V8Function p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, TKImageView.class, "7")) {
          return;
       }
       if (a.c.booleanValue() && p3 != null) {
          p3.setFunctionName("TKImageView_setUri_callback");
       }
       boolean b = (TextUtils.x(this.v.uri) || !(this.v.uri).equals(p0))? true: false;
       TKImageView tv = this.v;
       tv.pathType = 0;
       tv.uri = p0;
       tv.placeHolder = p1;
       tv.fallbackImage = p2;
       tv.setImageLoadCallback(p3);
       TKImageView tx = this.x;
       long l = tx.a + 1;
       tx.a = l;
       this.getImageLoader().e(this.getView(), this.v, l, b);
       return;
    }
    public void setViewMode(int p0){
       this.v.viewMode = p0;
    }
    public void show(V8Object p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, TKImageView.class, "6")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       TKImageLoadParam nativeModule = this.getNativeModule(p0);
       if (nativeModule == null) {
          return;
       }
       TKImageView tKImageView = null;
       if (this.v != nativeModule) {
          nativeModule.retainJsObj();
          TKImageView tv = this.v;
          if (tv != null) {
             tv.unRetainJsObj();
          }
          tv = this.v;
          TKImageLoadParam pathType = tv.pathType;
          if (pathType != 1) {
             if (pathType != 2) {
                if (TextUtils.x(tv.uri) || !(this.v.uri).equals(nativeModule.uri)) {
                label_0044 :
                   tKImageView = 1;
                }
             }else if(TextUtils.x(tv.iconName) || !(this.v.iconName).equals(nativeModule.iconName)){
                goto label_0044 ;
             }
          }else if(TextUtils.x(tv.cdnUrl) || !(this.v.cdnUrl).equals(nativeModule.cdnUrl)){
             goto label_0044 ;
          }
          this.v = nativeModule;
          nativeModule.bundleId = this.getTKJSContext().e();
          b = tKImageView;
       }else {
          b = false;
       }
       if (this.v.borderRadius != TKImageLoadParam.UNSET) {
          this.getImageLoader().c(this.getView(), this.v.borderRadius);
       }
       if (this.v.borderWidth - (double)TKImageLoadParam.UNSET) {
          this.getImageLoader().a(this.getView(), this.v.borderWidth);
       }
       if (!TextUtils.x(this.v.borderColor)) {
          this.getImageLoader().d(this.getView(), this.v.borderColor);
       }
       nativeModule.controller = this.x;
       TKImageView tx = this.x;
       long l = 1 + tx.a;
       tx.a = l;
       this.getImageLoader().e(this.getView(), this.v, l, b);
       return;
    }
    public boolean supportAsyncPrepareView(){
       boolean b = (Build$VERSION.SDK_INT <= 29)? true: false;
       return b;
    }
    public void unRetainAllJsObj(){
       if (PatchProxy.applyVoid(null, this, TKImageView.class, "5")) {
          return;
       }
       super.unRetainAllJsObj();
       TKImageView tv = this.v;
       if (tv != null) {
          tv.unRetainJsObj();
       }
       y.c(this.onImageSetRef);
       y.c(this.mOnLoadRef);
       y.c(this.mOnErrorRef);
       y.c(this.G);
       return;
    }
}
