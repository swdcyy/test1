package com.tachikoma.core.canvas.TKCanvas;
import com.tachikoma.core.component.e;
import gx4.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Stack;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.net.Uri;
import com.tkruntime.v8.V8Function;
import com.tkruntime.v8.V8Value;
import com.tkruntime.v8.JsValueRef;
import tx4.y;
import com.tkruntime.v8.V8Object;
import com.tachikoma.core.canvas.a;
import java.lang.Runnable;
import iq8.o;
import zp8.a;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.ImageView$ScaleType;
import qo8.f;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import qo8.c;
import java.lang.StringBuilder;
import android.graphics.Paint;
import iq8.n;
import android.graphics.Matrix;
import android.text.TextPaint;
import android.graphics.Path;
import java.lang.Number;
import java.lang.Integer;
import ro8.m;
import qo8.d;
import iq8.x;
import ro8.b;
import java.util.List;
import java.util.Iterator;
import ro8.a;
import java.util.Objects;
import java.lang.Boolean;
import qo8.a;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import android.graphics.drawable.Drawable;
import com.tachikoma.core.component.TKBaseNativeModule$DestroyReason;
import com.tachikoma.core.canvas.TKCanvas$a;
import java.util.HashMap;
import android.graphics.Bitmap$Config;

public class TKCanvas extends e	// class@000d4a
{
    public Path A;
    public TextPaint B;
    public Matrix C;
    public int D;
    public Stack E;
    public m F;
    public final int v;
    public Canvas w;
    public Bitmap x;
    public Paint y;
    public Paint z;

    public void TKCanvas(f p0){
       super(p0);
       this.v = 1;
       this.D = 1;
       if (PatchProxy.applyVoid(null, this, TKCanvas.class, "1")) {
       }else {
          this.E = new Stack();
       }
       return;
    }
    public static String getIdFromTKCanvasScheme(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TKCanvas.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.isEmpty(p0)) {
          return Uri.parse(p0).getQueryParameter("id");
       }
       return "";
    }
    public void asyncDraw(String p0,V8Function p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TKCanvas.class, "13")) {
          return;
       }
       JsValueRef jsValueRef = y.b(p1, this);
       if (this.w != null && (this.x == null || jsValueRef == null)) {
          a.h("Canvas", "asyncDraw canvas or bitmap is null , stop draw");
          return;
       }else {
          V8Function v8Function = jsValueRef.get();
          if (y.a(v8Function)) {
             o.a(new a(this, v8Function, p0, jsValueRef));
          }
          return;
       }
    }
    public View createViewInstance(Context p0){
       return this.createViewInstance(p0);
    }
    public ImageView createViewInstance(Context p0){
       ImageView obj = PatchProxy.applyOneRefs(p0, this, TKCanvas.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ImageView(p0);
       obj.setScaleType(ImageView$ScaleType.CENTER_INSIDE);
       return obj;
    }
    public void destroyOnUIThread(){
       if (PatchProxy.applyVoid(null, this, TKCanvas.class, "20")) {
          return;
       }
       f.a(String.valueOf(this.hashCode()));
       if (this.w != null) {
          this.w = null;
       }
       TKCanvas tx = this.x;
       if (tx != null && !tx.isRecycled()) {
          this.x.recycle();
       }
       return;
    }
    public Canvas getCanvas(){
       return this.w;
    }
    public void getDrawDataAsBase64(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKCanvas.class, "16")) {
          return;
       }
       JsValueRef jsValueRef = y.b(p0, this);
       if (jsValueRef == null) {
          return;
       }
       V8Function v8Function = jsValueRef.get();
       if (y.a(v8Function)) {
          BitmapDrawable uBitmapDrawa = f.c(String.valueOf(this.hashCode()));
          if (uBitmapDrawa != null && uBitmapDrawa.getBitmap() != null) {
             o.a(new c(this, v8Function, uBitmapDrawa, jsValueRef));
          }
       }
       return;
    }
    public String getDrawDataId(){
       Object obj = PatchProxy.apply(null, this, TKCanvas.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "TKCanvas://image?id="+String.valueOf(this.hashCode());
    }
    public Paint getLinePaint(){
       Paint obj = PatchProxy.apply(null, this, TKCanvas.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.y == null) {
          obj = new Paint();
          this.y = obj;
          obj.setAntiAlias(true);
          this.y.setStrokeWidth((float)n.b(true));
       }
       return this.y;
    }
    public Matrix getMatrix(){
       Object obj = PatchProxy.apply(null, this, TKCanvas.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.C == null) {
          this.C = new Matrix();
       }
       return this.C;
    }
    public Paint getPaint(){
       TextPaint obj = PatchProxy.apply(null, this, TKCanvas.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.B == null) {
          obj = new TextPaint();
          this.B = obj;
          obj.setAntiAlias(true);
       }
       return this.B;
    }
    public Path getPath(){
       return this.A;
    }
    public int getSaveAndRestoreId(){
       Object obj = PatchProxy.apply(null, this, TKCanvas.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (!this.E.empty()) {
          return this.E.pop().intValue();
       }
       return 0;
    }
    public m getSaveAndStoreMgr(){
       Object obj = PatchProxy.apply(null, this, TKCanvas.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.F == null) {
          this.F = new m(this);
       }
       return this.F;
    }
    public Paint getShadowPaint(){
       Paint obj = PatchProxy.apply(null, this, TKCanvas.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.z == null) {
          obj = new Paint();
          this.z = obj;
          obj.setAntiAlias(true);
       }
       return this.z;
    }
    public final void m(String p0,JsValueRef p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TKCanvas.class, "17")) {
          return;
       }
       x.f(new d(this, p1.get(), p0, p1));
       return;
    }
    public final void n(String p0){
       b a;
       boolean b;
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, TKCanvas.class, "11")) {
          return;
       }
       String str = "Canvas";
       if (TextUtils.isEmpty(p0)) {
          a.h(str, "draw command is empty");
          return;
       }else {
          TKCanvas tx = this.x;
          if (tx == null || tx.isRecycled()) {
             a.h(str, "draw bitmap is unable, command is: "+p0);
             return;
          }else {
             b uob1 = new b(p0, this);
             p0 = "2";
             if (!PatchProxy.applyVoid(null, uob1, uob, p0)) {
                b a1 = uob1.a;
                if (a1 != null && a1.size() > 0) {
                   Iterator iterator = uob1.a.iterator();
                   while (iterator.hasNext()) {
                      a uoa = iterator.next();
                      Objects.requireNonNull(uoa);
                      a uoa1 = a.class;
                      if (PatchProxy.applyVoid(null, uoa, uoa1, "1")) {
                         continue ;
                      }else {
                         Object obj = PatchProxy.apply(null, uoa, uoa1, p0);
                         if (obj != PatchProxyResult.class) {
                            b = obj.booleanValue();
                         }else if(!TextUtils.isEmpty(uoa.a()) && (!TextUtils.isEmpty(uoa.a) && (uoa.a).startsWith(uoa.a()))){
                            b = true;
                         }else {
                            b = false;
                         }
                         if (b) {
                            uoa.a = (uoa.a).replaceAll("#splita", ";");
                            uoa.b();
                         }
                      }
                   }
                }
             }
             if (!PatchProxy.applyVoid(null, uob1, uob, "3")) {
                a = uob1.a;
                if (a != null && a.size() > 0) {
                   uob1.a.clear();
                   uob1.a = null;
                }
             }
             if (x.c()) {
                this.o();
             }else {
                x.f(new a(this));
             }
             return;
          }
       }
    }
    public final void o(){
       if (PatchProxy.applyVoid(null, this, TKCanvas.class, "12")) {
          return;
       }
       TKCanvas tx = this.x;
       if (tx != null && !tx.isRecycled()) {
          BitmapDrawable uBitmapDrawa = new BitmapDrawable(this.x);
          uBitmapDrawa.setTargetDensity(c.c(this.getView().getResources()));
          this.getView().setImageDrawable(uBitmapDrawa);
          f.e(String.valueOf(this.hashCode()), uBitmapDrawa);
       }
       return;
    }
    public void onDestroy(TKBaseNativeModule$DestroyReason p0,boolean p1){
       TKCanvas tKCanvas = TKCanvas.class;
       if (PatchProxy.isSupport(tKCanvas) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, tKCanvas, "19")) {
          return;
       }
       super.onDestroy(p0, p1);
       if (p1) {
          this.destroyOnUIThread();
       }else {
          x.f(new TKCanvas$a(this));
       }
       return;
    }
    public void setPath(Path p0){
       this.A = p0;
    }
    public void setStyle(HashMap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKCanvas.class, "9")) {
          return;
       }
       this.x = Bitmap.createBitmap(n.b(p0.get("width").intValue()), n.b(p0.get("height").intValue()), Bitmap$Config.ARGB_8888);
       if (this.x != null) {
          this.w = new Canvas(this.x);
       }
       super.setStyle(p0);
       return;
    }
    public boolean supportAsyncPrepareView(){
       return true;
    }
    public void syncDraw(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKCanvas.class, "10")) {
          return;
       }
       if (this.w == null || this.x == null) {
          a.h("Canvas", "canvas or bitmap is null , stop draw");
          return;
       }else {
          this.n(p0);
          return;
       }
    }
    public int updateSaveAndRestoreId(){
       Object obj = PatchProxy.apply(null, this, TKCanvas.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.D + 1;
       this.D = i;
       this.E.push(Integer.valueOf(i));
       return this.D;
    }
}
