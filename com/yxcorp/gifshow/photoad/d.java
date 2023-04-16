package com.yxcorp.gifshow.photoad.d;
import com.yxcorp.gifshow.photoad.e;
import com.yxcorp.download.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.download.DownloadTask;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.Throwable;

public class d extends e	// class@000f75
{
    public final b f;

    public void d(b p0){
       this.f = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, d.class, "4")) {
          return;
       }
       this.f.a(this.f());
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, d.class, "10")) {
          return;
       }
       this.f.b(this.f());
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, d.class, "5")) {
          return;
       }
       this.f.c(this.f());
       return;
    }
    public void d(String p0,boolean p1,long p2,long p3){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidFourRefs(p0, Boolean.valueOf(p1), Long.valueOf(p2), Long.valueOf(p3), this, d.class, "3")) {
          return;
       }
       this.f.d(this.f(), p0, p1, (long)(int)p2, (long)(int)p3);
       return;
    }
    public void e(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "8")) {
          return;
       }
       this.f.e(this.f(), p0);
       return;
    }
    public void g(long p0,long p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, uod, "7")) {
          return;
       }
       this.f.i(this.f(), (long)(int)p0, (long)(int)p1);
       return;
    }
    public void h(long p0,long p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, uod, "1")) {
          return;
       }
       this.f.j(this.f(), (long)(int)p0, (long)(int)p1);
       return;
    }
    public void i(long p0,long p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, uod, "2")) {
          return;
       }
       this.f.k(this.f(), (long)(int)p0, (long)(int)p1);
       return;
    }
    public void k(long p0,long p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, uod, "11")) {
          return;
       }
       this.f.m(this.f(), (long)(int)p0, (long)(int)p1);
       return;
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, d.class, "6")) {
          return;
       }
       this.f.o(this.f());
       return;
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, d.class, "9")) {
          return;
       }
       this.f.p(this.f());
       return;
    }
}
