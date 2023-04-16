package nh9.f$a;
import com.kwai.video.westeros.Westeros$OnWesterosEventListener;
import nh9.f;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import x8c.a;
import java.lang.StringBuilder;
import w46.b;

public class f$a implements Westeros$OnWesterosEventListener	// class@003188
{
    public final f a;

    public void f$a(f p0){
       this.a = p0;
       super();
    }
    public void onEvent(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f$a.class, "1")) {
          return;
       }
       Objects.requireNonNull(p0);
       if (p0.equals("WESTEROS_EVENT_MODEL_MISSING")) {
          Object[] objArray = new Object[0];
          a.D().t("ResourceRestoreHelper", "ModelMissing:"+p1, objArray);
          this.a.d(p1);
       }
       return;
    }
}
