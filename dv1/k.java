package dv1.k;
import java.lang.Runnable;
import dv1.p;
import java.lang.Object;
import com.kuaishou.live.common.core.basic.optimizeui.ViewElement;
import android.view.View;
import ea1.b;
import dv1.j;

public final class k implements Runnable	// class@002037
{
    public final p b;

    public void k(p p0){
       this.b = p0;
    }
    public final void run(){
       k tb = this.b;
       if (tb.i != null) {
          b.a(tb.a, ViewElement.TOP_PENDANT_TEMPORARY);
          tb.b.f();
       }
       return;
    }
}
