package g82.z;
import erd.g;
import g82.v$b;
import java.lang.Object;
import com.kuaishou.live.common.core.component.fansgroup.model.LiveFansGroupJoinResponse;
import java.util.Objects;
import com.kuaishou.live.core.show.fansgroup.http.LiveFansGroupIntimacyInfo;
import g82.v;

public final class z implements g	// class@002ac5
{
    public final v$b b;

    public void z(v$b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       z tb = this.b;
       Objects.requireNonNull(tb);
       p0 = p0.mIntimacyInfo;
       if (p0 != null) {
          tb.b.e9(p0);
       }
       return;
    }
}
