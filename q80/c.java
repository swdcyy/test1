package q80.c;
import p80.e$a;
import java.lang.Object;
import com.kuaishou.webkit.extension.media.KsMediaPlayerFactory;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import r80.e;

public final class c implements e$a	// class@00297c
{

    public void c(){
       super();
    }
    public KsMediaPlayerFactory a(){
       Object obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new e();
    }
}
