package eob.t;
import java.lang.Object;
import androidx.fragment.app.FragmentActivity;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.plugin.downloader.PluginDownloadExtension;
import eob.q;
import io.reactivex.g;

public class t	// class@00279c
{

    public void t(){
       super();
    }
    public static boolean b(int p0){
       boolean b = (p0 != -1)? true: false;
       return b;
    }
    public t a(FragmentActivity p0,boolean p1){
       t ot = t.class;
       if (PatchProxy.isSupport(ot)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, ot, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       PluginDownloadExtension.k.a("moment");
       return t.create(new q(this, p0, p1));
    }
}
