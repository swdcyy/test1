package nmd.v$b;
import java.lang.Runnable;
import nmd.v;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import smd.d;
import com.yxcrop.gifshow.v3.editor.decoration_v2.action.DecorationTipShowAction;
import xvc.b;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;

public final class v$b implements Runnable	// class@001e79
{
    public final v b;

    public void v$b(v p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, v$b.class, "1")) {
          return;
       }
       this.b.b0().t0(new DecorationTipShowAction());
       return;
    }
}
