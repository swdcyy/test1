package cu1.a;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.multipk.render.LiveMultiPkRenderController;
import java.lang.Object;
import eu1.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hu1.c;
import androidx.lifecycle.MutableLiveData;

public final class a implements Observer	// class@001e4d
{
    public final LiveMultiPkRenderController b;

    public void a(LiveMultiPkRenderController p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
       }else {
          this.b.V2().c().setValue(p0);
       }
       return;
    }
}
