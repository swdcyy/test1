package okhttp3.CookieJar;
import okhttp3.CookieJar$1;
import okhttp3.HttpUrl;
import java.util.List;

public interface abstract CookieJar	// class@00206f
{
    public static final CookieJar NO_COOKIES;

    static {
       CookieJar.NO_COOKIES = new CookieJar$1();
    }
    List loadForRequest(HttpUrl p0);
    void saveFromResponse(HttpUrl p0,List p1);
}
