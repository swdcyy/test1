package f72.z;
import android.view.View$OnLongClickListener;
import f72.a0;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import yf5.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.u1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.QCurrentUser;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.model.config.FeedNegativeFeedback;
import com.kwai.component.photo.reduce.g;
import java.util.Collection;
import ekd.q;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import f72.y;
import java.util.List;
import yf5.l0$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.Fragment;
import yf5.l0;
import com.kwai.library.widget.popup.common.c;
import e72.p;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import k2b.e0;

public final class z implements View$OnLongClickListener	// class@0028e2
{
    public final a0 b;

    public void z(a0 p0){
       this.b = p0;
    }
    public final boolean onLongClick(View p0){
       z tb = this.b;
       Objects.requireNonNull(tb);
       boolean b = false;
       a.b(b);
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.type = 11;
       uElementPack.name = "reduce_similar_photo";
       uElementPack.action = 52;
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = w1.f(tb.r.mEntity);
       u1.u(4, uElementPack, uContentPack);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, a0.class, "7")) {
       }else if(!QCurrentUser.me().isLogined() || tb.getActivity() == null){
          FeedNegativeFeedback uFeedNegativ = g.d(tb.r, b, b);
          if (uFeedNegativ != null && !q.f(uFeedNegativ.mPhotoNegative)) {
             tb.t.h0().requestDisallowInterceptTouchEvent(true);
             l0$a uoa = new l0$a(tb.r).j(tb.q).h(uFeedNegativ.mPhotoNegative);
             uoa.e(uFeedNegativ.mPhotoContentNegative);
             l0$a uoa1 = uoa.g(g.e(uFeedNegativ.mPhotoNegativeHeader, R.string.arg_RES_7f1038d6));
             uoa1.d(g.e(uFeedNegativ.mPhotoContentNegativeHeader, R.string.arg_RES_7f1038d5));
             uoa1.c(new y(tb));
             uoa1.i(tb.p);
             uoa1 = uoa1.b(tb.getActivity());
             uoa1.f(tb.t);
             g.j(uoa1.a());
             QPhoto mEntity = tb.r.mEntity;
             a0 t = tb.t;
             if (PatchProxy.applyVoidTwoRefs(mEntity, t, objArray, p.class, "1") || (mEntity != null && mEntity instanceof LiveStreamFeed)) {
                uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "NEGATIVE_DIALOG";
                uContentPack = new ClientContent$ContentPackage();
                uContentPack.liveStreamPackage = p.a(mEntity);
                u1.C0("", t, 4, uElementPack, uContentPack);
             }
          }
       }
       return true;
    }
}
