package a1d.a1;
import erd.r;
import java.lang.Object;
import com.yxcorp.login.authorization.mode.AuthEvent;

public final class a1 implements r	// class@000014
{
    public static final a1 b;

    static {
       a1.b = new a1();
    }
    public void a1(){
       super();
    }
    public final boolean test(Object p0){
       boolean b = (p0 == AuthEvent.DATA_LOAD_SUCCESS || p0 == AuthEvent.REFRESH_LIST)? true: false;
       return b;
    }
}
