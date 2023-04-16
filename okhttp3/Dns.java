package okhttp3.Dns;
import okhttp3.Dns$1;
import java.lang.String;
import java.util.List;

public interface abstract Dns	// class@002072
{
    public static final Dns SYSTEM;

    static {
       Dns.SYSTEM = new Dns$1();
    }
    List lookup(String p0);
}
