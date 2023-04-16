package androidx.appcompat.widget.c;
import android.graphics.RectF;
import java.util.concurrent.ConcurrentHashMap;
import android.widget.TextView;
import java.lang.Object;
import android.content.Context;
import android.os.Build$VERSION;
import androidx.appcompat.widget.c$b;
import androidx.appcompat.widget.c$a;
import androidx.appcompat.widget.c$c;
import java.lang.String;
import java.lang.reflect.Method;
import java.lang.Class;
import androidx.appcompat.widget.AppCompatEditText;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Integer;
import java.util.List;
import java.util.Collections;
import java.lang.CharSequence;
import android.text.Layout$Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.StaticLayout$Builder;
import java.lang.IllegalStateException;
import java.lang.Math;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import android.view.View;
import a2.i0;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import android.util.TypedValue;
import android.text.Layout;
import android.text.method.TransformationMethod;

public class c	// class@000643
{
    public int a;
    public boolean b;
    public float c;
    public float d;
    public float e;
    public int[] f;
    public boolean g;
    public TextPaint h;
    public final TextView i;
    public final Context j;
    public final c$c k;
    public static final RectF l;
    public static ConcurrentHashMap m;
    public static ConcurrentHashMap n;

    static {
       c.l = new RectF();
       c.m = new ConcurrentHashMap();
       c.n = new ConcurrentHashMap();
    }
    public void c(TextView p0){
       super();
       this.a = 0;
       this.b = false;
       this.c = 0xbf800000;
       this.d = 0xbf800000;
       this.e = 0xbf800000;
       int[] ointArray = new int[0];
       this.f = ointArray;
       this.g = false;
       this.i = p0;
       this.j = p0.getContext();
       int sDK_INT = Build$VERSION.SDK_INT;
       if (sDK_INT >= 29) {
          this.k = new c$b();
       }else if(sDK_INT >= 23){
          this.k = new c$a();
       }else {
          this.k = new c$c();
       }
       return;
    }
    public static Method m(String p0){
       try{
          Method method = c.m.get(p0);
          if (method == null) {
             Class[] uClassArray = new Class[0];
             method = TextView.class.getDeclaredMethod(p0, uClassArray);
             if (method != null) {
                method.setAccessible(true);
                c.m.put(p0, method);
             }
          }
          return method;
       }catch(java.lang.Exception e0){
          return null;
       }
    }
    public static Object o(Object p0,String p1,Object p2){
       try{
          Object[] objArray = new Object[0];
          p2 = c.m(p1).invoke(p0, objArray);
          return p2;
       }catch(java.lang.Exception e0){
       }
    }
    public final boolean A(){
       return (this.i instanceof AppCompatEditText ^ 0x01);
    }
    public final void B(float p0,float p1,float p2){
       String str = "px\) is less or equal to \(0px\)";
       String str1 = null;
       if (p0 - str1 <= 0) {
          throw new IllegalArgumentException("Minimum auto-size text size \("+p0+str);
       }
       if (p1 - p0 <= 0) {
          throw new IllegalArgumentException("Maximum auto-size text size \("+p1+"px\) is less or equal to minimum auto-size text size \("+p0+"px\)");
       }
       if (p2 - str1 <= 0) {
          throw new IllegalArgumentException("The auto-size step granularity \("+p2+str);
       }
       this.a = 1;
       this.d = p0;
       this.e = p1;
       this.c = p2;
       this.g = false;
       return;
    }
    public void a(){
       if (!this.p()) {
          return;
       }
       if (this.b != null) {
          if (this.i.getMeasuredHeight() > 0 && this.i.getMeasuredWidth() > 0) {
             int i = (this.k.b(this.i))? 0x100000: (this.i.getMeasuredWidth() - this.i.getTotalPaddingLeft()) - this.i.getTotalPaddingRight();
             int i1 = (this.i.getHeight() - this.i.getCompoundPaddingBottom()) - this.i.getCompoundPaddingTop();
             if (i > 0 && i1 > 0) {
                RectF l = c.l;
                _monitor_enter(l);
                l.setEmpty();
                l.right = (float)i;
                l.bottom = (float)i1;
                float f = (float)this.g(l);
                if (f - this.i.getTextSize()) {
                   this.v(0, f);
                }
                _monitor_exit(l);
             }
          }
       label_007a :
          return;
       }
       this.b = true;
       return;
    }
    public final int[] b(int[] p0){
       int len = p0.length;
       if (!len) {
          return p0;
       }
       Arrays.sort(p0);
       ArrayList uArrayList = new ArrayList();
       int i = 0;
       int i1 = 0;
       while (i1 < len) {
          int i2 = p0[i1];
          if (i2 > 0 && Collections.binarySearch(uArrayList, Integer.valueOf(i2)) < 0) {
             uArrayList.add(Integer.valueOf(i2));
          }
          i1 = i1 + 1;
       }
       if (len == uArrayList.size()) {
          return p0;
       }
       int i3 = uArrayList.size();
       int[] ointArray = new int[i3];
       for (; i < i3; i = i + 1) {
          ointArray[i] = uArrayList.get(i).intValue();
       }
       return ointArray;
    }
    public final void c(){
       this.a = 0;
       this.d = 0xbf800000;
       this.e = 0xbf800000;
       this.c = 0xbf800000;
       int[] ointArray = new int[0];
       this.f = ointArray;
       this.b = false;
    }
    public StaticLayout d(CharSequence p0,Layout$Alignment p1,int p2,int p3){
       if (Build$VERSION.SDK_INT >= 23) {
          return this.e(p0, p1, p2, p3);
       }
       return this.f(p0, p1, p2);
    }
    public final StaticLayout e(CharSequence p0,Layout$Alignment p1,int p2,int p3){
       StaticLayout$Builder uBuilder = StaticLayout$Builder.obtain(p0, 0, p0.length(), this.h, p2);
       StaticLayout$Builder uBuilder1 = uBuilder.setAlignment(p1).setLineSpacing(this.i.getLineSpacingExtra(), this.i.getLineSpacingMultiplier()).setIncludePad(this.i.getIncludeFontPadding()).setBreakStrategy(this.i.getBreakStrategy()).setHyphenationFrequency(this.i.getHyphenationFrequency());
       if (p3 == -1) {
          p3 = Integer.MAX_VALUE;
       }
       try{
          uBuilder1.setMaxLines(p3);
          this.k.a(uBuilder, this.i);
          return uBuilder.build();
       }catch(java.lang.ClassCastException e0){
       }
    }
    public final StaticLayout f(CharSequence p0,Layout$Alignment p1,int p2){
       StaticLayout staticLayout = new StaticLayout(p0, this.h, p2, p1, this.i.getLineSpacingMultiplier(), this.i.getLineSpacingExtra(), this.i.getIncludeFontPadding());
       return v0;
    }
    public final int g(RectF p0){
       int len = this.f.length;
       if (!len) {
          throw new IllegalStateException("No available text sizes to choose from.");
       }
       len = len - 1;
       int i = 1;
       int i1 = 0;
       while (i <= len) {
          i1 = i + len;
          i1 = i1 / 2;
          if (this.z(this.f[i1], p0)) {
             i1 = i1 + 1;
             int i2 = i1;
             i1 = i;
             i = i2;
          }else {
             i1 = i1 - 1;
             len = i1;
          }
       }
       return this.f[i1];
    }
    public int h(){
       return Math.round(this.e);
    }
    public int i(){
       return Math.round(this.d);
    }
    public int j(){
       return Math.round(this.c);
    }
    public int[] k(){
       return this.f;
    }
    public int l(){
       return this.a;
    }
    public void n(int p0){
       c th = this.h;
       if (th == null) {
          this.h = new TextPaint();
       }else {
          th.reset();
       }
       this.h.set(this.i.getPaint());
       this.h.setTextSize((float)p0);
       return;
    }
    public boolean p(){
       boolean b = (this.A() && this.a != null)? true: false;
       return b;
    }
    public void q(AttributeSet p0,int p1){
       int[] s = c$b.s;
       TypedArray typedArray = this.j.obtainStyledAttributes(p0, s, p1, 0);
       c ti = this.i;
       i0.q0(ti, ti.getContext(), s, p0, typedArray, p1, 0);
       int i = 5;
       if (typedArray.hasValue(i)) {
          this.a = typedArray.getInt(i, 0);
       }
       i = 4;
       float dimension = (typedArray.hasValue(i))? typedArray.getDimension(i, 0xbf800000): 0xbf800000;
       p1 = 2;
       float dimension1 = (typedArray.hasValue(p1))? typedArray.getDimension(p1, 0xbf800000): 0xbf800000;
       int i1 = 1;
       float dimension2 = (typedArray.hasValue(i1))? typedArray.getDimension(i1, 0xbf800000): 0xbf800000;
       int i2 = 3;
       if (typedArray.hasValue(i2)) {
          i2 = typedArray.getResourceId(i2, 0);
          if (i2 > 0) {
             TypedArray typedArray1 = typedArray.getResources().obtainTypedArray(i2);
             this.x(typedArray1);
             typedArray1.recycle();
          }
       }
       typedArray.recycle();
       if (this.A()) {
          if (this.a == i1) {
             if (this.g == null) {
                DisplayMetrics uDisplayMetr = c.c(this.j.getResources());
                if (!dimension1 - 0xbf800000) {
                   dimension1 = TypedValue.applyDimension(p1, 12.00f, uDisplayMetr);
                }
                if (!dimension2 - 0xbf800000) {
                   dimension2 = TypedValue.applyDimension(p1, 112.00f, uDisplayMetr);
                }
                if (!dimension - 0xbf800000) {
                   dimension = 0x3f800000;
                }
                this.B(dimension1, dimension2, dimension);
             }
             this.w();
          }
       }else {
          this.a = 0;
       }
       return;
    }
    public void r(int p0,int p1,int p2,int p3){
       if (this.A()) {
          DisplayMetrics uDisplayMetr = c.c(this.j.getResources());
          this.B(TypedValue.applyDimension(p3, (float)p0, uDisplayMetr), TypedValue.applyDimension(p3, (float)p1, uDisplayMetr), TypedValue.applyDimension(p3, (float)p2, uDisplayMetr));
          if (this.w()) {
             this.a();
          }
       }
       return;
    }
    public void s(int[] p0,int p1){
       if (this.A()) {
          int len = p0.length;
          String str = null;
          if (len > 0) {
             int[] ointArray = new int[len];
             if (!p1) {
                ointArray = Arrays.copyOf(p0, len);
             }else {
                DisplayMetrics uDisplayMetr = c.c(this.j.getResources());
                for (; str < len; str = str + 1) {
                   ointArray[str] = Math.round(TypedValue.applyDimension(p1, (float)p0[str], uDisplayMetr));
                }
             }
             this.f = this.b(ointArray);
             if (!this.y()) {
                throw new IllegalArgumentException("None of the preset sizes is valid: "+Arrays.toString(p0));
             }
          }else {
             this.g = str;
          }
          if (this.w()) {
             this.a();
          }
       }
       return;
    }
    public void t(int p0){
       if (this.A()) {
          if (p0) {
             if (p0 == 1) {
                DisplayMetrics uDisplayMetr = c.c(this.j.getResources());
                float f = TypedValue.applyDimension(2, 12.00f, uDisplayMetr);
                this.B(f, TypedValue.applyDimension(2, 112.00f, uDisplayMetr), 0x3f800000);
                if (this.w()) {
                   this.a();
                }
             }else {
                throw new IllegalArgumentException("Unknown auto-size text type: "+p0);
             }
          }else {
             this.c();
          }
       }
       return;
    }
    public final void u(float p0){
       if (p0 - this.i.getPaint().getTextSize()) {
          this.i.getPaint().setTextSize(p0);
          boolean b = this.i.isInLayout();
          if (this.i.getLayout() != null) {
             boolean b1 = false;
             this.b = b1;
             try{
                Method method = c.m("nullLayouts");
                if (method != null) {
                   Object[] objArray = new Object[b1];
                   method.invoke(this.i, objArray);
                }
             }catch(java.lang.Exception e0){
             }
             if (!b) {
                this.i.requestLayout();
             }else {
                this.i.forceLayout();
             }
             this.i.invalidate();
          }
       }
       return;
    }
    public void v(int p0,float p1){
       c tj = this.j;
       Resources system = (tj == null)? Resources.getSystem(): tj.getResources();
       this.u(TypedValue.applyDimension(p0, p1, c.c(system)));
       return;
    }
    public final boolean w(){
       int i = 0;
       if (this.A() && this.a == 1) {
          if (this.g == null || !this.f.length) {
             int i1 = (int)Math.floor((double)((this.e - this.d) / this.c)) + 1;
             int[] ointArray = new int[i1];
             for (; i < i1; i = i + 1) {
                float f = (float)i * this.c;
                float f1 = this.d + f;
                ointArray[i] = Math.round(f1);
             }
             this.f = this.b(ointArray);
          }
          this.b = true;
       }else {
          this.b = i;
       }
       return this.b;
    }
    public final void x(TypedArray p0){
       int i = p0.length();
       int[] ointArray = new int[i];
       if (i > 0) {
          for (int i1 = 0; i1 < i; i1 = i1 + 1) {
             ointArray[i1] = p0.getDimensionPixelSize(i1, -1);
          }
          this.f = this.b(ointArray);
          this.y();
       }
       return;
    }
    public final boolean y(){
       c tf = this.f;
       int len = tf.length;
       int i = 0;
       boolean b = (len > 0)? true: false;
       this.g = b;
       if (b) {
          this.a = 1;
          this.d = (float)tf[i];
          this.e = (float)tf[(len - 1)];
          this.c = 0xbf800000;
       }
       return b;
    }
    public final boolean z(int p0,RectF p1){
       CharSequence text = this.i.getText();
       TransformationMethod transformati = this.i.getTransformationMethod();
       if (transformati != null) {
          CharSequence transformati1 = transformati.getTransformation(text, this.i);
          if (transformati1 != null) {
             text = transformati1;
          }
       }
       int maxLines = this.i.getMaxLines();
       this.n(p0);
       StaticLayout staticLayout = this.d(text, c.o(this.i, "getLayoutAlignment", Layout$Alignment.ALIGN_NORMAL), Math.round(p1.right), maxLines);
       if (maxLines != -1 && (staticLayout.getLineCount() > maxLines || staticLayout.getLineEnd((staticLayout.getLineCount() - 1)) != text.length())) {
          return false;
       }else if((float)staticLayout.getHeight() - p1.bottom > 0){
          return false;
       }else {
          return 1;
       }
    }
}
