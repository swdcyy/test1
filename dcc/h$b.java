package dcc.h$b;
import erd.g;
import dcc.h;
import java.lang.Object;
import com.kwai.framework.model.user.User;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dcc.c;
import com.kwai.library.widget.button.SlipSwitchButton;

public final class h$b implements g	// class@002177
{
    public final h b;

    public void h$b(h p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$b.class, "1")) {
       }else {
          this.b.d.g(p0.mHasReverseRemoved, true, false);
       }
       return;
    }
}
