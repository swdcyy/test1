package b79.g;
import android.view.View$OnAttachStateChangeListener;
import b79.h;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import r79.c;
import java.lang.Throwable;
import com.yxcorp.utility.Log;

public final class g implements View$OnAttachStateChangeListener	// class@000384
{
    public final h b;
    public final int c;

    public void g(h p0,int p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onViewAttachedToWindow(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
          return;
       }
       g tb = this.b;
       boolean b = true;
       try{
          tb.g(b);
          tb = this.b;
          tb.e(tb.j, false, this.c);
       }catch(java.lang.IllegalArgumentException e4){
          Log.k(e4);
       }
       return;
    }
    public void onViewDetachedFromWindow(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
          return;
       }
       g tb = this.b;
       boolean b = false;
       try{
          tb.g(b);
          tb = this.b;
          tb.e(tb.j, true, this.c);
       }catch(java.lang.IllegalArgumentException e4){
          Log.k(e4);
       }
       return;
    }
}
