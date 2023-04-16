package p80.y;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.webkit.extension.KsWebExtensionStatics;
import p80.v;

public final class y implements Runnable	// class@0028e4
{
    public static final y b;

    static {
       y.b = new y();
    }
    public void y(){
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, y.class, "1")) {
          return;
       }
       v.e("unload_reserved_memory", String.valueOf(KsWebExtensionStatics.umapSystemWebViewMemory()), null);
       return;
    }
}
