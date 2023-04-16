package g59.c;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.download.DownloadManager;
import java.lang.Integer;
import java.lang.Number;

public final class c	// class@0023f8
{
    public static final c a;

    static {
       c.a = new c();
    }
    public void c(){
       super();
    }
    public static final void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, c.class, "1")) {
          return;
       }
       if (p0 != null) {
          Integer integer = DownloadManager.n().p(p0);
          if (integer != null) {
             DownloadManager.n().e(integer.intValue());
          }
       }
       return;
    }
}
