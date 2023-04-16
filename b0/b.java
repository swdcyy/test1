package b0.b;
import java.lang.String;
import android.security.NetworkSecurityPolicy;

public final class b	// class@0002a9
{

    public static boolean a(String p0){
       return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(p0);
    }
}
