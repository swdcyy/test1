package ad9.k;
import android.view.ViewTreeObserver$OnPreDrawListener;
import ad9.i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import com.yxcorp.utility.n;
import lnc.a1;
import java.lang.Math;

public class k implements ViewTreeObserver$OnPreDrawListener	// class@0000a7
{
    public final i b;

    public void k(i p0){
       this.b = p0;
       super();
    }
    public boolean onPreDraw(){
       ViewGroup$LayoutParams obj = PatchProxy.apply(null, this, k.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.b.d.getViewTreeObserver().removeOnPreDrawListener(this);
       obj = this.b.d.getLayoutParams();
       n.Y(this.b.e, 0, 0);
       obj.width = Math.min(this.b.d.getWidth(), ((a1.h() - i.q) - this.b.e.getWidth()));
       this.b.d.setLayoutParams(obj);
       return 0;
    }
}
