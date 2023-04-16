package nmd.b0;
import java.lang.Runnable;
import nmd.v;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;

public final class b0 implements Runnable	// class@001e4c
{
    public final v b;
    public final EditDecorationBaseDrawer c;

    public void b0(v p0,EditDecorationBaseDrawer p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, b0.class, "1")) {
          return;
       }
       this.b.P().h0(this.c, "auto_delete", true);
       return;
    }
}
