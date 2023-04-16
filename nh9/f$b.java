package nh9.f$b;
import com.kwai.camerasdk.face.FaceDetectorContext$b;
import nh9.f;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import x8c.a;
import java.lang.StringBuilder;
import w46.b;

public class f$b implements FaceDetectorContext$b	// class@003189
{
    public final f a;

    public void f$b(f p0){
       this.a = p0;
       super();
    }
    public void a(int p0,String p1){
       f$b uob = f$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uob, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().t("ResourceRestoreHelper", "ModelMissing:"+p0+" message:"+p1, objArray);
       this.a.d(p1);
       return;
    }
}
