package com.tachikoma.component.network.a;
import java.lang.Runnable;
import com.tachikoma.component.network.TKNetwork;
import com.tkruntime.v8.JsValueRef;
import java.lang.Object;
import oo8.p;
import co8.a;
import oo8.o;

public final class a implements Runnable	// class@000d16
{
    public final TKNetwork b;
    public final JsValueRef c;

    public void a(TKNetwork p0,JsValueRef p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       a tb = this.b;
       a tc = this.c;
       if (tb.g != null) {
       }else {
          tb.f().d(new a(tb, tc));
       }
       return;
    }
}
