package kuaishou.perf.util.reflect.os.Handler;
import java.lang.Class;
import java.lang.String;
import kuaishou.perf.util.reflect.RefClass;
import java.lang.Object;

public class Handler	// class@001d16
{
    public static Class TYPE;
    public static RefObject mCallback;

    static {
       Handler.TYPE = RefClass.load(Handler.class, "android.os.Handler");
    }
    public void Handler(){
       super();
    }
}
