package b4c.b;
import qm9.f0;
import com.kwai.framework.model.user.User;
import java.lang.Object;
import com.kuaishou.android.model.music.Music;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import z5c.y1;

public class b implements f0	// class@0003a3
{
    public User a;

    public void b(User p0){
       super();
       this.a = p0;
    }
    public void a(boolean p0,Music p1,int p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), p1, Integer.valueOf(p2), this, b.class, "1")) {
          return;
       }
       if (p1 != null) {
          b ta = this.a;
          if (ta != null) {
             y1.H(p0, 3, ta, p1, 5, p2);
          }
       }
       return;
    }
    public void b(boolean p0,Music p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uob, "3")) {
          return;
       }
       if (p1 != null) {
          uob = this.a;
          if (uob != null) {
             y1.L(p0, 2, uob, p1);
          }
       }
       return;
    }
    public void c(boolean p0,Music p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uob, "5")) {
          return;
       }
       if (p1 != null) {
          uob = this.a;
          if (uob != null && (!PatchProxy.isSupport(y1.class) || !PatchProxy.applyVoidFourRefs(Boolean.valueOf(p0), Integer.valueOf(2), uob, p1, null, y1.class, "37"))) {
             y1.J(828, p0, 2, uob, p1);
          }
       }
       return;
    }
    public void d(boolean p0,Music p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uob, "4")) {
          return;
       }
       if (p1 != null) {
          uob = this.a;
          if (uob != null && (!PatchProxy.isSupport(y1.class) || !PatchProxy.applyVoidFourRefs(Boolean.valueOf(p0), Integer.valueOf(2), uob, p1, null, y1.class, "36"))) {
             y1.J(1043, p0, 2, uob, p1);
          }
       }
       return;
    }
    public void e(boolean p0,Music p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uob, "2")) {
          return;
       }
       if (p1 != null) {
          uob = this.a;
          if (uob != null) {
             y1.I(p0, 2, uob, p1);
          }
       }
       return;
    }
}
