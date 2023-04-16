package be8.j;
import erd.o;
import java.lang.Object;
import java.util.List;
import be8.k;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Iterator;
import com.mini.authorizemanager.ipc.ScopeForIPC;
import java.lang.CharSequence;
import android.text.TextUtils;

public final class j implements o	// class@000337
{
    public static final j b;

    static {
       j.b = new j();
    }
    public void j(){
       super();
    }
    public final Object apply(Object p0){
       boolean b;
       ScopeForIPC obj = PatchProxy.applyOneRefs(p0, null, k.class, "6");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          Objects.toString(p0);
          p0 = p0.iterator();
          while (true) {
             if (p0.hasNext()) {
                obj = p0.next();
                if (obj != null && TextUtils.equals(obj.b, "scope.userLocation")) {
                   b = true;
                   break ;
                }
             }else {
                b = false;
                break ;
             }
          }
       }
       return Boolean.valueOf(b);
    }
}
