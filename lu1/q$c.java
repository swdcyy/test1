package lu1.q$c;
import androidx.lifecycle.Observer;
import lu1.q;
import java.lang.Object;
import kotlin.Pair;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.multipk.render.viewcontroller.LiveMultiPkRenderChildViewController;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Number;

public final class q$c implements Observer	// class@00304b
{
    public final q b;

    public void q$c(q p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q$c.class, "1")) {
       }else if(!TextUtils.n(this.b.b3(), p0.getFirst()) || this.b.E == p0.getSecond().intValue()){
          this.b.E = p0.getSecond().intValue();
          this.b.s3(p0.getSecond().intValue());
       }
       return;
    }
}
