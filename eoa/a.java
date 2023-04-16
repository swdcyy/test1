package eoa.a;
import tx4.p;
import java.lang.Object;
import java.lang.Throwable;
import tx4.w;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.activity.kwaibubble.log.KwaiPopLog;

public final class a implements p	// class@002786
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final void m(Throwable p0,w p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "1")) {
          return;
       }
       Object[] objArray = new Object[]{p1};
       KwaiPopLog.e.E(p0, objArray);
       return;
    }
}
