package gb1.n1;
import z1.a;
import java.lang.Throwable;
import java.lang.Object;
import bb1.d;
import com.kwai.framework.model.live.LiveAdminPrivilege$PrivilegeType;

public final class n1 implements a	// class@002477
{
    public final Throwable a;

    public void n1(Throwable p0){
       this.a = p0;
    }
    public final void accept(Object p0){
       p0.a(false, false, this.a, LiveAdminPrivilege$PrivilegeType.KICK_USER);
    }
}
