package bp6.f2;
import bp6.f2$a;
import java.lang.String;
import java.lang.Object;
import com.kwai.chat.sdk.signal.BizDispatcher;

public class f2	// class@00051b
{
    public final String a;
    public static final BizDispatcher b;

    static {
       f2.b = new f2$a();
    }
    public void f2(String p0){
       super();
       this.a = p0;
    }
    public static f2 a(String p0){
       return f2.b.get(p0);
    }
}
