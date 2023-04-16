package ca7.f;
import java.lang.String;
import java.util.regex.Pattern;
import com.kwai.middleware.skywalker.gson.KwaiGsonBuilder;
import com.google.gson.Gson;
import com.kwai.middleware.skywalker.gson.KwaiGsonBuilder$a;
import ca7.f$a;
import java.lang.reflect.Type;
import el.a;
import android.os.Handler;
import android.os.Looper;

public class f	// class@00039c
{
    public static final Pattern a;
    public static final Gson b;
    public static final Type c;
    public static final Handler d;

    static {
       f.a = Pattern.compile("\\d+");
       f.b = KwaiGsonBuilder.g.a();
       f.c = new f$a().getType();
       f.d = new Handler(Looper.getMainLooper());
    }
}
