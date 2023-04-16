package com.kuaishou.tachikoma.api.f;
import java.lang.Runnable;
import com.tachikoma.core.bridge.a$b;
import java.lang.Object;
import no8.e;
import java.lang.String;
import com.tachikoma.core.bridge.d;
import tw4.t;
import com.tkruntime.v8.V8;
import com.tkruntime.v8.V8ObjectProxy;
import android.os.Handler;
import aq8.a;
import android.os.HandlerThread;
import android.os.Looper;
import tw4.c0;
import iq8.o;
import java.lang.Throwable;
import wp8.a;

public final class f implements Runnable	// class@000f84
{
    public final a$b b;

    public void f(a$b p0){
       this.b = p0;
    }
    public final void run(){
       t ot = new t(e.b().j(true, this.b, ""));
       V8ObjectProxy v8ObjectProx = (ot.g() != null)? new V8ObjectProxy(ot.g(), "preload-class"): null;
       if (V8.getHandler() == null) {
          V8.setLooper(a.b().a().getLooper());
       }
       o.a(new c0(v8ObjectProx, ot));
       return;
    }
}
