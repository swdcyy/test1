package com.kuaishou.live.core.voiceparty.g0;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.os.Message;
import brd.y;
import android.view.View;
import co2.l2;
import java.lang.Runnable;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import co2.k2;
import erd.r;
import brd.z;
import io.reactivex.android.schedulers.a;

public class g0	// class@0014f4
{
    public final c a;

    public void g0(){
       super();
       this.a = PublishSubject.g();
    }
    public void a(int p0,Object p1){
       if (PatchProxy.isSupport(g0.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, g0.class, "8")) {
          return;
       }
       Message message = new Message();
       message.what = p0;
       message.obj = p1;
       if (!PatchProxy.applyVoidOneRefs(message, this, g0.class, "6")) {
          this.a.onNext(message);
       }
       return;
    }
    public void b(int p0,View p1){
       g0 og0 = g0.class;
       if (PatchProxy.isSupport(og0) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, og0, "1")) {
          return;
       }
       if (p1.getVisibility()) {
          return;
       }
       p1.post(new l2(this, p0, p1));
       return;
    }
    public t c(int p0){
       g0 og0 = g0.class;
       if (PatchProxy.isSupport(og0)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, og0, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.a.filter(new k2(p0)).observeOn(a.c());
    }
}
