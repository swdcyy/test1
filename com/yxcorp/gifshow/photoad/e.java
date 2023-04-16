package com.yxcorp.gifshow.photoad.e;
import java.lang.Object;
import java.lang.ref.WeakReference;
import java.lang.String;
import java.lang.Throwable;
import com.yxcorp.download.DownloadTask;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.download.b;
import com.yxcorp.gifshow.photoad.e$a;
import brd.t;
import mxb.s;
import erd.g;
import io.reactivex.internal.functions.Functions;
import g59.u;
import crd.b;
import com.trello.rxlifecycle3.components.RxFragment;
import mxb.t;

public class e	// class@000f8b
{
    public e$a a;
    public WeakReference b;
    public final WeakReference c;
    public DownloadTask d;
    public b e;

    public void e(){
       super();
       this.b = new WeakReference(null);
       this.c = new WeakReference(null);
    }
    public void a(){
    }
    public void b(){
    }
    public void c(){
    }
    public void d(String p0,boolean p1,long p2,long p3){
    }
    public void e(Throwable p0){
    }
    public DownloadTask f(){
       return this.d;
    }
    public void g(long p0,long p1){
    }
    public void h(long p0,long p1){
    }
    public void i(long p0,long p1){
    }
    public final e j(RxFragmentActivity p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.b = new WeakReference(p0);
       return this;
    }
    public void k(long p0,long p1){
    }
    public void l(){
    }
    public b m(){
       e uoe = e.class;
       Object[] objArray = null;
       e obj = PatchProxy.apply(objArray, this, uoe, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.a == null) {
          this.a = new e$a(this);
       }
       if (!PatchProxy.applyVoid(objArray, this, uoe, "3")) {
          obj = this.b;
          if (obj != null) {
             RxFragmentActivity rxFragmentAc = obj.get();
             if (rxFragmentAc != null) {
                this.e = rxFragmentAc.m().doOnNext(new s(this)).subscribe(Functions.d(), u.a);
             }
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, uoe, "4")) {
          RxFragment rxFragment = this.c.get();
          if (rxFragment != null) {
             this.e = rxFragment.m().doOnNext(new t(this)).subscribe(Functions.d(), u.a);
          }
       }
       return this.a;
    }
    public void n(){
    }
}
