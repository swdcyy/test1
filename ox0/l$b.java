package ox0.l$b;
import tyc.r0;
import ox0.l;
import android.content.DialogInterface;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import rd1.c0;
import com.kwai.framework.model.user.QCurrentUser;

public class l$b extends r0	// class@0035c2
{
    public final l c;

    public void l$b(l p0){
       this.c = p0;
       super();
    }
    public void a(DialogInterface p0,int p1){
       if (PatchProxy.isSupport(l$b.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, l$b.class, "1")) {
          return;
       }
       l e = this.c.e;
       if (!PatchProxy.applyVoidOneRefs(e, null, c0.class, "37")) {
          c0.N(1820, QCurrentUser.me().getId(), e);
       }
       this.c.e();
       return;
    }
}
