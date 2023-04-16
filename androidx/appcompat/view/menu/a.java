package androidx.appcompat.view.menu.a;
import androidx.appcompat.view.menu.j;
import android.content.Context;
import java.lang.Object;
import android.view.LayoutInflater;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j$a;
import android.view.ViewGroup;
import java.util.ArrayList;
import androidx.appcompat.view.menu.h;
import android.view.View;
import androidx.appcompat.view.menu.k$a;
import androidx.appcompat.view.menu.m;
import android.view.ViewParent;
import androidx.appcompat.view.menu.k;
import ag6.a;

public abstract class a implements j	// class@0005a0
{
    public Context b;
    public Context c;
    public e d;
    public LayoutInflater e;
    public LayoutInflater f;
    public j$a g;
    public int h;
    public int i;
    public k j;
    public int k;

    public void a(Context p0,int p1,int p2){
       super();
       this.b = p0;
       this.e = LayoutInflater.from(p0);
       this.h = p1;
       this.i = p2;
    }
    public void b(e p0,boolean p1){
       a tg = this.g;
       if (tg != null) {
          tg.b(p0, p1);
       }
       return;
    }
    public void e(boolean p0){
       a tj = this.j;
       if (tj == null) {
          return;
       }
       a td = this.d;
       boolean b = false;
       if (td != null) {
          td.t();
          ArrayList uArrayList = this.d.G();
          int i = uArrayList.size();
          int i1 = 0;
          int i2 = 0;
          while (i1 < i) {
             h oh = uArrayList.get(i1);
             if (this.t(i2, oh)) {
                View childAt = tj.getChildAt(i2);
                h itemData = (childAt instanceof k$a)? childAt.getItemData(): null;
                View view = this.r(oh, childAt, tj);
                if (oh != itemData) {
                   view.setPressed(b);
                   view.jumpDrawablesToCurrentState();
                }
                if (view != childAt) {
                   this.i(view, i2);
                }
                i2 = i2 + 1;
             }
             i1 = i1 + 1;
          }
          b = i2;
       }
       while (b < tj.getChildCount()) {
          if (!this.p(tj, b)) {
             b = b + 1;
          }
       }
       return;
    }
    public boolean f(m p0){
       a tg = this.g;
       if (tg == null) {
          return false;
       }
       if (p0 == null) {
          a td = this.d;
       }
       return tg.c(p0);
    }
    public boolean g(e p0,h p1){
       return false;
    }
    public int getId(){
       return this.k;
    }
    public boolean h(){
       return false;
    }
    public void i(View p0,int p1){
       ViewGroup parent = p0.getParent();
       if (parent != null) {
          parent.removeView(p0);
       }
       this.j.addView(p0, p1);
       return;
    }
    public boolean j(e p0,h p1){
       return false;
    }
    public void k(Context p0,e p1){
       this.c = p0;
       this.f = LayoutInflater.from(p0);
       this.d = p1;
    }
    public void l(j$a p0){
       this.g = p0;
    }
    public k m(ViewGroup p0){
       if (this.j == null) {
          k ok = a.c(this.e, this.h, p0, false);
          this.j = ok;
          ok.d(this.d);
          this.e(true);
       }
       return this.j;
    }
    public abstract void n(h p0,k$a p1);
    public k$a o(ViewGroup p0){
       return a.c(this.e, this.i, p0, false);
    }
    public boolean p(ViewGroup p0,int p1){
       p0.removeViewAt(p1);
       return true;
    }
    public j$a q(){
       return this.g;
    }
    public View r(h p0,View p1,ViewGroup p2){
       if (p1 instanceof k$a) {
       }else {
          k$a uoa = this.o(p2);
       }
       this.n(p0, p1);
       return p1;
    }
    public void s(int p0){
       this.k = p0;
    }
    public boolean t(int p0,h p1){
       return true;
    }
}
