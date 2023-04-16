package g3a.a;
import wvb.e;
import qvb.i;
import ok.o;
import java.util.ArrayList;
import g3a.a$a;
import java.util.List;
import java.util.Collection;
import qvb.q;
import qvb.j;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.util.Iterator;
import g3a.b;

public class a extends e	// class@0023a3
{
    public final List f;
    public boolean g;
    public o h;
    public final b i;
    public final q j;

    public void a(i p0){
       super(p0, null);
    }
    public void a(i p0,o p1){
       super(p0);
       ArrayList uArrayList = new ArrayList();
       this.f = uArrayList;
       this.g = false;
       a$a uoa = new a$a(this);
       this.j = uoa;
       this.h = p1;
       this.i = null;
       uArrayList.addAll(p0.getItems());
       this.n();
       this.p();
       p0.h(uoa);
    }
    public void F(int p0,Object p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "15")) {
          return;
       }
       if (p0 >= 0 && this.getCount() > p0) {
          this.f.remove(p0);
          this.f.add(p0, p1);
       }
       return;
    }
    public void add(int p0,Object p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "8")) {
          return;
       }
       if (this.g != null) {
          super.add(p0, p1);
       }
       this.f.add(p0, p1);
       return;
    }
    public void add(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "7")) {
          return;
       }
       if (this.g != null) {
          super.add(p0);
       }
       this.f.add(p0);
       return;
    }
    public void b(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "10")) {
          return;
       }
       if (this.g != null) {
          super.b(p0);
       }
       this.f.addAll(p0);
       this.n();
       this.p();
       return;
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, a.class, "11")) {
          return;
       }
       if (this.g != null) {
          super.clear();
       }
       this.f.clear();
       return;
    }
    public boolean d(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.g != null) {
          super.d(p0);
       }
       return this.f.removeAll(p0);
    }
    public List d1(){
       return this.f;
    }
    public int getCount(){
       Object obj = PatchProxy.apply(null, this, a.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.f.size();
    }
    public Object getItem(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "14");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.f.get(p0);
    }
    public List getItems(){
       ArrayList obj = PatchProxy.apply(null, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList(this.f.size());
       obj.addAll(this.f);
       return obj;
    }
    public void l0(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "12")) {
          return;
       }
       if (this.g != null) {
          super.l0(p0);
       }
       this.f.clear();
       this.f.addAll(p0);
       this.n();
       this.p();
       return;
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       if (this.h != null) {
          Iterator iterator = this.f.iterator();
          while (iterator.hasNext()) {
             if (!this.h.apply(iterator.next())) {
                iterator.remove();
             }
          }
       }
       return;
    }
    public void p(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       a ti = this.i;
       if (ti != null) {
          ti.h(this.f);
       }
       return;
    }
    public boolean remove(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.g != null) {
          super.remove(p0);
       }
       return this.f.remove(p0);
    }
    public void set(int p0,Object p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "9")) {
          return;
       }
       if (this.g != null) {
          super.set(p0, p1);
       }
       this.f.set(p0, p1);
       return;
    }
}
