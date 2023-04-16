package db.b;
import com.kuaishou.webkit.MimeTypeMap;
import java.lang.Object;
import java.util.Map;
import com.facebook.common.internal.ImmutableMap;

public class b	// class@001e30
{
    public static final MimeTypeMap a;
    public static final Map b;
    public static final Map c;

    static {
       b.a = MimeTypeMap.getSingleton();
       b.b = ImmutableMap.of("image/heif", "heif", "image/heic", "heic");
       b.c = ImmutableMap.of("heif", "image/heif", "heic", "image/heic");
    }
}
