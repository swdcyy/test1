package kuaishou.perf.util.reflect.app.Singleton;
import java.lang.Class;
import java.lang.String;
import kuaishou.perf.util.reflect.RefClass;
import java.lang.Object;

public class Singleton	// class@001bfe
{
    public static Class TYPE;
    public static RefMethod get;
    public static RefObject mInstance;

    static {
       Singleton.TYPE = RefClass.load(Singleton.class, "android.util.Singleton");
    }
    public void Singleton(){
       super();
    }
}
