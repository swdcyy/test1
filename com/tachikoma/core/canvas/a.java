package com.tachikoma.core.canvas.a;
import java.lang.Runnable;
import com.tachikoma.core.canvas.TKCanvas;
import com.tkruntime.v8.V8Function;
import java.lang.String;
import com.tkruntime.v8.JsValueRef;
import java.lang.Object;
import java.util.Objects;
import com.tkruntime.v8.V8Object;
import tx4.y;
import qo8.b;
import iq8.x;

public final class a implements Runnable	// class@000d4b
{
    public final TKCanvas b;
    public final V8Function c;
    public final String d;
    public final JsValueRef e;

    public void a(TKCanvas p0,V8Function p1,String p2,JsValueRef p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void run(){
       a tb = this.b;
       a td = this.d;
       a te = this.e;
       Objects.requireNonNull(tb);
       if (y.a(this.c)) {
          tb.n(td);
          x.f(new b(tb, te));
       }
       return;
    }
}
