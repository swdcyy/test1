package nmd.x;
import java.lang.Runnable;
import nmd.v$d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import smd.d;
import nmd.v;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.DecorationMoveStartAction;
import xvc.b;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;

public final class x implements Runnable	// class@001e88
{
    public final v$d b;

    public void x(v$d p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, x.class, "1")) {
          return;
       }
       this.b.a.b0().t0(new DecorationMoveStartAction());
       return;
    }
}
