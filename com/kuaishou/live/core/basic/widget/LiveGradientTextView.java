package com.kuaishou.live.core.basic.widget.LiveGradientTextView;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ll8.c$b;
import android.content.res.TypedArray;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.widget.TextView;
import android.graphics.Shader;
import android.graphics.Paint;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Integer;
import android.view.View;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import android.graphics.Paint$FontMetrics;
import android.text.TextPaint;
import com.kuaishou.live.core.basic.widget.b;
import java.lang.Boolean;
import pp.c;
import com.kuaishou.android.live.log.b;

public class LiveGradientTextView extends AppCompatTextView	// class@000903
{
    public boolean f;
    public LinearGradient g;
    public LinearGradient h;
    public Paint i;
    public String j;
    public Paint$FontMetrics k;
    public float l;
    public float m;
    public ColorStateList n;
    public ColorStateList o;
    public static final int p;

    public void LiveGradientTextView(Context p0){
       super(p0, null);
    }
    public void LiveGradientTextView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveGradientTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.f = false;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveGradientTextView.class, "1")) {
       }else if(p1 == null){
          this.f = false;
       }else {
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.B2);
          this.n = typedArray.getColorStateList(1);
          this.o = typedArray.getColorStateList(false);
          this.q();
       }
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGradientTextView.class, "8")) {
          return;
       }
       if (this.f == null) {
          super.onDraw(p0);
       }else {
          LiveGradientTextView ti = this.i;
          LiveGradientTextView th = (this.isPressed())? this.h: this.g;
          ti.setShader(th);
          if (!TextUtils.isEmpty(this.j)) {
             p0.drawText(this.j, this.m, this.l, this.i);
          }
       }
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(LiveGradientTextView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, LiveGradientTextView.class, "5")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       if (this.f != null) {
          this.p();
       }
       return;
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(LiveGradientTextView.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, LiveGradientTextView.class, "6")) {
          return;
       }
       super.onTextChanged(p0, p1, p2, p3);
       if (this.f != null) {
          this.p();
       }
       return;
    }
    public final void p(){
       LinearGradient linearGradie = this;
       if (PatchProxy.applyVoid(null, linearGradie, LiveGradientTextView.class, "7")) {
          return;
       }
       int[] ointArray = new int[0];
       int[] ointArray1 = new int[0];
       LinearGradient linearGradie1 = new LinearGradient(0, 0, (float)this.getMeasuredWidth(), 0, linearGradie.n.getColorForState(ointArray, 0xff000000), linearGradie.o.getColorForState(ointArray1, 0xff000000), Shader$TileMode.REPEAT);
       linearGradie.g = v1;
       int i = 1;
       int[] ointArray2 = new int[i];
       int i1 = 0x10100a7;
       ointArray2[0] = i1;
       ointArray2 = new int[i];
       ointArray2[0] = i1;
       LinearGradient linearGradie2 = new LinearGradient(0, 0, (float)this.getMeasuredWidth(), 0, linearGradie.n.getColorForState(ointArray2, 0xff000000), linearGradie.o.getColorForState(ointArray2, 0xff000000), Shader$TileMode.REPEAT);
       linearGradie.h = v1;
       if (this.getText() != null) {
          linearGradie.j = this.getText().toString();
          LiveGradientTextView k = linearGradie.k;
          Paint$FontMetrics bottom = k.bottom;
          linearGradie.l = (float)(this.getHeight() >> i) + (((bottom - k.top) / 2.00f) - bottom);
          linearGradie.m = (float)(this.getWidth() >> i) - (linearGradie.i.measureText(linearGradie.j) / 2.00f);
       }
       return;
    }
    public void q(){
       if (PatchProxy.applyVoid(null, this, LiveGradientTextView.class, "2")) {
          return;
       }
       LiveGradientTextView to = this.o;
       boolean b = false;
       if (to != null && (this.n == null || this.f != null)) {
          b.e0(b.b, "tryInitDataAndSetTextColor", "mGradientEndColorList", to, "mGradientStartColorList", this.n, "mEnableGradient", Boolean.valueOf(this.f));
          this.f = b;
          return;
       }else {
          TextPaint paint = this.getPaint();
          this.i = paint;
          this.k = paint.getFontMetrics();
          int i = 2;
          int[][] ointArray = new int[][i];
          int[] ointArray1 = new int[]{0x10100a7};
          ointArray[b] = ointArray1;
          ointArray1 = new int[b];
          ointArray[1] = ointArray1;
          int colorForStat = this.n.getColorForState(ointArray[b], 0xff000000);
          int colorForStat1 = this.n.getColorForState(ointArray[1], 0xff000000);
          if (colorForStat != colorForStat1) {
             int[] ointArray2 = new int[i];
             ointArray2[b] = colorForStat;
             ointArray2[1] = colorForStat1;
             this.setTextColor(new ColorStateList(ointArray, ointArray2));
          }
          this.f = true;
          return;
       }
    }
    public void setGradientEndColorList(int p0){
       if (PatchProxy.isSupport(LiveGradientTextView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveGradientTextView.class, "3")) {
          return;
       }
       this.o = ColorStateList.valueOf(p0);
       this.q();
       return;
    }
    public void setGradientStartColorList(int p0){
       if (PatchProxy.isSupport(LiveGradientTextView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveGradientTextView.class, "4")) {
          return;
       }
       this.n = ColorStateList.valueOf(p0);
       this.q();
       return;
    }
}
