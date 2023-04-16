package kod.a$c;
import java.lang.Runnable;
import kod.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import com.yxcrop.gifshow.v3.editor.decoration_v2.action.DecorationTipShowAction;
import xvc.b;

public final class a$c implements Runnable	// class@0017fa
{
    public final a b;

    public void a$c(a p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, a$c.class, "1")) {
          return;
       }
       this.b.Z().t0(new DecorationTipShowAction());
       return;
    }
}
