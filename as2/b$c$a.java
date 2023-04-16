package as2.b$c$a;
import erd.g;
import as2.b$c;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import as2.b;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class b$c$a implements g	// class@0002b9
{
    public final b$c b;

    public void b$c$a(b$c p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$c$a.class, "1")) {
       }else if(!p0.booleanValue()){
          p0 = this.b.b;
          p0.l = true;
          b.Z(p0.f, "unfollow during micseat");
       }
       return;
    }
}
