package y97.c;
import erd.g;
import com.kwai.middleware.azeroth.sdk.SDKHandler;
import java.lang.Object;
import l97.b;
import java.lang.String;
import android.os.SystemClock;

public final class c implements g	// class@002864
{
    public final SDKHandler b;

    public void c(SDKHandler p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       p0 = p0.a();
       int i = p0.hashCode();
       if (i != -747104798) {
          if (i == -578289054 && p0.equals("ON_STOP")) {
             p0.f = SystemClock.elapsedRealtime();
          }
       }else if(p0.equals("ON_START")){
          p0 = this.b;
          if (p0.a != null && p0.f - null > 0) {
             p0 = this.b;
             if ((SystemClock.elapsedRealtime() - p0.f) - p0.c > 0) {
                p0.c();
                p0.f = -1;
             }
          }
       }
       return;
    }
}
