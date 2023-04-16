package com.kwai.component.tti.a$a;
import ph5.k;
import com.kwai.component.tti.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.util.Objects;
import com.kwai.component.tti.TTIStrategy;
import com.kwai.component.tti.monitor.a;
import java.util.concurrent.atomic.AtomicBoolean;
import com.kwai.component.tti.monitor.TTIData;
import java.lang.Runnable;
import java.util.List;
import android.os.SystemClock;

public class a$a extends k	// class@000bc6
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public boolean queueIdle(){
       boolean b;
       Runnable runnable;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       a$a obj = PatchProxy.apply(objArray, this, a$a.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.b;
       Objects.requireNonNull(obj);
       a uoa = a.class;
       Object obj1 = PatchProxy.apply(objArray, obj, uoa, "10");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if(obj.b == null){
          obj.d = false;
       }else if(TTIStrategy.h != null){
          if (a.p.get()) {
             if (TTIData.getInstance().shouldSchduleNormal()) {
                runnable = obj.j();
             }else {
                Object obj2 = PatchProxy.apply(objArray, obj, uoa, "12");
                if (obj2 != patchProxyRe) {
                   objArray = obj2;
                }else if(!obj.h.isEmpty()){
                   objArray = obj.h.remove(false);
                }else if(!obj.j.isEmpty()){
                   objArray = obj.j.remove(false);
                }
                if (objArray == null) {
                label_00a3 :
                   b = true;
                }else {
                   runnable = objArray;
                }
             }
          }else {
             runnable = obj.j();
          }
       }else {
          runnable = obj.j();
       }
       if (runnable != null) {
          runnable.run();
          obj.p = obj.p + 1;
          TTIStrategy.c(SystemClock.elapsedRealtime(), obj.k(runnable, 1), 1);
          goto label_00a3 ;
       }else {
          obj.f = true;
          obj.d = false;
       }
       b = false;
       return b;
    }
}
