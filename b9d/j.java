package b9d.j;
import android.view.ViewTreeObserver$OnPreDrawListener;
import b9d.i;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import uy5.b;
import java.util.List;
import android.view.ViewTreeObserver;

public class j implements ViewTreeObserver$OnPreDrawListener	// class@0003c8
{
    public final View b;
    public final i c;

    public void j(i p0,View p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public boolean onPreDraw(){
       j obj = PatchProxy.apply(null, this, j.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b.c("SearchHomeNewUserGuidePresenter", "onBind, onPreDraw");
       obj = this.c;
       obj.V8(obj.s);
       this.b.getViewTreeObserver().removeOnPreDrawListener(this);
       return true;
    }
}
