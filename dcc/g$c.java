package dcc.g$c;
import z1.a;
import dcc.g;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dcc.c;
import com.kwai.framework.model.user.User;
import com.kwai.library.widget.button.SlipSwitchButton;

public final class g$c implements a	// class@002174
{
    public final g a;

    public void g$c(g p0){
       this.a = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$c.class, "1")) {
       }else if(!p0.booleanValue()){
          p0 = this.a;
          p0.d.g(p0.h.mHasRemoved, true, false);
       }
       return;
    }
}
