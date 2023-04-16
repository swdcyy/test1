package com.frog.engine.view.FrogRender$k;
import java.lang.Runnable;
import com.frog.engine.FrogBaseRequestListener;
import android.util.Pair;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.frog.engine.FrogAsyncRequestListener;
import com.frog.engine.jsobject.FrogJSObject;
import com.frog.engine.view.FrogRender$k$a;
import com.frog.engine.FrogCommandResponseListener;

public final class FrogRender$k implements Runnable	// class@0015a2
{
    public final FrogBaseRequestListener a;
    public final Pair b;
    public final int c;
    public final String d;

    public void FrogRender$k(FrogBaseRequestListener p0,Pair p1,int p2,String p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, FrogRender$k.class, "1")) {
          return;
       }
       this.a.onResponse(this.b.second, new FrogRender$k$a(this, this.c));
       return;
    }
}
