package nmd.d0;
import java.lang.Runnable;
import nmd.v;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;

public final class d0 implements Runnable	// class@001e50
{
    public final v b;

    public void d0(v p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, d0.class, "1")) {
          return;
       }
       this.b.P().A0();
       return;
    }
}
