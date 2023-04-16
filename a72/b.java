package a72.b;
import oq5.c;
import com.kuaishou.live.core.show.divertpush.c;
import java.lang.Object;
import android.content.res.Configuration;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.LinearLayout;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d61.y;
import android.view.View;
import com.kuaishou.live.core.show.divertpush.view.LiveDivertPushView;

public final class b implements c	// class@000072
{
    public final c b;

    public void b(c p0){
       this.b = p0;
    }
    public final void onConfigurationChanged(Configuration p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, c.class, "9")) {
       }else {
          c w = tb.W;
          if (w != null && w.isShown()) {
             if (y.d(tb.getActivity())) {
                tb.W.c(tb.getActivity(), false, tb.X.getY());
             }else {
                tb.W.setVisibility(8);
             }
          }
       }
       return;
    }
}
