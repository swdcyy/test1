package com.kwai.component.photo.detail.core.media.a;
import android.app.Activity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.t;
import com.kwai.framework.init.e;
import java.util.concurrent.TimeUnit;
import brd.w;
import brd.m;
import t45.d;
import brd.z;
import ae5.a;
import erd.a;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import android.content.ServiceConnection;
import java.lang.RuntimeException;
import k2b.u1;

public class a	// class@000a35
{
    public Activity a;
    public ServiceConnection b;
    public boolean c;
    public boolean d;
    public boolean e;
    public b f;

    public void a(Activity p0){
       super();
       this.a = p0;
       this.c = false;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.e = true;
       this.f = t.merge(e.b(), t.timer(10, TimeUnit.SECONDS)).firstElement().C().observeOn(d.a).doFinally(new a(this)).subscribe(Functions.d(), Functions.e);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       a tf = this.f;
       if (tf != null) {
          tf.dispose();
       }
       this.e = false;
       if (this.d != null) {
          try{
             this.a.unbindService(this.b);
          }catch(java.lang.RuntimeException e1){
             u1.Q("MediaServiceHolder:unbind", e1.toString());
          }
          this.d = false;
       }
       return;
    }
}
