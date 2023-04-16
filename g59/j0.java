package g59.j0;
import android.view.ViewOutlineProvider;
import android.view.View;
import android.graphics.Outline;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Rect;

public class j0 extends ViewOutlineProvider	// class@002406
{
    public final float a;

    public void j0(float p0){
       super();
       this.a = p0;
    }
    public void getOutline(View p0,Outline p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, j0.class, "1")) {
          return;
       }
       p1.setRoundRect(new Rect(0, 0, p0.getWidth(), p0.getHeight()), this.a);
       return;
    }
}
