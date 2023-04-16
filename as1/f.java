package as1.f;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.model.LiveMultiLinePuzzleModel;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.MutableLiveData;

public final class f implements Observer	// class@00029c
{
    public final LiveMultiLinePuzzleModel b;

    public void f(LiveMultiLinePuzzleModel p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
       }else {
          this.b.d.setValue(p0);
       }
       return;
    }
}
