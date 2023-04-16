package com.kuaishou.growth.pendant.coin.task.widget.CountDownTaskPendantV2;
import com.kuaishou.growth.pendant.coin.core.KemPendantV2;
import com.kuaishou.growth.pendant.coin.task.widget.CountDownTaskPendantV2$a;
import nsd.u;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.growth.pendant.coin.task.widget.CountDownTaskPendantV2$b;
import android.util.AttributeSet;
import com.kuaishou.growth.pendant.model.TaskParamsV2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.model.CDNUrl;
import mf0.b;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import rd0.a;
import java.lang.Float;
import java.lang.StringBuilder;
import ld0.c;
import nsd.r0;
import lnc.a1;
import java.util.Arrays;
import java.lang.CharSequence;
import android.view.View;
import ekd.m1;
import com.kuaishou.growth.pendant.ui.widget.PendantAnimImageView;
import java.lang.Boolean;
import ed0.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.growth.pendant.model.TaskReportResponseV2;
import gd0.b;
import qf0.b;
import com.yxcorp.gifshow.widget.density.KwaiFixedScreenWidthFrameLayout;
import ae0.b;
import android.view.View$OnClickListener;
import android.widget.FrameLayout;
import brd.t;
import rd0.k;
import rd0.l;
import erd.g;
import crd.b;
import com.yxcorp.utility.TextUtils;
import android.graphics.Color;
import android.content.res.Resources;
import cw9.c;
import android.graphics.RectF;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.Shape;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import java.lang.Integer;
import android.animation.ValueAnimator;
import com.kuaishou.growth.pendant.coin.task.widget.CountDownTaskPendantV2$c;
import android.animation.ValueAnimator$AnimatorUpdateListener;

public final class CountDownTaskPendantV2 extends KemPendantV2	// class@00061e
{
    public PendantAnimImageView o;
    public KwaiBindableImageView p;
    public TextView q;
    public TextView r;
    public ProgressBar s;
    public int t;
    public a u;
    public final CountDownTaskPendantV2$b v;
    public static final CountDownTaskPendantV2$a w;

    static {
       CountDownTaskPendantV2.w = new CountDownTaskPendantV2$a(null);
    }
    public void CountDownTaskPendantV2(Context p0){
       a.p(p0, "context");
       super(p0);
       this.t = 1;
       this.v = new CountDownTaskPendantV2$b(this);
    }
    public void CountDownTaskPendantV2(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
       this.t = 1;
       this.v = new CountDownTaskPendantV2$b(this);
    }
    public void CountDownTaskPendantV2(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.t = 1;
       this.v = new CountDownTaskPendantV2$b(this);
    }
    public final void A(TaskParamsV2 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CountDownTaskPendantV2.class, "7")) {
          return;
       }
       CDNUrl[] uCDNUrlArray = b.c(this.getMParams());
       CountDownTaskPendantV2 uCountDownTa = 1;
       if (uCDNUrlArray != null) {
          TaskParamsV2 taskParamsV2 = (!uCDNUrlArray.length)? 1: null;
          if (!taskParamsV2) {
             uCountDownTa = null;
          }
       }
       if (!uCountDownTa) {
          uCDNUrlArray = b.c(this.getMParams());
          if (uCDNUrlArray != null) {
             uCountDownTa = this.p;
             if (uCountDownTa != null) {
                uCountDownTa.U(uCDNUrlArray);
                uCountDownTa.setVisibility(0);
             }
          }
       }
       CountDownTaskPendantV2 ts = this.s;
       if (ts != null) {
          ts.setVisibility(8);
       }
       ts = this.r;
       if (ts != null) {
          ts.setVisibility(8);
       }
       ts = this.q;
       if (ts != null) {
          ts.setVisibility(8);
       }
       ts = this.u;
       if (ts != null) {
          ts.i(p0);
       }
       return;
    }
    public void b(float p0){
       Object[] objArray;
       if (PatchProxy.isSupport(CountDownTaskPendantV2.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, CountDownTaskPendantV2.class, "9")) {
          return;
       }
       c.c("onTaskProgressChanged, progress="+p0);
       CountDownTaskPendantV2 tt = this.t;
       String str = "java.lang.String.format\(format, *args\)";
       int i = 1;
       int i1 = 0;
       String str1 = "CommonUtil.string\(R.string.pendant_task_status\)";
       int i2 = 0x7f103bc3;
       if (tt != 2) {
          if (tt != 3) {
             tt = this.s;
             if (tt != null) {
                this.z(tt.getProgress(), (int)(((p0 * 0x3f800000) / (float)this.getMParams().getMTargetCount()) * (float)100));
             }
          }else {
             tt = this.r;
             if (tt != null) {
                String str2 = a1.p(i2);
                a.o(str2, str1);
                objArray = new Object[]{String.valueOf((int)p0),String.valueOf(this.getMParams().getMTargetCount())};
                String str3 = String.format(str2, Arrays.copyOf(objArray, 2));
                a.o(str3, str);
                tt.setText(str3);
             }
             tt = this.s;
             if (tt != null) {
                this.z(tt.getProgress(), (int)(((p0 * 0x3f800000) / (float)this.getMParams().getMTargetCount()) * (float)100));
             }
          }
       }else {
          String str4 = a1.p(i2);
          a.o(str4, str1);
          objArray = new Object[]{String.valueOf((int)p0),String.valueOf(this.getMParams().getMTargetCount())};
          a.o(String.format(str4, Arrays.copyOf(objArray, 2)), str);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CountDownTaskPendantV2.class, "3")) {
          return;
       }
       a.p(p0, "view");
       super.doBindView(p0);
       this.s = m1.f(p0, 0x7f0a32de);
       this.q = m1.f(p0, 0x7f0a2fde);
       this.r = m1.f(p0, 0x7f0a2fdf);
       this.o = m1.f(p0, 0x7f0a2fc8);
       this.p = m1.f(p0, 0x7f0a2fce);
       return;
    }
    public void g(TaskParamsV2 p0,float p1,boolean p2){
       if (PatchProxy.isSupport(CountDownTaskPendantV2.class) && PatchProxy.applyVoidThreeRefs(p0, Float.valueOf(p1), Boolean.valueOf(p2), this, CountDownTaskPendantV2.class, "5")) {
          return;
       }
       a.p(p0, "taskParamsV2");
       super.g(p0, p1, p2);
       this.getMBuilder().s(p0);
       return;
    }
    public final int getCountDownTaskProgress(){
       Object obj = PatchProxy.apply(null, this, CountDownTaskPendantV2.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.getMParams().getMCurrentCount();
    }
    public void j(TaskReportResponseV2 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CountDownTaskPendantV2.class, "6")) {
          return;
       }
       a.p(p0, "responseV2");
       super.j(p0);
       c.c("onTaskComplete");
       CDNUrl[] uCDNUrlArray = b.d(this.getMParams());
       int i = 0;
       if (uCDNUrlArray != null) {
          uCDNUrlArray = (!uCDNUrlArray.length)? 1: 0;
          if (!uCDNUrlArray) {
          label_002f :
             if (!i) {
                this.A(p0.getMNextTaskParamsV2());
             }
             return;
          }
       }
       i = 1;
       goto label_002f ;
    }
    public void o(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CountDownTaskPendantV2.class, "1")) {
          return;
       }
       a.p(p0, "context");
       super.o(p0);
       this.f(this.v);
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, CountDownTaskPendantV2.class, "8")) {
          return;
       }
       super.onDetachedFromWindow();
       CountDownTaskPendantV2 tu = this.u;
       if (tu != null) {
          tu.f();
       }
       this.k(this.v);
       return;
    }
    public void p(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CountDownTaskPendantV2.class, "2")) {
          return;
       }
       a.p(p0, "context");
       super.p(p0);
       if (b.j()) {
          this.v();
       }
       return;
    }
    public final void v(){
       TaskParamsV2 taskParamsV2;
       a a;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, CountDownTaskPendantV2.class, "4")) {
          return;
       }
       Context realContext = this.getRealContext();
       a.o(realContext, "realContext");
       a uoa = new a(realContext, this.o, this.getMParams(), null, 8, null);
       this.u = v0;
       this.setOnClickListener(new b(this.getMParams()));
       CDNUrl[] obj = PatchProxy.apply(objArray, this, CountDownTaskPendantV2.class, "16");
       boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): b.s(this.getMParams());
       CDNUrl[] uCDNUrlArray = null;
       String str = 1;
       if (b) {
          c.c("init CountDownPendantView, task is complete");
          obj = b.d(this.getMParams());
          if (obj != null) {
             b = (!obj.length)? 1: 0;
             if (!b) {
                taskParamsV2 = null;
             label_0076 :
                if (!taskParamsV2) {
                   this.A(objArray);
                   return;
                }
             }
          }
          taskParamsV2 = 1;
          goto label_0076 ;
       }
       if (this.getMParams().getMWidgetStyle() > 0) {
          this.t = this.getMParams().getMWidgetStyle();
       }
       CountDownTaskPendantV2 tt = this.t;
       if (tt != str) {
          String str1 = 8;
          if (tt != 2) {
             if (tt != 3) {
                this.y();
             }else if(PatchProxy.applyVoid(objArray, this, CountDownTaskPendantV2.class, "13")){
                tt = this.o;
                if (tt != null) {
                   tt.setFailureImage(R.drawable.arg_RES_7f0823ed);
                }
                tt = this.p;
                if (tt != null) {
                   tt.setVisibility(str1);
                }
                this.x();
                this.w();
                this.b((float)this.getCountDownTaskProgress());
             }
          }else if(PatchProxy.applyVoid(objArray, this, CountDownTaskPendantV2.class, "12")){
             tt = this.o;
             if (tt != null) {
                tt.setFailureImage(R.drawable.arg_RES_7f0823ed);
             }
             tt = this.p;
             if (tt != null) {
                tt.setVisibility(str1);
             }
             tt = this.s;
             if (tt != null) {
                tt.setVisibility(4);
             }
             this.x();
             this.b((float)this.getCountDownTaskProgress());
          }
       }else {
          this.y();
       }
       tt = this.u;
       if (tt != null && !PatchProxy.applyVoid(objArray, tt, a.class, "9")) {
          a h = tt.h;
          if (h != null) {
             a = tt.a;
             if (a == null || !a.length()) {
                uCDNUrlArray = 1;
             }
             if (uCDNUrlArray) {
                tt.a(h, tt.c());
             }else {
                tt.d(tt.a, "doing").subscribe(new k(h, tt), new l(h, tt));
             }
          }
       }
       return;
    }
    public final void w(){
       Paint paint;
       CountDownTaskPendantV2 ts1;
       String str = "progressShapeDrawable.paint";
       String str1 = "backgroundDrawable.paint";
       if (PatchProxy.applyVoid(null, this, CountDownTaskPendantV2.class, "17")) {
          return;
       }
       CountDownTaskPendantV2 ts = this.s;
       if (ts != null) {
          ts.setVisibility(0);
          ts.setMax(100);
       }
       if (!TextUtils.x(this.getMParams().getMProgressColor()) && !TextUtils.x(this.getMParams().getMProgressBgColor())) {
          try{
             float f = (float)c.b(this.getResources(), 0x7f07042b);
             RectF rectF = new RectF(0, 0, 0, 0);
             float[] uofloatArray = new float[]{f,f,f,f,f,f,f,f};
             ShapeDrawable shapeDrawabl = new ShapeDrawable(new RoundRectShape(uofloatArray, rectF, uofloatArray));
             paint = shapeDrawabl.getPaint();
             a.o(paint, str1);
             paint.setColor(Color.parseColor(this.getMParams().getMProgressBgColor()));
             Paint paint1 = shapeDrawabl.getPaint();
             a.o(paint1, str1);
             paint1.setStyle(Paint$Style.FILL);
             ShapeDrawable shapeDrawabl1 = new ShapeDrawable(new RoundRectShape(uofloatArray, rectF, uofloatArray));
             Paint paint2 = shapeDrawabl1.getPaint();
             a.o(paint2, str);
             paint2.setColor(Color.parseColor(this.getMParams().getMProgressColor()));
             paint2 = shapeDrawabl1.getPaint();
             a.o(paint2, str);
             paint2.setStyle(Paint$Style.FILL);
             Drawable[] uDrawableArr = new Drawable[]{shapeDrawabl,new ClipDrawable(shapeDrawabl1, 3, 1)};
             LayerDrawable layerDrawabl = new LayerDrawable(uDrawableArr);
             layerDrawabl.setId(0, R.id.background);
             layerDrawabl.setId(1, R.id.progress);
             ts1 = this.s;
             if (ts1 != null) {
                ts1.setProgressDrawable(layerDrawabl);
             }
          }catch(java.lang.Exception e0){
             ts1 = this.s;
             if (ts1 != null) {
                ts1.setProgressDrawable(this.getResources().getDrawable(R.drawable.arg_RES_7f0823e8));
             }
          }
       }
    }
    public final void x(){
       if (PatchProxy.applyVoid(null, this, CountDownTaskPendantV2.class, "14")) {
          return;
       }
       CountDownTaskPendantV2 tr = this.r;
       int i = 0;
       if (tr != null) {
          tr.setVisibility(i);
       }
       String mTaskDesc = this.getMParams().getMTaskDesc();
       tr = (mTaskDesc == null || !mTaskDesc.length())? 1: null;
       if (!tr) {
          tr = this.q;
          if (tr != null) {
             tr.setVisibility(i);
          }
          tr = this.q;
          if (tr != null) {
             tr.setText(this.getMParams().getMTaskDesc());
          }
       }
       mTaskDesc = this.getMParams().getMTextColor();
       if (mTaskDesc == null || !mTaskDesc.length()) {
          i = 1;
       }
       if (i) {
          return;
       }else {
          try{
             int i1 = Color.parseColor(this.getMParams().getMTextColor());
             CountDownTaskPendantV2 tq = this.q;
             if (tq != null) {
                tq.setTextColor(i1);
             }
             tq = this.r;
             if (tq != null) {
                tq.setTextColor(i1);
             }
             return;
          }catch(java.lang.Exception e0){
          }
       }
    }
    public final void y(){
       if (PatchProxy.applyVoid(null, this, CountDownTaskPendantV2.class, "11")) {
          return;
       }
       CountDownTaskPendantV2 to = this.o;
       if (to != null) {
          to.setFailureImage(R.drawable.arg_RES_7f0823eb);
       }
       to = this.p;
       if (to != null) {
          to.setVisibility(8);
       }
       to = this.q;
       if (to != null) {
          to.setVisibility(8);
       }
       to = this.r;
       if (to != null) {
          to.setVisibility(8);
       }
       this.w();
       this.b((float)this.getCountDownTaskProgress());
       return;
    }
    public final void z(int p0,int p1){
       if (PatchProxy.isSupport(CountDownTaskPendantV2.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, CountDownTaskPendantV2.class, "10")) {
          return;
       }
       int[] ointArray = new int[]{p0,p1};
       ValueAnimator valueAnimato = ValueAnimator.ofInt(ointArray);
       valueAnimato.addUpdateListener(new CountDownTaskPendantV2$c(this));
       a.o(valueAnimato, "animator");
       valueAnimato.setDuration(240);
       valueAnimato.start();
       return;
    }
}
