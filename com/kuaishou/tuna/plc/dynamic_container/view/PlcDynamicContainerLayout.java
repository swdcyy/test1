package com.kuaishou.tuna.plc.dynamic_container.view.PlcDynamicContainerLayout;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Paint;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ll8.c$b;
import android.content.res.TypedArray;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Xfermode;
import ny4.c;
import com.kuaishou.tuna.plc.dynamic_container.view.a$a;
import com.kuaishou.tuna.plc.dynamic_container.view.a;
import java.lang.Float;
import android.graphics.Path;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import android.graphics.RectF;
import java.lang.Boolean;
import android.graphics.Canvas;
import android.view.ViewGroup;
import android.view.MotionEvent;
import ny4.b;
import com.kuaishou.tuna.plc.dynamic_container.view.PlcDynamicContainerLayout$a;
import android.view.ViewOutlineProvider;
import java.lang.Number;
import android.view.View;
import android.os.Build$VERSION;

public class PlcDynamicContainerLayout extends RelativeLayout	// class@001007
{
    public Paint b;
    public Path c;
    public int d;
    public b e;
    public a f;

    public void PlcDynamicContainerLayout(Context p0){
       super(p0, null);
    }
    public void PlcDynamicContainerLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void PlcDynamicContainerLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = new Paint();
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PlcDynamicContainerLayout.class, "1")) {
       }else if(p1 == null){
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.W3);
          this.d = typedArray.getDimensionPixelSize(0, 0);
          typedArray.recycle();
          this.b.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.DST_IN));
          this.f = new c();
       }
       return;
    }
    public void a(a$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcDynamicContainerLayout.class, "2")) {
          return;
       }
       this.f.s(p0);
       return;
    }
    public void b(float p0){
       if (PatchProxy.isSupport(PlcDynamicContainerLayout.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, PlcDynamicContainerLayout.class, "13")) {
          return;
       }
       this.f.b(p0);
       return;
    }
    public final Path c(int p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7){
       Path obj;
       if (PatchProxy.isSupport(PlcDynamicContainerLayout.class)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5),Integer.valueOf(p6),Integer.valueOf(p7)};
          obj = PatchProxy.apply(objArray, this, PlcDynamicContainerLayout.class, "29");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new Path();
       obj.moveTo(0, (float)p4);
       if (p4) {
          obj.arcTo(new RectF(0, 0, (float)(p4 * 2), (float)(p4 * 2)), -180.00f, 90.00f);
       }
       obj.lineTo((float)(p2 - p5), 0);
       if (p5) {
          p5 = p5 * 2;
          obj.arcTo(new RectF((float)(p2 - p5), 0, (float)p2, (float)p5), -90.00f, 90.00f);
       }
       float f = (float)p2;
       obj.lineTo(f, (float)(p3 - p6));
       if (p6) {
          p6 = p6 * 2;
          obj.arcTo(new RectF((float)(p2 - p6), (float)(p3 - p6), f, (float)p3), 0, 90.00f);
       }
       f = (float)p3;
       obj.lineTo((float)p7, f);
       if (p7) {
          p7 = p7 * 2;
          obj.arcTo(new RectF(0, (float)(p3 - p7), (float)p7, f), 90.00f, 90.00f);
       }
       obj.close();
       obj.offset((float)p0, (float)p1);
       return obj;
    }
    public boolean d(){
       Object obj = PatchProxy.apply(null, this, PlcDynamicContainerLayout.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.getDragStatus2() == 5 || this.getDragStatus2() == 2)? true: false;
       return b;
    }
    public void dispatchDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcDynamicContainerLayout.class, "26")) {
          return;
       }
       PlcDynamicContainerLayout tc = this.c;
       if (tc != null) {
          p0.clipPath(tc);
       }
       super.dispatchDraw(p0);
       return;
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       PlcDynamicContainerLayout obj = PatchProxy.applyOneRefs(p0, this, PlcDynamicContainerLayout.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.e;
       if (obj != null) {
          obj.dispatchTouchEvent(p0);
       }
       return super.dispatchTouchEvent(p0);
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, PlcDynamicContainerLayout.class, "4")) {
          return;
       }
       this.f(true);
       return;
    }
    public void f(boolean p0){
       if (PatchProxy.isSupport(PlcDynamicContainerLayout.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PlcDynamicContainerLayout.class, "5")) {
          return;
       }
       PlcDynamicContainerLayout tf = this.f;
       tf.r(tf.q(), p0);
       return;
    }
    public final void g(){
       if (PatchProxy.applyVoid(null, this, PlcDynamicContainerLayout.class, "28")) {
          return;
       }
       PlcDynamicContainerLayout$a uoa = new PlcDynamicContainerLayout$a((float)this.d, 0, 0, this.getWidth(), (this.d + this.getHeight()));
       this.setOutlineProvider(v0);
       this.setClipToOutline(true);
       return;
    }
    public float getAnchorTranslationY(){
       Object obj = PatchProxy.apply(null, this, PlcDynamicContainerLayout.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.f.getAnchorY();
    }
    public int getDragStatus2(){
       Object obj = PatchProxy.apply(null, this, PlcDynamicContainerLayout.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.f.f();
    }
    public int getFixedDragStatus(){
       Object obj = PatchProxy.apply(null, this, PlcDynamicContainerLayout.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.f.q();
    }
    public boolean h(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PlcDynamicContainerLayout.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return super.onInterceptTouchEvent(p0);
    }
    public boolean i(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PlcDynamicContainerLayout.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return super.onTouchEvent(p0);
    }
    public final void j(){
       if (PatchProxy.applyVoid(null, this, PlcDynamicContainerLayout.class, "21")) {
          return;
       }
       if (Build$VERSION.SDK_INT >= 23) {
          this.g();
       }else {
          PlcDynamicContainerLayout td = this.d;
          this.c = this.c(0, 0, this.getMeasuredWidth(), this.getMeasuredHeight(), td, td, 0, 0);
       }
       return;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       PlcDynamicContainerLayout obj = PatchProxy.applyOneRefs(p0, this, PlcDynamicContainerLayout.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.e;
       obj = (obj == null || !obj.a(p0))? 1: 0;
       if (obj) {
          return super.onInterceptTouchEvent(p0);
       }else {
          return true;
       }
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(PlcDynamicContainerLayout.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, PlcDynamicContainerLayout.class, "20")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       this.j();
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       PlcDynamicContainerLayout obj = PatchProxy.applyOneRefs(p0, this, PlcDynamicContainerLayout.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.e;
       if (obj == null) {
          return super.onTouchEvent(p0);
       }
       return obj.onTouchEvent(p0);
    }
    public void setContainerStatus(int p0){
       if (PatchProxy.isSupport(PlcDynamicContainerLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, PlcDynamicContainerLayout.class, "9")) {
          return;
       }
       this.f.g(p0);
       return;
    }
    public void setTopRadius(int p0){
       if (PatchProxy.isSupport(PlcDynamicContainerLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, PlcDynamicContainerLayout.class, "27")) {
          return;
       }
       if (this.d == p0) {
          return;
       }
       this.d = p0;
       this.j();
       this.invalidate();
       return;
    }
}
