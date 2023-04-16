package gb1.o1;
import z1.a;
import java.lang.Object;
import bb1.d;
import com.kwai.framework.model.live.LiveAdminPrivilege$PrivilegeType;
import java.lang.Throwable;

public final class o1 implements a	// class@00247a
{
    public final boolean a;

    public void o1(boolean p0){
       this.a = p0;
    }
    public final void accept(Object p0){
       p0.a(true, this.a, null, LiveAdminPrivilege$PrivilegeType.KICK_USER);
    }
}
