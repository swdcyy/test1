package ac2.g;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.show.luckystar.currentinfo.c;
import java.lang.Object;
import android.view.View;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d61.g;
import com.yxcorp.gifshow.activity.GifshowActivity;
import yb2.i;
import y41.i$a;
import java.lang.String;
import p91.m;
import com.kwai.framework.model.user.User;
import y41.i;

public final class g implements View$OnClickListener	// class@0000b1
{
    public final c b;

    public void g(c p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       g tb = this.b;
       if (!g.h(tb.getActivity()) || !tb.getActivity() instanceof GifshowActivity) {
          i a = tb.v.a;
          i$a uoa = new i$a(tb.getActivity(), a.getLiveStreamId());
          uoa.o(a.I());
          uoa.n(108);
          uoa.r(true);
          uoa.a().c();
       }
       return;
    }
}
