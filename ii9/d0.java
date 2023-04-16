package ii9.d0;
import android.view.ViewOutlineProvider;
import ii9.b0;
import android.view.View;
import android.graphics.Outline;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hi9.d;

public class d0 extends ViewOutlineProvider	// class@002834
{
    public final b0 a;

    public void d0(b0 p0){
       this.a = p0;
       super();
    }
    public void getOutline(View p0,Outline p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d0.class, "1")) {
          return;
       }
       p1.setRoundRect(0, 0, p0.getWidth(), p0.getHeight(), (float)d.h());
       return;
    }
}
