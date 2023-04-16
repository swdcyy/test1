package ba2.p0;
import android.view.ViewOutlineProvider;
import com.kuaishou.live.core.show.hourlytrank.h;
import android.view.View;
import android.graphics.Outline;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.a1;

public class p0 extends ViewOutlineProvider	// class@0003a3
{
    public final h a;

    public void p0(h p0){
       this.a = p0;
       super();
    }
    public void getOutline(View p0,Outline p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, p0.class, "1")) {
          return;
       }
       p1.setRoundRect(0, 0, p0.getWidth(), p0.getHeight(), (float)a1.e(10.00f));
       return;
    }
}
