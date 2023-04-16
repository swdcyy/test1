package aegon.chrome.base.ApplicationStatus;
import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.lang.Object;
import aegon.chrome.base.ApplicationStatus$c;
import aegon.chrome.base.e;
import aegon.chrome.base.ApplicationStatus$a;
import java.lang.Runnable;
import aegon.chrome.base.ThreadUtils;

public class ApplicationStatus	// class@00012d
{
    public static final Map a;
    public static int b;
    public static Activity c;
    public static ApplicationStatus$c d;
    public static e e;
    public static e f;
    public static e g;
    public static final boolean h;

    static {
       ApplicationStatus.a = Collections.synchronizedMap(new HashMap());
       ApplicationStatus.b = 0;
    }
    public void ApplicationStatus(){
       super();
    }
    public static void a(ApplicationStatus$c p0){
       if (ApplicationStatus.f == null) {
          ApplicationStatus.f = new e();
       }
       ApplicationStatus.f.b(p0);
       return;
    }
    public static int getStateForApplication(){
       Map a = ApplicationStatus.a;
       _monitor_enter(a);
       _monitor_exit(a);
       return ApplicationStatus.b;
    }
    public static boolean hasVisibleActivities(){
       int stateForAppl = ApplicationStatus.getStateForApplication();
       boolean b = true;
       if (stateForAppl != b && stateForAppl != 2) {
          b = false;
       }
       return b;
    }
    public static void registerThreadSafeNativeApplicationStateListener(){
       ThreadUtils.d(new ApplicationStatus$a());
    }
}
