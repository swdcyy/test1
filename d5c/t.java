package d5c.t;
import erd.r;
import java.lang.Object;
import com.trello.rxlifecycle3.android.FragmentEvent;
import d5c.g0;

public final class t implements r	// class@002110
{
    public static final t b;

    static {
       t.b = new t();
    }
    public void t(){
       super();
    }
    public final boolean test(Object p0){
       boolean b = (p0 == FragmentEvent.RESUME || p0 == FragmentEvent.PAUSE)? true: false;
       return b;
    }
}
