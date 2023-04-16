package cbd.d;
import com.yxcorp.plugin.search.kbox.weak.a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.m1;

public class d extends a	// class@000519
{

    public void d(){
       super();
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a3531);
       this.s = m1.f(p0, 0x7f0a094a);
       return;
    }
}
