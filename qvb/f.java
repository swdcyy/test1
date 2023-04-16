package qvb.f;
import qvb.n0;
import java.lang.Object;
import la6.b;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Collection;
import com.kwai.robust.PatchProxyResult;
import java.util.Iterator;
import java.lang.Boolean;
import qvb.f$b;
import qvb.f$c;
import qvb.f$a;
import e72.o;

public abstract class f extends n0	// class@00378a
{
    public f$b m;
    public f$c n;
    public List o;

    public void f(){
       super();
    }
    public boolean B1(Object p0){
       return this.X1(p0);
    }
    public void M1(Object p0,List p1){
       this.d2(p0, p1);
    }
    public void V1(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "5")) {
          return;
       }
       if (this.o == null) {
          this.o = new ArrayList();
       }
       this.o.clear();
       this.o.addAll(p0);
       return;
    }
    public List W1(b p0,List p1){
       List obj = PatchProxy.applyTwoRefs(p0, p1, this, f.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.getItems();
       if (obj == null || this.i()) {
          return obj;
       }
       ArrayList uArrayList = new ArrayList();
       ArrayList uArrayList1 = new ArrayList();
       Iterator iterator = obj.iterator();
       while (iterator.hasNext()) {
          Object obj1 = iterator.next();
          if (!p1.contains(obj1) || (this.g2(obj1) && !uArrayList.contains(obj1))) {
             uArrayList.add(obj1);
          }else {
             uArrayList1.add(obj1);
          }
       }
       this.b2(p0, uArrayList1);
       return uArrayList;
    }
    public boolean X1(b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return p0.hasMore();
    }
    public List Y1(List p0,List p1,List p2){
       ArrayList obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, f.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       if (this.i()) {
          return p2;
       }
       Iterator iterator = p2.iterator();
       while (iterator.hasNext()) {
          Object obj1 = iterator.next();
          if (!p0.contains(obj1) || (this.g2(obj1) && p1.contains(obj1))) {
             obj.add(obj1);
          }
       }
       return obj;
    }
    public f$b Z1(){
       return this.m;
    }
    public void a2(List p0){
    }
    public void b2(b p0,List p1){
    }
    public void c2(List p0){
    }
    public void d2(b p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f.class, "2")) {
          return;
       }
       if (this.K()) {
          this.c2(new ArrayList(p1));
          p1.clear();
       }
       List list = this.W1(p0, p1);
       if (list == null) {
          return;
       }else {
          ArrayList uArrayList = new ArrayList(p1);
          f tn = this.n;
          if (tn != null) {
             tn.a(list, this.K());
          }
          p1.addAll(list);
          this.a2(p1);
          this.o = this.Y1(uArrayList, p1, list);
          f$b uob = this.Z1();
          if (uob instanceof f$a) {
             uob.b(p1, p0, list);
          }else if(uob != null){
             uob.a(p1);
          }
          return;
       }
    }
    public void e2(f$b p0){
       this.m = p0;
    }
    public void f2(f$c p0){
       this.n = p0;
    }
    public boolean g2(Object p0){
       return false;
    }
    public boolean i(){
       return (this instanceof o ^ 0x01);
    }
    public List z0(){
       return this.o;
    }
}
