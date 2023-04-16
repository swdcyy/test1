package f69.b0;
import com.yxcorp.gifshow.widget.m;
import f69.y;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.Fragment;
import qa9.q;
import qa9.s;
import brd.t;
import f69.a0;
import erd.r;
import f69.z;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;

public class b0 extends m	// class@0022af
{
    public final y c;

    public void b0(y p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b0.class, "1")) {
          return;
       }
       if (this.c.getActivity() instanceof GifshowActivity) {
          q oq = s.a(this.c.p);
          if (oq != null) {
             this.c.X7(oq.e().filter(a0.b).subscribe(new z(this), Functions.d()));
          }
          s.b(this.c.p);
       }
       return;
    }
}
