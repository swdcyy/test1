package com.kwai.live.gzone.accompanyplay.audience.b1;
import mrd.c;
import mrd.a;
import com.kwai.live.gzone.accompanyplay.audience.b1$a;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import pp.a;
import q87.c;
import crd.b;
import brd.y;

public class b1 extends c	// class@000b6f
{
    public a b;

    public void b1(){
       super();
       this.b = a.g();
    }
    public void b1(b1$a p0){
       super();
       this.b = a.h(p0);
    }
    public Throwable b(){
       Object obj = PatchProxy.apply(null, this, b1.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.b();
    }
    public boolean c(){
       Object obj = PatchProxy.apply(null, this, b1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.c();
    }
    public boolean d(){
       Object obj = PatchProxy.apply(null, this, b1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.d();
    }
    public boolean e(){
       Object obj = PatchProxy.apply(null, this, b1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.e();
    }
    public boolean g(b1$a p0){
       b1$a obj = PatchProxy.applyOneRefs(p0, this, b1.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b.i();
       if (obj == null) {
          return true;
       }
       if (p0 == obj) {
          return true;
       }
       if (obj.a(p0)) {
          return true;
       }
       return false;
    }
    public b1$a h(){
       Object obj = PatchProxy.apply(null, this, b1.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.i();
    }
    public void i(b1$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b1.class, "7")) {
          return;
       }
       if (this.g(p0)) {
          this.b.onNext(p0);
       }else {
          Object[] objArray = new Object[0];
          a.C().s("LiveGzoneBehaviorSubject", "onNext: cancel onNext", objArray);
       }
       return;
    }
    public void onComplete(){
       if (PatchProxy.applyVoid(null, this, b1.class, "10")) {
          return;
       }
       this.b.onComplete();
       return;
    }
    public void onError(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b1.class, "9")) {
          return;
       }
       this.b.onError(p0);
       return;
    }
    public void onNext(Object p0){
       this.i(p0);
    }
    public void onSubscribe(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b1.class, "6")) {
          return;
       }
       this.b.onSubscribe(p0);
       return;
    }
    public void subscribeActual(y p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b1.class, "5")) {
          return;
       }
       this.b.subscribeActual(p0);
       return;
    }
}
