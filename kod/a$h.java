package kod.a$h;
import android.view.View$OnClickListener;
import kod.a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import vnd.a;
import androidx.fragment.app.Fragment;
import java.util.Objects;
import k2b.e0;

public final class a$h implements View$OnClickListener	// class@0017ff
{
    public final a b;

    public void a$h(a p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$h.class, "1")) {
          return;
       }
       Fragment uFragment = this.b.R();
       Objects.requireNonNull(uFragment, "null cannot be cast to non-null type com.yxcorp.gifshow.log.ILogPage");
       a.a.a(uFragment);
       this.b.M();
       return;
    }
}
