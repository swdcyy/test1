package fia.e0;
import android.view.View$OnClickListener;
import fia.z;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dia.a;
import bia.d;
import java.lang.Integer;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import cia.w;
import k2b.e0;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import bia.f;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.follow.common.model.FollowingUserBannerFeed$UserBannerInfo;
import com.kwai.feature.api.social.followStagger.model.FeedUserAvatarInfo;
import com.kwai.framework.model.feed.BaseFeed;
import java.util.Map;
import bia.k;

public final class e0 implements View$OnClickListener	// class@0028fa
{
    public final z b;
    public final QPhoto c;

    public void e0(z p0,QPhoto p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e0.class, "1")) {
          return;
       }
       a.a.a(z.R8(this.b).b(), Integer.valueOf(this.b.J));
       Activity activity = this.b.getActivity();
       Object obj = null;
       if (!activity instanceof GifshowActivity) {
          activity = obj;
       }
       Activity uActivity = activity;
       e0 uoe0 = z.P8(this.b).N();
       if (!uoe0 instanceof BaseFragment) {
          uoe0 = obj;
       }
       e0 uoe01 = uoe0;
       QPhoto mEntity = this.c.mEntity;
       z i = this.b.I;
       ArrayList uArrayList = PatchProxy.applyOneRefs(i, obj, f.class, "6");
       if (uArrayList != PatchProxyResult.class) {
       }else {
          uArrayList = new ArrayList();
          if (i != null) {
             Iterator iterator = i.iterator();
             while (iterator.hasNext()) {
                uArrayList.add(new QPhoto(iterator.next().mAvatarInfo.mLiveStreamFeed));
             }
          }
       }
       Object obj1 = uArrayList;
       k.c(uActivity, uoe01, mEntity, obj1, 4, null, false, 96, null);
       return;
    }
}
