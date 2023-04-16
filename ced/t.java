package ced.t;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.plugin.search.result.hashtag.presenters.h;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.plugin.search.result.hashtag.entity.TagInfo;
import com.kwai.feature.api.router.social.profile.ProfileStartParam;
import com.kwai.feature.api.router.social.profile.ProfileStartParam$CollectionSub;
import tkd.b;
import tkd.d;
import vu5.b;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.plugin.search.result.hashtag.presenters.b;
import com.kwai.library.widget.popup.common.c;

public class t extends m	// class@000580
{
    public final h c;

    public void t(h p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "1")) {
          return;
       }
       t tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(null, tc, h.class, "13")) {
          boolean b = true;
          ProfileStartParam profileStart = ProfileStartParam.i().u(b);
          TagInfo mTagType = tc.D.mTagType;
          if (mTagType == b) {
             profileStart.t(ProfileStartParam$CollectionSub.TAB_COLLECTION_TAG);
          }else if(mTagType == 3){
             profileStart.t(ProfileStartParam$CollectionSub.TAB_COLLECTION_MUSIC);
          }else if(mTagType == 4){
             profileStart.t(ProfileStartParam$CollectionSub.TAB_COLLECTION_MAGIC);
          }
          d.a(-1718536792).wT(tc.getActivity(), profileStart);
          tc.W8();
          h f = tc.F;
          if (f != null && f.K()) {
             tc.F.o();
          }
       }
    label_006a :
       return;
    }
}
