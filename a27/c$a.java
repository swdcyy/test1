package a27.c$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.ViewGroup;
import z17.b;
import a27.c$b;
import java.lang.Object;
import android.content.Context;
import ekd.p1;
import android.view.View;
import android.view.ViewParent;
import android.graphics.Rect;
import a27.c;
import a27.a;
import java.lang.Math;
import android.content.SharedPreferences;
import a27.b;
import android.content.SharedPreferences$Editor;
import java.lang.String;
import oe6.g;

public class c$a implements ViewTreeObserver$OnGlobalLayoutListener	// class@00002e
{
    public int b;
    public final ViewGroup c;
    public final b d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public boolean i;
    public final c$b j;
    public final int k;
    public boolean l;
    public int m;

    public void c$a(boolean p0,boolean p1,boolean p2,ViewGroup p3,b p4,c$b p5,int p6){
       super();
       this.b = 0;
       this.l = false;
       this.c = p3;
       this.d = p4;
       this.e = p0;
       this.f = p1;
       this.g = p2;
       this.h = p1.f(p3.getContext());
       this.j = p5;
       this.k = p6;
    }
    public final Context a(){
       return this.c.getContext();
    }
    public void onGlobalLayout(){
       int i1;
       int b;
       int height;
       c$a tj;
       Context uContext1;
       int i = 0;
       View childAt = this.c.getChildAt(i);
       View parent = this.c.getParent();
       Rect rect = new Rect();
       c$a uoa = -1;
       if (this.f != null) {
          parent.getWindowVisibleDisplayFrame(rect);
          i1 = rect.bottom - rect.top;
          if (this.l == null) {
             b = (i1 == this.k)? true: false;
             this.l = b;
          }
          if (this.l == null) {
             i1 = i1 + this.h;
          }
       }else if(childAt != null){
          childAt.getWindowVisibleDisplayFrame(rect);
          i1 = rect.bottom - rect.top;
       }else {
          i1 = -1;
       }
       if (i1 == uoa) {
          return;
       }else if(this.b == null){
          this.b = i1;
          this.d.b(c.c(this.a()));
       }else if(a.a(this.e, this.f, this.g)){
          b = this.c.getParent().getHeight() - i1;
       }else {
          b = Math.abs((i1 - this.b));
       }
       if (b > c.a(this.a()) && b != this.h) {
          Context uContext = this.a();
          if (c.a == b || b < 0) {
             uContext1 = null;
          }else {
             c.a = b;
             g.b(b.a(uContext).edit().putInt("mSharedPreferences.key.keyboard.height", b));
             uContext1 = 1;
          }
          if (uContext1) {
             b = c.c(this.a());
             if (this.d.getHeight() != b) {
                this.d.b(b);
             }
          }
       }
    label_00c4 :
       parent = this.c.getParent();
       height = parent.getHeight();
       height = height - parent.getPaddingTop();
       if (a.a(this.e, this.f, this.g)) {
          if (this.f == null && (height - i1) == this.h) {
             i = this.i;
          }else if(height > i1){
             i = 1;
          }
       }else {
          tj = this.m;
          if (tj == null) {
             i = this.i;
          }else if(i1 < (tj - c.a(this.a()))){
             i = 1;
          }
          this.m = Math.max(this.m, height);
       }
       if (this.i != i) {
          this.d.a(i);
          tj = this.j;
          if (tj != null) {
             tj.a(i);
          }
       }
       this.i = i;
       this.b = i1;
       return;
    }
}
