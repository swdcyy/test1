package com.yxcorp.plugin.search.widget.SearchScrollSelectTextView;
import android.widget.TextView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.search.widget.SearchScrollSelectTextView$CursorHandle;
import android.widget.PopupWindow;
import com.yxcorp.plugin.search.widget.SearchScrollSelectTextView$a;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnScrollChangedListener;
import android.os.Build$VERSION;
import com.yxcorp.plugin.search.widget.SearchScrollSelectTextView$b;
import android.view.View$OnScrollChangeListener;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.view.View$MeasureSpec;
import lnc.a1;
import com.yxcorp.plugin.search.utils.j0;
import com.yxcorp.plugin.search.widget.SearchScrollSelectTextView$g;
import android.view.View$OnClickListener;
import com.yxcorp.plugin.search.widget.SearchScrollSelectTextView$h;
import android.os.Looper;
import android.text.Spannable;
import java.lang.Integer;
import android.text.StaticLayout;
import java.lang.CharSequence;
import android.text.TextPaint;
import android.text.Layout$Alignment;
import android.text.Layout;
import android.text.style.BackgroundColorSpan;
import com.yxcorp.utility.n;
import android.graphics.Canvas;
import zf6.j;
import java.lang.StringBuilder;
import nfd.t0;
import android.graphics.Paint;
import android.graphics.Typeface;
import java.lang.Boolean;
import android.text.method.MovementMethod;
import android.text.method.LinkMovementMethod;
import com.yxcorp.plugin.search.widget.SearchScrollSelectTextView$c;
import android.view.View$OnTouchListener;
import com.yxcorp.plugin.search.widget.SearchScrollSelectTextView$d;
import com.yxcorp.plugin.search.widget.SearchScrollSelectTextView$e;
import android.view.View$OnLongClickListener;
import com.yxcorp.plugin.search.widget.SearchScrollSelectTextView$f;

public class SearchScrollSelectTextView extends TextView	// class@0007eb
{
    public ViewTreeObserver$OnScrollChangedListener A;
    public View$OnScrollChangeListener B;
    public SearchScrollSelectTextView$CursorHandle C;
    public SearchScrollSelectTextView$CursorHandle D;
    public BackgroundColorSpan E;
    public Spannable F;
    public PopupWindow G;
    public int H;
    public int I;
    public String J;
    public int[] K;
    public String b;
    public Context c;
    public boolean d;
    public boolean e;
    public V8Function f;
    public int g;
    public int h;
    public int i;
    public int j;
    public float k;
    public float l;
    public int m;
    public float n;
    public float o;
    public float p;
    public float q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public float w;
    public boolean x;
    public boolean y;
    public String z;

    public void SearchScrollSelectTextView(Context p0){
       super(p0);
       this.b = "SearchScrollSelectTextView";
       this.g = 1;
       this.i = -1;
       this.x = false;
       this.y = false;
       this.J = "£¬¡££¿£¡£º£»";
       int[] ointArray = new int[2];
       this.K = ointArray;
       this.c = p0;
       this.c();
    }
    public void SearchScrollSelectTextView(Context p0,AttributeSet p1,int p2,int p3){
       super(p0, null, p2, p3);
       this.b = "SearchScrollSelectTextView";
       this.g = 1;
       this.i = -1;
       this.x = false;
       this.y = false;
       this.J = "£¬¡££¿£¡£º£»";
       int[] ointArray = new int[2];
       this.K = ointArray;
       this.c = p0;
       this.c();
    }
    public static float a(SearchScrollSelectTextView p0,float p1){
       float f = p0.o + p1;
       p0.o = f;
       return f;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, SearchScrollSelectTextView.class, "13")) {
          return;
       }
       SearchScrollSelectTextView tC = this.C;
       if (tC != null) {
          tC.b();
       }
       tC = this.D;
       if (tC != null) {
          tC.b();
       }
       tC = this.G;
       if (tC != null) {
          tC.dismiss();
       }
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, SearchScrollSelectTextView.class, "1")) {
          return;
       }
       this.A = new SearchScrollSelectTextView$a(this);
       this.getViewTreeObserver().addOnScrollChangedListener(this.A);
       if (Build$VERSION.SDK_INT >= 23) {
          SearchScrollSelectTextView$b uob = new SearchScrollSelectTextView$b(this);
          this.B = uob;
          this.setOnScrollChangeListener(uob);
       }
       this.d();
       return;
    }
    public final void d(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, SearchScrollSelectTextView.class, "10")) {
          return;
       }
       View view = LayoutInflater.from(this.c).inflate(R.layout.arg_RES_7f0d140c, objArray);
       view.measure(View$MeasureSpec.makeMeasureSpec(0, 0), View$MeasureSpec.makeMeasureSpec(0, 0));
       this.H = view.getMeasuredWidth();
       this.I = view.getMeasuredHeight();
       PopupWindow popupWindow = new PopupWindow(view, -2, -2, 0);
       this.G = popupWindow;
       popupWindow.setClippingEnabled(0);
       j0.D(view.findViewById(R.id.container), (float)a1.e(4.00f));
       view.findViewById(R.id.tv_copy).setOnClickListener(new SearchScrollSelectTextView$g(this));
       view.findViewById(R.id.tv_select_all).setOnClickListener(new SearchScrollSelectTextView$h(this));
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, SearchScrollSelectTextView.class, "15")) {
          return;
       }
       if (Looper.getMainLooper() == Looper.myLooper()) {
          this.invalidate();
       }else {
          this.postInvalidate();
       }
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, SearchScrollSelectTextView.class, "14")) {
          return;
       }
       this.z = null;
       SearchScrollSelectTextView tF = this.F;
       if (tF != null) {
          SearchScrollSelectTextView tE = this.E;
          if (tE != null) {
             tF.removeSpan(tE);
             this.E = null;
          }
       }
       return;
    }
    public void g(int p0,int p1){
       Layout layout;
       if (PatchProxy.isSupport(SearchScrollSelectTextView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, SearchScrollSelectTextView.class, "6")) {
          return;
       }
       p0 = (!p0)? this.getWidth(): a1.e((float)p0);
       StaticLayout staticLayout = new StaticLayout(this.getText(), this.getPaint(), p0, Layout$Alignment.ALIGN_CENTER, this.getLineSpacingMultiplier(), this.getLineSpacingExtra(), this.getIncludeFontPadding());
       if (this.getLayout() != null) {
          layout = this.getLayout();
       }
       p1 = layout.getLineForOffset(p1);
       this.q = (float)(layout.getLineTop(layout.getLineForOffset(this.getText().length())) + this.getLineHeight());
       if (p1 > 1) {
          p1--;
       }
       float f = (float)layout.getLineTop(p1);
       this.p = f;
       this.o = f;
       SearchScrollSelectTextView tq = this.q;
       if ((f + (float)this.getHeight()) - tq > 0 && tq - (float)this.getHeight() > 0) {
          this.o = this.q - (float)this.getHeight();
       }else if(this.q - (float)this.getHeight() <= 0){
          this.o = 0;
       }
       this.scrollTo(0, (int)this.o);
       return;
    }
    public float getLargestDepth(){
       return (this.p / this.q);
    }
    public void h(int p0,int p1){
       if (PatchProxy.isSupport(SearchScrollSelectTextView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, SearchScrollSelectTextView.class, "9")) {
          return;
       }
       int i = -1;
       if (p0 != i) {
          this.u = p0;
       }
       if (p1 != i) {
          this.v = p1;
       }
       SearchScrollSelectTextView tu = this.u;
       SearchScrollSelectTextView tv = this.v;
       if (tu > tv) {
          this.u = tv;
          this.v = tu;
       }
       if (this.F != null) {
          if (this.E == null) {
             this.E = new BackgroundColorSpan(this.r);
          }
          this.z = this.F.subSequence(this.u, this.v).toString();
          this.F.setSpan(this.E, this.u, this.v, 17);
       }
       return;
    }
    public void i(int p0,int p1){
       if (PatchProxy.isSupport(SearchScrollSelectTextView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, SearchScrollSelectTextView.class, "7")) {
          return;
       }
       if (p0 != this.i || p1 != this.j) {
          this.i = p0;
          this.j = p1;
          this.e();
       }
       return;
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, SearchScrollSelectTextView.class, "12")) {
          return;
       }
       this.getLocationInWindow(this.K);
       Layout layout = this.getLayout();
       int i = (int)layout.getPrimaryHorizontal(this.u) + this.K[0];
       SearchScrollSelectTextView tK = this.K;
       int i1 = 1;
       int i2 = (((layout.getLineTop(layout.getLineForOffset(this.u)) + tK[i1]) - this.I) - 16) - this.m;
       if (i <= 0) {
          i = 16;
       }
       if (i2 < (tK[i1] - 200)) {
          i2 = ((tK[i1] * 2) + this.getHeight()) / 2;
       }
       if ((this.H + i) > n.z(this.c)) {
          i = (n.z(this.c) - this.H) - 16;
       }
       if (this.G == null) {
          this.d();
       }
       this.G.setElevation(8.00f);
       this.G.showAtLocation(this, 0, i, (i2 + a1.e(10.00f)));
       return;
    }
    public void onDraw(Canvas p0){
       int i4;
       float f5;
       float f6;
       float f8;
       float f9;
       int i7;
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, SearchScrollSelectTextView.class, "2")) {
          return;
       }
       if (obj.i >= null) {
          float f = this.getTextSize() + (float)this.getPaddingTop();
          int i = 0;
          int i1 = this.getLayout().getLineBottom(i) - this.getLayout().getLineTop(i);
          this.getLayout().getLineCount();
          int width = this.getWidth();
          char[] uocharArray = (this.getText().toString()).toCharArray();
          TextPaint paint = this.getPaint();
          paint.setColor(j.b(this.getContext(), R.color.arg_RES_7f0607de));
          paint.setTextScaleX(this.getTextScaleX());
          paint.setTextSize(this.getTextSize());
          float f1 = 0;
          int i2 = 0;
          while (i2 < uocharArray.length) {
             String str = "";
             float f2 = paint.measureText(uocharArray[i2]+str);
             float f3 = f1 + f2;
             float f4 = (float)width;
             if (f3 - f4 < 0) {
                int i3 = uocharArray.length - 1;
                if (i2 < i3) {
                   i4 = i2 + 1;
                   if ((obj.J).contains(uocharArray[i4]+str)) {
                      f3 = paint.measureText(uocharArray[i2]+str+uocharArray[i4]) + f1;
                      if (f3 - f4 >= 0) {
                      label_00c9 :
                         if (i >= this.getLayout().getLineCount()) {
                            f = f + (float)i1;
                         }else {
                            i7 = this.getLayout().getLineBottom(i) - this.getLayout().getLineTop(i);
                            f = f + (float)i7;
                            i = i + 1;
                         }
                         f1 = null;
                      }
                   }
                }
             }else {
                goto label_00c9 ;
             }
             int i5 = 10;
             int i6 = 0;
             if (uocharArray[i2] == i5 && f1 - i6) {
                if (i >= this.getLayout().getLineCount()) {
                   f = f + (float)i1;
                }else {
                   i7 = this.getLayout().getLineBottom(i) - this.getLayout().getLineTop(i);
                   f = f + (float)i7;
                   i = i + 1;
                }
                f4 = f;
                i4 = i;
                f5 = 0;
             }else {
                f4 = f;
                f5 = f1;
                i4 = i;
             }
             if (obj.i <= i2 && (obj.j > i2 && uocharArray[i2] != i5)) {
                paint.setColor(j.b(this.getContext(), R.color.arg_RES_7f0608bd));
                f6 = f4 - (float)t0.u;
                f3 = f5 + f2;
                float f7 = f4 + (float)t0.j;
                f8 = f5;
                f9 = f4;
                p0.drawRect(f5, f6, f3, f7, paint);
                paint.setColor(j.b(this.getContext(), obj.h));
                paint.setTypeface(Typeface.DEFAULT_BOLD);
                f1 = 0x7f0607de;
             }else {
                f8 = f5;
                f9 = f4;
                paint.setColor(j.b(this.getContext(), R.color.arg_RES_7f0607de));
                paint.setTypeface(Typeface.DEFAULT);
             }
             if (uocharArray[i2] != i5) {
                f6 = f9;
                obj1.drawText(String.valueOf(uocharArray[i2]), f8, f6, paint);
                f5 = f8 + f2;
             }else {
                f6 = f9;
                f5 = f8;
             }
             i2 = i2 + 1;
             f = f6;
             f1 = f5;
             i = i4;
             StringBuilder str1 = 0x7f0607de;
          }
       }else {
          super.onDraw(p0);
       }
       return;
    }
    public void setCanScroll(boolean p0){
       if (PatchProxy.isSupport(SearchScrollSelectTextView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, SearchScrollSelectTextView.class, "3")) {
          return;
       }
       if (p0) {
          this.setMovementMethod(LinkMovementMethod.getInstance());
          this.setVerticalScrollBarEnabled(true);
          this.setOnTouchListener(new SearchScrollSelectTextView$c(this));
       }else {
          this.setMovementMethod(null);
          this.setVerticalScrollBarEnabled(false);
       }
       return;
    }
    public void setCanSelect(boolean p0){
       if (PatchProxy.isSupport(SearchScrollSelectTextView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, SearchScrollSelectTextView.class, "4")) {
          return;
       }
       if (p0) {
          this.setSelectAllOnFocus(true);
          this.setOnTouchListener(new SearchScrollSelectTextView$d(this));
          this.setOnLongClickListener(new SearchScrollSelectTextView$e(this));
          this.setOnClickListener(new SearchScrollSelectTextView$f(this));
       }
       return;
    }
    public void setHasClickableSpan(boolean p0){
       this.y = p0;
    }
    public void setHighLightColor(int p0){
       this.h = p0;
    }
}
