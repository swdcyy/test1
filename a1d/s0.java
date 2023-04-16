package a1d.s0;
import erd.r;
import java.lang.Object;
import com.yxcorp.login.authorization.mode.AuthEvent;

public final class s0 implements r	// class@000052
{
    public static final s0 b;

    static {
       s0.b = new s0();
    }
    public void s0(){
       super();
    }
    public final boolean test(Object p0){
       boolean b = (p0 == AuthEvent.LOGIN_SUCCESS)? true: false;
       return b;
    }
}
