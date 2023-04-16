package a1d.i1;
import erd.r;
import java.lang.Object;
import com.yxcorp.login.authorization.mode.AuthEvent;

public final class i1 implements r	// class@00002d
{
    public static final i1 b;

    static {
       i1.b = new i1();
    }
    public void i1(){
       super();
    }
    public final boolean test(Object p0){
       boolean b = (p0 == AuthEvent.DATA_LOAD_SUCCESS || p0 == AuthEvent.REFRESH_MANAGER_VIEW)? true: false;
       return b;
    }
}
