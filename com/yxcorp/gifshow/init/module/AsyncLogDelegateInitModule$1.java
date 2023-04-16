package com.yxcorp.gifshow.init.module.AsyncLogDelegateInitModule$1;
import androidx.lifecycle.LifecycleObserver;
import com.yxcorp.gifshow.init.module.AsyncLogDelegateInitModule;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dm8.c;
import java.util.Objects;
import am8.b;
import android.os.Message;
import android.os.Handler;

public class AsyncLogDelegateInitModule$1 implements LifecycleObserver	// class@001962
{
    public final boolean b;
    public final AsyncLogDelegateInitModule c;

    public void AsyncLogDelegateInitModule$1(AsyncLogDelegateInitModule p0,boolean p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public final void onProcessBackground(){
       if (PatchProxy.applyVoidWithListener(null, this, AsyncLogDelegateInitModule$1.class, "2")) {
          return;
       }
       c uoc = c.d();
       Objects.requireNonNull(uoc);
       if (b.c) {
          Message message = Message.obtain();
          message.what = 8;
          uoc.b.sendMessage(message);
       }
       b.e = false;
       PatchProxy.onMethodExit(AsyncLogDelegateInitModule$1.class, "2");
       return;
    }
    public final void onProcessForeground(){
       if (PatchProxy.applyVoidWithListener(null, this, AsyncLogDelegateInitModule$1.class, "1")) {
          return;
       }
       c uoc = c.d();
       Objects.requireNonNull(uoc);
       if (b.c) {
          Message message = Message.obtain();
          message.what = 7;
          uoc.b.sendMessage(message);
       }
       b.e = this.b;
       PatchProxy.onMethodExit(AsyncLogDelegateInitModule$1.class, "1");
       return;
    }
}
