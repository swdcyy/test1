package op.j;
import java.lang.Object;
import java.util.ArrayList;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.content.Context;

public abstract class j	// class@002b6c
{
    public final List a;

    public void j(){
       super();
       this.a = new ArrayList();
    }
    public synchronized void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
          return;
       }
       this.a.add(p0);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, j.class, "3")) {
          return;
       }
       this.a.clear();
       return;
    }
    public int c(){
       Object obj = PatchProxy.apply(null, this, j.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.size();
    }
    public abstract int d();
    public abstract View e(Context p0,int p1,View p2);
    public synchronized View f(){
       Object obj = PatchProxy.apply(null, this, j.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.a.size() > 0) {
          return this.a.remove(0);
       }
       return null;
    }
}
