package com.tachikoma.component.imageview.TKImage;
import com.tachikoma.core.component.e;
import gx4.f;
import android.graphics.drawable.BitmapDrawable;
import org.json.JSONObject;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Exception;
import android.content.Context;
import android.view.View;
import com.tachikoma.component.imageview.RoundImageView;
import java.util.Objects;
import android.graphics.Bitmap;
import qo8.f;
import vn8.v;
import un8.w;
import com.tachikoma.core.component.TKBaseNativeModule;
import iq8.w;
import java.lang.CharSequence;
import android.text.TextUtils;
import tx4.x;
import java.lang.StringBuilder;
import java.lang.Throwable;
import zp8.a;
import com.tachikoma.core.component.TKBaseNativeModule$DestroyReason;
import java.lang.Boolean;
import com.tachikoma.component.imageview.TKImage$a;
import java.lang.Runnable;
import iq8.x;
import android.graphics.BitmapFactory$Options;
import android.graphics.BitmapFactory;
import yp8.a;
import jq8.a;
import lg.i;
import com.tkruntime.v8.JsValueRef;
import com.tkruntime.v8.V8Object;
import tx4.y;
import com.tkruntime.v8.V8Function;
import com.tachikoma.core.bridge.d;
import wp8.a;
import java.util.List;
import java.lang.Integer;
import android.widget.ImageView;
import un8.l;
import vn8.v$a;
import java.io.File;
import com.tachikoma.component.imageview.e;
import iq8.o;
import android.graphics.drawable.Drawable;
import iq8.b;
import com.tachikoma.core.bridge.c;
import iq8.p;
import java.lang.Double;
import iq8.n;
import crd.b;
import un8.n;
import java.util.concurrent.Callable;
import brd.a0;
import brd.z;
import lrd.b;
import io.reactivex.android.schedulers.a;
import un8.r;
import un8.s;
import erd.g;
import android.widget.ImageView$ScaleType;
import ln8.a;
import com.tachikoma.component.imageview.TKImage$b;
import vn8.v$b;
import com.tkruntime.v8.V8Value;
import un8.p;
import com.tachikoma.component.imageview.d;
import com.tachikoma.component.imageview.c;
import com.tachikoma.core.utility.f;
import un8.v;
import java.lang.reflect.Type;
import el.a;
import un8.o;
import un8.q;

public class TKImage extends e	// class@000cfc
{
    public int blurRadius;
    public String fallbackImage;
    public String mPlaceHolder;
    public String placeholder;
    public String src;
    public String uri;
    public JsValueRef v;
    public b w;
    public long x;
    public boolean y;

    public void TKImage(f p0){
       super(p0);
       this.x = 0;
    }
    public static void m(TKImage p0,BitmapDrawable p1){
       p0.q(p1);
    }
    public JSONObject collectViewAttrs(){
       JSONObject obj = PatchProxy.apply(null, this, TKImage.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.collectViewAttrs();
       try{
          obj.put("src", this.src);
          obj.put("uri", this.uri);
          obj.put("placeholder", this.placeholder);
          obj.put("fallbackImage", this.fallbackImage);
       }catch(java.lang.Exception e1){
          e1.printStackTrace();
       }
       return obj;
    }
    public View createViewInstance(Context p0){
       return this.createViewInstance(p0);
    }
    public RoundImageView createViewInstance(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TKImage.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new RoundImageView(p0);
    }
    public void destroyOnMainThread(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, TKImage.class, "4")) {
          return;
       }
       RoundImageView view = this.getView();
       Objects.requireNonNull(view);
       if (!PatchProxy.applyVoid(objArray, view, RoundImageView.class, "14")) {
          view.u = true;
          RoundImageView j = view.j;
          if (j != null && !j.isRecycled()) {
             view.j.recycle();
          }
       }
       if (this.y != null) {
          f.a(this.src);
       }
       return;
    }
    public final v n(){
       Object obj = PatchProxy.apply(null, this, TKImage.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return w.b().a();
    }
    public final String o(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj = PatchProxy.applyOneRefs(p0, this, TKImage.class, "13");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.getRootDir();
       Object obj1 = null;
       Object obj2 = PatchProxy.applyTwoRefs(p0, obj, obj1, w.class, "2");
       if (obj2 != patchProxyRe) {
          obj1 = obj2;
       }else if(TextUtils.isEmpty(p0)){
          if (p0.startsWith("bundle://")) {
             obj1 = w.c(p0, obj);
          }else if(p0.startsWith("file://")){
             obj1 = w.e(p0);
          }else if(p0.startsWith("asset://")){
             Object obj3 = PatchProxy.applyOneRefs(p0, obj1, w.class, "5");
             if (obj3 != patchProxyRe) {
                obj1 = obj3;
             }else if(TextUtils.isEmpty(p0)){
                String str = x.b(p0);
                if (!w.d(str)) {
                   a.g("showAssetImage", new Exception(p0+" not exist"));
                }else {
                   obj1 = str;
                }
             }
          }else if(p0.startsWith("http://") || p0.startsWith("https://")){
             p0 = w.c(p0, obj);
          }
          obj1 = p0;
       }
       return obj1;
    }
    public void onDestroy(TKBaseNativeModule$DestroyReason p0,boolean p1){
       TKImage tKImage = TKImage.class;
       if (PatchProxy.isSupport(tKImage) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, tKImage, "3")) {
          return;
       }
       super.onDestroy(p0, p1);
       if (p1) {
          this.destroyOnMainThread();
       }else {
          x.f(new TKImage$a(this));
       }
       return;
    }
    public final BitmapFactory$Options p(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       TKImage tKImage = TKImage.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, tKImage, "29");
       if (obj != patchProxyRe) {
          return obj;
       }
       BitmapFactory$Options options = PatchProxy.applyOneRefs(p0, this, tKImage, "30");
       int i = 1;
       if (options != patchProxyRe) {
       }else {
          options = new BitmapFactory$Options();
          options.inJustDecodeBounds = i;
          BitmapFactory.decodeFile(p0, options);
       }
       options.inJustDecodeBounds = false;
       int i1 = (int)this.getDomNode().c().d().a;
       int i2 = (int)this.getDomNode().c().l().a;
       BitmapFactory$Options outHeight = options.outHeight;
       BitmapFactory$Options outWidth = options.outWidth;
       if (outHeight > i1 || outWidth > i2) {
          int i3 = outHeight / 2;
          int i4 = outWidth / 2;
          int i5 = i3 / i;
          while (i5 > i1) {
             i5 = i4 / i;
             if (i5 > i2) {
                i = i * 2;
             }
          }
       }
       options.inSampleSize = i;
       return options;
    }
    public final void q(BitmapDrawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKImage.class, "31")) {
          return;
       }
       if (this.y != null && p0 != null) {
          f.e(this.src, p0);
       }
       TKImage tv = this.v;
       if (tv == null) {
          return;
       }else if(y.a(tv.get())){
          try{
             V8Function v8Function = this.v.get();
             int i = 1;
             Object[] objArray = new Object[i];
             if (p0 == null) {
                i = false;
             }
             objArray[0] = Boolean.valueOf(i);
             v8Function.call(null, objArray);
          }catch(java.lang.Exception e6){
             a.b(e6, this.getTKJSContext().hashCode());
          }
       }
    }
    public final void r(List p0,int p1,int p2){
       TKImage tKImage = this;
       if (PatchProxy.isSupport(TKImage.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, TKImage.class, "20")) {
          return;
       }
       if (p0 == null || p0.isEmpty()) {
          this.n().e("", this.getView(), 0, super(this));
          return;
       }else if(TextUtils.isEmpty(tKImage.placeholder)){
          this.n().g(this.getView(), p0, p1, p2, tKImage.blurRadius, new l(this));
       }else {
          String str = (this.getRootDir()).concat(tKImage.placeholder);
          if (new File(str).exists()) {
             e uoe = new e(this, str, p0, p1, p2);
             o.a(v7);
          }else {
             this.n().a(this.getView(), p0, p1, p2, null, tKImage.blurRadius, null);
          }
       }
       return;
    }
    public final void s(String p0,boolean p1,String p2){
       TKImage tKImage = TKImage.class;
       if (PatchProxy.isSupport(tKImage) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, this, TKImage.class, "8")) {
          return;
       }
       Drawable uDrawable = null;
       if (p1) {
          this.getView().setImageDrawable(uDrawable);
       }
       if (!TextUtils.isEmpty(p2)) {
          this.getView().setTintColor(p2);
       }
       if (!TextUtils.isEmpty(p0) && (p0.startsWith("data:image") || p0.startsWith("data:Image"))) {
          if (!PatchProxy.applyVoid(uDrawable, this, tKImage, "12")) {
             Bitmap uBitmap = b.c(this.uri);
             if (uBitmap != null) {
                this.getView().setImageBitmap(uBitmap);
             }
          }
          return;
       }else {
          this.n().c(this.getView(), this.o(p0), this.o(this.placeholder), this.o(this.fallbackImage), this.blurRadius, (int)this.getDomNode().c().l().a, (int)this.getDomNode().c().d().a, new l(this));
          return;
       }
    }
    public void setBlurRadius(int p0){
       this.blurRadius = p0;
    }
    public void setBorderColor(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKImage.class, "23")) {
          return;
       }
       super.setBorderColor(p0);
       Integer integer = Integer.valueOf(p.c(p0, this.getJSContext()));
       if (integer != null) {
          this.getView().setBorderColor(integer.intValue());
       }
       return;
    }
    public void setBorderRadius(int p0){
       TKImage tKImage = TKImage.class;
       if (PatchProxy.isSupport(tKImage) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, tKImage, "24")) {
          return;
       }
       super.setBorderRadius(p0);
       this.getView().setBorderRadius((float)p0);
       return;
    }
    public void setBorderWidth(double p0){
       TKImage tKImage = TKImage.class;
       if (PatchProxy.isSupport(tKImage) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, tKImage, "22")) {
          return;
       }
       super.setBorderWidth(p0);
       this.getView().setBorderWidth((float)n.a((float)p0));
       return;
    }
    public void setBottomLeftRadius(int p0){
       TKImage tKImage = TKImage.class;
       if (PatchProxy.isSupport(tKImage) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, tKImage, "28")) {
          return;
       }
       super.setBottomLeftRadius(p0);
       this.getView().setBottomLeftRoundRadius((float)n.b(p0));
       return;
    }
    public void setBottomRightRadius(int p0){
       TKImage tKImage = TKImage.class;
       if (PatchProxy.isSupport(tKImage) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, tKImage, "27")) {
          return;
       }
       super.setBottomRightRadius(p0);
       this.getView().setBottomRightRoundRadius((float)n.b(p0));
       return;
    }
    public void setCDNUrls(String p0,int p1,int p2,String p3,String p4,int p5){
       TKImage tKImage = this;
       object oobject = p0;
       object oobject1 = p3;
       object oobject2 = p4;
       TKImage tKImage1 = TKImage.class;
       if (PatchProxy.isSupport(tKImage1)) {
          Object[] objArray = new Object[]{oobject,Integer.valueOf(p1),Integer.valueOf(p2),oobject1,oobject2,Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, tKImage1, "16")) {
             return;
          }
       }
       Drawable uDrawable = null;
       this.getView().setImageDrawable(uDrawable);
       TKImage w = tKImage.w;
       if (w != null && !w.isDisposed()) {
          tKImage.w.dispose();
       }
       if (!PatchProxy.applyVoidOneRefs(p3, this, tKImage1, "17")) {
          if (TextUtils.isEmpty(p3)) {
             this.getView().setImageDrawable(uDrawable);
          }else {
             this.setUri(p3);
          }
       }
       long l = tKImage.x + 1;
       tKImage.x = l;
       r or = new r(this, l, p4, p1, p2);
       tKImage.w = a0.y(new n(this, p0)).T(b.c()).G(a.c()).R(v10, new s(this, oobject2));
       return;
    }
    public void setContentMode(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKImage.class, "21")) {
          return;
       }
       Objects.requireNonNull(p0);
       int i = -1;
       switch (p0.hashCode()){
           case 0x8fd4e705:
             if (p0.equals("stretch")) {
                i = 0;
             }
             break;
           case 0xc3e1af26:
             if (p0.equals("origin")) {
                i = 1;
             }
             break;
           case 0x5a753b7:
             if (p0.equals("cover")) {
                i = 2;
             }
             break;
           case 0x38b724d4:
             if (p0.equals("contain")) {
                i = 3;
             }
             break;
           default:
       }
       switch (i){
           case 0:
             this.getView().setScaleType(ImageView$ScaleType.FIT_XY);
             break;
           case 1:
             this.getView().setScaleType(ImageView$ScaleType.CENTER);
             break;
           case 2:
             this.getView().setScaleType(ImageView$ScaleType.CENTER_CROP);
             break;
           case 3:
             this.getView().setScaleType(ImageView$ScaleType.FIT_CENTER);
             break;
           default:
       }
       return;
    }
    public void setImageIconName(String p0,String p1,int p2,V8Function p3){
       if (PatchProxy.isSupport(TKImage.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, this, TKImage.class, "14")) {
          return;
       }
       if (a.c.booleanValue() && p3 != null) {
          p3.setFunctionName("TKImage_setImageIconName");
       }
       this.n().b(this.getView(), p0, p1, p2, new TKImage$b(this, p3));
       return;
    }
    public void setImageLoadCallback(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKImage.class, "1")) {
          return;
       }
       if (a.c.booleanValue() && p0 != null) {
          p0.setFunctionName("TKImage_setImageLoadCallback");
       }
       y.c(this.v);
       this.v = y.b(p0, this);
       return;
    }
    public void setImageUri(String p0,String p1,V8Function p2){
       TKImage tplaceholder;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, TKImage.class, "11")) {
          return;
       }
       if (a.c.booleanValue() && p2 != null) {
          p2.setFunctionName("TKImage_setImageUri");
       }
       JsValueRef jsValueRef = y.b(p2, this);
       if (jsValueRef == null) {
          return;
       }else {
          V8Function v8Function = jsValueRef.get();
          this.uri = p0;
          this.getView().setImageDrawable(null);
          int i = (int)this.getDomNode().c().d().a;
          int i1 = (int)this.getDomNode().c().l().a;
          if (TextUtils.isEmpty(p1)) {
             tplaceholder = this.placeholder;
          }
          this.n().c(this.getView(), this.o(p0), this.o(tplaceholder), this.o(this.fallbackImage), this.blurRadius, i1, i, new p(this, v8Function, jsValueRef));
          return;
       }
    }
    public void setPlaceholder(String p0){
       this.placeholder = p0;
    }
    public void setSrc(String p0){
       this.src = p0;
       if (p0.startsWith("//")) {
          this.src = "https:"+this.src;
       }
       Drawable uDrawable = null;
       this.getView().setImageDrawable(uDrawable);
       if ((this.src).startsWith("http")) {
          if (TextUtils.isEmpty(this.placeholder)) {
             v ov = this.n();
             TKImage tsrc = this.src;
             ImageView imageView = (this.y != null)? new ImageView(this.getContext()): this.getView();
             ov.e(tsrc, imageView, this.blurRadius, new l(this));
          }else {
             p0 = (this.getRootDir()).concat(this.placeholder);
             if (new File(p0).exists()) {
                o.a(new d(this, p0));
             }else {
                v ov1 = this.n();
                ImageView imageView1 = (this.y != null)? new ImageView(this.getContext()): this.getView();
                ov1.f(imageView1, this.src, null, this.blurRadius, new l(this));
             }
          }
       }else if((this.src).startsWith("TKCanvas")){
          if (!TextUtils.isEmpty(this.src)) {
             this.getView().setImageDrawable(f.c(this.src));
          }
       }else {
          p0 = (this.getRootDir()).concat(this.src);
          if (new File(p0).exists()) {
             o.a(new c(this, p0));
          }else {
             this.getView().setImageResource(f.a(this.src, "drawable", uDrawable));
          }
       }
       return;
    }
    public void setTopLeftRadius(int p0){
       TKImage tKImage = TKImage.class;
       if (PatchProxy.isSupport(tKImage) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, tKImage, "25")) {
          return;
       }
       super.setTopLeftRadius(p0);
       this.getView().setTopLeftRoundRadius((float)n.b(p0));
       return;
    }
    public void setTopRightRadius(int p0){
       TKImage tKImage = TKImage.class;
       if (PatchProxy.isSupport(tKImage) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, tKImage, "26")) {
          return;
       }
       super.setTopRightRadius(p0);
       this.getView().setTopRightRoundRadius((float)n.b(p0));
       return;
    }
    public void setUri(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKImage.class, "7")) {
          return;
       }
       this.uri = p0;
       this.s(p0, true, null);
       return;
    }
    public void setUriWith(String p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, TKImage.class, "10")) {
          return;
       }
       this.uri = p0;
       this.getView().setImageDrawable(null);
       this.n().c(this.getView(), this.o(p0), this.o(p1), this.o(p2), this.blurRadius, (int)this.getDomNode().c().l().a, (int)this.getDomNode().c().d().a, new l(this));
       return;
    }
    public void setUriWithTintColor(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TKImage.class, "6")) {
          return;
       }
       this.s(p0, false, p1);
       return;
    }
    public void setUrls(String p0,int p1,int p2){
       TKImage tKImage = TKImage.class;
       if (PatchProxy.isSupport(tKImage) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, TKImage.class, "15")) {
          return;
       }
       this.getView().setImageDrawable(null);
       if (!PatchProxy.isSupport(tKImage) || !PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, TKImage.class, "19")) {
          long l = this.x + 1;
          this.x = l;
          this.r(null, p1, p2);
          q oq = new q(this, l, p1, p2);
          a0.y(new o(p0, new v(this).getType())).T(b.c()).G(a.c()).Q(tKImage);
       }
       return;
    }
    public void setUsedWithCanvas(boolean p0){
       this.y = p0;
    }
    public boolean supportAsyncPrepareView(){
       return true;
    }
    public void unRetainAllJsObj(){
       if (PatchProxy.applyVoid(null, this, TKImage.class, "5")) {
          return;
       }
       super.unRetainAllJsObj();
       y.c(this.v);
       return;
    }
}
