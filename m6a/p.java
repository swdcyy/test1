package m6a.p;
import androidx.recyclerview.widget.y;
import java.util.ArrayList;
import th0.q;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.View;
import java.lang.Integer;
import m6a.p$d;
import m6a.p$e;
import java.util.List;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView$l;
import android.animation.ValueAnimator;
import android.animation.TimeInterpolator;
import java.util.Iterator;
import m6a.q;
import android.animation.Animator$AnimatorListener;
import java.util.Collection;
import m6a.p$a;
import java.lang.Runnable;
import a2.i0;
import m6a.p$b;
import m6a.p$c;
import java.lang.Math;

public class p extends y	// class@002f5d
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
    public final q s;
    public static TimeInterpolator t;

    public void p(){
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
       this.s = new q();
    }
    public boolean B(RecyclerView$ViewHolder p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, p.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.Q(p0);
       p0.itemView.setAlpha(0);
       p0.itemView.setScaleX(0x3f733333);
       p0.itemView.setScaleY(0x3f733333);
       this.i.add(p0);
       PatchProxy.onMethodExit(p.class, "4");
       return true;
    }
    public boolean C(RecyclerView$ViewHolder p0,RecyclerView$ViewHolder p1,int p2,int p3,int p4,int p5){
       Object obj = this;
       object oobject = p0;
       object oobject1 = p1;
       int i = 1;
       if (PatchProxy.isSupport2(p.class, "8")) {
          Object[] objArray = new Object[]{oobject,oobject1,Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5)};
          Object obj1 = PatchProxy.apply(objArray, obj, p.class, "8");
          if (obj1 != PatchProxyResult.class) {
             return obj1.booleanValue();
          }
       }
       if (oobject == oobject1) {
          PatchProxy.onMethodExit(p.class, "8");
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
          oobject.itemView.setScaleX(oobject.itemView.getScaleX());
          oobject.itemView.setScaleY(oobject.itemView.getScaleY());
          if (oobject1 != null) {
             obj.Q(oobject1);
             oobject1.itemView.setTranslationX((float)(- i1));
             oobject1.itemView.setTranslationY((float)(- i2));
             oobject1.itemView.setAlpha(0);
             translationY = 0x3f733333;
             oobject1.itemView.setScaleX(translationY);
             oobject1.itemView.setScaleY(translationY);
          }
          p$d uod = new p$d(p0, p1, p2, p3, p4, p5);
          obj.k.add(translationY);
          PatchProxy.onMethodExit(p.class, "8");
          return i;
       }
    }
    public boolean D(RecyclerView$ViewHolder p0,int p1,int p2,int p3,int p4){
       RecyclerView$ViewHolder obj;
       p op = this;
       object oobject = p0;
       int i = 0;
       if (PatchProxy.isSupport2(p.class, "6")) {
          Object[] objArray = new Object[]{oobject,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          obj = PatchProxy.apply(objArray, this, p.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = oobject.itemView;
       int i1 = (int)obj.getTranslationX() + p1;
       int i2 = (int)oobject.itemView.getTranslationY() + p2;
       this.Q(p0);
       int i3 = p3 - i1;
       int i4 = p4 - i2;
       if (!i3 && !i4) {
          this.H(p0);
          PatchProxy.onMethodExit(p.class, "6");
          return i;
       }else if(i3){
          obj.setTranslationX((float)(- i3));
       }
       if (i4) {
          obj.setTranslationY((float)(- i4));
       }
       p$e uoe = new p$e(p0, i1, i2, p3, p4);
       op.j.add(v11);
       PatchProxy.onMethodExit(p.class, "6");
       return 1;
    }
    public boolean E(RecyclerView$ViewHolder p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, p.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.Q(p0);
       this.h.add(p0);
       PatchProxy.onMethodExit(p.class, "2");
       return true;
    }
    public void L(List p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, p.class, "18")) {
          return;
       }
       int i = p0.size();
       i = i - 1;
       while (i >= 0) {
          p0.get(i).itemView.animate().cancel();
       }
       PatchProxy.onMethodExit(p.class, "18");
       return;
    }
    public void M(){
       if (PatchProxy.applyVoidWithListener(null, this, p.class, "16")) {
          return;
       }
       if (!this.p()) {
          this.i();
       }
       PatchProxy.onMethodExit(p.class, "16");
       return;
    }
    public final void N(List p0,RecyclerView$ViewHolder p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, p.class, "10")) {
          return;
       }
       int i = p0.size();
       i = i - 1;
       while (i >= 0) {
          p$d uod = p0.get(i);
          if (this.P(uod, p1) && (uod.a == null && uod.b == null)) {
             p0.remove(uod);
          }
       }
       PatchProxy.onMethodExit(p.class, "10");
       return;
    }
    public final void O(p$d p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, p.class, "11")) {
          return;
       }
       p$d a = p0.a;
       if (a != null) {
          this.P(p0, a);
       }
       a = p0.b;
       if (a != null) {
          this.P(p0, a);
       }
       PatchProxy.onMethodExit(p.class, "11");
       return;
    }
    public final boolean P(p$d p0,RecyclerView$ViewHolder p1){
       Object obj = PatchProxy.applyTwoRefsWithListener(p0, p1, this, p.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       RecyclerView$ViewHolder viewHolder = null;
       boolean b = false;
       if (p0.b == p1) {
          p0.b = viewHolder;
       }else if(p0.a == p1){
          p0.a = viewHolder;
          b = true;
       }else {
          PatchProxy.onMethodExit(p.class, "12");
          return b;
       }
       p1.itemView.setAlpha(0x3f800000);
       p1.itemView.setTranslationX(0);
       p1.itemView.setTranslationY(0);
       p1.itemView.setScaleX(0x3f800000);
       p1.itemView.setScaleY(0x3f800000);
       this.G(p1, b);
       PatchProxy.onMethodExit(p.class, "12");
       return true;
    }
    public final void Q(RecyclerView$ViewHolder p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, p.class, "14")) {
          return;
       }
       if (p.t == null) {
          p.t = new ValueAnimator().getInterpolator();
       }
       p0.itemView.animate().setInterpolator(p.t);
       this.j(p0);
       PatchProxy.onMethodExit(p.class, "14");
       return;
    }
    public boolean g(RecyclerView$ViewHolder p0,List p1){
       Object obj = PatchProxy.applyTwoRefsWithListener(p0, p1, this, p.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!p1.isEmpty() || super.g(p0, p1))? true: false;
       PatchProxy.onMethodExit(p.class, "19");
       return b;
    }
    public void j(RecyclerView$ViewHolder p0){
       ArrayList uArrayList;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, p.class, "13")) {
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
          itemView.setScaleX(0x3f800000);
          itemView.setScaleY(0x3f800000);
          this.I(p0);
       }
       if (this.i.remove(p0)) {
          itemView.setAlpha(0x3f800000);
          itemView.setScaleX(0x3f800000);
          itemView.setScaleY(0x3f800000);
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
             itemView.setScaleX(0x3f800000);
             itemView.setScaleY(0x3f800000);
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
       this.M();
       PatchProxy.onMethodExit(p.class, "13");
       return;
    }
    public void k(){
       RecyclerView$ViewHolder itemView;
       ArrayList uArrayList1;
       if (PatchProxy.applyVoidWithListener(null, this, p.class, "17")) {
          return;
       }
       int i = this.j.size() - 1;
       float f = 0;
       while (i >= 0) {
          p$e uoe = this.j.get(i);
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
          PatchProxy.onMethodExit(p.class, "17");
          return;
       }else {
          i = this.m.size() - 1;
          while (i >= 0) {
             ArrayList uArrayList = this.m.get(i);
             int i1 = uArrayList.size() - 1;
             while (i1 >= 0) {
                p$e uoe1 = uArrayList.get(i1);
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
          PatchProxy.onMethodExit(p.class, "17");
          return;
       }
    }
    public boolean p(){
       p op = p.class;
       Object obj = PatchProxy.applyWithListener(null, this, op, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.i.isEmpty() && (this.k.isEmpty() && (this.j.isEmpty() && (this.h.isEmpty() && (this.p.isEmpty() && (this.q.isEmpty() && (this.o.isEmpty() && (this.r.isEmpty() && (this.m.isEmpty() && (!this.l.isEmpty() || !this.n.isEmpty()))))))))))? true: false;
       PatchProxy.onMethodExit(op, "15");
       return b;
    }
    public void v(){
       ArrayList uArrayList;
       if (PatchProxy.applyVoidWithListener(null, this, p.class, "1")) {
          return;
       }
       int i = this.h.isEmpty() ^ 0x01;
       int i1 = this.j.isEmpty() ^ 0x01;
       int i2 = this.k.isEmpty() ^ 0x01;
       int i3 = this.i.isEmpty() ^ 0x01;
       if (!i && (!i1 && (!i3 && !i2))) {
          PatchProxy.onMethodExit(p.class, "1");
          return;
       }else {
          Iterator iterator = this.h.iterator();
          while (iterator.hasNext()) {
             RecyclerView$ViewHolder viewHolder = iterator.next();
             String str = "3";
             if (PatchProxy.applyVoidOneRefsWithListener(viewHolder, this, p.class, str)) {
                continue ;
             }
             RecyclerView$ViewHolder itemView = viewHolder.itemView;
             ViewPropertyAnimator viewProperty = itemView.animate();
             this.q.add(viewHolder);
             viewProperty.setDuration(this.o()).alpha(0).scaleX(0x3f733333).scaleY(0x3f733333).setListener(new q(this, viewHolder, viewProperty, itemView)).start();
             PatchProxy.onMethodExit(p.class, str);
          }
          this.h.clear();
          if (i1) {
             uArrayList = new ArrayList();
             uArrayList.addAll(this.j);
             this.m.add(uArrayList);
             this.j.clear();
             p$a uoa = new p$a(this, uArrayList);
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
             p$b uob = new p$b(this, uArrayList);
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
             p$c uoc = new p$c(this, uArrayList1);
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
          PatchProxy.onMethodExit(p.class, "1");
          return;
       }
    }
}
