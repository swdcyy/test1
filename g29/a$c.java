package g29.a$c;
import androidx.lifecycle.Observer;
import g29.a;
import java.lang.Object;
import com.kwai.feature.component.photofeatures.startup.response.AvatarInfoResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qp7.x0;
import qp7.b;
import ls7.d;

public final class a$c implements Observer	// class@0023eb
{
    public final a b;

    public void a$c(a p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$c.class, "1")) {
       }else {
          d uod = this.b.E();
          boolean b = true;
          if (p0.mType != b) {
             b = false;
          }
          uod.g(b);
       }
       return;
    }
}
