package m69.g$c;
import java.util.concurrent.Callable;
import java.io.File;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import qkd.b;
import oa0.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;

public final class g$c implements Callable	// class@002e19
{
    public final File b;

    public void g$c(File p0){
       this.b = p0;
       super();
    }
    public Object call(){
       Boolean uBoolean = PatchProxy.apply(null, this, g$c.class, "1");
       if (uBoolean != PatchProxyResult.class) {
       }else {
          b.q(this.b);
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putBoolean("ai_cut_clear_cache", false);
          g.a(uEditor);
          uBoolean = Boolean.TRUE;
       }
       return uBoolean;
    }
}
