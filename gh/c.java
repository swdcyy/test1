package gh.c;
import java.lang.Object;
import android.view.View;
import java.util.List;
import dh.b;
import gh.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class c	// class@0020b0
{

    public void c(){
       super();
    }
    public static void a(View p0,List p1,b p2,b p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, c.class, "5")) {
          return;
       }
       p3.a(p0, p1, p2);
       return;
    }
}
