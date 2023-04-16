package androidx.recyclerview.widget.g;
import androidx.recyclerview.widget.y;
import java.util.ArrayList;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.View;
import java.lang.Object;
import androidx.recyclerview.widget.g$i;
import androidx.recyclerview.widget.g$j;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView$l;
import androidx.recyclerview.widget.g$e;
import android.animation.Animator$AnimatorListener;
import androidx.recyclerview.widget.g$g;
import androidx.recyclerview.widget.g$h;
import androidx.recyclerview.widget.g$f;
import androidx.recyclerview.widget.g$d;
import java.util.List;
import android.animation.ValueAnimator;
import android.animation.TimeInterpolator;
import java.util.Iterator;
import java.util.Collection;
import androidx.recyclerview.widget.g$a;
import java.lang.Runnable;
import a2.i0;
import androidx.recyclerview.widget.g$b;
import androidx.recyclerview.widget.g$c;
import java.lang.Math;

public class g extends y	// class@000908
{
    public ArrayList h;
    public ArrayList i;
    public ArrayList j;
    public ArrayList k;
    public ArrayList l;
    public ArrayList m;
    public ArrayList n;
    public ArrayList o;
    public ArrayList p;
    public ArrayList q;
    public ArrayList r;
    public static TimeInterpolator s;

    public void g(){
       super();
       this.h = new ArrayList();
       this.i = new ArrayList();
       this.j = new ArrayList();
       this.k = new ArrayList();
       this.l = new ArrayList();
       this.m = new ArrayList();
       this.n = new ArrayList();
       this.o = new ArrayList();
       this.p = new ArrayList();
       this.q = new ArrayList();
       this.r = new ArrayList();
    }
    public boolean B(RecyclerView$ViewHolder p0){
       this.U(p0);
       p0.itemView.setAlpha(0);
       this.i.add(p0);
       return true;
    }
    public boolean C(RecyclerView$ViewHolder p0,RecyclerView$ViewHolder p1,int p2,int p3,int p4,int p5){
       if (p0 == p1) {
          return this.D(p0, p2, p3, p4, p5);
       }
       float translationX = p0.itemView.getTranslationX();
       float translationY = p0.itemView.getTranslationY();
       this.U(p0);
       int i = (int)((float)(p4 - p2) - translationX);
       int i1 = (int)((float)(p5 - p3) - translationY);
       p0.itemView.setTranslationX(translationX);
       p0.itemView.setTranslationY(translationY);
       p0.itemView.setAlpha(p0.itemView.getAlpha());
       if (p1 != null) {
          this.U(p1);
          p1.itemView.setTranslationX((float)(- i));
          p1.itemView.setTranslationY((float)(- i1));
          p1.itemView.setAlpha(0);
       }
       g$i oi = new g$i(p0, p1, p2, p3, p4, p5);
       this.k.add(v8);
       return true;
    }
    public boolean D(RecyclerView$ViewHolder p0,int p1,int p2,int p3,int p4){
       RecyclerView$ViewHolder itemView = p0.itemView;
       int i = p1 + (int)itemView.getTranslationX();
       int i1 = p2 + (int)p0.itemView.getTranslationY();
       this.U(p0);
       p1 = p3 - i;
       p2 = p4 - i1;
       if (!p1 && !p2) {
          this.H(p0);
          return false;
       }else if(p1){
          itemView.setTranslationX((float)(- p1));
       }
       if (p2) {
          itemView.setTranslationY((float)(- p2));
       }
       g$j oj = new g$j(p0, i, i1, p3, p4);
       this.j.add(p2);
       return true;
    }
    public boolean E(RecyclerView$ViewHolder p0){
       this.U(p0);
       this.h.add(p0);
       return true;
    }
    public void L(RecyclerView$ViewHolder p0){
       RecyclerView$ViewHolder itemView = p0.itemView;
       ViewPropertyAnimator viewProperty = itemView.animate();
       this.o.add(p0);
       viewProperty.alpha(0x3f800000).setDuration(this.l()).setListener(new g$e(this, p0, itemView, viewProperty)).start();
    }
    public void M(g$i p0){
       g$i a = p0.a;
       RecyclerView$ViewHolder viewHolder = null;
       View view = (a == null)? viewHolder: a.itemView;
       g$i b = p0.b;
       if (b != null) {
          viewHolder = b.itemView;
       }
       float f = 0;
       if (view != null) {
          ViewPropertyAnimator viewProperty = view.animate().setDuration(this.m());
          this.r.add(p0.a);
          viewProperty.translationX((float)(p0.e - p0.c));
          viewProperty.translationY((float)(p0.f - p0.d));
          viewProperty.alpha(f).setListener(new g$g(this, p0, viewProperty, view)).start();
       }
       if (viewHolder != null) {
          ViewPropertyAnimator viewProperty1 = viewHolder.animate();
          this.r.add(p0.b);
          viewProperty1.translationX(f).translationY(f).setDuration(this.m()).alpha(0x3f800000).setListener(new g$h(this, p0, viewProperty1, viewHolder)).start();
       }
       return;
    }
    public void N(RecyclerView$ViewHolder p0,int p1,int p2,int p3,int p4){
       RecyclerView$ViewHolder itemView = p0.itemView;
       int i = p3 - p1;
       int i1 = p4 - p2;
       float f = 0;
       if (i) {
          itemView.animate().translationX(f);
       }
       if (i1) {
          itemView.animate().translationY(f);
       }
       ViewPropertyAnimator viewProperty = itemView.animate();
       this.p.add(p0);
       g$f uof = new g$f(this, p0, i, itemView, i1, viewProperty);
       viewProperty.setDuration(this.n()).setListener(itemView.animate()).start();
       return;
    }
    public final void O(RecyclerView$ViewHolder p0){
       RecyclerView$ViewHolder itemView = p0.itemView;
       ViewPropertyAnimator viewProperty = itemView.animate();
       this.q.add(p0);
       viewProperty.setDuration(this.o()).alpha(0).setListener(new g$d(this, p0, viewProperty, itemView)).start();
    }
    public void P(List p0){
       int i = p0.size();
       i = i - 1;
       while (i >= 0) {
          p0.get(i).itemView.animate().cancel();
       }
       return;
    }
    public void Q(){
       if (!this.p()) {
          this.i();
       }
       return;
    }
    public final void R(List p0,RecyclerView$ViewHolder p1){
       int i = p0.size();
       i = i - 1;
       while (i >= 0) {
          g$i oi = p0.get(i);
          if (this.T(oi, p1) && (oi.a == null && oi.b == null)) {
             p0.remove(oi);
          }
       }
       return;
    }
    public final void S(g$i p0){
       g$i a = p0.a;
       if (a != null) {
          this.T(p0, a);
       }
       a = p0.b;
       if (a != null) {
          this.T(p0, a);
       }
       return;
    }
    public final boolean T(g$i p0,RecyclerView$ViewHolder p1){
       boolean b = false;
       if (p0.b == p1) {
          p0.b = null;
       }else if(p0.a == p1){
          p0.a = null;
          b = true;
       }else {
          return b;
       }
       p1.itemView.setAlpha(0x3f800000);
       p1.itemView.setTranslationX(0);
       p1.itemView.setTranslationY(0);
       this.G(p1, b);
       return true;
    }
    public final void U(RecyclerView$ViewHolder p0){
       if (g.s == null) {
          g.s = new ValueAnimator().getInterpolator();
       }
       p0.itemView.animate().setInterpolator(g.s);
       this.j(p0);
       return;
    }
    public boolean g(RecyclerView$ViewHolder p0,List p1){
       boolean b = (!p1.isEmpty() || super.g(p0, p1))? true: false;
       return b;
    }
    public void j(RecyclerView$ViewHolder p0){
       ArrayList uArrayList;
       RecyclerView$ViewHolder itemView = p0.itemView;
       itemView.animate().cancel();
       int i = this.j.size() - 1;
       float f = 0;
       while (i >= 0) {
          if (this.j.get(i).a == p0) {
             itemView.setTranslationY(f);
             itemView.setTranslationX(f);
             this.H(p0);
             this.j.remove(i);
          }
          i = i - 1;
       }
       this.R(this.k, p0);
       if (this.h.remove(p0)) {
          itemView.setAlpha(0x3f800000);
          this.I(p0);
       }
       if (this.i.remove(p0)) {
          itemView.setAlpha(0x3f800000);
          this.F(p0);
       }
       i = this.n.size() - 1;
       while (i >= 0) {
          uArrayList = this.n.get(i);
          this.R(uArrayList, p0);
          if (uArrayList.isEmpty()) {
             this.n.remove(i);
          }
          i = i - 1;
       }
       i = this.m.size() - 1;
       while (i >= 0) {
          uArrayList = this.m.get(i);
          int i1 = uArrayList.size() - 1;
          while (i1 >= 0) {
             if (uArrayList.get(i1).a == p0) {
                itemView.setTranslationY(f);
                itemView.setTranslationX(f);
                this.H(p0);
                uArrayList.remove(i1);
                if (uArrayList.isEmpty()) {
                   this.m.remove(i);
                   break ;
                }else {
                   break ;
                }
             }
             i1 = i1 - 1;
          }
          i = i - 1;
       }
       i = this.l.size() - 1;
       while (i >= 0) {
          ArrayList uArrayList1 = this.l.get(i);
          if (uArrayList1.remove(p0)) {
             itemView.setAlpha(0x3f800000);
             this.F(p0);
             if (uArrayList1.isEmpty()) {
                this.l.remove(i);
             }
          }
          i = i - 1;
       }
       this.q.remove(p0);
       this.o.remove(p0);
       this.r.remove(p0);
       this.p.remove(p0);
       this.Q();
       return;
    }
    public void k(){
       RecyclerView$ViewHolder itemView;
       ArrayList uArrayList1;
       int i = this.j.size() - 1;
       float f = 0;
       while (i >= 0) {
          g$j oj = this.j.get(i);
          itemView = oj.a.itemView;
          itemView.setTranslationY(f);
          itemView.setTranslationX(f);
          this.H(oj.a);
          this.j.remove(i);
          i = i - 1;
       }
       for (i = this.h.size() - 1; i >= 0; i = i - 1) {
          this.I(this.h.get(i));
          this.h.remove(i);
       }
       i = this.i.size() - 1;
       float f1 = 0x3f800000;
       while (i >= 0) {
          itemView = this.i.get(i);
          itemView.itemView.setAlpha(f1);
          this.F(itemView);
          this.i.remove(i);
          i = i - 1;
       }
       for (i = this.k.size() - 1; i >= 0; i = i - 1) {
          this.S(this.k.get(i));
       }
       this.k.clear();
       if (!this.p()) {
          return;
       }
       i = this.m.size() - 1;
       while (i >= 0) {
          ArrayList uArrayList = this.m.get(i);
          int i1 = uArrayList.size() - 1;
          while (i1 >= 0) {
             g$j oj1 = uArrayList.get(i1);
             RecyclerView$ViewHolder itemView1 = oj1.a.itemView;
             itemView1.setTranslationY(f);
             itemView1.setTranslationX(f);
             this.H(oj1.a);
             uArrayList.remove(i1);
             if (uArrayList.isEmpty()) {
                this.m.remove(uArrayList);
             }
             i1 = i1 - 1;
          }
          i = i - 1;
       }
       i = this.l.size() - 1;
       while (i >= 0) {
          uArrayList1 = this.l.get(i);
          int i2 = uArrayList1.size() - 1;
          while (i2 >= 0) {
             RecyclerView$ViewHolder viewHolder = uArrayList1.get(i2);
             viewHolder.itemView.setAlpha(f1);
             this.F(viewHolder);
             uArrayList1.remove(i2);
             if (uArrayList1.isEmpty()) {
                this.l.remove(uArrayList1);
             }
             i2 = i2 - 1;
          }
          i = i - 1;
       }
       i = this.n.size() - 1;
       while (i >= 0) {
          uArrayList1 = this.n.get(i);
          int i3 = uArrayList1.size() - 1;
          while (i3 >= 0) {
             this.S(uArrayList1.get(i3));
             if (uArrayList1.isEmpty()) {
                this.n.remove(uArrayList1);
             }
             i3 = i3 - 1;
          }
          i = i - 1;
       }
       this.P(this.q);
       this.P(this.p);
       this.P(this.o);
       this.P(this.r);
       this.i();
       return;
    }
    public boolean p(){
       boolean b = (this.i.isEmpty() && (this.k.isEmpty() && (this.j.isEmpty() && (this.h.isEmpty() && (this.p.isEmpty() && (this.q.isEmpty() && (this.o.isEmpty() && (this.r.isEmpty() && (this.m.isEmpty() && (!this.l.isEmpty() || !this.n.isEmpty()))))))))))? true: false;
       return b;
    }
    public void v(){
       ArrayList uArrayList;
       int i = this.h.isEmpty() ^ 0x01;
       int i1 = this.j.isEmpty() ^ 0x01;
       int i2 = this.k.isEmpty() ^ 0x01;
       int i3 = this.i.isEmpty() ^ 0x01;
       if (!i && (!i1 && (!i3 && !i2))) {
          return;
       }
       Iterator iterator = this.h.iterator();
       while (iterator.hasNext()) {
          this.O(iterator.next());
       }
       this.h.clear();
       if (i1) {
          uArrayList = new ArrayList();
          uArrayList.addAll(this.j);
          this.m.add(uArrayList);
          this.j.clear();
          g$a uoa = new g$a(this, uArrayList);
          if (i) {
             i0.l0(uArrayList.get(0).a.itemView, uoa, this.o());
          }else {
             uoa.run();
          }
       }
       if (i2) {
          uArrayList = new ArrayList();
          uArrayList.addAll(this.k);
          this.n.add(uArrayList);
          this.k.clear();
          g$b uob = new g$b(this, uArrayList);
          if (i) {
             i0.l0(uArrayList.get(0).a.itemView, uob, this.o());
          }else {
             uob.run();
          }
       }
       if (i3) {
          ArrayList uArrayList1 = new ArrayList();
          uArrayList1.addAll(this.i);
          this.l.add(uArrayList1);
          this.i.clear();
          g$c uoc = new g$c(this, uArrayList1);
          if (!i && (i1 || i2)) {
             long l = 0;
             long l1 = (i)? this.o(): l;
             long l2 = (i1)? this.n(): l;
             if (i2) {
                l = this.m();
             }
             i0.l0(uArrayList1.get(0).itemView, uoc, (l1 + Math.max(l2, l)));
          }else {
             uoc.run();
          }
       }
       return;
    }
}
