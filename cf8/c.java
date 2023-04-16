package cf8.c;
import com.mini.widget.actionsheet.a$d;
import java.util.List;
import android.app.Activity;
import bf8.g;
import cf8.b$a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.mini.map.api.utils.ThirdMap;
import msd.q;

public final class c implements a$d	// class@000403
{
    public final List a;
    public final Activity b;
    public final g c;
    public final b$a d;

    public void c(List p0,Activity p1,g p2,b$a p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void a(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "1")) {
          return;
       }
       ThirdMap thirdMap = this.a.get(p0);
       thirdMap.getJumpAction().invoke(this.b, null, this.c);
       this.d.a(thirdMap);
       return;
    }
    public void onCancel(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       this.d.onCancel();
       return;
    }
}
