package com.frog.engine.internal.BaseCommandHandler$h;
import com.frog.engine.FrogAsyncRequestListener;
import com.frog.engine.internal.BaseCommandHandler;
import com.frog.engine.jsobject.FrogJSObject;
import com.frog.engine.FrogCommandResponseListener;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.frog.engine.internal.BaseCommandHandler$h$a;
import java.lang.Runnable;
import android.os.AsyncTask;

public class BaseCommandHandler$h extends FrogAsyncRequestListener	// class@001518
{
    public final BaseCommandHandler a;

    public void BaseCommandHandler$h(BaseCommandHandler p0){
       this.a = p0;
       super();
    }
    public void onResponse(FrogJSObject p0,FrogCommandResponseListener p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BaseCommandHandler$h.class, "1")) {
          return;
       }
       AsyncTask.execute(new BaseCommandHandler$h$a(this, p1));
       return;
    }
}
