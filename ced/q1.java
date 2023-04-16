package ced.q1;
import android.view.View$OnClickListener;
import com.yxcorp.plugin.search.result.hashtag.presenters.f0;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.router.social.profile.ProfileStartParam;
import com.yxcorp.plugin.search.result.hashtag.entity.TagInfo;
import com.kwai.feature.api.router.social.profile.ProfileStartParam$CollectionSub;
import tkd.b;
import tkd.d;
import vu5.b;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.plugin.search.result.hashtag.presenters.b;
import com.kwai.library.widget.popup.common.c;

public final class q1 implements View$OnClickListener	// class@000576
{
    public final f0 b;

    public void q1(f0 p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       q1 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, f0.class, "12")) {
       }else {
          boolean b = true;
          ProfileStartParam profileStart = ProfileStartParam.i().u(b);
          TagInfo mTagType = tb.x.mTagType;
          if (mTagType == b) {
             profileStart.t(ProfileStartParam$CollectionSub.TAB_COLLECTION_TAG);
          }else if(mTagType == 3){
             profileStart.t(ProfileStartParam$CollectionSub.TAB_COLLECTION_MUSIC);
          }else if(mTagType == 4){
             profileStart.t(ProfileStartParam$CollectionSub.TAB_COLLECTION_MAGIC);
          }
          d.a(-1718536792).wT(tb.getActivity(), profileStart);
          tb.W8();
          f0 b1 = tb.B;
          if (b1 != null && b1.K()) {
             tb.B.o();
          }
       }
       return;
    }
}
