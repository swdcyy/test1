package com.kuaishou.live.common.gzone.pendant.LiveScaleLinearLayout;
import gz1.a;
import ya1.m;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import ll8.c$b;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import gz1.c;
import java.util.Objects;
import com.kuaishou.live.common.gzone.pendant.LiveScaleLinearLayout$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.view.View$MeasureSpec;
import android.graphics.Rect;
import java.lang.Float;

public class LiveScaleLinearLayout extends LinearLayout implements a, m	// class@0017dc
{
    public c b;
    public float c;

    public void LiveScaleLinearLayout(Context p0){
       super(p0, null);
    }
    public void LiveScaleLinearLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveScaleLinearLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (!PatchProxy.isSupport(LiveScaleLinearLayout.class) || !PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, LiveScaleLinearLayout.class, "1")) {
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.R2);
          this.c = typedArray.getFloat(0, 0x3f800000);
          typedArray.recycle();
       }
       this.e();
       return;
    }
    public void a(View p0,int p1,ViewGroup$LayoutParams p2){
       if (PatchProxy.isSupport(LiveScaleLinearLayout.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, LiveScaleLinearLayout.class, "11")) {
          return;
       }
       super.addView(p0, p1, p2);
       return;
    }
    public void addView(View p0,int p1,ViewGroup$LayoutParams p2){
       if (PatchProxy.isSupport(LiveScaleLinearLayout.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, LiveScaleLinearLayout.class, "6")) {
          return;
       }
       c help = this.getHelp();
       Objects.requireNonNull(help);
       if (!PatchProxy.isSupport(c.class) || !PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, help, c.class, "4")) {
          if (p0 == help.b) {
             help.c.a(p0, p1, p2);
          }else if(!PatchProxy.applyVoid(null, help, c.class, "6") && help.b == null){
             ViewGroup viewGroup = help.a(help.a.getContext());
             help.b = viewGroup;
             viewGroup.setPivotX(0);
             help.b.setPivotY(0);
             help.b.setScaleX(help.d);
             help.b.setScaleY(help.d);
             if (help.a.getLayoutParams() != null) {
                help.a.addView(help.b, new ViewGroup$LayoutParams(help.a.getLayoutParams().width, help.a.getLayoutParams().height));
             }else {
                help.a.addView(help.b);
             }
             help.b(help.b);
          }
          help.b.addView(p0, p1, p2);
       }
       return;
    }
    public void b(int p0,int p1){
       if (PatchProxy.isSupport(LiveScaleLinearLayout.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, LiveScaleLinearLayout.class, "10")) {
          return;
       }
       super.setMeasuredDimension(p0, p1);
       return;
    }
    public void c(int p0,int p1){
       if (PatchProxy.isSupport(LiveScaleLinearLayout.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, LiveScaleLinearLayout.class, "9")) {
          return;
       }
       super.onMeasure(p0, p1);
       return;
    }
    public void d(ViewGroup$LayoutParams p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveScaleLinearLayout.class, "12")) {
          return;
       }
       super.setLayoutParams(p0);
       return;
    }
    public final void e(){
       if (PatchProxy.applyVoid(null, this, LiveScaleLinearLayout.class, "2")) {
          return;
       }
       if (this.b != null) {
          return;
       }
       this.b = new LiveScaleLinearLayout$a(this, this, this);
       return;
    }
    public c getHelp(){
       Object obj = PatchProxy.apply(null, this, LiveScaleLinearLayout.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.b == null) {
          this.e();
       }
       return this.b;
    }
    public float getScale(){
       Object obj = PatchProxy.apply(null, this, LiveScaleLinearLayout.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.b.d;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(LiveScaleLinearLayout.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, LiveScaleLinearLayout.class, "3")) {
          return;
       }
       c help = this.getHelp();
       Objects.requireNonNull(help);
       c uoc = c.class;
       if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), help, uoc, "1")) {
          p0 = 0;
          help.c.c(View$MeasureSpec.makeMeasureSpec(p0, p0), View$MeasureSpec.makeMeasureSpec(p0, p0));
          p1 = help.a.getMeasuredWidth();
          int measuredHeig = help.a.getMeasuredHeight();
          if (help.a.getChildCount() > 0) {
             c e = help.e;
             uoc = help.e;
             help.c.b((((int)((float)p1 * help.a.getChildAt(p0).getScaleX()) + e.left) + e.right), (((int)((float)measuredHeig * help.a.getChildAt(p0).getScaleY()) + uoc.top) + uoc.bottom));
             help.a.forceLayout();
          }
       }
       return;
    }
    public void setLayoutParams(ViewGroup$LayoutParams p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveScaleLinearLayout.class, "7")) {
          return;
       }
       c help = this.getHelp();
       Objects.requireNonNull(help);
       if (!PatchProxy.applyVoidOneRefs(p0, help, c.class, "5")) {
          c b = help.b;
          if (b != null && b.getLayoutParams() != null) {
             help.b.getLayoutParams().height = p0.height;
             help.b.getLayoutParams().width = p0.width;
          }
          help.c.d(p0);
       }
       return;
    }
    public void setOrientation(int p0){
       if (PatchProxy.isSupport(LiveScaleLinearLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveScaleLinearLayout.class, "8")) {
          return;
       }
       super.setOrientation(p0);
       if (this.getHelp().b != null) {
          this.getHelp().b.setOrientation(p0);
       }
       return;
    }
    public void setScale(float p0){
       if (PatchProxy.isSupport(LiveScaleLinearLayout.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, LiveScaleLinearLayout.class, "14")) {
          return;
       }
       this.b.c((p0 * this.c));
       return;
    }
    public void setScaleX(float p0){
       if (PatchProxy.isSupport(LiveScaleLinearLayout.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, LiveScaleLinearLayout.class, "4")) {
          return;
       }
       c help = this.getHelp();
       p0 = p0 * this.c;
       Objects.requireNonNull(help);
       c uoc = c.class;
       if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidOneRefs(Float.valueOf(p0), help, uoc, "2")) {
          help.c(p0);
       }
       return;
    }
    public void setScaleY(float p0){
       if (PatchProxy.isSupport(LiveScaleLinearLayout.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, LiveScaleLinearLayout.class, "5")) {
          return;
       }
       c help = this.getHelp();
       p0 = p0 * this.c;
       Objects.requireNonNull(help);
       c uoc = c.class;
       if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidOneRefs(Float.valueOf(p0), help, uoc, "3")) {
          help.c(p0);
       }
       return;
    }
}
