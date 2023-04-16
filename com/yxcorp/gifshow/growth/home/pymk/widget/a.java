package com.yxcorp.gifshow.growth.home.pymk.widget.a;
import androidx.recyclerview.widget.y;
import androidx.recyclerview.widget.RecyclerView$l$a;
import java.util.ArrayList;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.View;
import java.lang.Integer;
import com.yxcorp.gifshow.growth.home.pymk.widget.a$d;
import com.yxcorp.gifshow.growth.home.pymk.widget.a$e;
import java.util.List;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView$l;
import android.animation.ValueAnimator;
import android.animation.TimeInterpolator;
import java.lang.Number;
import java.util.Iterator;
import wna.a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import wna.c;
import android.animation.Animator$AnimatorListener;
import java.util.Collection;
import com.yxcorp.gifshow.growth.home.pymk.widget.a$a;
import java.lang.Runnable;
import a2.i0;
import com.yxcorp.gifshow.growth.home.pymk.widget.a$b;
import com.yxcorp.gifshow.growth.home.pymk.widget.a$c;
import java.lang.Math;

public class a extends y	// class@0013b0
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
    public final RecyclerView$l$a s;
    public static TimeInterpolator t;

    public void a(RecyclerView$l$a p0){
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
       this.s = p0;
    }
    public boolean B(RecyclerView$ViewHolder p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.Q(p0);
       p0.itemView.setAlpha(0);
       this.i.add(p0);
       return true;
    }
    public boolean C(RecyclerView$ViewHolder p0,RecyclerView$ViewHolder p1,int p2,int p3,int p4,int p5){
       a uoa = this;
       object oobject = p0;
       object oobject1 = p1;
       a uoa1 = a.class;
       int i = 1;
       if (PatchProxy.isSupport(uoa1)) {
          Object[] objArray = new Object[]{oobject,oobject1,Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5)};
          Object obj = PatchProxy.apply(objArray, this, uoa1, "8");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (oobject == oobject1) {
          return this.D(p0, p2, p3, p4, p5);
       }else {
          float translationX = oobject.itemView.getTranslationX();
          float translationY = oobject.itemView.getTranslationY();
          this.Q(p0);
          int i1 = (int)((float)(p4 - p2) - translationX);
          int i2 = (int)((float)(p5 - p3) - translationY);
          oobject.itemView.setTranslationX(translationX);
          oobject.itemView.setTranslationY(translationY);
          oobject.itemView.setAlpha(oobject.itemView.getAlpha());
          if (oobject1 != null) {
             this.Q(oobject1);
             oobject1.itemView.setTranslationX((float)(- i1));
             oobject1.itemView.setTranslationY((float)(- i2));
             oobject1.itemView.setAlpha(0);
          }
          a$d uod = new a$d(p0, p1, p2, p3, p4, p5);
          uoa.k.add(translationY);
          return i;
       }
    }
    public boolean D(RecyclerView$ViewHolder p0,int p1,int p2,int p3,int p4){
       RecyclerView$ViewHolder obj;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          obj = PatchProxy.apply(objArray, this, uoa, "6");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = p0.itemView;
       int i = p1 + (int)obj.getTranslationX();
       int i1 = p2 + (int)p0.itemView.getTranslationY();
       this.Q(p0);
       p1 = p3 - i;
       p2 = p4 - i1;
       if (!p1 && !p2) {
          this.H(p0);
          return 0;
       }else if(p1){
          obj.setTranslationX((float)(- p1));
       }
       if (p2) {
          obj.setTranslationY((float)(- p2));
       }
       a$e uoe = new a$e(p0, i, i1, p3, p4);
       this.j.add(p2);
       return 1;
    }
    public boolean E(RecyclerView$ViewHolder p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.Q(p0);
       this.h.add(p0);
       return true;
    }
    public void L(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "18")) {
          return;
       }
       int i = p0.size();
       i = i - 1;
       while (i >= 0) {
          p0.get(i).itemView.animate().cancel();
       }
       return;
    }
    public void M(){
       if (PatchProxy.applyVoid(null, this, a.class, "16")) {
          return;
       }
       if (!this.p()) {
          this.i();
       }
       return;
    }
    public final void N(List p0,RecyclerView$ViewHolder p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "10")) {
          return;
       }
       int i = p0.size();
       i = i - 1;
       while (i >= 0) {
          a$d uod = p0.get(i);
          if (this.P(uod, p1) && (uod.a == null && uod.b == null)) {
             p0.remove(uod);
          }
       }
       return;
    }
    public final void O(a$d p0){
       a$d a;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "11")) {
          return;
       }
       a = p0.a;
       if (a != null) {
          this.P(p0, a);
       }
       a = p0.b;
       if (a != null) {
          this.P(p0, a);
       }
       return;
    }
    public final boolean P(a$d p0,RecyclerView$ViewHolder p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
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
    public final void Q(RecyclerView$ViewHolder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "14")) {
          return;
       }
       if (a.t == null) {
          a.t = new ValueAnimator().getInterpolator();
       }
       p0.itemView.animate().setInterpolator(a.t);
       this.j(p0);
       return;
    }
    public boolean g(RecyclerView$ViewHolder p0,List p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!p1.isEmpty() || super.g(p0, p1))? true: false;
       return b;
    }
    public void j(RecyclerView$ViewHolder p0){
       ArrayList uArrayList;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "13")) {
          return;
       }
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
       this.N(this.k, p0);
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
          this.N(uArrayList, p0);
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
       this.M();
       return;
    }
    public void k(){
       RecyclerView$ViewHolder itemView;
       ArrayList uArrayList1;
       if (PatchProxy.applyVoid(null, this, a.class, "17")) {
          return;
       }
       int i = this.j.size() - 1;
       float f = 0;
       while (i >= 0) {
          a$e uoe = this.j.get(i);
          itemView = uoe.a.itemView;
          itemView.setTranslationY(f);
          itemView.setTranslationX(f);
          this.H(uoe.a);
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
          this.O(this.k.get(i));
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
             a$e uoe1 = uArrayList.get(i1);
             RecyclerView$ViewHolder itemView1 = uoe1.a.itemView;
             itemView1.setTranslationY(f);
             itemView1.setTranslationX(f);
             this.H(uoe1.a);
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
             this.O(uArrayList1.get(i3));
             if (uArrayList1.isEmpty()) {
                this.n.remove(uArrayList1);
             }
             i3 = i3 - 1;
          }
          i = i - 1;
       }
       this.L(this.q);
       this.L(this.p);
       this.L(this.o);
       this.L(this.r);
       this.i();
       return;
    }
    public long l(){
       return 500;
    }
    public long m(){
       Object obj = PatchProxy.apply(null, this, a.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return super.m();
    }
    public long n(){
       return 500;
    }
    public long o(){
       return 150;
    }
    public boolean p(){
       Object obj = PatchProxy.apply(null, this, a.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.i.isEmpty() && (this.k.isEmpty() && (this.j.isEmpty() && (this.h.isEmpty() && (this.p.isEmpty() && (this.q.isEmpty() && (this.o.isEmpty() && (this.r.isEmpty() && (this.m.isEmpty() && (!this.l.isEmpty() || !this.n.isEmpty()))))))))))? true: false;
       return b;
    }
    public void v(){
       ArrayList uArrayList;
       a uoa = a.class;
       if (PatchProxy.applyVoid(null, this, uoa, "1")) {
          return;
       }
       int i = this.h.isEmpty() ^ 0x01;
       int i1 = this.j.isEmpty() ^ 0x01;
       int i2 = this.k.isEmpty() ^ 0x01;
       int i3 = this.i.isEmpty() ^ 0x01;
       if (!i && (!i1 && (!i3 && !i2))) {
          return;
       }
       Iterator iterator = this.h.iterator();
       while (iterator.hasNext()) {
          RecyclerView$ViewHolder viewHolder = iterator.next();
          if (PatchProxy.applyVoidOneRefs(viewHolder, this, uoa, "3")) {
             continue ;
          }
          this.q.add(viewHolder);
          this.q(this.s);
          ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
          valueAnimato.setDuration(300).addUpdateListener(new a(viewHolder.itemView));
          valueAnimato.addListener(new c(this, viewHolder));
          valueAnimato.start();
       }
       this.h.clear();
       long l = 150;
       int i4 = 0;
       if (i1) {
          uArrayList = new ArrayList();
          uArrayList.addAll(this.j);
          this.m.add(uArrayList);
          this.j.clear();
          a$a uoa1 = new a$a(this, uArrayList);
          if (i) {
             i0.l0(uArrayList.get(i4).a.itemView, uoa1, l);
          }else {
             uoa1.run();
          }
       }
       if (i2) {
          uArrayList = new ArrayList();
          uArrayList.addAll(this.k);
          this.n.add(uArrayList);
          this.k.clear();
          a$b uob = new a$b(this, uArrayList);
          if (i) {
             i0.l0(uArrayList.get(i4).a.itemView, uob, l);
          }else {
             uob.run();
          }
       }
       if (i3) {
          ArrayList uArrayList1 = new ArrayList();
          uArrayList1.addAll(this.i);
          this.l.add(uArrayList1);
          this.i.clear();
          a$c uoc = new a$c(this, uArrayList1);
          if (!i && (i1 || i2)) {
             long l1 = 0;
             if (!i) {
                l = l1;
             }
             long l2 = (i1)? 500: l1;
             if (i2) {
                l1 = this.m();
             }
             i0.l0(uArrayList1.get(i4).itemView, uoc, (l + Math.max(l2, l1)));
          }else {
             uoc.run();
          }
       }
       return;
    }
}
