package gb1.w0;
import z1.a;
import java.lang.Object;
import bb1.d;
import com.kwai.framework.model.live.LiveAdminPrivilege$PrivilegeType;
import java.lang.Throwable;

public final class w0 implements a	// class@002491
{
    public final boolean a;

    public void w0(boolean p0){
       this.a = p0;
    }
    public final void accept(Object p0){
       p0.a(true, this.a, null, LiveAdminPrivilege$PrivilegeType.BLOCK);
    }
}
