package b0.d;
import android.net.LinkProperties;
import java.lang.String;

public final class d	// class@0002ab
{

    public static String a(LinkProperties p0){
       return p0.getPrivateDnsServerName();
    }
    public static boolean b(LinkProperties p0){
       return p0.isPrivateDnsActive();
    }
}
