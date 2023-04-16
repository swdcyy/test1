package bsc.e$a;
import android.view.View$OnClickListener;
import bsc.e;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import androidx.fragment.app.Fragment;
import lsc.f0;
import qrc.e;
import lsc.g0;

public final class e$a implements View$OnClickListener	// class@000484
{
    public final e b;

    public void e$a(e p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "1")) {
          return;
       }
       if (PostExperimentUtils.q0() == 1) {
          f0.n(this.b.h());
       }else {
          f0.m(this.b.h());
       }
       g0.g(f0.d(this.b.h()).a(), "list_top");
       return;
    }
}
