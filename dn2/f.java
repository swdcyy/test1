package dn2.f;
import com.kuaishou.live.core.show.wishlight.download.base.a$a;
import dn2.e;
import dn2.c$c;
import dn2.g;
import java.lang.Object;
import com.kuaishou.live.core.show.wishlight.download.base.LiveAvatarFailType;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import en2.a;

public class f implements a$a	// class@00255d
{
    public final c$c a;
    public final g b;
    public final e c;

    public void f(e p0,c$c p1,g p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void a(LiveAvatarFailType p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, f.class, "2")) {
          return;
       }
       this.a.onFinish();
       this.c.e(this.b, p0, p1, p2);
       return;
    }
    public void onSuccess(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       this.a.onFinish();
       this.c.f(this.b, p0);
       this.c.b.b();
       return;
    }
}
