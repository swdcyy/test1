package ek9.t0;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;
import mrd.a;
import pk9.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.mix.QComment;
import java.lang.Integer;
import nk9.f;
import com.yxcorp.gifshow.entity.QPhoto;
import ek9.t0$a;
import java.lang.Boolean;
import erd.g;
import crd.b;
import com.kwai.robust.PatchProxyResult;
import brd.t;

public final class t0	// class@0021a3
{
    public PublishSubject a;
    public PublishSubject b;
    public PublishSubject c;
    public PublishSubject d;
    public PublishSubject e;
    public PublishSubject f;
    public PublishSubject g;
    public PublishSubject h;
    public PublishSubject i;
    public PublishSubject j;
    public PublishSubject k;
    public PublishSubject l;
    public a m;

    public void t0(){
       super();
       this.a = PublishSubject.g();
       this.b = PublishSubject.g();
       this.c = PublishSubject.g();
       this.d = PublishSubject.g();
       this.e = PublishSubject.g();
       this.f = PublishSubject.g();
       this.g = PublishSubject.g();
       this.h = PublishSubject.g();
       this.i = PublishSubject.g();
       this.j = PublishSubject.g();
       this.k = PublishSubject.g();
       this.l = PublishSubject.g();
       this.m = a.g();
    }
    public void a(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t0.class, "2")) {
          return;
       }
       this.m.onNext(p0);
       return;
    }
    public void b(int p0,QComment p1){
       t0 ot0 = t0.class;
       if (PatchProxy.isSupport(ot0) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, ot0, "14")) {
          return;
       }
       this.l.onNext(new f(p0, p1));
       return;
    }
    public void c(QPhoto p0,QComment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, t0.class, "10")) {
          return;
       }
       this.d.onNext(new t0$a(p0, p1));
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, t0.class, "22")) {
          return;
       }
       this.h.onNext(Boolean.FALSE);
       return;
    }
    public void e(QPhoto p0,QComment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, t0.class, "19")) {
          return;
       }
       this.g.onNext(new t0$a(p0, p1));
       return;
    }
    public void f(QPhoto p0,QComment p1,boolean p2){
       if (PatchProxy.isSupport(t0.class) && PatchProxy.applyVoidThreeRefs(p0, null, Boolean.valueOf(p2), this, t0.class, "18")) {
          return;
       }
       this.g.onNext(new t0$a(p0, null, p2));
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, t0.class, "21")) {
          return;
       }
       this.h.onNext(Boolean.TRUE);
       return;
    }
    public void h(QPhoto p0,QComment p1,boolean p2){
       if (PatchProxy.isSupport(t0.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, t0.class, "6")) {
          return;
       }
       t0$a uoa = new t0$a(p0, p1);
       uoa.e = p2;
       this.b.onNext(uoa);
       return;
    }
    public b i(g p0,g p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, t0.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.h.subscribe(p0, p1);
    }
    public b j(g p0,g p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, t0.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.subscribe(p0, p1);
    }
}
