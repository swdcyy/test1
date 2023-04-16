package kuaishou.perf.util.reflect.app.ActivityManagerOreo;
import java.lang.Class;
import java.lang.String;
import kuaishou.perf.util.reflect.RefClass;
import java.lang.Object;

public class ActivityManagerOreo	// class@001bfa
{
    public static RefStaticObject IActivityManagerSingleton;
    public static final Class TYPE;
    public static RefStaticMethod getService;

    static {
       ActivityManagerOreo.TYPE = RefClass.load(ActivityManagerOreo.class, "android.app.ActivityManager");
    }
    public void ActivityManagerOreo(){
       super();
    }
}
