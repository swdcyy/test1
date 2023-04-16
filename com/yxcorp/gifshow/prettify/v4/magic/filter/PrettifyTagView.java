package com.yxcorp.gifshow.prettify.v4.magic.filter.PrettifyTagView;
import androidx.appcompat.widget.AppCompatTextView;
import lnc.a1;
import android.util.SparseArray;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.utility.n;
import android.widget.TextView;
import ll8.c$b;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.content.res.Resources;
import java.lang.CharSequence;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable$ConstantState;
import androidx.core.graphics.drawable.a;
import java.lang.ref.WeakReference;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable$Orientation;
import java.lang.StringBuilder;
import java.lang.Integer;
import java.lang.Float;

public class PrettifyTagView extends AppCompatTextView	// class@0011ac
{
    public Paint f;
    public String g;
    public String h;
    public String i;
    public PaintFlagsDrawFilter j;
    public int k;
    public int l;
    public int m;
    public Drawable n;
    public float o;
    public float p;
    public boolean q;
    public static final int r;
    public static SparseArray s;

    static {
       PrettifyTagView.r = a1.a(0x7f061e0a);
       PrettifyTagView.s = new SparseArray();
    }
    public void PrettifyTagView(Context p0,AttributeSet p1){
       super(p0, p1);
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PrettifyTagView.class, "12")) {
       }else {
          this.j = new PaintFlagsDrawFilter(0, 3);
          Paint paint = new Paint(1);
          this.f = paint;
          paint.setStyle(Paint$Style.FILL);
          this.setTagBgColor(TextUtils.g(PrettifyTagView.r));
          this.setTextSize(0, (float)n.c(p0, 8.00f));
          this.setLayerType(1, null);
          this.p = (float)a1.d(0x7f070428);
          this.o = (float)a1.d(0x7f070cbe);
          if (!PatchProxy.applyVoidTwoRefs(p1, p0, this, PrettifyTagView.class, "13") && p1 != null) {
             TypedArray typedArray = this.getContext().obtainStyledAttributes(p1, c$b.n4);
             this.setTextSize(0, typedArray.getDimension(2, (float)n.c(p0, 8.00f)));
             this.p = typedArray.getDimension(0, this.p);
             this.o = typedArray.getDimension(3, this.o);
             this.q = typedArray.getBoolean(1, 0);
             typedArray.recycle();
          }
       }
       return;
    }
    public void onDraw(Canvas p0){
       int b;
       PrettifyTagView to;
       if (PatchProxy.applyVoidOneRefs(p0, this, PrettifyTagView.class, "9")) {
          return;
       }
       DrawFilter drawFilter = p0.getDrawFilter();
       p0.setDrawFilter(this.j);
       Object[] objArray = null;
       Drawable obj = PatchProxy.apply(objArray, this, PrettifyTagView.class, "14");
       int i = 0;
       int i1 = 1;
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(PrettifyTagView.s.get(this.m) != null && (this.l != this.getHeight() || this.k != this.getWidth())){
          b = true;
       }else {
          b = false;
       }
       if (b && !PatchProxy.applyVoid(objArray, this, PrettifyTagView.class, "15")) {
          if (this.getContext() != null) {
             objArray = this.getContext().getResources();
          }
          if (objArray != null) {
             this.l = this.getHeight();
             this.k = this.getWidth();
             if (TextUtils.x(this.i)) {
                b = (this.q != null)? 0x7f081d39: 0x7f081d38;
                obj = objArray.getDrawable(b);
                if (obj != null) {
                   Drawable$ConstantState constantStat = obj.getConstantState();
                   if (constantStat != null) {
                      obj = constantStat.newDrawable();
                   }
                   obj = a.r(obj).mutate();
                   a.n(obj, this.m);
                   obj.setBounds(i, i, this.k, this.l);
                   PrettifyTagView.s.put(this.m, new WeakReference(obj));
                }
             }else {
                int[] ointArray = new int[]{TextUtils.J(this.h, -574616),TextUtils.J(this.i, -574616)};
                GradientDrawable gradientDraw = new GradientDrawable(GradientDrawable$Orientation.BL_TR, ointArray);
                gradientDraw.mutate();
                gradientDraw.setGradientType(i);
                float[] uofloatArray = new float[]{to,to,0,0,to,to,0,0};
                to = this.o;
                to = this.p;
                gradientDraw.setCornerRadii(uofloatArray);
                gradientDraw.setBounds(i, i, this.getWidth(), this.getHeight());
                PrettifyTagView.s.put(this.m, new WeakReference(gradientDraw));
             }
          }
       }
    label_0114 :
       obj = PrettifyTagView.s.get(this.m).get();
       this.n = obj;
       if (obj != null) {
          obj.draw(p0);
       }
       super.onDraw(p0);
       p0.setDrawFilter(drawFilter);
       return;
    }
    public void p(){
       if (PatchProxy.applyVoid(null, this, PrettifyTagView.class, "3")) {
          return;
       }
       if (this.getVisibility() != 8) {
          this.setVisibility(8);
       }
       return;
    }
    public void q(){
       if (PatchProxy.applyVoid(null, this, PrettifyTagView.class, "2")) {
          return;
       }
       if (this.getVisibility()) {
          this.setVisibility(0);
       }
       return;
    }
    public final void r(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PrettifyTagView.class, "11")) {
          return;
       }
       int i = -574616;
       if (TextUtils.x(p1)) {
          this.m = TextUtils.J(p0, i);
       }else {
          int i1 = TextUtils.J(p0, i);
          int i2 = TextUtils.J(p1, i);
          int i3 = i1 >> 16;
          i1 = (i1 & 0xffff) ^ i3;
          i3 = i2 >> 16;
          this.m = i1 << (((i2 & 0xffff) ^ i3) + 16);
       }
       return;
    }
    public final void setBgColor(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PrettifyTagView.class, "10")) {
          return;
       }
       this.r(p0, null);
       this.f.setColor(this.m);
       return;
    }
    public void setTagBgColor(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PrettifyTagView.class, "5")) {
          return;
       }
       if (TextUtils.x(p0)) {
          return;
       }
       if (p0.charAt(0) != '#') {
          p0 = '#'+p0;
       }
       if (!p0.equals(this.h)) {
          this.h = p0;
          this.setBgColor(p0);
       }
       return;
    }
    public void setTagBgSecondColor(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PrettifyTagView.class, "6")) {
          return;
       }
       if (TextUtils.x(p0)) {
          this.i = p0;
          return;
       }else if(p0.charAt(0) != '#'){
          p0 = '#'+p0;
       }
       if (!p0.equals(this.i)) {
          this.i = p0;
          this.r(this.h, p0);
       }
       return;
    }
    public void setTagText(int p0){
       if (PatchProxy.isSupport(PrettifyTagView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, PrettifyTagView.class, "8")) {
          return;
       }
       if (this.getContext() == null) {
          return;
       }
       this.setTagText(this.getContext().getString(p0));
       return;
    }
    public void setTagText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PrettifyTagView.class, "7")) {
          return;
       }
       if (TextUtils.x(p0)) {
          return;
       }
       if (!p0.equals(this.g)) {
          this.g = p0;
          this.setText(p0);
       }
       return;
    }
    public void setTagTextSize(float p0){
       if (PatchProxy.isSupport(PrettifyTagView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, PrettifyTagView.class, "4")) {
          return;
       }
       this.setTextSize(0, p0);
       return;
    }
}
