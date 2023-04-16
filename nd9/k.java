package nd9.k;
import android.view.ViewOutlineProvider;
import nd9.l;
import android.view.View;
import android.graphics.Outline;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Rect;

public class k extends ViewOutlineProvider	// class@003146
{
    public final l a;

    public void k(l p0){
       this.a = p0;
       super();
    }
    public void getOutline(View p0,Outline p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, k.class, "1")) {
          return;
       }
       if (p1 != null && p0 != null) {
          p1.setOval(new Rect(0, 0, p0.getWidth(), p0.getHeight()));
       }
       return;
    }
}
