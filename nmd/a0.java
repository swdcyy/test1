package nmd.a0;
import java.lang.Runnable;
import nmd.v;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;

public final class a0 implements Runnable	// class@001e4a
{
    public final v b;

    public void a0(v p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, a0.class, "1")) {
          return;
       }
       this.b.P().e0();
       return;
    }
}
