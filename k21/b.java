package k21.b;
import android.view.View$OnClickListener;
import k21.k;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.b5;
import p91.m;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.live.core.show.statistics.LivePlayLogger;

public final class b implements View$OnClickListener	// class@002c66
{
    public final k b;

    public void b(k p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, k.class, "19")) {
       }else {
          k r = tb.r;
          r.B.onResidentFullScreenButtonClick(r.c, b5.a(tb.getActivity()), tb.r.Z2.getLiveStreamId());
          tb.a9();
       }
       return;
    }
}
