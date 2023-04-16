package com.kwai.yoda.view.YodaWebTitleBar;
import com.kwai.yoda.view.YodaTitleBar;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.res.Resources;
import cw9.c;
import com.kwai.yoda.model.ButtonParams$PositionId;
import android.view.View;
import android.widget.RelativeLayout$LayoutParams;
import com.kwai.yoda.view.YodaWebTitleBar$a;
import java.lang.Enum;
import android.widget.RelativeLayout;
import android.view.ViewGroup$LayoutParams;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.widget.TextView;
import java.lang.Math;
import android.view.ViewGroup;
import android.view.ViewParent;

public class YodaWebTitleBar extends YodaTitleBar	// class@0012fe
{
    public Context b;
    public int c;
    public int d;
    public int e;
    public int f;

    public void YodaWebTitleBar(Context p0){
       super(p0, null, 0);
    }
    public void YodaWebTitleBar(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void YodaWebTitleBar(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = p0;
       if (PatchProxy.applyVoidOneRefs(p0, this, YodaWebTitleBar.class, "1")) {
       }else {
          this.f = c.a(p0.getResources(), 0x7f070fdc);
          this.e = c.a(p0.getResources(), 0x7f070fdd);
          this.c = c.a(p0.getResources(), 0x7f07045c);
          this.d = c.a(p0.getResources(), 0x7f07045b);
       }
       return;
    }
    public void a(ButtonParams$PositionId p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, YodaWebTitleBar.class, "5")) {
          return;
       }
       boolean b = true;
       p1.setFocusable(b);
       p1.setVisibility(0);
       p1.setMinimumWidth(this.e);
       RelativeLayout$LayoutParams layoutParams = this.h(p1);
       layoutParams.alignWithParent = b;
       int i = YodaWebTitleBar$a.a[p0.ordinal()];
       if (i != b) {
          if (i != 2) {
             if (i != 3) {
                if (i == 4) {
                   this.g(layoutParams, p1);
                }
             }else {
                this.f(layoutParams, p1);
             }
          }else {
             this.d(layoutParams, p1);
          }
       }else {
          this.c(layoutParams, p1);
       }
       View view = this.findViewById(ButtonParams$PositionId.CENTER.mPositionId);
       if (view != null && (view.getLayoutParams() instanceof RelativeLayout$LayoutParams && this.e(view.getLayoutParams()))) {
          view.setLayoutParams(view.getLayoutParams());
       }
    label_0066 :
       return;
    }
    public void b(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YodaWebTitleBar.class, "6")) {
          return;
       }
       if (p0 != null) {
          p0.setVisibility(4);
          p0.setFocusable(false);
          RelativeLayout$LayoutParams layoutParams = p0.getLayoutParams();
          layoutParams.width = this.e;
          p0.setLayoutParams(layoutParams);
       }
       return;
    }
    public final void c(RelativeLayout$LayoutParams p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, YodaWebTitleBar.class, "7")) {
          return;
       }
       p0.addRule(9);
       ButtonParams$PositionId lEFT1 = ButtonParams$PositionId.LEFT1;
       View view = this.findViewById(lEFT1.mPositionId);
       if (view == null) {
          this.addView(p1, p0);
       }else {
          this.removeView(view);
          this.addView(p1, p0);
       }
       p1.setId(lEFT1.mPositionId);
       return;
    }
    public final void d(RelativeLayout$LayoutParams p0,View p1){
       View view;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, YodaWebTitleBar.class, "8")) {
          return;
       }
       ButtonParams$PositionId lEFT1 = ButtonParams$PositionId.LEFT1;
       if (this.findViewById(lEFT1.mPositionId) == null) {
          view = new View(this.b);
          RelativeLayout$LayoutParams layoutParams = this.h(view);
          view.setId(lEFT1.mPositionId);
          view.setMinimumWidth(this.e);
          layoutParams.addRule(9);
          this.addView(view, layoutParams);
       }
       p0.addRule(1, lEFT1.mPositionId);
       lEFT1 = ButtonParams$PositionId.LEFT2;
       view = this.findViewById(lEFT1.mPositionId);
       if (view == null) {
          this.addView(p1, p0);
       }else {
          this.removeView(view);
          this.addView(p1, p0);
       }
       p1.setId(lEFT1.mPositionId);
       return;
    }
    public final boolean e(RelativeLayout$LayoutParams p0){
       int i1;
       ButtonParams$PositionId obj = PatchProxy.applyOneRefs(p0, this, YodaWebTitleBar.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = ButtonParams$PositionId.LEFT2;
       int i = 2;
       if (this.findViewById(obj.mPositionId) != null) {
          p0.addRule(1, obj.mPositionId);
          i1 = 2;
       }else {
          obj = ButtonParams$PositionId.LEFT1;
          if (this.findViewById(obj.mPositionId) != null) {
             p0.addRule(1, obj.mPositionId);
             i1 = 1;
          }else {
             p0.removeRule(1);
             i1 = 0;
          }
       }
       ButtonParams$PositionId rIGHT2 = ButtonParams$PositionId.RIGHT2;
       if (this.findViewById(rIGHT2.mPositionId) != null) {
          p0.addRule(0, rIGHT2.mPositionId);
       }else {
          rIGHT2 = ButtonParams$PositionId.RIGHT1;
          if (this.findViewById(rIGHT2.mPositionId) != null) {
             p0.addRule(0, rIGHT2.mPositionId);
             i = 1;
          }else {
             p0.removeRule(0);
             i = 0;
          }
       }
       if (i1 > i) {
          p0.rightMargin = this.c * (i1 - i);
          p0.leftMargin = 0;
       }else if(i1 < i){
          p0.leftMargin = this.c * (i - i1);
          p0.rightMargin = 0;
       }else {
          p0.rightMargin = 0;
          p0.leftMargin = 0;
       }
       return 1;
    }
    public final void f(RelativeLayout$LayoutParams p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, YodaWebTitleBar.class, "9")) {
          return;
       }
       p0.addRule(11);
       ButtonParams$PositionId rIGHT1 = ButtonParams$PositionId.RIGHT1;
       View view = this.findViewById(rIGHT1.mPositionId);
       if (view == null) {
          this.addView(p1, p0);
       }else {
          this.removeView(view);
          this.addView(p1, p0);
       }
       p1.setId(rIGHT1.mPositionId);
       return;
    }
    public final void g(RelativeLayout$LayoutParams p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, YodaWebTitleBar.class, "10")) {
          return;
       }
       ButtonParams$PositionId rIGHT2 = ButtonParams$PositionId.RIGHT2;
       View view = this.findViewById(rIGHT2.mPositionId);
       ButtonParams$PositionId rIGHT1 = ButtonParams$PositionId.RIGHT1;
       if (this.findViewById(rIGHT1.mPositionId) == null) {
          View view1 = new View(this.b);
          RelativeLayout$LayoutParams layoutParams = this.h(view1);
          view1.setId(rIGHT1.mPositionId);
          view1.setMinimumWidth(this.e);
          layoutParams.addRule(11);
          this.addView(view1, layoutParams);
       }
       p0.addRule(0, rIGHT1.mPositionId);
       if (view == null) {
          this.addView(p1, p0);
       }else {
          this.removeView(view);
          this.addView(p1, p0);
       }
       p1.setId(rIGHT2.mPositionId);
       return;
    }
    public RelativeLayout$LayoutParams h(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, YodaWebTitleBar.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       RelativeLayout$LayoutParams layoutParams = (p0 instanceof TextView)? new RelativeLayout$LayoutParams(-2, this.d): new RelativeLayout$LayoutParams(this.c, this.d);
       layoutParams.topMargin = Math.max(0, ((this.f - this.d) / 2));
       return layoutParams;
    }
    public RelativeLayout$LayoutParams i(View p0){
       p0 = PatchProxy.applyOneRefs(p0, this, YodaWebTitleBar.class, "11");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(-1, -1);
       layoutParams.addRule(13);
       return layoutParams;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, YodaWebTitleBar.class, "2")) {
          return;
       }
       super.onAttachedToWindow();
       ViewParent parent = this.getParent();
       while (parent instanceof View) {
          parent = parent.getParent();
       }
       return;
    }
    public void setPageTitle(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YodaWebTitleBar.class, "3")) {
          return;
       }
       RelativeLayout$LayoutParams layoutParams = this.i(p0);
       this.e(layoutParams);
       this.addView(p0, layoutParams);
       return;
    }
}
