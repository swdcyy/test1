package l31.f$c;
import androidx.fragment.app.c$b;
import l31.f;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class f$c extends c$b	// class@002e73
{
    public final f a;

    public void f$c(f p0){
       this.a = p0;
       super();
    }
    public void i(c p0,Fragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f$c.class, "1")) {
          return;
       }
       this.a.x9(false, "onFragmentResumed");
       return;
    }
}
