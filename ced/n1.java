package ced.n1;
import android.view.ViewTreeObserver$OnPreDrawListener;
import ced.o1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;

public class n1 implements ViewTreeObserver$OnPreDrawListener	// class@00056c
{
    public final o1 b;

    public void n1(o1 p0){
       this.b = p0;
       super();
    }
    public boolean onPreDraw(){
       Object obj = PatchProxy.apply(null, this, n1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.b.v.getViewTreeObserver().removeOnPreDrawListener(this);
       return true;
    }
}
