package b98.a;
import b98.d;
import java.lang.Object;
import android.view.Window;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.Build$VERSION;
import com.yxcorp.utility.Log;
import android.view.WindowManager$LayoutParams;

public class a implements d	// class@00031d
{

    public void a(){
       super();
    }
    public void a(Window p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       int sDK_INT = Build$VERSION.SDK_INT;
       if (sDK_INT >= 28) {
          this.f(p0);
       }else if(sDK_INT >= 26){
          this.e(p0);
       }
       return;
    }
    public void b(Window p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       int sDK_INT = Build$VERSION.SDK_INT;
       if (sDK_INT >= 28) {
          this.d(p0);
       }else if(sDK_INT >= 26){
          this.c(p0);
       }
       return;
    }
    public void c(Window p0){
    }
    public void d(Window p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       Log.g("FullScreenFit", "applyP");
       WindowManager$LayoutParams attributes = p0.getAttributes();
       attributes.layoutInDisplayCutoutMode = 1;
       p0.setAttributes(attributes);
       return;
    }
    public void e(Window p0){
    }
    public void f(Window p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       Log.g("FullScreenFit", "disApplyP");
       WindowManager$LayoutParams attributes = p0.getAttributes();
       attributes.layoutInDisplayCutoutMode = 2;
       p0.setAttributes(attributes);
       return;
    }
}
