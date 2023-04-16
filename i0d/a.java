package i0d.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Object;

public class a	// class@001781
{
    public static final List a;
    public static final AtomicBoolean b;

    static {
       a.a = Collections.synchronizedList(new ArrayList());
       a.b = new AtomicBoolean(false);
    }
    public void a(){
       super();
    }
}
