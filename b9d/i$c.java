package b9d.i$c;
import hka.a;
import b9d.i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.yxcorp.plugin.search.homepage.widget.guide.HomeGuideLayout;

public class i$c implements a	// class@0003c5
{
    public final i b;

    public void i$c(i p0){
       this.b = p0;
       super();
    }
    public boolean onBackPressed(){
       i obj = PatchProxy.apply(null, this, i$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b.q;
       if (obj == null || obj.getParent() == null) {
          return false;
       }
       this.b.q.e();
       return true;
    }
}
