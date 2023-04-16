package com.tachikoma.component.common.resource.TKImageResource;
import com.tachikoma.core.component.TKBaseNativeModule;
import gx4.f;
import java.lang.String;
import java.lang.Number;
import iq8.n;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.tkruntime.v8.V8Object;
import tx4.y;
import com.tkruntime.v8.V8Function;
import com.tachikoma.core.bridge.d;
import java.lang.Throwable;
import wp8.a;
import java.lang.Integer;
import crd.b;
import android.graphics.Bitmap;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import java.util.HashMap;
import android.content.Context;
import brd.a0;
import com.tachikoma.core.utility.b;
import brd.z;
import io.reactivex.android.schedulers.a;
import com.tachikoma.component.common.resource.TKImageResource$a;
import com.tachikoma.component.common.resource.TKImageResource$b;
import erd.g;
import com.tachikoma.core.component.TKBaseNativeModule$DestroyReason;
import java.lang.Boolean;
import com.tachikoma.component.common.resource.TKImageResource$c;
import java.lang.Runnable;
import iq8.x;
import com.tkruntime.v8.JsValueRef;
import com.tkruntime.v8.V8Value;

public class TKImageResource extends TKBaseNativeModule	// class@000cea
{
    public String f;
    public b g;
    public int h;
    public int i;
    public JsValueRef j;
    public JsValueRef k;
    public Bitmap mBitmap;
    public int mHeight;
    public int mHeightPx;
    public int mWidth;
    public int mWidthPx;
    public V8Function onFail;
    public V8Function onSuccess;

    public void TKImageResource(f p0){
       int i;
       super(p0);
       this.h = Integer.MAX_VALUE;
       this.i = Integer.MAX_VALUE;
       f b = this.mInitParams.b;
       if (b == null) {
          return;
       }
       if (b.length > 0) {
          i = 0;
          if (b[i] instanceof String) {
             this.f = b[i];
          }
       }
       int i1 = 1;
       if (b.length > i1 && b[i1] instanceof Number) {
          i = n.b(b[i1].intValue());
          this.h = i;
          if (i <= 0) {
             this.h = Integer.MAX_VALUE;
          }
       }
       if (b.length > 2 && b[2] instanceof Number) {
          int i2 = n.b(b[2].intValue());
          this.i = i2;
          if (i2 <= 0) {
             this.i = Integer.MAX_VALUE;
          }
       }
       return;
    }
    public void callOnFail(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKImageResource.class, "5")) {
          return;
       }
       this.g = null;
       if (!y.a(this.onFail)) {
          return;
       }
       Object[] objArray = new Object[]{p0};
       this.onFail.call(null, objArray);
       return;
    }
    public void callOnSuccess(int p0,int p1){
       TKImageResource tKImageResou = TKImageResource.class;
       if (PatchProxy.isSupport(tKImageResou) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, tKImageResou, "6")) {
          return;
       }
       if (!y.a(this.onSuccess)) {
          return;
       }
       Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1)};
       this.onSuccess.call(null, objArray);
       return;
    }
    public void destroyOnMainThread(){
       if (PatchProxy.applyVoid(null, this, TKImageResource.class, "9")) {
          return;
       }
       this.mBitmap = null;
       TKImageResource tg = this.g;
       if (tg != null) {
          tg.dispose();
       }
       return;
    }
    public Bitmap getBitmap(){
       return this.mBitmap;
    }
    public int getHeight(){
       return this.mHeightPx;
    }
    public Map getSize(){
       HashMap obj = PatchProxy.apply(null, this, TKImageResource.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       obj.put("width", Integer.valueOf(this.mWidth));
       obj.put("height", Integer.valueOf(this.mHeight));
       return obj;
    }
    public int getWidth(){
       return this.mWidthPx;
    }
    public void load(){
       if (PatchProxy.applyVoid(null, this, TKImageResource.class, "3")) {
          return;
       }
       if (this.g != null) {
          return;
       }
       a0 uoa0 = b.g(this.getContext(), this.f, this.getTKJSContext().e(), this.getRootDir(), this.h, this.i);
       if (uoa0 == null) {
          this.callOnFail("Uri is null or empty");
          return;
       }else {
          this.g = uoa0.G(a.c()).R(new TKImageResource$a(this), new TKImageResource$b(this));
          return;
       }
    }
    public void onDestroy(TKBaseNativeModule$DestroyReason p0,boolean p1){
       TKImageResource tKImageResou = TKImageResource.class;
       if (PatchProxy.isSupport(tKImageResou) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, tKImageResou, "8")) {
          return;
       }
       super.onDestroy(p0, p1);
       if (p1) {
          this.destroyOnMainThread();
       }else {
          x.f(new TKImageResource$c(this));
       }
       return;
    }
    public void setOnFail(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKImageResource.class, "2")) {
          return;
       }
       y.c(this.k);
       JsValueRef jsValueRef = y.b(p0, this);
       this.k = jsValueRef;
       this.onFail = jsValueRef.get();
       return;
    }
    public void setOnSuccess(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKImageResource.class, "1")) {
          return;
       }
       y.c(this.j);
       JsValueRef jsValueRef = y.b(p0, this);
       this.j = jsValueRef;
       this.onSuccess = jsValueRef.get();
       return;
    }
    public void unRetainAllJsObj(){
       if (PatchProxy.applyVoid(null, this, TKImageResource.class, "7")) {
          return;
       }
       super.unRetainAllJsObj();
       y.c(this.j);
       y.c(this.k);
       return;
    }
}
