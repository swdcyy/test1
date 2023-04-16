package g59.v$a;
import java.lang.Object;
import nsd.u;
import android.view.Window;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.os.Build$VERSION;
import android.view.WindowManager$LayoutParams;
import android.view.View;

public final class v$a	// class@002419
{

    public void v$a(){
       super();
    }
    public void v$a(u p0){
       super();
    }
    public final void a(Window p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v$a.class, "1")) {
          return;
       }
       a.p(p0, "window");
       WindowManager$LayoutParams attributes = p0.getAttributes();
       attributes.systemUiVisibility = 2052;
       if (Build$VERSION.SDK_INT >= 28) {
          attributes.layoutInDisplayCutoutMode = 1;
       }
       p0.setAttributes(attributes);
       View decorView = p0.getDecorView();
       a.o(decorView, "window.decorView");
       decorView.setSystemUiVisibility(1280);
       return;
    }
}
