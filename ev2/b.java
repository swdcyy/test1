package ev2.b;
import ev2.l;
import com.kuaishou.live.core.voiceparty.playway.video.camera.AudienceVideoCameraControlViewController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;

public final class b implements l	// class@0027f8
{
    public boolean a;
    public final AudienceVideoCameraControlViewController b;
    public final boolean c;

    public void b(AudienceVideoCameraControlViewController p0,boolean p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       QCurrentUser qCurrentUser = QCurrentUser.me();
       a.o(qCurrentUser, "QCurrentUser.me\(\)");
       String id = qCurrentUser.getId();
       a.o(id, "QCurrentUser.me\(\).id");
       this.b.Y2(id, false);
       return;
    }
    public void e(){
    }
    public void onDismiss(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       if (this.a == null && this.c != null) {
          QCurrentUser qCurrentUser = QCurrentUser.me();
          a.o(qCurrentUser, "QCurrentUser.me\(\)");
          String id = qCurrentUser.getId();
          a.o(id, "QCurrentUser.me\(\).id");
          this.b.Y2(id, false);
       }
       this.a = false;
       return;
    }
}
