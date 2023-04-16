package kuaishou.perf.util.reflect.app.ActivityManagerNative;
import java.lang.Class;
import java.lang.String;
import kuaishou.perf.util.reflect.RefClass;
import java.lang.Object;

public class ActivityManagerNative	// class@001bf9
{
    public static Class TYPE;
    public static RefStaticObject gDefault;
    public static RefStaticMethod getDefault;

    static {
       ActivityManagerNative.TYPE = RefClass.load(ActivityManagerNative.class, "android.app.ActivityManagerNative");
    }
    public void ActivityManagerNative(){
       super();
    }
}
