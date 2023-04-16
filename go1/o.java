package go1.o;
import android.view.ViewOutlineProvider;
import com.kuaishou.live.common.core.component.like.i;
import android.view.View;
import android.graphics.Outline;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class o extends ViewOutlineProvider	// class@00253d
{
    public final i a;

    public void o(i p0){
       this.a = p0;
       super();
    }
    public void getOutline(View p0,Outline p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, o.class, "1")) {
          return;
       }
       p1.setRoundRect(0, 0, this.a.V8(), p0.getHeight(), ((float)p0.getHeight() / 2.00f));
       return;
    }
}
