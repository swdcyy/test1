package o90.a;
import qw7.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.logic.fetchframe.FetchFrameManager;

public class a implements c	// class@00276b
{

    public void a(){
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       FetchFrameManager.i().o();
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       FetchFrameManager.i().q();
       return;
    }
}
