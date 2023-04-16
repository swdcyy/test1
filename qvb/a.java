package qvb.a;
import qvb.i;
import java.lang.Object;
import java.util.ArrayList;
import qvb.o;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.List;
import java.lang.Integer;
import java.util.Collection;
import java.lang.Boolean;
import qvb.q;
import java.util.Objects;
import qvb.h;

public abstract class a implements i	// class@00377d
{
    public List b;
    public o c;

    public void a(){
       super();
       this.b = new ArrayList();
       this.c = new o();
    }
    public int A(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.indexOf(p0);
    }
    public void J(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       this.c.J();
       return;
    }
    public void add(int p0,Object p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "11")) {
          return;
       }
       this.b.add(p0, p1);
       this.c.k(false);
       return;
    }
    public void add(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "10")) {
          return;
       }
       this.b.add(p0);
       this.c.k(false);
       return;
    }
    public void b(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "15")) {
          return;
       }
       this.b.addAll(p0);
       this.c.k(false);
       return;
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, a.class, "6")) {
          return;
       }
       this.b.clear();
       this.c.k(true);
       return;
    }
    public boolean d(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = this.b.removeAll(p0);
       if (b) {
          this.c.k(false);
       }
       return b;
    }
    public void e(int p0,List p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "16")) {
          return;
       }
       this.b.addAll(p0, p1);
       this.c.k(false);
       return;
    }
    public void f(q p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.c.f(p0);
       a tc = this.c;
       Objects.requireNonNull(tc);
       Object obj = PatchProxy.apply(null, tc, o.class, "3");
       boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): tc.c.isEmpty();
       if (b) {
          this.release();
       }
       return;
    }
    public int getCount(){
       Object obj = PatchProxy.apply(null, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.size();
    }
    public Object getItem(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "18");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.b.get(p0);
    }
    public List getItems(){
       ArrayList obj = PatchProxy.apply(null, this, a.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList(this.b.size());
       obj.addAll(this.b);
       return obj;
    }
    public void h(q p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       this.c.h(p0);
       return;
    }
    public boolean i(){
       return h.a(this);
    }
    public boolean isEmpty(){
       Object obj = PatchProxy.apply(null, this, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.isEmpty();
    }
    public void l0(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "17")) {
          return;
       }
       this.b.clear();
       this.b.addAll(p0);
       this.c.k(true);
       return;
    }
    public void p1(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       this.c.p1();
       return;
    }
    public void release(){
       h.b(this);
    }
    public boolean remove(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = this.b.remove(p0);
       if (b) {
          this.c.k(false);
       }
       return b;
    }
    public void set(int p0,Object p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "12")) {
          return;
       }
       this.b.set(p0, p1);
       this.c.k(false);
       return;
    }
    public boolean v1(boolean p0){
       return p0;
    }
}
