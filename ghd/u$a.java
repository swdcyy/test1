package ghd.u$a;
import erd.g;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.Integer;

public final class u$a implements g	// class@000f3d
{
    public final int b;
    public final g c;

    public void u$a(int p0,g p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u$a.class, "1")) {
       }else {
          a.p(p0, "any");
          QCurrentUser.ME.startEdit().setOnlineStatusSetting(this.b).commitChanges();
          p0 = this.c;
          if (p0 != null) {
             p0.accept(Integer.valueOf(this.b));
          }
       }
       return;
    }
}
