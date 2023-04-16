package com.tachikoma.component.network.b;
import java.lang.Runnable;
import com.tachikoma.component.network.TKNetwork;
import com.tkruntime.v8.JsValueRef;
import java.lang.Object;
import oo8.p;
import co8.b;
import oo8.o;

public final class b implements Runnable	// class@000d17
{
    public final TKNetwork b;
    public final JsValueRef c;

    public void b(TKNetwork p0,JsValueRef p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       b tb = this.b;
       b tc = this.c;
       if (tb.g != null) {
       }else {
          tb.f().f(new b(tb, tc));
       }
       return;
    }
}
