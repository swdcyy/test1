package gh9.i;
import java.lang.Object;
import android.content.Intent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ekd.j0;

public final class i	// class@0024a1
{
    public static final i a;

    static {
       i.a = new i();
    }
    public void i(){
       super();
    }
    public static final boolean a(Intent p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, i.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 == null)? true: j0.a(p0, "snapshot_disabled", false);
       return b;
    }
}
