package eu2.d;
import erd.g;
import com.kwai.library.widget.popup.bubble.a;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.popup.common.c;
import com.kuaishou.live.core.voiceparty.d0;

public final class d implements g	// class@0027f1
{
    public final a b;

    public void d(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
       }else {
          d0.e(this.b);
       }
       return;
    }
}
