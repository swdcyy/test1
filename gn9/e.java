package gn9.e;
import com.kwai.library.widget.popup.common.PopupInterface$b;
import java.lang.Object;
import android.view.View;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.library.widget.popup.common.d;

public final class e implements PopupInterface$b	// class@0024d0
{
    public static final e a;

    static {
       e.a = new e();
    }
    public void e(){
       super();
    }
    public final Animator a(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.a(p0);
    }
}
