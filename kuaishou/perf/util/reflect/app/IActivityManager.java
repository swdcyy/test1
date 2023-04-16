package kuaishou.perf.util.reflect.app.IActivityManager;
import java.lang.Class;
import java.lang.String;
import kuaishou.perf.util.reflect.RefClass;
import java.lang.Object;

public class IActivityManager	// class@001bfd
{
    public static Class TYPE;
    public static RefMethod startActivity;

    static {
       IActivityManager.TYPE = RefClass.load(IActivityManager.class, "android.app.IActivityManager");
    }
    public void IActivityManager(){
       super();
    }
}
