package com.yxcorp.download.b;
import java.lang.Object;
import com.yxcorp.download.DownloadTask;
import java.lang.String;
import java.lang.Throwable;
import com.kwai.video.hodor.ResourceDownloadTask$TaskInfo;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import com.yxcorp.download.b$a;
import erd.g;
import com.trello.rxlifecycle3.android.ActivityEvent;
import gr8.b;
import gr8.c;
import brd.x;
import io.reactivex.internal.functions.Functions;
import crd.b;

public abstract class b	// class@0011b7
{
    public int a;
    public boolean b;

    public void b(){
       super();
    }
    public abstract void a(DownloadTask p0);
    public abstract void b(DownloadTask p0);
    public abstract void c(DownloadTask p0);
    public abstract void d(DownloadTask p0,String p1,boolean p2,long p3,long p4);
    public abstract void e(DownloadTask p0,Throwable p1);
    public boolean f(){
       return this.b;
    }
    public abstract void g(DownloadTask p0);
    public void h(DownloadTask p0,ResourceDownloadTask$TaskInfo p1){
    }
    public abstract void i(DownloadTask p0,long p1,long p2);
    public abstract void j(DownloadTask p0,long p1,long p2);
    public abstract void k(DownloadTask p0,long p1,long p2);
    public final b l(RxFragmentActivity p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0.m().doOnNext(new b$a(this)).compose(c.c(p0.m(), ActivityEvent.DESTROY)).subscribe(Functions.d());
       return this;
    }
    public abstract void m(DownloadTask p0,long p1,long p2);
    public b n(boolean p0){
       this.b = p0;
       return this;
    }
    public abstract void o(DownloadTask p0);
    public abstract void p(DownloadTask p0);
}
