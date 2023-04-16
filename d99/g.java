package d99.g;
import android.view.ViewTreeObserver$OnPreDrawListener;
import d99.h;
import androidx.recyclerview.widget.RecyclerView;
import com.kwai.feature.api.feed.detail.router.biz.normal.ReplaceFragmentAnimationParam;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;
import d99.f;
import d99.h$c;

public class g implements ViewTreeObserver$OnPreDrawListener	// class@00209d
{
    public final RecyclerView b;
    public final int c;
    public final ReplaceFragmentAnimationParam d;
    public final h e;

    public void g(h p0,RecyclerView p1,int p2,ReplaceFragmentAnimationParam p3){
       this.e = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public boolean onPreDraw(){
       Object obj = PatchProxy.apply(null, this, g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.b.getViewTreeObserver().removeOnPreDrawListener(this);
       this.b.scrollBy(0, this.c);
       if (this.d.mEnableShrinkUnchanged == null) {
          this.e.P8((- this.c), new f(this.b));
       }
       return 0;
    }
}
