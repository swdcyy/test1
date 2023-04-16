package a1d.l0;
import erd.r;
import java.lang.Object;
import com.yxcorp.login.authorization.mode.AuthEvent;

public final class l0 implements r	// class@00003a
{
    public static final l0 b;

    static {
       l0.b = new l0();
    }
    public void l0(){
       super();
    }
    public final boolean test(Object p0){
       boolean b = (p0 == AuthEvent.LOGIN_SUCCESS || p0 == AuthEvent.LOGIN_START)? true: false;
       return b;
    }
}
