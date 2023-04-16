package com.beloo.widget.chipslayoutmanager.f;
import p9.e;
import com.beloo.widget.chipslayoutmanager.ChipsLayoutManager;
import t9.m;
import com.beloo.widget.chipslayoutmanager.f$a;
import java.lang.Object;
import t9.g;
import androidx.recyclerview.widget.RecyclerView$t;
import androidx.recyclerview.widget.RecyclerView$y;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import java.util.Iterator;
import p9.a;
import p9.a$a;
import android.view.View;
import java.lang.Math;
import android.graphics.Rect;
import com.beloo.widget.chipslayoutmanager.anchor.AnchorViewState;
import java.lang.Integer;

public abstract class f implements e	// class@000f12
{
    public ChipsLayoutManager a;
    public f$a b;
    public m c;
    public g d;

    public void f(ChipsLayoutManager p0,m p1,f$a p2){
       super();
       this.a = p0;
       this.b = p2;
       this.c = p1;
       this.d = p0.P();
    }
    public final boolean d(RecyclerView$t p0,RecyclerView$y p1){
       int i;
       int i1;
       if (this.a.getChildCount()) {
          i = this.c.k() - this.c.j();
          if (i >= 0) {
          label_001b :
             if (i > 0) {
                this.q((- i));
                return true;
             }else if(!this.a.getChildCount()){
                f ta = this.a;
                Iterator iterator = ta.d.iterator();
                int i2 = 0;
                Iterator iterator1 = iterator;
                while (iterator1.hasNext()) {
                   if (ta.b.d(iterator1.next())) {
                      i2 = i2 + 1;
                   }
                }
                if (i2 != this.a.getItemCount()) {
                   i1 = this.c.l() - this.c.m();
                   if (i1 >= 0) {
                   label_0069 :
                      if (i1 > 0) {
                         this.r((- i1), p0, p1);
                         return true;
                      }else {
                         return false;
                      }
                   }
                }
             }
             i1 = 0;
             goto label_0069 ;
          }
       }
       i = 0;
       goto label_001b ;
    }
    public final int e(RecyclerView$y p0){
       int i = (this.b())? this.n(p0): 0;
       return i;
    }
    public final int f(RecyclerView$y p0){
       int i = (this.a())? this.m(p0): 0;
       return i;
    }
    public final int g(RecyclerView$y p0){
       int i = (this.b())? this.m(p0): 0;
       return i;
    }
    public final int h(RecyclerView$y p0){
       int i = (this.a())? this.n(p0): 0;
       return i;
    }
    public final int i(RecyclerView$y p0){
       int i = (this.a())? this.o(p0): 0;
       return i;
    }
    public final int j(int p0,RecyclerView$t p1,RecyclerView$y p2){
       p0 = (this.a())? this.r(p0, p1, p2): 0;
       return p0;
    }
    public final int k(int p0,RecyclerView$t p1,RecyclerView$y p2){
       p0 = (this.b())? this.r(p0, p1, p2): 0;
       return p0;
    }
    public final int l(RecyclerView$y p0){
       int i = (this.b())? this.o(p0): 0;
       return i;
    }
    public final int m(RecyclerView$y p0){
       if (!this.a.getChildCount() || !p0.c()) {
          return 0;
       }
       int i = this.a.i0();
       int i1 = this.a.c();
       if (!this.a.k()) {
          return (Math.abs((i1 - i)) + 1);
       }
       return Math.min(this.c.h(), this.p());
    }
    public final int n(RecyclerView$y p0){
       int i = 0;
       if (!this.a.getChildCount() || !p0.c()) {
          return i;
       }
       int i1 = this.a.i0();
       int i2 = this.a.c();
       i = Math.max(i, i1);
       if (!this.a.k()) {
          return i;
       }
       return Math.round((((float)i * ((float)this.p() / (float)(Math.abs((i1 - i2)) + 1))) + (float)(this.c.j() - this.c.k())));
    }
    public final int o(RecyclerView$y p0){
       if (!this.a.getChildCount() || !p0.c()) {
          return 0;
       }
       if (!this.a.k()) {
          return p0.c();
       }
       return (int)(((float)this.p() / (float)(Math.abs((this.a.i0() - this.a.c())) + 1)) * (float)p0.c());
    }
    public final int p(){
       return (this.c.m() - this.c.k());
    }
    public abstract void q(int p0);
    public final int r(int p0,RecyclerView$t p1,RecyclerView$y p2){
       int i = 0;
       if (!this.a.getChildCount()) {
       }else if(p0 < 0){
          ChipsLayoutManager u = this.a.u;
          if (u.a() != null) {
             if (!u.c().intValue()) {
                int i1 = this.c.g(u) - this.c.j();
                p0 = (i1 >= 0)? i1: Math.max(i1, p0);
             }
          }
       }else if(p0 > 0){
          if (this.a.getPosition(this.a.getChildAt((this.a.getChildCount() - 1))) >= (this.a.getItemCount() - 1)) {
             p0 = Math.min((this.c.m() - this.c.l()), p0);
          }
       }
       i = p0;
       this.q((- i));
       this.b.s(this, p1, p2);
       return i;
    }
}
