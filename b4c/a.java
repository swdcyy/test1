package b4c.a;
import qm9.e0;
import com.kwai.framework.model.user.User;
import java.lang.Object;
import com.kuaishou.android.model.music.Music;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import z5c.y1;

public class a implements e0	// class@0003a2
{
    public User a;

    public void a(User p0){
       super();
       this.a = p0;
    }
    public void a(boolean p0,Music p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoa, "3")) {
          return;
       }
       if (p1 != null) {
          uoa = this.a;
          if (uoa != null && (!PatchProxy.isSupport(y1.class) || !PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), uoa, p1, null, y1.class, "38"))) {
             y1.J(1881, p0, 0, uoa, p1);
          }
       }
       return;
    }
    public void b(boolean p0,Music p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoa, "1")) {
          return;
       }
       if (p1 != null) {
          a ta = this.a;
          if (ta != null) {
             y1.H(p0, 3, ta, p1, 1, 0);
          }
       }
       return;
    }
    public void c(boolean p0,Music p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoa, "2")) {
          return;
       }
       if (p1 != null) {
          a ta = this.a;
          if (ta != null) {
             y1.G(p0, 3, ta, p1, 1, 0);
          }
       }
       return;
    }
}
