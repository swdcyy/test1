package dcc.h$c;
import z1.a;
import dcc.h;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dcc.c;
import com.kwai.framework.model.user.User;
import com.kwai.library.widget.button.SlipSwitchButton;

public final class h$c implements a	// class@002178
{
    public final h a;

    public void h$c(h p0){
       this.a = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$c.class, "1")) {
       }else if(!p0.booleanValue()){
          p0 = this.a;
          p0.d.g(p0.h.mHasReverseRemoved, true, false);
       }
       return;
    }
}
