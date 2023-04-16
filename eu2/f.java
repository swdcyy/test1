package eu2.f;
import java.lang.Runnable;
import com.kwai.library.widget.popup.bubble.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.popup.common.c;
import com.kuaishou.live.core.voiceparty.d0;

public final class f implements Runnable	// class@0027f3
{
    public final a b;

    public void f(a p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       d0.e(this.b);
       return;
    }
}
