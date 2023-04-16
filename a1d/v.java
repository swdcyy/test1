package a1d.v;
import erd.r;
import java.lang.Object;
import com.yxcorp.login.authorization.mode.AuthEvent;

public final class v implements r	// class@00005a
{
    public static final v b;

    static {
       v.b = new v();
    }
    public void v(){
       super();
    }
    public final boolean test(Object p0){
       boolean b = (p0 == AuthEvent.DATA_LOAD_SUCCESS)? true: false;
       return b;
    }
}
