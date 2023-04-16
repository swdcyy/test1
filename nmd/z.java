package nmd.z;
import java.lang.Runnable;
import nmd.v;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import android.view.View$OnTouchListener;
import android.view.View;

public final class z implements Runnable	// class@001e8a
{
    public final v b;

    public void z(v p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, z.class, "1")) {
          return;
       }
       this.b.P().Q(true);
       this.b.P().C(false);
       v j = this.b.j;
       if (j != null) {
          j.setOnTouchListener(null);
       }
       return;
    }
}
