package com.tachikoma.core.component.timer.TKTimer$b;
import java.lang.Runnable;
import com.tachikoma.core.component.timer.TKTimer;
import com.tachikoma.core.component.timer.TKTimer$d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import android.os.Message;
import android.os.Handler;
import com.tkruntime.v8.JsValueRef;
import com.tkruntime.v8.V8Function;
import com.tkruntime.v8.V8Object;
import tx4.y;
import java.lang.Throwable;
import wp8.a;

public class TKTimer$b implements Runnable	// class@000daa
{
    public final TKTimer$d b;
    public final long c;
    public final TKTimer d;

    public void TKTimer$b(TKTimer p0,TKTimer$d p1,long p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, TKTimer$b.class, "1")) {
          return;
       }
       boolean b = false;
       this.b.b = b;
       TKTimer mHandler = this.d.mHandler;
       mHandler.sendMessage(mHandler.obtainMessage(1004, Long.valueOf(this.c)));
       TKTimer$d e = this.b.e;
       if (e == null) {
          return;
       }
       V8Function v8Function = e.get();
       if (y.a(v8Function)) {
          Object[] objArray = new Object[b];
          v8Function.call(null, objArray);
       }
       TKTimer$b tb = this.b;
       if (tb.d == null) {
          y.c(tb.e);
       }
       return;
    }
}
