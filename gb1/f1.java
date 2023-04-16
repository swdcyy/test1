package gb1.f1;
import z1.a;
import java.lang.Object;
import bb1.d;
import com.kwai.framework.model.live.LiveAdminPrivilege$PrivilegeType;
import java.lang.Throwable;

public final class f1 implements a	// class@00245b
{
    public final boolean a;

    public void f1(boolean p0){
       this.a = p0;
    }
    public final void accept(Object p0){
       p0.a(true, this.a, null, LiveAdminPrivilege$PrivilegeType.FORBID_COMMENT);
    }
}
