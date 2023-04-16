package kuaishou.perf.util.reflect.app.ActivityThread;
import java.lang.Class;
import java.lang.String;
import kuaishou.perf.util.reflect.RefClass;
import java.lang.Object;

public class ActivityThread	// class@001d15
{
    public static Class TYPE;
    public static RefStaticMethod currentActivityThread;
    public static RefMethod getProcessName;
    public static RefObject mH;

    static {
       ActivityThread.TYPE = RefClass.load(ActivityThread.class, "android.app.ActivityThread");
    }
    public void ActivityThread(){
       super();
    }
}
