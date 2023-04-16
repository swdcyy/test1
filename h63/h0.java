package h63.h0;
import mw1.d;
import h63.k0;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import android.view.View;

public final class h0 implements d	// class@002c7e
{
    public final k0 a;

    public void h0(k0 p0){
       this.a = p0;
    }
    public final void a(){
       h0 ta = this.a;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoid(null, ta, k0.class, "6")) {
       }else if(ta.B.getLayoutParams() instanceof ViewGroup$MarginLayoutParams){
          RelativeLayout$LayoutParams layoutParams = ta.B.getLayoutParams();
          int i = (int)(ta.C.getY() + (float)ta.C.getHeight());
          if (layoutParams.topMargin != i) {
             layoutParams.topMargin = i;
             if (i > 0) {
                layoutParams.height = -1;
             }
             ta.B.setLayoutParams(layoutParams);
          }
       }
       ta.P8();
       return;
    }
}
