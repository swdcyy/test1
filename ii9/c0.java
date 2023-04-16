package ii9.c0;
import android.view.ViewOutlineProvider;
import ii9.b0;
import android.view.View;
import android.graphics.Outline;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hi9.d;

public class c0 extends ViewOutlineProvider	// class@002832
{
    public final b0 a;

    public void c0(b0 p0){
       this.a = p0;
       super();
    }
    public void getOutline(View p0,Outline p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c0.class, "1")) {
          return;
       }
       p1.setRoundRect(0, 0, p0.getWidth(), p0.getHeight(), (float)d.c());
       return;
    }
}
