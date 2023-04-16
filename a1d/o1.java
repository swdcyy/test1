package a1d.o1;
import erd.r;
import java.lang.Object;
import com.yxcorp.login.authorization.mode.AuthEvent;

public final class o1 implements r	// class@000044
{
    public static final o1 b;

    static {
       o1.b = new o1();
    }
    public void o1(){
       super();
    }
    public final boolean test(Object p0){
       boolean b = (p0 == AuthEvent.DATA_LOAD_SUCCESS || p0 == AuthEvent.REFRESH_LIST)? true: false;
       return b;
    }
}
