package dcc.g$b;
import erd.g;
import dcc.g;
import java.lang.Object;
import com.kwai.framework.model.user.User;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dcc.c;
import com.kwai.library.widget.button.SlipSwitchButton;

public final class g$b implements g	// class@002173
{
    public final g b;

    public void g$b(g p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$b.class, "1")) {
       }else {
          this.b.d.g(p0.mHasRemoved, true, false);
       }
       return;
    }
}
