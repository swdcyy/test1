package c36.b;
import java.lang.Object;
import java.io.File;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import j80.c;

public final class b	// class@000644
{

    public void b(){
       super();
    }
    public static File a(){
       Object obj = PatchProxy.apply(null, null, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(-1504323719).d(".post_tts");
    }
}
