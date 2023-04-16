package nmd.j0;
import java.lang.Runnable;
import nmd.l0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import nmd.v;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;

public final class j0 implements Runnable	// class@001e5e
{
    public final l0 b;

    public void j0(l0 p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, j0.class, "1")) {
          return;
       }
       this.b.P().R();
       return;
    }
}
