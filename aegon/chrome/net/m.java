package aegon.chrome.net.m;
import aegon.chrome.base.ApplicationStatus$c;
import aegon.chrome.net.NetworkChangeNotifierAutoDetect$h;
import aegon.chrome.base.ApplicationStatus;
import aegon.chrome.net.NetworkChangeNotifierAutoDetect;
import aegon.chrome.base.e;
import java.lang.Object;
import java.util.Objects;
import java.util.List;

public class m extends NetworkChangeNotifierAutoDetect$h implements ApplicationStatus$c	// class@0001e2
{
    public boolean c;

    public void m(){
       super();
    }
    public void a(int p0){
       if (ApplicationStatus.hasVisibleActivities()) {
          this.d();
       }else {
          this.a.j();
       }
       return;
    }
    public void b(){
       if (this.c != null) {
          return;
       }
       e f = ApplicationStatus.f;
       if (f != null) {
          if (f.g != null) {
             Objects.requireNonNull(f.c);
          }
          int i = f.b.indexOf(this);
          if (i != -1) {
             if (f.d == null) {
                f.b.remove(i);
             }else {
                f.f = true;
                f.b.set(i, null);
             }
             f.e = f.e - true;
          }
       }
       this.c = true;
       return;
    }
    public void c(NetworkChangeNotifierAutoDetect p0){
       super.c(p0);
       ApplicationStatus.a(this);
       if (ApplicationStatus.hasVisibleActivities()) {
          this.d();
       }else {
          this.a.j();
       }
       return;
    }
}
