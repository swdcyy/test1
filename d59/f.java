package d59.f;
import com.kwai.library.widget.button.SlipSwitchButton$a;
import msd.p;
import java.lang.Object;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;

public final class f implements SlipSwitchButton$a	// class@002049
{
    public final p b;

    public void f(p p0){
       this.b = p0;
       super();
    }
    public void r(SlipSwitchButton p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, f.class, "1")) {
          return;
       }
       this.b.invoke(Boolean.valueOf(p1), Boolean.valueOf(p2));
       return;
    }
}
