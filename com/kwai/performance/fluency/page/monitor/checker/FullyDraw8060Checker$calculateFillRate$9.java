package com.kwai.performance.fluency.page.monitor.checker.FullyDraw8060Checker$calculateFillRate$9;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.performance.fluency.page.monitor.checker.FullyDraw8060Checker;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import gf7.a;
import java.lang.Float;

public final class FullyDraw8060Checker$calculateFillRate$9 extends Lambda implements a	// class@0010a5
{
    public final FullyDraw8060Checker this$0;

    public void FullyDraw8060Checker$calculateFillRate$9(FullyDraw8060Checker p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       StringBuilder str = "is fully draw£»cal X: ";
       FullyDraw8060Checker b = this.this$0.b;
       Float uFloat = null;
       Float uFloat1 = (b != null)? Float.valueOf(b.b()): uFloat;
       str = str+uFloat1+"; "+"Y: ";
       b = this.this$0.b;
       if (b != null) {
          uFloat = Float.valueOf(b.c());
       }
       return str+uFloat;
    }
}
