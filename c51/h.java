package c51.h;
import c51.b;
import c51.d;
import fw6.b;
import c51.e;
import java.util.ArrayList;
import ok.o;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import c51.h$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import bw6.a;
import wg3.b;
import c51.a;
import java.lang.Throwable;
import java.lang.Integer;
import java.util.Collection;
import java.util.Collections;
import gw6.b;
import java.lang.Number;

public class h extends b implements b, d	// class@00047b
{
    public boolean g;
    public final e h;
    public final List i;
    public final b j;

    public void h(e p0){
       super(new ArrayList(), p0.o());
       this.i = new CopyOnWriteArrayList();
       h$a uoa = new h$a(this);
       this.j = uoa;
       this.h = p0;
       List dataList = p0.getDataList();
       if (dataList != null && !dataList.isEmpty()) {
          super.p(dataList);
       }else {
          p0.a();
       }
       this.y(this);
       p0.p(uoa);
       return;
    }
    public void G(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "5")) {
          return;
       }
       this.i.remove(p0);
       return;
    }
    public boolean P(){
       Object obj = PatchProxy.apply(null, this, h.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.h.a();
    }
    public boolean Q(int p0,a p1){
       return this.r(p0, p1);
    }
    public boolean R(a p0){
       return this.t(p0);
    }
    public void S(boolean p0){
       a.e(this, p0);
    }
    public void U(boolean p0){
       a.d(this, p0);
    }
    public boolean W(a p0){
       return this.s(p0);
    }
    public void X(boolean p0,Throwable p1){
       a.c(this, p0, p1);
    }
    public boolean b(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.h.b(p0);
       return super.b(p0);
    }
    public boolean b0(){
       Object obj = PatchProxy.apply(null, this, h.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.g == null) {
          return false;
       }
       return this.h.n();
    }
    public void c0(){
       a.a(this);
    }
    public boolean clear(){
       Object obj = PatchProxy.apply(null, this, h.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.h.clear();
       this.G(this);
       return super.clear();
    }
    public boolean d(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.h.d(p0);
       return super.d(p0);
    }
    public boolean e(int p0,List p1){
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, oh, "16");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       this.h.e(p0, p1);
       return super.e(p0, p1);
    }
    public boolean isLoading(){
       Object obj = PatchProxy.apply(null, this, h.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.h.isLoading();
    }
    public boolean j0(){
       Object obj = PatchProxy.apply(null, this, h.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.h.hasMore();
    }
    public boolean k(int p0,b p1){
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, oh, "14");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       this.h.k(p0, p1);
       return super.R(p1);
    }
    public List l(){
       List list;
       ArrayList obj = PatchProxy.apply(null, this, h.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.c != null)? new ArrayList(this.c): Collections.emptyList();
       return obj;
    }
    public boolean m(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.h.d(p0);
       return super.m(p0);
    }
    public boolean o(int p0,List p1){
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, oh, "17");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       this.h.e(p0, p1);
       return super.o(p0, p1);
    }
    public boolean o0(int p0,a p1){
       boolean b;
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, oh, "14");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          label_0028 :
             return b;
          }
       }
       this.h.k(p0, p1);
       b = super.R(p1);
       goto label_0028 ;
    }
    public boolean p(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = super.p(p0);
       if (b) {
          this.h.clear();
          this.h.b(p0);
       }
       return b;
    }
    public void p0(int p0,b p1){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, oh, "23")) {
          return;
       }
       this.h.r(p0, p1);
       return;
    }
    public boolean r(int p0,b p1){
       b obj;
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, oh, "18");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       this.h.r(p0, p1);
       obj = this.c;
       if (obj != null && (obj.contains(p1) && this.c.indexOf(p1) == p0)) {
          this.e.a(this.c, p0);
          return true;
       }else {
          return super.Q(p0, p1);
       }
    }
    public a remove(int p0){
       return this.remove(p0);
    }
    public b remove(int p0){
       b obj;
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oh, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.c;
       if (obj != null) {
          this.h.remove(p0);
          return obj.remove(p0);
       }else {
          return null;
       }
    }
    public boolean s(b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.h.s(p0);
       return super.W(p0);
    }
    public void setEnableLoadMore(boolean p0){
       this.g = p0;
    }
    public int size(){
       b obj = PatchProxy.apply(null, this, h.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.c;
       int i = (obj != null)? obj.size(): 0;
       return i;
    }
    public boolean t(b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.h.t(p0);
       return super.R(p0);
    }
    public void w(boolean p0,List p1){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, oh, "22")) {
          return;
       }
       if (p0) {
          super.b(new ArrayList(p1));
       }else {
          super.p(new ArrayList(p1));
       }
       return;
    }
    public void w0(){
       if (PatchProxy.applyVoid(null, this, h.class, "21")) {
          return;
       }
       super.w0();
       this.h.q(this.j);
       return;
    }
    public void y(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "4")) {
          return;
       }
       if (this.i.contains(p0)) {
          return;
       }
       this.i.add(p0);
       return;
    }
}
