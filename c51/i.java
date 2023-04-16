package c51.i;
import c51.d;
import c51.h;
import java.lang.Object;
import c51.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wg3.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import bw6.a;
import fw6.b;
import java.lang.Boolean;
import java.util.List;
import java.lang.Integer;
import hw6.a;
import java.util.ArrayList;
import java.util.Collection;

public class i implements d	// class@00047c
{
    public h b;

    public void i(h p0){
       super();
       this.b = p0;
    }
    public void G(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "16")) {
          return;
       }
       this.b.G(p0);
       return;
    }
    public int K(b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.h(p0);
    }
    public boolean P(){
       Object obj = PatchProxy.apply(null, this, i.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.P();
    }
    public void a(h p0){
       this.b = p0;
    }
    public boolean b(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.b(p0);
    }
    public boolean b0(){
       Object obj = PatchProxy.apply(null, this, i.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.b0();
    }
    public boolean clear(){
       Object obj = PatchProxy.apply(null, this, i.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.clear();
    }
    public boolean d(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.d(p0);
    }
    public boolean e(int p0,List p1){
       i oi = i.class;
       if (PatchProxy.isSupport(oi)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, oi, "6");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.b.e(p0, p1);
    }
    public int f(){
       Object obj = PatchProxy.apply(null, this, i.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.f();
    }
    public void g(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "18")) {
          return;
       }
       this.b.g(p0);
       return;
    }
    public b get(int p0){
       i oi = i.class;
       if (PatchProxy.isSupport(oi)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oi, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.b.get(p0);
    }
    public boolean isLoading(){
       Object obj = PatchProxy.apply(null, this, i.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.isLoading();
    }
    public boolean j0(){
       Object obj = PatchProxy.apply(null, this, i.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.j0();
    }
    public boolean k(int p0,b p1){
       i oi = i.class;
       if (PatchProxy.isSupport(oi)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, oi, "4");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.b.t(p1);
    }
    public List l(){
       Object obj = PatchProxy.apply(null, this, i.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.l();
    }
    public boolean m(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.m(p0);
    }
    public boolean o(int p0,List p1){
       i oi = i.class;
       if (PatchProxy.isSupport(oi)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, oi, "22");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.b.o(p0, p1);
    }
    public boolean p(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.p(new ArrayList(p0));
    }
    public void p0(int p0,b p1){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, oi, "20")) {
          return;
       }
       this.b.p0(p0, p1);
       return;
    }
    public boolean r(int p0,b p1){
       i oi = i.class;
       if (PatchProxy.isSupport(oi)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, oi, "7");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.b.r(p0, p1);
    }
    public b remove(int p0){
       i oi = i.class;
       if (PatchProxy.isSupport(oi)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oi, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.b.remove(p0);
    }
    public boolean s(b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.s(p0);
    }
    public void setEnableLoadMore(boolean p0){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oi, "19")) {
          return;
       }
       this.b.setEnableLoadMore(p0);
       return;
    }
    public int size(){
       Object obj = PatchProxy.apply(null, this, i.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.size();
    }
    public boolean t(b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.t(p0);
    }
    public void u(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "17")) {
          return;
       }
       this.b.u(p0);
       return;
    }
    public void y(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "15")) {
          return;
       }
       this.b.y(p0);
       return;
    }
}
