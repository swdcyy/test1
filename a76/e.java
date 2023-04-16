package a76.e;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public final class e	// class@000035
{
    public static final List a;
    public static final List b;
    public static BroadcastReceiver c;
    public static BroadcastReceiver d;

    static {
       e.a = Collections.synchronizedList(new ArrayList());
       e.b = Collections.synchronizedList(new ArrayList());
       e.c = null;
       e.d = null;
    }
}
