package fva.m$b$a;
import erd.g;
import fva.m$b;
import android.view.View;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.model.config.FeedNegativeFeedback;
import com.kwai.component.photo.reduce.g;
import java.util.Collection;
import ekd.q;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import fva.n;
import java.util.List;
import yf5.l0$a;
import android.view.View$OnClickListener;
import java.util.Objects;
import com.yxcorp.gifshow.activity.GifshowActivity;
import fva.m;
import com.yxcorp.gifshow.hot.spot.fragment.HotSpotFragment;
import androidx.fragment.app.Fragment;
import yf5.l0;
import com.kwai.library.widget.popup.common.c;

public final class m$b$a implements g	// class@002a12
{
    public final m$b b;
    public final View c;

    public void m$b$a(m$b p0,View p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m$b$a.class, "1")) {
       }else {
          a.p(p0, "photo");
          FeedNegativeFeedback uFeedNegativ = g.d(p0, false, false);
          if (uFeedNegativ != null && (!q.f(uFeedNegativ.mPhotoNegative) && this.b.b.getActivity() != null)) {
             List list = g.e(uFeedNegativ.mPhotoNegativeHeader, R.string.arg_RES_7f1038d6);
             a.o(list, "PhotoReduceHelper.getOrD¡­ck_header_not_interested\)");
             List list1 = g.e(uFeedNegativ.mPhotoContentNegativeHeader, R.string.arg_RES_7f1038d5);
             a.o(list1, "PhotoReduceHelper.getOrD¡­feed_back_header_content\)");
             p0 = this.c;
             a.o(p0, "it");
             FeedNegativeFeedback mPhotoNegati = uFeedNegativ.mPhotoNegative;
             a.o(mPhotoNegati, "negativeFeedbackV2.mPhotoNegative");
             p0 = new l0$a(p0).j(p0).h(mPhotoNegati);
             p0.e(uFeedNegativ.mPhotoContentNegative);
             p0 = p0.g(list);
             p0.d(list1);
             p0.c(new n(this));
             p0.i(289);
             Activity activity = this.b.b.getActivity();
             Objects.requireNonNull(activity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
             p0 = p0.b(activity);
             p0.f(m.R8(this.b.b));
             p0.n = true;
             g.j(p0.a());
          }
       }
       return;
    }
}
