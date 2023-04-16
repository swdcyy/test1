package androidx.appcompat.widget.b;
import android.widget.TextView;
import java.lang.Object;
import androidx.appcompat.widget.c;
import android.content.Context;
import w0.d;
import w0.w;
import android.content.res.ColorStateList;
import w0.x;
import android.os.Build$VERSION;
import android.graphics.Typeface;
import java.lang.ref.WeakReference;
import androidx.appcompat.widget.b$a;
import o1.f$a;
import java.lang.String;
import android.graphics.drawable.Drawable;
import android.graphics.PorterDuff$Mode;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import android.view.View;
import a2.i0;
import android.text.method.TransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.os.LocaleList;
import java.util.Locale;
import androidx.core.widget.a;
import androidx.core.widget.b;
import w0.l;

public class b	// class@00063f
{
    public final TextView a;
    public w b;
    public w c;
    public w d;
    public w e;
    public w f;
    public w g;
    public w h;
    public final c i;
    public int j;
    public int k;
    public Typeface l;
    public boolean m;

    public void b(TextView p0){
       super();
       this.j = 0;
       this.k = -1;
       this.a = p0;
       this.i = new c(p0);
    }
    public static w d(Context p0,d p1,int p2){
       ColorStateList uColorStateL = p1.e(p0, p2);
       if (uColorStateL == null) {
          return null;
       }
       w ow = new w();
       ow.d = true;
       ow.a = uColorStateL;
       return ow;
    }
    public final void A(int p0,float p1){
       this.i.v(p0, p1);
    }
    public final void B(Context p0,x p1){
       int i1;
       String str;
       b tk1;
       int b1;
       this.j = p1.k(2, this.j);
       int sDK_INT = Build$VERSION.SDK_INT;
       int i = 0;
       if (sDK_INT >= 28) {
          i1 = p1.k(11, -1);
          this.k = i1;
          if (i1 != -1) {
             this.j = (this.j & 2) | i;
          }
       }
       i1 = 10;
       int i2 = 12;
       if (p1.s(i1) || p1.s(i2)) {
          this.l = null;
          if (p1.s(i2)) {
             i1 = 12;
          }
          b tk = this.k;
          b tj = this.j;
          if (!p0.isRestricted()) {
             WeakReference weakReferenc = new WeakReference(this.a);
             try{
                b$a uoa = new b$a(this, tk, tj, weakReferenc);
                Typeface typeface = p1.j(i1, this.j, uoa);
                if (typeface != null) {
                   if (sDK_INT >= 28 && this.k != -1) {
                      typeface = Typeface.create(typeface, i);
                      b tk2 = this.k;
                      boolean b = (this.j & 2)? true: false;
                      this.l = Typeface.create(typeface, tk2, b);
                   }else {
                      this.l = typeface;
                   }
                }
                b1 = (this.l == null)? true: false;
                this.m = b1;
             }catch(java.lang.UnsupportedOperationException e0){
             }catch(android.content.res.Resources$NotFoundException e0){
             }
          }
       }else if(p1.s(1)){
          this.m = i;
          b1 = p1.k(1, 1);
          if (b1 != 1) {
             if (b1 != 2) {
                if (b1 == 3) {
                   this.l = Typeface.MONOSPACE;
                }
             }else {
                this.l = Typeface.SERIF;
             }
          }else {
             this.l = Typeface.SANS_SERIF;
          }
       }
       return;
    }
    public final void a(Drawable p0,w p1){
       if (p0 != null && p1 != null) {
          d.h(p0, p1, this.a.getDrawableState());
       }
       return;
    }
    public void b(){
       Drawable[] compoundDraw;
       int i = 2;
       int i1 = 0;
       if (this.b == null && (this.c == null && (this.d != null || this.e != null))) {
          compoundDraw = this.a.getCompoundDrawables();
          this.a(compoundDraw[i1], this.b);
          this.a(compoundDraw[1], this.c);
          this.a(compoundDraw[i], this.d);
          this.a(compoundDraw[3], this.e);
       }
       if (this.f != null || this.g != null) {
          compoundDraw = this.a.getCompoundDrawablesRelative();
          this.a(compoundDraw[i1], this.f);
          this.a(compoundDraw[i], this.g);
       }
       return;
    }
    public void c(){
       this.i.a();
    }
    public int e(){
       return this.i.h();
    }
    public int f(){
       return this.i.i();
    }
    public int g(){
       return this.i.j();
    }
    public int[] h(){
       return this.i.k();
    }
    public int i(){
       return this.i.l();
    }
    public ColorStateList j(){
       b th = this.h;
       w a = (th != null)? th.a: null;
       return a;
    }
    public PorterDuff$Mode k(){
       b th = this.h;
       w b = (th != null)? th.b: null;
       return b;
    }
    public boolean l(){
       return this.i.p();
    }
    public void m(AttributeSet p0,int p1){
       x ox1;
       int i10;
       ColorStateList uColorStateL;
       ColorStateList uColorStateL1;
       ColorStateList uColorStateL2;
       String str;
       String str1;
       int i11;
       d uod1;
       Drawable uDrawable;
       Drawable uDrawable2;
       b uob = this;
       AttributeSet uAttributeSe = p0;
       int i = p1;
       Context context = uob.a.getContext();
       d uod = d.a();
       int[] r = c$b.r;
       x ox = x.v(context, uAttributeSe, r, i, 0);
       b a = uob.a;
       i0.q0(a, a.getContext(), r, p0, ox.r(), p1, 0);
       int i1 = -1;
       int i2 = ox.n(0, i1);
       int i3 = 3;
       if (ox.s(i3)) {
          uob.b = b.d(context, uod, ox.n(i3, 0));
       }
       int i4 = 1;
       if (ox.s(i4)) {
          uob.c = b.d(context, uod, ox.n(i4, 0));
       }
       int i5 = 4;
       if (ox.s(i5)) {
          uob.d = b.d(context, uod, ox.n(i5, 0));
       }
       int i6 = 2;
       if (ox.s(i6)) {
          uob.e = b.d(context, uod, ox.n(i6, 0));
       }
       i6 = Build$VERSION.SDK_INT;
       int i7 = 5;
       if (ox.s(i7)) {
          uob.f = b.d(context, uod, ox.n(i7, 0));
       }
       boolean i8 = 6;
       if (ox.s(i8)) {
          uob.g = b.d(context, uod, ox.n(i8, 0));
       }
       ox.w();
       v13 = uob.a.getTransformationMethod() instanceof PasswordTransformationMethod;
       i4 = 23;
       int i9 = 14;
       if (i2 != i1) {
          ox1 = x.t(context, i2, c$b.E5);
          if (!ox && ox1.s(i9)) {
             i8 = ox1.a(i9, 0);
             i10 = 1;
          }else {
             i8 = false;
             i10 = 0;
          }
          uob.B(context, ox1);
          if (i6 < i4) {
             uColorStateL = (ox1.s(i3))? ox1.c(i3): null;
             uColorStateL1 = (ox1.s(i5))? ox1.c(i5): null;
             if (ox1.s(i7)) {
                uColorStateL2 = ox1.c(i7);
                i1 = 15;
             label_00f6 :
                if (ox1.s(i1)) {
                   str = ox1.o(i1);
                   i1 = 26;
                }else {
                   i1 = 26;
                   str = null;
                }
                if (i6 >= i1) {
                   i1 = 13;
                   if (ox1.s(i1)) {
                      str1 = ox1.o(i1);
                   label_0118 :
                      ox1.w();
                   }
                }
                str1 = null;
                goto label_0118 ;
             }else {
                i1 = 15;
             }
          }else {
             i1 = 15;
             uColorStateL = null;
             uColorStateL1 = null;
          }
          uColorStateL2 = null;
          goto label_00f6 ;
       }else {
          i8 = false;
          i10 = 0;
          uColorStateL = null;
          uColorStateL1 = null;
          uColorStateL2 = null;
          str = null;
          str1 = null;
       }
       ox1 = x.v(context, uAttributeSe, c$b.E5, i, 0);
       if (!ox && ox1.s(i9)) {
          i8 = ox1.a(i9, 0);
          i11 = 1;
       }else {
          i11 = i10;
       }
       if (i6 < i4) {
          if (ox1.s(i3)) {
             uColorStateL = ox1.c(i3);
          }
          if (ox1.s(i5)) {
             uColorStateL1 = ox1.c(i5);
          }
          if (ox1.s(i7)) {
             uColorStateL2 = ox1.c(i7);
          }
       }
       ColorStateList uColorStateL3 = uColorStateL;
       ColorStateList uColorStateL4 = uColorStateL1;
       ColorStateList uColorStateL5 = uColorStateL2;
       i7 = 15;
       if (ox1.s(i7)) {
          str = ox1.o(i7);
       }
       String str2 = str;
       if (i6 >= 26) {
          i1 = 13;
          if (ox1.s(i1)) {
             str1 = ox1.o(i1);
          }
       }
       String str3 = str1;
       if (i6 >= 28 && (ox1.s(0) && !ox1.f(0, -1))) {
          uod1 = uod;
          uob.a.setTextSize(0, 0);
       }else {
          uod1 = uod;
       }
       uob.B(context, ox1);
       ox1.w();
       if (uColorStateL3 != null) {
          uob.a.setTextColor(uColorStateL3);
       }
       if (uColorStateL4 != null) {
          uob.a.setHintTextColor(uColorStateL4);
       }
       if (uColorStateL5 != null) {
          uob.a.setLinkTextColor(uColorStateL5);
       }
       if (!ox && i11) {
          uob.r(i8);
       }
       a = uob.l;
       if (a != null) {
          if (uob.k == -1) {
             uob.a.setTypeface(a, uob.j);
          }else {
             uob.a.setTypeface(a);
          }
       }
       if (str3 != null) {
          uob.a.setFontVariationSettings(str3);
       }
       if (str2 != null) {
          if (i6 >= 24) {
             uob.a.setTextLocales(LocaleList.forLanguageTags(str2));
          }else {
             uob.a.setTextLocale(Locale.forLanguageTag(str2.substring(0, str2.indexOf(44))));
          }
       }
       uob.i.q(uAttributeSe, i);
       if (a.a0 && uob.i.l()) {
          int[] ointArray = uob.i.k();
          if (ointArray.length > 0) {
             if ((float)uob.a.getAutoSizeStepGranularity() - 0xbf800000) {
                uob.a.setAutoSizeTextTypeUniformWithConfiguration(uob.i.i(), uob.i.h(), uob.i.j(), 0);
             }else {
                uob.a.setAutoSizeTextTypeUniformWithPresetSizes(ointArray, 0);
             }
          }
       }
       x ox2 = x.u(context, uAttributeSe, c$b.s);
       i3 = -1;
       i2 = ox2.n(8, i3);
       d uod2 = uod1;
       if (i2 != i3) {
          uDrawable = uod2.b(context, i2);
          i2 = 13;
       }else {
          i2 = 13;
          uDrawable = 0;
       }
       i2 = ox2.n(i2, i3);
       Drawable uDrawable1 = (i2 != i3)? uod2.b(context, i2): 0;
       i2 = ox2.n(9, i3);
       if (i2 != i3) {
          uDrawable2 = uod2.b(context, i2);
          i2 = 6;
       }else {
          i2 = 6;
          uDrawable2 = 0;
       }
       i2 = ox2.n(i2, i3);
       Drawable uDrawable3 = (i2 != i3)? uod2.b(context, i2): 0;
       i2 = ox2.n(10, i3);
       Drawable uDrawable4 = (i2 != i3)? uod2.b(context, i2): 0;
       i2 = ox2.n(7, i3);
       Drawable uDrawable5 = (i2 != i3)? uod2.b(context, i2): 0;
       this.x(uDrawable, uDrawable1, uDrawable2, uDrawable3, uDrawable4, uDrawable5);
       i2 = 11;
       if (ox2.s(i2)) {
          b.j(uob.a, ox2.c(i2));
       }
       i2 = 12;
       if (ox2.s(i2)) {
          b.k(uob.a, l.e(ox2.k(i2, -1), null));
       }else {
          i3 = -1;
       }
       i2 = ox2.f(14, -1);
       i4 = ox2.f(17, -1);
       i5 = ox2.f(18, -1);
       ox2.w();
       if (i2 != -1) {
          b.n(uob.a, i2);
       }
       if (i4 != -1) {
          b.o(uob.a, i4);
       }
       if (i5 != -1) {
          b.p(uob.a, i5);
       }
       return;
    }
    public void n(WeakReference p0,Typeface p1){
       if (this.m != null) {
          this.l = p1;
          TextView textView = p0.get();
          if (textView != null) {
             textView.setTypeface(p1, this.j);
          }
       }
       return;
    }
    public void o(boolean p0,int p1,int p2,int p3,int p4){
       if (!a.a0) {
          this.c();
       }
       return;
    }
    public void p(){
       this.b();
    }
    public void q(Context p0,int p1){
       x ox = x.t(p0, p1, c$b.E5);
       int i = 14;
       if (ox.s(i)) {
          this.r(ox.a(i, false));
       }
       i = Build$VERSION.SDK_INT;
       if (i < 23) {
          int i1 = 3;
          if (ox.s(i1)) {
             ColorStateList uColorStateL = ox.c(i1);
             if (uColorStateL != null) {
                this.a.setTextColor(uColorStateL);
             }
          }
       }
       if (ox.s(false) && !ox.f(false, -1)) {
          this.a.setTextSize(false, 0);
       }
       this.B(p0, ox);
       if (i >= 26) {
          int i2 = 13;
          if (ox.s(i2)) {
             String str = ox.o(i2);
             if (str != null) {
                this.a.setFontVariationSettings(str);
             }
          }
       }
       ox.w();
       b tl = this.l;
       if (tl != null) {
          this.a.setTypeface(tl, this.j);
       }
       return;
    }
    public void r(boolean p0){
       this.a.setAllCaps(p0);
    }
    public void s(int p0,int p1,int p2,int p3){
       this.i.r(p0, p1, p2, p3);
    }
    public void t(int[] p0,int p1){
       this.i.s(p0, p1);
    }
    public void u(int p0){
       this.i.t(p0);
    }
    public void v(ColorStateList p0){
       if (this.h == null) {
          this.h = new w();
       }
       b th = this.h;
       th.a = p0;
       boolean b = (p0 != null)? true: false;
       th.d = b;
       this.y();
       return;
    }
    public void w(PorterDuff$Mode p0){
       if (this.h == null) {
          this.h = new w();
       }
       b th = this.h;
       th.b = p0;
       boolean b = (p0 != null)? true: false;
       th.c = b;
       this.y();
       return;
    }
    public final void x(Drawable p0,Drawable p1,Drawable p2,Drawable p3,Drawable p4,Drawable p5){
       object oobject;
       object oobject1;
       object oobject2;
       object oobject4;
       if (p4 != null || p5 != null) {
          Drawable[] compoundDraw = this.a.getCompoundDrawablesRelative();
          b ta = this.a;
          if (p4 == null) {
             object oobject3 = compoundDraw[0];
          }
          if (p1 == null) {
             oobject2 = compoundDraw[1];
          }
          if (p5 == null) {
             oobject1 = compoundDraw[2];
          }
          if (p3 == null) {
             oobject = compoundDraw[3];
          }
          ta.setCompoundDrawablesRelativeWithIntrinsicBounds(p4, p1, p5, p3);
       }else if(p0 == null && (p1 == null && (p2 != null || p3 != null))){
          Drawable[] compoundDraw1 = this.a.getCompoundDrawablesRelative();
          if (compoundDraw1[0] != null || compoundDraw1[2] != null) {
             b ta1 = this.a;
             oobject4 = compoundDraw1[0];
             if (p1 == null) {
                oobject2 = compoundDraw1[1];
             }
             oobject1 = compoundDraw1[2];
             if (p3 == null) {
                oobject = compoundDraw1[3];
             }
             ta1.setCompoundDrawablesRelativeWithIntrinsicBounds(oobject4, p1, oobject1, p3);
             return;
          }else {
             compoundDraw1 = this.a.getCompoundDrawables();
             b ta2 = this.a;
             if (p0 == null) {
                object oobject5 = compoundDraw1[0];
             }
             if (p1 == null) {
                oobject2 = compoundDraw1[1];
             }
             if (p2 == null) {
                oobject4 = compoundDraw1[2];
             }
             if (p3 == null) {
                oobject = compoundDraw1[3];
             }
             ta2.setCompoundDrawablesWithIntrinsicBounds(p0, p1, p2, p3);
          }
       }
       return;
    }
    public final void y(){
       b th = this.h;
       this.b = th;
       this.c = th;
       this.d = th;
       this.e = th;
       this.f = th;
       this.g = th;
    }
    public void z(int p0,float p1){
       if (!a.a0 && !this.l()) {
          this.A(p0, p1);
       }
       return;
    }
}
