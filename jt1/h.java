package jt1.h;
import androidx.lifecycle.Observer;
import jt1.i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;

public final class h implements Observer	// class@002c0b
{
    public final i b;

    public void h(i p0){
       this.b = p0;
       super();
    }
    public final void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
          return;
       }
       this.b.a.setVisibility(8);
       this.b.b.setVisibility(8);
       return;
    }
}
