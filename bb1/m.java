package bb1.m;
import erd.g;
import bb1.n;
import java.lang.Object;
import kb1.c;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.collection.SimpleArrayMap;
import com.kwai.framework.model.live.LiveAdminPrivilege;
import bb1.n$c;
import java.lang.Enum;

public final class m implements g	// class@000339
{
    public final n b;

    public void m(n p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       m tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, n.class, "7")) {
       }else if(!tb.e.containsKey(p0.a)){
          LiveAdminPrivilege liveAdminPri = tb.e.get(p0.a);
          int i = n$c.a[p0.b.ordinal()];
          if (i != 1) {
             if (i != 2) {
                if (i != 3) {
                   if (i == 4) {
                      liveAdminPri.mControl = p0.c;
                   }
                }else {
                   liveAdminPri.mBlock = p0.c;
                }
             }else {
                liveAdminPri.mKickUser = p0.c;
             }
          }else {
             liveAdminPri.mForbidComment = p0.c;
          }
       }
       return;
    }
}
