package com.yxcorp.gifshow.relation.user.adapter.MissUProfileAndNoticeAdapter$PostCardPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.feature.post.api.postcard.PostCardView;
import java.lang.Boolean;
import com.yxcorp.gifshow.relation.user.adapter.MissUProfileAndNoticeAdapter$PostCardPresenter$1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.lifecycle.Lifecycle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.LifecycleObserver;

public class MissUProfileAndNoticeAdapter$PostCardPresenter extends PresenterV2	// class@0019e5
{
    public final PostCardView p;
    public Boolean q;
    public GifshowActivity r;
    public final LifecycleObserver s;

    public void MissUProfileAndNoticeAdapter$PostCardPresenter(PostCardView p0){
       super();
       this.q = Boolean.FALSE;
       this.s = new MissUProfileAndNoticeAdapter$PostCardPresenter$1(this);
       this.p = p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, MissUProfileAndNoticeAdapter$PostCardPresenter.class, "1")) {
          return;
       }
       if (this.getActivity() instanceof GifshowActivity) {
          GifshowActivity activity = this.getActivity();
          this.r = activity;
          activity.getLifecycle().addObserver(this.s);
       }
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, MissUProfileAndNoticeAdapter$PostCardPresenter.class, "2")) {
          return;
       }
       MissUProfileAndNoticeAdapter$PostCardPresenter tr = this.r;
       if (tr != null) {
          tr.getLifecycle().removeObserver(this.s);
       }
       return;
    }
}
