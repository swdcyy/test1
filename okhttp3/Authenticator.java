package okhttp3.Authenticator;
import okhttp3.Authenticator$1;
import okhttp3.Route;
import okhttp3.Response;
import okhttp3.Request;

public interface abstract Authenticator	// class@00205b
{
    public static final Authenticator NONE;

    static {
       Authenticator.NONE = new Authenticator$1();
    }
    Request authenticate(Route p0,Response p1);
}
