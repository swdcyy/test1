package androidx.viewpager.widget.PagerTitleStrip;
import android.view.ViewGroup;
import android.content.Context;
import android.util.AttributeSet;
import androidx.viewpager.widget.PagerTitleStrip$a;
import android.widget.TextView;
import android.view.View;
import android.content.res.TypedArray;
import androidx.core.widget.b;
import android.content.res.ColorStateList;
import android.text.TextUtils$TruncateAt;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import androidx.viewpager.widget.PagerTitleStrip$b;
import android.text.method.TransformationMethod;
import h3.a;
import android.database.DataSetObserver;
import java.lang.ref.WeakReference;
import java.lang.Object;
import androidx.viewpager.widget.ViewPager;
import java.lang.CharSequence;
import java.lang.Math;
import android.view.View$MeasureSpec;
import android.graphics.drawable.Drawable;
import android.view.ViewParent;
import androidx.viewpager.widget.ViewPager$i;
import androidx.viewpager.widget.ViewPager$h;
import java.lang.IllegalStateException;
import java.lang.String;

public class PagerTitleStrip extends ViewGroup	// class@000a09
{
    public ViewPager b;
    public TextView c;
    public TextView d;
    public TextView e;
    public int f;
    public float g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public final PagerTitleStrip$a l;
    public WeakReference m;
    public int n;
    public int o;
    public static final int[] p;
    public static final int[] q;

    static {
       PagerTitleStrip.p = new int[4]{0x1010034,0x1010095,0x1010098,0x10100af};
       int[] ointArray = new int[]{0x101038c};
       PagerTitleStrip.q = ointArray;
    }
    public void PagerTitleStrip(Context p0){
       super(p0, null);
    }
    public void PagerTitleStrip(Context p0,AttributeSet p1){
       super(p0, p1);
       this.f = -1;
       this.g = 0xbf800000;
       this.l = new PagerTitleStrip$a(this);
       TextView textView = new TextView(p0);
       this.c = textView;
       this.addView(textView);
       textView = new TextView(p0);
       this.d = textView;
       this.addView(textView);
       textView = new TextView(p0);
       this.e = textView;
       this.addView(textView);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, PagerTitleStrip.p);
       int i = 0;
       int resourceId = typedArray.getResourceId(i, i);
       if (resourceId) {
          b.r(this.c, resourceId);
          b.r(this.d, resourceId);
          b.r(this.e, resourceId);
       }
       int dimensionPix = typedArray.getDimensionPixelSize(1, i);
       if (dimensionPix) {
          this.a(i, (float)dimensionPix);
       }
       dimensionPix = 2;
       if (typedArray.hasValue(dimensionPix)) {
          dimensionPix = typedArray.getColor(dimensionPix, i);
          this.c.setTextColor(dimensionPix);
          this.d.setTextColor(dimensionPix);
          this.e.setTextColor(dimensionPix);
       }
       this.i = typedArray.getInteger(3, 80);
       typedArray.recycle();
       this.o = this.d.getTextColors().getDefaultColor();
       this.setNonPrimaryAlpha(0x3f19999a);
       this.c.setEllipsize(TextUtils$TruncateAt.END);
       this.d.setEllipsize(TextUtils$TruncateAt.END);
       this.e.setEllipsize(TextUtils$TruncateAt.END);
       if (resourceId) {
          typedArray = p0.obtainStyledAttributes(resourceId, PagerTitleStrip.q);
          i = typedArray.getBoolean(i, i);
          typedArray.recycle();
       }
       if (i) {
          PagerTitleStrip.setSingleLineAllCaps(this.c);
          PagerTitleStrip.setSingleLineAllCaps(this.d);
          PagerTitleStrip.setSingleLineAllCaps(this.e);
       }else {
          this.c.setSingleLine();
          this.d.setSingleLine();
          this.e.setSingleLine();
       }
       this.h = (int)(c.c(p0.getResources()).density * 16.00f);
       return;
    }
    public static void setSingleLineAllCaps(TextView p0){
       p0.setTransformationMethod(new PagerTitleStrip$b(p0.getContext()));
    }
    public void a(int p0,float p1){
       this.c.setTextSize(p0, p1);
       this.d.setTextSize(p0, p1);
       this.e.setTextSize(p0, p1);
    }
    public void b(a p0,a p1){
       if (p0 != null) {
          p0.y(this.l);
          this.m = null;
       }
       if (p1 != null) {
          p1.r(this.l);
          this.m = new WeakReference(p1);
       }
       PagerTitleStrip tb = this.b;
       if (tb != null) {
          this.f = -1;
          this.g = 0xbf800000;
          this.c(tb.getCurrentItem(), p1);
          this.requestLayout();
       }
       return;
    }
    public void c(int p0,a p1){
       int i = (p1 != null)? p1.j(): 0;
       int b = true;
       this.j = b;
       CharSequence uCharSequenc = null;
       CharSequence uCharSequenc1 = (p0 >= b && p1 != null)? p1.l((p0 - 1)): uCharSequenc;
       this.c.setText(uCharSequenc1);
       PagerTitleStrip td = this.d;
       CharSequence uCharSequenc2 = (p1 != null && p0 < i)? p1.l(p0): uCharSequenc;
       td.setText(uCharSequenc2);
       b = p0 + 1;
       if (b < i && p1 != null) {
          uCharSequenc = p1.l(b);
       }
       this.e.setText(uCharSequenc);
       int i1 = View$MeasureSpec.makeMeasureSpec(Math.max(0, (int)((float)((this.getWidth() - this.getPaddingLeft()) - this.getPaddingRight()) * 0x3f4ccccd)), Integer.MIN_VALUE);
       i = View$MeasureSpec.makeMeasureSpec(Math.max(0, ((this.getHeight() - this.getPaddingTop()) - this.getPaddingBottom())), Integer.MIN_VALUE);
       this.c.measure(i1, i);
       this.d.measure(i1, i);
       this.e.measure(i1, i);
       this.f = p0;
       if (this.k == null) {
          this.d(p0, this.g, 0);
       }
       this.j = false;
       return;
    }
    public void d(int p0,float p1,boolean p2){
       PagerTitleStrip pagerTitleSt = this;
       int i = p0;
       float f = p1;
       if (i != pagerTitleSt.f) {
          pagerTitleSt.c(i, pagerTitleSt.b.getAdapter());
       }else if(!p2 && !f - pagerTitleSt.g){
          return;
       }
       pagerTitleSt.k = true;
       i = pagerTitleSt.c.getMeasuredWidth();
       int measuredWidt = pagerTitleSt.d.getMeasuredWidth();
       int measuredWidt1 = pagerTitleSt.e.getMeasuredWidth();
       int i1 = measuredWidt / 2;
       int width = this.getWidth();
       int height = this.getHeight();
       int paddingLeft = this.getPaddingLeft();
       int paddingRight = this.getPaddingRight();
       int paddingTop = this.getPaddingTop();
       int paddingBotto = this.getPaddingBottom();
       int i2 = paddingRight + i1;
       int i3 = (width - (paddingLeft + i1)) - i2;
       float f1 = 0x3f000000 + f;
       float f2 = 0x3f800000;
       if (f1 - f2 > 0) {
          f1 = f1 - f2;
       }
       i2 = ((width - i2) - (int)((float)i3 * f1)) - i1;
       measuredWidt = measuredWidt + i2;
       i1 = pagerTitleSt.c.getBaseline();
       i3 = pagerTitleSt.d.getBaseline();
       int baseline = pagerTitleSt.e.getBaseline();
       int i4 = Math.max(Math.max(i1, i3), baseline);
       i1 = i4 - i1;
       i3 = i4 - i3;
       i4 = i4 - baseline;
       p0 = measuredWidt1;
       int i5 = Math.max(Math.max((pagerTitleSt.c.getMeasuredHeight() + i1), (pagerTitleSt.d.getMeasuredHeight() + i3)), (pagerTitleSt.e.getMeasuredHeight() + i4));
       measuredWidt1 = pagerTitleSt.i & 0x70;
       if (measuredWidt1 != 16) {
          if (measuredWidt1 != 80) {
             i1 = i1 + paddingTop;
             i3 = i3 + paddingTop;
             paddingTop = paddingTop + i4;
          label_00c0 :
             PagerTitleStrip d = pagerTitleSt.d;
             d.layout(i2, i3, measuredWidt, (d.getMeasuredHeight() + i3));
             i5 = Math.min(paddingLeft, ((i2 - pagerTitleSt.h) - i));
             PagerTitleStrip c = pagerTitleSt.c;
             c.layout(i5, i1, (i + i5), (c.getMeasuredHeight() + i1));
             i = Math.max(((width - paddingRight) - p0), (measuredWidt + pagerTitleSt.h));
             d = pagerTitleSt.e;
             d.layout(i, paddingTop, (i + p0), (d.getMeasuredHeight() + paddingTop));
             pagerTitleSt.g = p1;
             pagerTitleSt.k = false;
             return;
          }else {
             height = (height - paddingBotto) - i5;
          }
       }else {
          height = (((height - paddingTop) - paddingBotto) - i5) / 2;
       }
       i1 = i1 + height;
       i3 = i3 + height;
       paddingTop = height + i4;
       goto label_00c0 ;
    }
    public int getMinHeight(){
       Drawable background = this.getBackground();
       int intrinsicHei = (background != null)? background.getIntrinsicHeight(): 0;
       return intrinsicHei;
    }
    public int getTextSpacing(){
       return this.h;
    }
    public void onAttachedToWindow(){
       super.onAttachedToWindow();
       ViewParent parent = this.getParent();
       if (!parent instanceof ViewPager) {
          throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
       }
       a adapter = parent.getAdapter();
       parent.setInternalPageChangeListener(this.l);
       parent.addOnAdapterChangeListener(this.l);
       this.b = parent;
       PagerTitleStrip tm = this.m;
       a uoa = (tm != null)? tm.get(): null;
       this.b(uoa, adapter);
       return;
    }
    public void onDetachedFromWindow(){
       super.onDetachedFromWindow();
       PagerTitleStrip tb = this.b;
       if (tb != null) {
          this.b(tb.getAdapter(), null);
          this.b.setInternalPageChangeListener(null);
          this.b.removeOnAdapterChangeListener(this.l);
          this.b = null;
       }
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (this.b != null) {
          PagerTitleStrip tg = this.g;
          if (tg - null < 0) {
             tg = 0;
          }
          this.d(this.f, tg, true);
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       int i = 0x40000000;
       if (View$MeasureSpec.getMode(p0) != i) {
          throw new IllegalStateException("Must measure with an exact width");
       }
       int i1 = this.getPaddingTop() + this.getPaddingBottom();
       int childMeasure = ViewGroup.getChildMeasureSpec(p1, i1, -2);
       int size = View$MeasureSpec.getSize(p0);
       p0 = ViewGroup.getChildMeasureSpec(p0, (int)((float)size * 0.20f), -2);
       this.c.measure(p0, childMeasure);
       this.d.measure(p0, childMeasure);
       this.e.measure(p0, childMeasure);
       p0 = (View$MeasureSpec.getMode(p1) == i)? View$MeasureSpec.getSize(p1): Math.max(this.getMinHeight(), (this.d.getMeasuredHeight() + i1));
       this.setMeasuredDimension(size, View.resolveSizeAndState(p0, p1, (this.d.getMeasuredState() << 16)));
       return;
    }
    public void requestLayout(){
       if (this.j == null) {
          super.requestLayout();
       }
       return;
    }
    public void setGravity(int p0){
       this.i = p0;
       this.requestLayout();
    }
    public void setNonPrimaryAlpha(float p0){
       int i = (int)(p0 * 0x437f0000) & 0x00ff;
       this.n = i;
       i = (i << 24) | (this.o & 0xffffff);
       this.c.setTextColor(i);
       this.e.setTextColor(i);
    }
    public void setTextColor(int p0){
       this.o = p0;
       this.d.setTextColor(p0);
       p0 = (this.n << 24) | (this.o & 0xffffff);
       this.c.setTextColor(p0);
       this.e.setTextColor(p0);
    }
    public void setTextSpacing(int p0){
       this.h = p0;
       this.requestLayout();
    }
}
