package nd9.n0$a;
import com.yxcorp.gifshow.bubble.b$c;
import nd9.n0;
import android.app.Activity;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import j8c.a;
import q87.c;

public class n0$a implements b$c	// class@003150
{
    public final Activity a;
    public final View b;
    public final n0 c;

    public void n0$a(n0 p0,Activity p1,View p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public boolean c(){
       Object obj = PatchProxy.apply(null, this, n0$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.c.h2(this.a, this.b)) {
          return true;
       }
       Object[] objArray = new Object[0];
       a.D().w("TabGuideController", "needShowChecker, tabView not full display", objArray);
       return 0;
    }
}
