package gb1.e1;
import z1.a;
import java.lang.Throwable;
import java.lang.Object;
import bb1.d;
import com.kwai.framework.model.live.LiveAdminPrivilege$PrivilegeType;

public final class e1 implements a	// class@002457
{
    public final Throwable a;

    public void e1(Throwable p0){
       this.a = p0;
    }
    public final void accept(Object p0){
       p0.a(false, false, this.a, LiveAdminPrivilege$PrivilegeType.FORBID_COMMENT);
    }
}
