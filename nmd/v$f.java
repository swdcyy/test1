package nmd.v$f;
import android.view.View$OnClickListener;
import nmd.v;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import vnd.a;
import androidx.fragment.app.Fragment;
import java.util.Objects;
import k2b.e0;

public final class v$f implements View$OnClickListener	// class@001e7e
{
    public final v b;

    public void v$f(v p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v$f.class, "1")) {
          return;
       }
       Fragment uFragment = this.b.W();
       Objects.requireNonNull(uFragment, "null cannot be cast to non-null type com.yxcorp.gifshow.log.ILogPage");
       a.a.a(uFragment);
       this.b.I();
       return;
    }
}
