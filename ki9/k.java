package ki9.k;
import com.kwai.library.widget.popup.common.PopupInterface$b;
import java.lang.Object;
import android.view.View;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.library.widget.popup.common.d;

public final class k implements PopupInterface$b	// class@002c98
{
    public static final k a;

    static {
       k.a = new k();
    }
    public void k(){
       super();
    }
    public final Animator a(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, k.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.a(p0);
    }
}
