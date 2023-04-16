package em2.c;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.widget.TextView;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.ViewTreeObserver;

public class c implements ViewTreeObserver$OnPreDrawListener	// class@00278b
{
    public final TextView b;
    public final Runnable c;

    public void c(TextView p0,Runnable p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public boolean onPreDraw(){
       Object obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.b.getWidth() <= 0) {
          return false;
       }
       this.b.getViewTreeObserver().removeOnPreDrawListener(this);
       this.c.run();
       return true;
    }
}
