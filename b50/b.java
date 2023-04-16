package b50.b;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import b50.b$a;
import java.lang.String;
import ok.x;
import java.lang.Object;
import b50.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import zsd.u;
import v40.a;
import java.lang.StringBuilder;
import com.kuaishou.eve.kit.api.init.EveManagerWrapper;
import java.util.Objects;
import com.kuaishou.eve.kit.api.init.Op;
import u40.f;
import java.lang.Runnable;
import u40.i;
import q40.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import km8.b;
import oe6.g;

public final class b extends ConfigAutoParseJsonConsumer	// class@000244
{
    public static final b e;

    static {
       b.e = new b();
    }
    public void b(){
       super("eveConfig", b$a.b);
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
       }else if(p0 != null){
          a identity = p0.identity;
          int i = 1;
          int i1 = (identity == null || u.S1(identity))? 1: 0;
          if (!(i ^ i1)) {
             identity = null;
          }
          if (identity != null) {
             a.a.b("EveStartupConfigConsumer#doAccept "+identity);
             EveManagerWrapper e = EveManagerWrapper.e;
             Objects.requireNonNull(e);
             if (!PatchProxy.applyVoidOneRefs(identity, e, EveManagerWrapper.class, "30")) {
                EveManagerWrapper.d.a(Op.POSITIVE, identity, new f(identity));
             }
          }
          p0 = p0.taskUploadRatios;
          if (p0 != null) {
             SharedPreferences$Editor uEditor = a.a.edit();
             uEditor.putString("eve_task_upload_ratio", b.e(p0));
             g.a(uEditor);
          }
       }
       return;
    }
}
