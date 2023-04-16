package g21.a$f;
import androidx.lifecycle.Observer;
import g21.a;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import mrd.a;
import f02.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Iterator;
import com.kuaishou.live.common.core.component.multiline.model.a;
import pq1.b;
import dq5.b;

public final class a$f implements Observer	// class@002405
{
    public final a b;

    public void a$f(a p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       boolean b1;
       if (PatchProxy.applyVoidOneRefs(p0, this, a$f.class, "1")) {
       }else {
          this.b.c.onNext(Integer.valueOf(p0.size()));
          a b = this.b.b;
          a obj = PatchProxy.applyOneRefs(p0, null, a.class, "7");
          if (obj != PatchProxyResult.class) {
             b1 = obj.booleanValue();
          }else if(!p0.size()){
             p0 = p0.iterator();
             while (true) {
                if (p0.hasNext()) {
                   obj = p0.next();
                   if (obj != null && ((double)obj.a - 0x3f847ae147ae147b < 0 && obj.d - 0x3f4ccccd > 0)) {
                      b1 = true;
                      break ;
                   }
                }
             }
          }
          b1 = false;
          b.onNext(Boolean.valueOf(b1));
          b1 = this.b.j;
          if (b1 != null) {
             b1.a();
          }
       }
       return;
    }
}
