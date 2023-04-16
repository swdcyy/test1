package aegon.chrome.base.ApplicationStatus$a;
import java.lang.Runnable;
import java.lang.Object;
import aegon.chrome.base.ApplicationStatus;
import aegon.chrome.base.ApplicationStatus$a$a;
import aegon.chrome.base.ApplicationStatus$c;

public class ApplicationStatus$a implements Runnable	// class@000128
{

    public void ApplicationStatus$a(){
       super();
    }
    public void run(){
       if (ApplicationStatus.d != null) {
          return;
       }
       ApplicationStatus$a$a uoa$a = new ApplicationStatus$a$a(this);
       ApplicationStatus.d = uoa$a;
       ApplicationStatus.a(uoa$a);
       return;
    }
}
