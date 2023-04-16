package f43.c$b;
import erd.g;
import f43.c;
import java.lang.String;
import android.app.Activity;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.Object;
import com.kuaishou.live.gameinteractive.auth.model.GameLiveAuthInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import f43.d;
import f43.b$b;
import java.util.Set;

public class c$b implements g	// class@00286c
{
    public final String b;
    public final Activity c;
    public final ClientContent$LiveStreamPackage d;
    public final c e;

    public void c$b(c p0,String p1,Activity p2,ClientContent$LiveStreamPackage p3){
       this.e = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void accept(Object p0){
       Object obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, this, c$b.class, "1")) {
       }else if(obj != null){
          this.e.b.put(this.b, obj);
          if (!obj.a()) {
             this.e.h(this.b, this.c, obj, obj.b(), this.d, new d(this, obj));
             this.e.d.add(this.b);
          }
       }
       return;
    }
}
