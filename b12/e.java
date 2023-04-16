package b12.e;
import b12.e$a;
import nsd.u;
import java.util.ArrayList;
import java.lang.String;
import android.app.Activity;
import android.net.Uri;
import java.lang.Object;
import kotlin.jvm.internal.a;
import b12.f;

public final class e	// class@0002ed
{
    public final f a;
    public final Uri b;
    public static final List c;
    public static final e$a d;

    static {
       e.d = new e$a(null);
       e.c = new ArrayList();
    }
    public void e(String p0,Activity p1,Uri p2){
       a.p(p0, "liveStreamId");
       a.p(p1, "activity");
       super();
       this.b = p2;
       this.a = new f(p0, p1);
    }
}
