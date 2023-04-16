package com.yxcorp.upgrade.impl.a$b;
import ckd.e;
import com.yxcorp.upgrade.impl.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import akd.g;
import java.lang.Runnable;
import android.os.Handler;
import akd.h;
import com.yxcorp.upgrade.impl.b;
import f97.a;
import java.lang.Throwable;
import akd.j;
import java.lang.Integer;
import akd.i;

public class a$b implements e	// class@00098c
{
    public final a a;

    public void a$b(a p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, a$b.class, "2")) {
          return;
       }
       a$b ta = this.a;
       if (ta.a == null) {
          return;
       }
       ta.j.post(new g(this));
       return;
    }
    public void onCanceled(){
       if (PatchProxy.applyVoid(null, this, a$b.class, "5")) {
          return;
       }
       if (this.a.a == null) {
          return;
       }
       this.a.j.post(new h(this));
       return;
    }
    public void onComplete(){
       if (PatchProxy.applyVoid(null, this, a$b.class, "4")) {
          return;
       }
       a.a(new b(this.a));
       return;
    }
    public void onError(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "3")) {
          return;
       }
       if (this.a.a == null) {
          return;
       }
       p0.getMessage();
       this.a.j.post(new j(this, p0));
       return;
    }
    public void onProgress(int p0){
       a$b uob = a$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "1")) {
          return;
       }
       if (this.a.a == null) {
          return;
       }
       this.a.j.post(new i(this, p0));
       return;
    }
}
