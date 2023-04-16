package aq3.f;
import erd.g;
import com.kuaishou.live.tuna.presenter.b;
import java.lang.Object;
import na6.b;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.ref.WeakReference;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.livestream.message.nano.LiveBsStateMessages$SCLiveCurrentBsState;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import cq3.b;

public final class f implements g	// class@0002a1
{
    public final b b;

    public void f(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       f tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, b.class, "7")) {
       }else if(tb.Q == null){
          b m = tb.M;
          if (m != null && m.c != null) {
             Activity activity = tb.getActivity();
             if (activity != null && p0.a.get() == activity) {
                p0 = p0.b;
                if (p0 == 1) {
                   b.b(activity, tb.M.c.mEntity, tb.Q.floatLiveType);
                }else if(p0 == 2){
                   b.a();
                }
             }
          }
       }
       return;
    }
}
