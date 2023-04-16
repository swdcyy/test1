package iy9.b;
import androidx.lifecycle.Observer;
import iy9.d;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import qp7.d;
import android.view.ViewGroup$LayoutParams;
import lnc.a1;

public final class b implements Observer	// class@0028be
{
    public final d b;

    public void b(d p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
       }else {
          this.b.p().setAlpha(0x3f800000);
          p0.height = a1.e(40.00f);
       }
       return;
    }
}
