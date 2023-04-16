package hb2.c;
import oq5.c;
import hb2.g;
import java.lang.Object;
import android.content.res.Configuration;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.core.basic.activity.LivePlayActivity;
import android.view.View;
import com.yxcorp.utility.n;
import hb2.f;
import java.lang.Runnable;
import va1.n0;

public final class c implements c	// class@002d42
{
    public final g b;

    public void c(g p0){
       this.b = p0;
    }
    public final void onConfigurationChanged(Configuration p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, g.class, "10")) {
       }else if(tb.getActivity() instanceof LivePlayActivity){
          if (p0.orientation == 2) {
             n.f(tb.getActivity()).post(new f(tb));
          }else {
             tb.W8((float)n0.f());
          }
       }
       return;
    }
}
