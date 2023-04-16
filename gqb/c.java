package gqb.c;
import erd.g;
import gqb.g;
import com.kuaishou.android.model.music.Music;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.music.radio.MusicRadioLogger;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import uh5.e;
import lnc.a1;
import gqb.h;
import com.yxcorp.gifshow.widget.h$a;
import e17.i$b;
import com.yxcorp.gifshow.widget.h;
import kotlin.jvm.internal.a;
import e17.i;

public final class c implements g	// class@002b73
{
    public final g b;
    public final Music c;

    public void c(g p0,Music p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
       }else {
          MusicRadioLogger.d(true, this.c);
          this.b.P8(true);
          p0 = this.b;
          Activity activity = p0.getActivity();
          if (!activity instanceof GifshowActivity) {
             activity = null;
          }
          if (!PatchProxy.applyVoidOneRefs(activity, p0, g.class, "5") && (activity != null && (!activity.isFinishing() && !activity.isDestroyed()))) {
             int i = e.c() + a1.e(58.00f);
             p0.u = i;
             p0 = h.b(R.string.arg_RES_7f10072c, new h(p0, activity), 3000, i);
             p0.v(false);
             a.o(p0, "buildBottomSkipToastBuil¡­     \).setResidual\(false\)");
             i.z(p0);
          }
       }
    label_0065 :
       return;
    }
}
