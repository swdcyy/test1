package jl0.b;
import android.view.ViewOutlineProvider;
import android.view.View;
import android.graphics.Outline;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.y0;

public final class b extends ViewOutlineProvider	// class@002bc2
{

    public void b(){
       super();
    }
    public void getOutline(View p0,Outline p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "1")) {
          return;
       }
       if (p1 != null) {
          int i = (p0 != null)? p0.getWidth(): 0;
          int i1 = (p0 != null)? p0.getHeight(): 0;
          p1.setRoundRect(0, 0, i, i1, (float)y0.l(R.dimen.arg_RES_7f0702e5));
       }
       return;
    }
}
