package com.kwai.library.widget.viewpager.a;
import androidx.recyclerview.widget.RecyclerView$r;
import android.view.ViewGroup$MarginLayoutParams;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.String;
import java.lang.Class;
import com.kwai.library.widget.viewpager.a$a;
import androidx.recyclerview.widget.RecyclerView;
import com.kwai.library.widget.viewpager.RecyclerViewPager$b;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import java.lang.IllegalStateException;
import java.util.Locale;
import java.lang.Object;
import java.lang.Integer;

public final class a extends RecyclerView$r	// class@000a83
{
    public final String a;
    public RecyclerViewPager$b b;
    public final LinearLayoutManager c;
    public int d;
    public int e;
    public a$a f;
    public int g;
    public int h;
    public boolean i;
    public boolean j;
    public static final ViewGroup$MarginLayoutParams k;

    static {
       ViewGroup$MarginLayoutParams marginLayout = new ViewGroup$MarginLayoutParams(-1, -1);
       a.k = marginLayout;
       marginLayout.setMargins(0, 0, 0, 0);
    }
    public void a(LinearLayoutManager p0){
       super();
       this.a = a.class.getSimpleName();
       this.c = p0;
       this.f = new a$a();
       this.i();
    }
    public void a(RecyclerView p0,int p1){
       a td = this.d;
       if (td != 1 && p1 == 1) {
          this.d = 1;
          td = this.h;
          if (td != -1) {
             this.g = td;
             this.h = -1;
          }else {
             this.g = this.f();
          }
          this.e(1);
          return;
       }else if(td == 1 && p1 == 2){
          if (this.j == null) {
             this.c(this.f(), 0, 0);
          }else {
             this.e(2);
             this.i = true;
             this.j = false;
          }
          return;
       }else if(td == 1 && !p1){
          if (this.e == 1 && this.f.c == null) {
             if (this.j == null) {
                this.c(this.f(), 0, 0);
             }else {
                this.i = true;
                this.j = false;
             }
          }
          if (this.j == null) {
             if (this.i != null) {
                this.j();
                a$a a = this.f.a;
                if (this.g != a) {
                   this.d(a);
                }
             }
             this.e(0);
             this.i();
          }
       }
    label_0072 :
       return;
    }
    public void b(RecyclerView p0,int p1,int p2){
       a$a uoa1;
       this.j = true;
       a$a uoa = this.j();
       if (this.i != null) {
          this.i = false;
          if (p2 <= 0) {
             if (!p2) {
                p1 = (p1 < 0)? 1: 0;
                if (p1 != this.h()) {
                label_001e :
                   uoa1 = null;
                label_0021 :
                   uoa1 = (uoa1 && uoa.c != null)? uoa.a + true: uoa.a;
                   this.h = uoa1;
                   if (this.g != uoa1) {
                      this.d(uoa1);
                   }
                }
             }else {
                goto label_001e ;
             }
          }
          uoa1 = 1;
          goto label_0021 ;
       }
       this.c(uoa.a, uoa.b, uoa.c);
       a th = this.h;
       if (uoa.a == th || (th == -1 && (uoa.c == null && this.e != true))) {
          this.e(false);
          this.i();
       }
    label_0056 :
       return;
    }
    public final void c(int p0,float p1,int p2){
       a tb = this.b;
       if (tb != null) {
          tb.b(p0, p1, p2);
       }
       return;
    }
    public final void d(int p0){
       a tb = this.b;
       if (tb != null) {
          tb.c(p0);
       }
       return;
    }
    public final void e(int p0){
       if (this.d == 3 && this.e == null) {
          return;
       }
       if (this.e == p0) {
          return;
       }
       this.e = p0;
       a tb = this.b;
       if (tb != null) {
          tb.a(p0);
       }
       return;
    }
    public final int f(){
       return this.c.i0();
    }
    public boolean g(){
       boolean b = (this.d == null)? true: false;
       return b;
    }
    public final boolean h(){
       boolean b = true;
       if (this.c.getLayoutDirection() == b) {
       }else {
          b = false;
       }
       return b;
    }
    public final void i(){
       this.d = 0;
       this.e = 0;
       this.f.a();
       this.g = -1;
       this.h = -1;
       this.i = false;
       this.j = false;
    }
    public final a$a j(){
       ViewGroup$MarginLayoutParams layoutParams;
       a tf = this.f;
       int i = this.c.i0();
       tf.a = i;
       if (i == -1) {
          tf.a();
          return tf;
       }else {
          View view = this.c.findViewByPosition(i);
          if (view == null) {
             tf.a();
             return tf;
          }else if(view.getLayoutParams() instanceof ViewGroup$MarginLayoutParams){
             layoutParams = view.getLayoutParams();
          }else {
             layoutParams = a.k;
          }
          int i1 = (!this.c.getOrientation())? 1: 0;
          if (i1) {
             i1 = view.getWidth();
             if (!this.h()) {
                i = view.getLeft();
                layoutParams = layoutParams.leftMargin;
             }else {
                i = (i1 - view.getRight()) + layoutParams.rightMargin;
             label_0063 :
                i = - i;
                tf.c = i;
                if (i >= 0) {
                   float f = (!i1)? 0: (float)i / (float)i1;
                   tf.b = f;
                   return tf;
                }else {
                   Object[] objArray = new Object[]{Integer.valueOf(tf.c)};
                   throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", objArray));
                }
             }
          }else {
             i1 = view.getHeight();
             i = view.getTop();
             layoutParams = layoutParams.topMargin;
          }
          i = i - layoutParams;
          goto label_0063 ;
       }
    }
}
