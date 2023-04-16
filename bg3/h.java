package bg3.h;
import android.view.ViewOutlineProvider;
import bg3.e;
import android.view.View;
import android.graphics.Outline;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class h extends ViewOutlineProvider	// class@0003a7
{
    public final int a;
    public final e b;

    public void h(e p0,int p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void getOutline(View p0,Outline p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, h.class, "1")) {
          return;
       }
       p1.setRoundRect(0, 0, p0.getWidth(), p0.getHeight(), (float)this.a);
       return;
    }
}
