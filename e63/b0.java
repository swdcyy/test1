package e63.b0;
import erd.g;
import com.kuaishou.live.gzone.v2.profile.e;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveUserStatusResponse;
import java.util.Objects;
import com.kuaishou.live.core.show.fansgroup.LiveFansGroupInfo;

public final class b0 implements g	// class@00263f
{
    public final e b;

    public void b0(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b0 tb = this.b;
       Objects.requireNonNull(tb);
       p0 = p0.mLiveFansGroupInfo;
       boolean b = (p0 != null && p0.mHasFansGroupAuthority != null)? true: false;
       tb.H1 = b;
       tb.D9();
       return;
    }
}
