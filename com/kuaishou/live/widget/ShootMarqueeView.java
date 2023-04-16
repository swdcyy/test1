package com.kuaishou.live.widget.ShootMarqueeView;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import android.text.TextUtils$TruncateAt;
import com.yxcorp.utility.RomUtils;
import android.widget.Scroller;
import java.lang.Integer;
import android.view.animation.LinearInterpolator;
import android.view.animation.Interpolator;
import com.kuaishou.live.widget.ShootMarqueeView$c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.view.View;
import android.app.Activity;
import com.yxcorp.utility.n;
import qq3.a;
import q87.c;
import lnc.a1;
import android.text.TextPaint;
import java.lang.CharSequence;
import java.lang.Boolean;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.Drawable;
import android.widget.TextView$BufferType;
import android.graphics.drawable.GradientDrawable$Orientation;
import java.lang.Long;
import com.kuaishou.live.widget.ShootMarqueeView$a;
import com.kuaishou.live.widget.ShootMarqueeView$b;
import java.lang.Runnable;
import java.lang.StringBuilder;

public class ShootMarqueeView extends AppCompatTextView	// class@001025
{
    public Scroller f;
    public Scroller g;
    public int h;
    public ShootMarqueeView$c i;
    public int j;
    public boolean k;
    public int l;

    public void ShootMarqueeView(Context p0){
       super(p0, null);
    }
    public void ShootMarqueeView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void ShootMarqueeView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.h = 20;
       this.l = -1;
       if (PatchProxy.applyVoid(null, this, ShootMarqueeView.class, "1")) {
       }else {
          this.setSingleLine();
          this.setEllipsize(null);
          if (!RomUtils.o()) {
             this.setHorizontalFadingEdgeEnabled(true);
          }
       }
       return;
    }
    public void computeScroll(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ShootMarqueeView.class, "12")) {
          return;
       }
       super.computeScroll();
       ShootMarqueeView tf = this.f;
       if (tf != null && tf.isFinished()) {
          int currX = this.f.getCurrX();
          this.f.abortAnimation();
          this.f = objArray;
          int i = 1;
          int i1 = this.j - i;
          this.j = i1;
          if (i1 > 0) {
             if (!PatchProxy.applyVoid(objArray, this, ShootMarqueeView.class, "7")) {
                i1 = this.getTextWidth();
                int i2 = (this.getWidth() - this.getCompoundPaddingLeft()) - this.getCompoundPaddingRight();
                currX = i1 + i2;
                if (this.j == i) {
                   this.x((- i2), i1);
                }else {
                   this.x((- i2), currX);
                }
             }
          }else if(PatchProxy.isSupport(ShootMarqueeView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(currX), this, ShootMarqueeView.class, "8")){
             this.setHorizontallyScrolling(i);
             Scroller scroller = new Scroller(this.getContext(), new LinearInterpolator());
             this.setScroller(scroller);
             scroller.startScroll(currX, 0, 1, 0, 0x2710);
             this.g = scroller;
             this.invalidate();
          }
          tf = this.i;
          if (tf != null) {
             tf.a();
          }
       }
       return;
    }
    public final int getContentAreaMaxWidth(){
       Activity obj = PatchProxy.apply(null, this, ShootMarqueeView.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = n.d(this);
       if (obj != null) {
          return (((((n.k(obj) - (a1.d(0x7f070955) * 2)) - a1.d(0x7f070956)) - a1.d(0x7f070957)) - (a1.d(0x7f070954) * 2)) - (a1.d(0x7f070953) * 2));
       }
       Object[] objArray = new Object[]{"get current activity is null, max width return 0"};
       a.C().w("ShootMarqueeView", "getContentAreaMaxWidth", objArray);
       return 0;
    }
    public float getLeftFadingEdgeStrength(){
       Object obj = PatchProxy.apply(null, this, ShootMarqueeView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       if (this.k != null) {
          return 0;
       }
       return super.getLeftFadingEdgeStrength();
    }
    public int getTextWidth(){
       Object obj = PatchProxy.apply(null, this, ShootMarqueeView.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (int)this.getPaint().measureText(this.getText().toString());
    }
    public boolean isFocused(){
       return true;
    }
    public final void p(){
       if (PatchProxy.applyVoid(null, this, ShootMarqueeView.class, "15")) {
          return;
       }
       ShootMarqueeView tf = this.f;
       if (tf != null && !tf.isFinished()) {
          this.r(this.f);
          this.f = null;
       }
       tf = this.g;
       if (tf != null && !tf.isFinished()) {
          this.r(this.g);
          this.g = null;
       }
       return;
    }
    public boolean q(){
       ShootMarqueeView obj = PatchProxy.apply(null, this, ShootMarqueeView.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.f;
       boolean b = (obj != null && !obj.isFinished())? true: false;
       return b;
    }
    public final void r(Scroller p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShootMarqueeView.class, "16")) {
          return;
       }
       p0.setFinalX(0);
       p0.abortAnimation();
       return;
    }
    public void s(){
       if (PatchProxy.applyVoid(null, this, ShootMarqueeView.class, "18")) {
          return;
       }
       this.t(this.getResources().getColor(R.color.arg_RES_7f0614d5), this.getResources().getColor(R.color.arg_RES_7f0614d4));
       return;
    }
    public void setBackground(int p0){
       if (PatchProxy.isSupport(ShootMarqueeView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ShootMarqueeView.class, "17")) {
          return;
       }
       if (p0 == -1) {
          return;
       }
       GradientDrawable gradientDraw = new GradientDrawable();
       gradientDraw.setColor(p0);
       gradientDraw.setCornerRadius((float)a1.e(50.00f));
       gradientDraw.setShape(0);
       this.setBackground(gradientDraw);
       return;
    }
    public void setMarqueeCustomDuration(int p0){
       this.l = p0;
    }
    public void setMarqueeDpPerSecond(int p0){
       this.h = p0;
    }
    public void setMarqueeListener(ShootMarqueeView$c p0){
       this.i = p0;
    }
    public void setText(CharSequence p0,TextView$BufferType p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ShootMarqueeView.class, "13")) {
          return;
       }
       this.p();
       super.setText(p0, p1);
       return;
    }
    public boolean t(int p0,int p1){
       GradientDrawable obj;
       if (PatchProxy.isSupport(ShootMarqueeView.class)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, ShootMarqueeView.class, "19");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       int i = -1;
       if (p0 == i || p1 == i) {
          return false;
       }else {
          obj = new GradientDrawable();
          int[] ointArray = new int[]{p0,p1};
          obj.setColors(ointArray);
          obj.setOrientation(GradientDrawable$Orientation.LEFT_RIGHT);
          obj.setCornerRadius((float)a1.e(50.00f));
          obj.setShape(false);
          this.setBackground(obj);
          return 1;
       }
    }
    public void u(CharSequence p0,int p1,long p2,long p3){
       if (PatchProxy.isSupport(ShootMarqueeView.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Long.valueOf(p2), Long.valueOf(p3), this, ShootMarqueeView.class, "6")) {
          return;
       }
       this.setVisibility(0);
       this.setText(p0);
       if (this.i == null) {
          this.setMarqueeListener(new ShootMarqueeView$a(this, p3));
       }
       this.postDelayed(new ShootMarqueeView$b(this, p1), p2);
       return;
    }
    public boolean v(int p0){
       if (PatchProxy.isSupport(ShootMarqueeView.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ShootMarqueeView.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (p0 < 1) {
          return false;
       }else {
          this.y();
          this.j = p0;
          int textWidth = this.getTextWidth();
          int i = (this.getWidth() - this.getCompoundPaddingLeft()) - this.getCompoundPaddingRight();
          if (i <= 0) {
             Object[] objArray = new Object[]{"contentArea with is less or equals 0, maybe not measure"};
             a.C().w("ShootMarqueeView", "startMarquee", objArray);
             i = this.getContentAreaMaxWidth();
             Object[] objArray1 = new Object[]{"use default max width:"+i};
             a.C().w("ShootMarqueeView", "startMarquee", objArray1);
          }
          if (textWidth > i) {
             if (p0 > 1) {
                this.x(false, textWidth);
             }else {
                this.x(false, (textWidth - i));
             }
             return 1;
          }else {
             return false;
          }
       }
    }
    public boolean w(int p0,int p1){
       if (PatchProxy.isSupport(ShootMarqueeView.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, ShootMarqueeView.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (p0 < 1) {
          return false;
       }else {
          this.y();
          this.j = p0;
          int textWidth = this.getTextWidth();
          if (p1 <= 0) {
             Object[] objArray = new Object[]{"contentArea with is less or equals 0, maybe not measure"};
             a.C().w("ShootMarqueeView", "startMarquee", objArray);
             p1 = this.getContentAreaMaxWidth();
             Object[] objArray1 = new Object[]{"use default max width:"+p1};
             a.C().w("ShootMarqueeView", "startMarquee", objArray1);
          }
          if (textWidth > p1) {
             if (p0 > 1) {
                this.x(false, textWidth);
             }else {
                this.x(false, (textWidth - p1));
             }
             return 1;
          }else {
             return false;
          }
       }
    }
    public final void x(int p0,int p1){
       if (PatchProxy.isSupport(ShootMarqueeView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, ShootMarqueeView.class, "9")) {
          return;
       }
       if (p1 > 0) {
          ShootMarqueeView tl = this.l;
          if (tl == -1) {
             tl = (int)((float)p1 / (float)a1.e((float)this.h)) * 1000;
          }
          this.setHorizontallyScrolling(true);
          Scroller scroller = new Scroller(this.getContext(), new LinearInterpolator());
          this.f = scroller;
          this.setScroller(scroller);
          this.f.startScroll(p0, 0, p1, 0, tl);
          this.invalidate();
       }
       return;
    }
    public void y(){
       if (PatchProxy.applyVoid(null, this, ShootMarqueeView.class, "10")) {
          return;
       }
       this.p();
       return;
    }
}
