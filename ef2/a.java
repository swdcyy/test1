package ef2.a;
import androidx.lifecycle.Observer;
import ef2.d;
import java.lang.Object;
import com.kuaishou.live.core.show.profilecard.http.LiveUserProfileExtraInfo;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wj2.r;
import com.kuaishou.live.core.show.profilecard.LiveProfileMode;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.utility.n;
import mkc.b;
import android.view.View;
import mkc.c;

public final class a implements Observer	// class@002717
{
    public final d b;

    public void a(d p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       b[] uobArray;
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, d.class, "6")) {
       }else {
          p0 = tb.v.m;
          int i = 1;
          if (p0 != LiveProfileMode.ANCHOR_VIEW_SELF && (p0 == LiveProfileMode.ESCROW_VIEW_SELF || (!n.I(tb.getActivity()) && tb.S8()))) {
             uobArray = new b[i];
             uobArray[0] = b.e;
             c.d(tb.x, uobArray);
             tb.V8(tb.x, 8);
          }else {
             uobArray = new b[i];
             uobArray[0] = b.e;
             c.d(tb.w, uobArray);
             tb.V8(tb.w, 8);
          }
       }
       return;
    }
}
