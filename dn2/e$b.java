package dn2.e$b;
import com.kuaishou.live.core.show.wishlight.download.base.a$a;
import dn2.e;
import dn2.g;
import java.lang.Object;
import com.kuaishou.live.core.show.wishlight.download.base.LiveAvatarFailType;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import en2.a;

public class e$b implements a$a	// class@00255b
{
    public final g a;
    public final e b;

    public void e$b(e p0,g p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(LiveAvatarFailType p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, e$b.class, "2")) {
          return;
       }
       this.b.e(this.a, p0, p1, p2);
       return;
    }
    public void onSuccess(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$b.class, "1")) {
          return;
       }
       this.b.f(this.a, p0);
       this.b.b.b();
       return;
    }
}
