package qvb.d;
import qvb.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.t;
import java.util.List;
import qvb.o;
import java.lang.Integer;
import qvb.i;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import la6.a;
import t45.d;
import brd.z;
import crd.b;
import qvb.b;
import qvb.c;
import erd.g;

public abstract class d extends a	// class@003783
{
    public String d;
    public String e;
    public int f;
    public boolean g;
    public boolean h;
    public t i;
    public b j;
    public Object k;

    public void d(){
       super();
       this.d = "";
       this.e = "";
       this.f = 2;
    }
    public void A1(){
       if (PatchProxy.applyVoid(null, this, d.class, "6")) {
          return;
       }
       this.z1(0);
       return;
    }
    public void B0(){
       if (PatchProxy.applyVoid(null, this, d.class, "5")) {
          return;
       }
       this.z1(2);
       return;
    }
    public void B1(){
       if (PatchProxy.applyVoid(null, this, d.class, "4")) {
          return;
       }
       this.z1(1);
       return;
    }
    public abstract t C1();
    public void D1(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "9")) {
          return;
       }
       boolean b = this.K();
       if (p0 != null) {
          this.E1(p0, this.b);
          this.k = p0;
          this.c.j(b, false);
       }
       this.g = false;
       this.h = false;
       this.i = null;
       return;
    }
    public abstract void E1(Object p0,List p1);
    public void F(int p0,Object p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uod, "12")) {
          return;
       }
       if (p0 >= 0 && this.getCount() > p0) {
          this.d1().remove(p0);
          this.d1().add(p0, p1);
       }
       return;
    }
    public void F1(String p0,String p1){
       d tf = this.f;
       if (tf != null) {
          if (tf != 1) {
             if (tf == 2) {
                this.e = p1;
             }
          }else {
             this.d = p0;
          }
       }else {
          this.d = p0;
          this.e = p1;
       }
       return;
    }
    public final boolean K(){
       boolean b = (this.k == null || this.h != null)? true: false;
       return b;
    }
    public Object L0(){
       return this.k;
    }
    public boolean P0(){
       boolean b = (this.f == 2)? true: false;
       return b;
    }
    public boolean Q0(){
       Object obj = PatchProxy.apply(null, this, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.e);
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, d.class, "11")) {
          return;
       }
       this.invalidate();
       return;
    }
    public boolean hasMore(){
       d obj = PatchProxy.apply(null, this, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.f;
       if (obj == true) {
          return this.r0();
       }
       if (obj != 2) {
          return true;
       }
       return this.Q0();
    }
    public void invalidate(){
       this.h = true;
    }
    public final boolean isLoading(){
       return this.g;
    }
    public void load(){
    }
    public boolean r0(){
       Object obj = PatchProxy.apply(null, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.d);
    }
    public final void release(){
       if (PatchProxy.applyVoid(null, this, d.class, "13")) {
          return;
       }
       d ti = this.i;
       if (ti != null && this.j != null) {
          ti.unsubscribeOn(d.a);
          this.j.dispose();
       }
       return;
    }
    public String w1(){
       String str;
       d obj = PatchProxy.apply(null, this, d.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.f;
       if (obj != null) {
          if (obj != 1) {
             str = (obj != 2)? "": this.e;
          }else {
             str = this.d;
          }
       }else {
          str = String.valueOf(this.y1());
       }
       return str;
    }
    public int x1(){
       return this.f;
    }
    public abstract long y1();
    public final void z1(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uod, "7")) {
          return;
       }
       this.f = p0;
       if (this.g == null && (this.hasMore() || this.h != null)) {
          this.g = true;
          this.i = this.C1();
          this.c.N0(this.K(), false);
          this.j = this.i.observeOn(d.a).subscribe(new b(this), new c(this));
       }
       return;
    }
}
