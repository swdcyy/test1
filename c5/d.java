package c5.d;
import c5.e;
import c5.n;
import d5.a$a;
import g5.e;
import a5.f;
import com.airbnb.lottie.ex.model.layer.a;
import i5.i;
import java.util.List;
import java.util.ArrayList;
import java.lang.Object;
import i5.b;
import c5.c;
import h5.l;
import java.lang.String;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import d5.o;
import c5.j;
import java.util.ListIterator;
import android.graphics.Canvas;
import d5.a;
import java.lang.Integer;
import java.util.Collection;
import n5.c;
import g5.d;

public class d implements e, n, a$a, e	// class@000cce
{
    public final Matrix a;
    public final Path b;
    public final RectF c;
    public final String d;
    public final boolean e;
    public final List f;
    public final f g;
    public List h;
    public o i;

    public void d(f p0,a p1,i p2){
       b uob1;
       i a = p2.a;
       i c = p2.c;
       List list = p2.b();
       ArrayList uArrayList = new ArrayList(list.size());
       int i = 0;
       int i1 = 0;
       while (i1 < list.size()) {
          c uoc = list.get(i1).a(p0, p1);
          if (uoc != null) {
             uArrayList.add(uoc);
          }
          i1 = i1 + 1;
       }
       List list1 = p2.b();
       while (true) {
          if (i < list1.size()) {
             b uob = list1.get(i);
             if (uob instanceof l) {
                uob1 = uob;
                break ;
             }else {
                i = i + 1;
             }
          }else {
             uob1 = null;
             break ;
          }
       }
       super(p0, p1, a, c, uArrayList, uob1);
       return;
    }
    public void d(f p0,a p1,String p2,boolean p3,List p4,l p5){
       super();
       this.a = new Matrix();
       this.b = new Path();
       this.c = new RectF();
       this.d = p2;
       this.g = p0;
       this.e = p3;
       this.f = p4;
       if (p5 != null) {
          o oo = p5.b();
          this.i = oo;
          oo.a(p1);
          this.i.b(this);
       }
       ArrayList uArrayList = new ArrayList();
       int i = p4.size();
       i--;
       while (i >= 0) {
          c uoc = p4.get(i);
          if (uoc instanceof j) {
             uArrayList.add(uoc);
          }
       }
       i = uArrayList.size();
       i--;
       while (i >= 0) {
          uArrayList.get(i).d(p4.listIterator(p4.size()));
       }
       return;
    }
    public void a(Canvas p0,Matrix p1,int p2){
       int i;
       if (this.e != null) {
          return;
       }
       this.a.set(p1);
       d ti = this.i;
       if (ti != null) {
          this.a.preConcat(ti.e());
          i = (this.i.g() == null)? 100: this.i.g().h().intValue();
          p2 = (int)(((((float)i / 100.00f) * (float)p2) / 0x437f0000) * 0x437f0000);
       }
       i = this.f.size() - 1;
       while (i >= 0) {
          Object obj = this.f.get(i);
          if (obj instanceof e) {
             obj.a(p0, this.a, p2);
          }
          i--;
       }
       return;
    }
    public void b(List p0,List p1){
       ArrayList uArrayList = new ArrayList((p0.size() + this.f.size()));
       uArrayList.addAll(p0);
       for (int i = this.f.size() - 1; i >= 0; i--) {
          c uoc = this.f.get(i);
          uoc.b(uArrayList, this.f.subList(0, i));
          uArrayList.add(uoc);
       }
       return;
    }
    public void c(RectF p0,Matrix p1,boolean p2){
       this.a.set(p1);
       d ti = this.i;
       if (ti != null) {
          this.a.preConcat(ti.e());
       }
       this.c.set(0, 0, 0, 0);
       int i = this.f.size() - 1;
       while (i >= 0) {
          c uoc = this.f.get(i);
          if (uoc instanceof e) {
             uoc.c(this.c, this.a, p2);
             p0.union(this.c);
          }
          i--;
       }
       return;
    }
    public List d(){
       if (this.h == null) {
          this.h = new ArrayList();
          int i = 0;
          while (i < this.f.size()) {
             c uoc = this.f.get(i);
             if (uoc instanceof n) {
                this.h.add(uoc);
             }
             i = i + 1;
          }
       }
       return this.h;
    }
    public void e(){
       this.g.invalidateSelf();
    }
    public void f(Object p0,c p1){
       d ti = this.i;
       if (ti != null) {
          ti.c(p0, p1);
       }
       return;
    }
    public void g(d p0,int p1,List p2,d p3){
       if (!p0.g(this.getName(), p1)) {
          return;
       }
       if (!("__container").equals(this.getName())) {
          p3 = p3.a(this.getName());
          if (p0.c(this.getName(), p1)) {
             p2.add(p3.i(this));
          }
       }
       if (p0.h(this.getName(), p1)) {
          p1 = p1 + p0.e(this.getName(), p1);
          int i = 0;
          while (i < this.f.size()) {
             c uoc = this.f.get(i);
             if (uoc instanceof e) {
                uoc.g(p0, p1, p2, p3);
             }
             i = i + 1;
          }
       }
       return;
    }
    public String getName(){
       return this.d;
    }
    public Path getPath(){
       this.a.reset();
       d ti = this.i;
       if (ti != null) {
          this.a.set(ti.e());
       }
       this.b.reset();
       if (this.e != null) {
          return this.b;
       }else {
          int i = this.f.size() - 1;
          while (i >= 0) {
             c uoc = this.f.get(i);
             if (uoc instanceof n) {
                this.b.addPath(uoc.getPath(), this.a);
             }
             i = i - 1;
          }
          return this.b;
       }
    }
    public Matrix h(){
       d ti = this.i;
       if (ti != null) {
          return ti.e();
       }
       this.a.reset();
       return this.a;
    }
}
