package gb1.v0;
import z1.a;
import java.lang.Throwable;
import java.lang.Object;
import bb1.d;
import com.kwai.framework.model.live.LiveAdminPrivilege$PrivilegeType;

public final class v0 implements a	// class@00248e
{
    public final Throwable a;

    public void v0(Throwable p0){
       super();
       this.a = p0;
    }
    public final void accept(Object p0){
       p0.a(false, false, this.a, LiveAdminPrivilege$PrivilegeType.BLOCK);
    }
}
