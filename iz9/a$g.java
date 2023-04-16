package iz9.a$g;
import erd.g;
import iz9.a;
import java.lang.Object;
import bf5.u;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import zsd.u;
import de5.a;

public final class a$g implements g	// class@0028d2
{
    public final a b;

    public void a$g(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       u a;
       if (PatchProxy.applyVoidOneRefs(p0, this, a$g.class, "1")) {
       }else {
          a.p(p0, "event");
          a = p0.a;
          if (a != null) {
             Object obj = null;
             String photoId = a.getPhotoId();
             a u = this.b.u;
             String photoId1 = (u != null)? u.getPhotoId(): obj;
             if (u.J1(photoId, photoId1, false, 2, obj)) {
                a$g tb = this.b;
                if (tb.A != null && (tb.u != null && (tb.y != null && (p0.b).equals("scene_play_time_out")))) {
                   p0 = this.b.A;
                   a.m(p0);
                   a u1 = this.b.u;
                   a.m(u1);
                   p0.z(u1);
                }
             }
          }
       }
    label_0058 :
       return;
    }
}
