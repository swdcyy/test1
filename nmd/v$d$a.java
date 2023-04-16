package nmd.v$d$a;
import java.lang.Runnable;
import nmd.v$d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import smd.d;
import nmd.v;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.DecorationScaleStartAction;
import xvc.b;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;

public final class v$d$a implements Runnable	// class@001e7b
{
    public final v$d b;

    public void v$d$a(v$d p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, v$d$a.class, "1")) {
          return;
       }
       this.b.a.b0().t0(new DecorationScaleStartAction());
       return;
    }
}
