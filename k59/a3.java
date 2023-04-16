package k59.a3;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.ad.webview.q;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import java.lang.Object;
import android.view.View;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.model.feed.BaseFeed;
import g59.h;

public final class a3 implements View$OnClickListener	// class@002ac4
{
    public final q b;
    public final PhotoAdvertisement c;

    public void a3(q p0,PhotoAdvertisement p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onClick(View p0){
       a3 tb = this.b;
       GifshowActivity activity = tb.getActivity();
       h.a(activity, tb.q, this.c);
    }
}
