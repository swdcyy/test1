package mk0.e;
import android.view.ViewTreeObserver$OnPreDrawListener;
import com.kuaishou.krn.widget.react.KrnReactRootView;
import com.facebook.react.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.facebook.react.bridge.ReactContext;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

public class e implements ViewTreeObserver$OnPreDrawListener	// class@003190
{
    public final a b;
    public final KrnReactRootView c;

    public void e(KrnReactRootView p0,a p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public boolean onPreDraw(){
       Object obj = PatchProxy.apply(null, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.c.o(this.b.n());
       this.c.getViewTreeObserver().removeOnPreDrawListener(this);
       return true;
    }
}
