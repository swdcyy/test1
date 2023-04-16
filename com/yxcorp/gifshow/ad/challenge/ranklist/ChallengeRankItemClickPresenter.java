package com.yxcorp.gifshow.ad.challenge.ranklist.ChallengeRankItemClickPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.ad.challenge.ranklist.ChallengeRankItemClickPresenter$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.ad.challenge.ranklist.ChallengeRankItemClickPresenter$onBind$1;
import android.view.View;
import msd.l;
import lnc.y0;
import qvb.q;
import qvb.a;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.ad.challenge.model.RankListItemInfo;
import com.yxcorp.gifshow.model.TagChallengeBannerInfo;
import py8.k;

public final class ChallengeRankItemClickPresenter extends PresenterV2	// class@001535
{
    public View p;
    public Fragment q;
    public TagChallengeBannerInfo r;
    public RankListItemInfo s;
    public k t;
    public a u;
    public ProgressFragment v;
    public final q w;

    public void ChallengeRankItemClickPresenter(){
       super();
       this.w = new ChallengeRankItemClickPresenter$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, ChallengeRankItemClickPresenter.class, "3")) {
          return;
       }
       ChallengeRankItemClickPresenter tp = this.p;
       if (tp != null) {
          y0.a(tp, new ChallengeRankItemClickPresenter$onBind$1(this));
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, ChallengeRankItemClickPresenter.class, "7")) {
          return;
       }
       ChallengeRankItemClickPresenter tu = this.u;
       if (tu != null) {
          tu.f(this.w);
       }
       return;
    }
    public final Fragment P8(){
       return this.q;
    }
    public final RankListItemInfo R8(){
       return this.s;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ChallengeRankItemClickPresenter.class, "1")) {
          return;
       }
       this.p = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, ChallengeRankItemClickPresenter.class, "2")) {
          return;
       }
       this.r = this.t8("TAG_CHALLENGE_BANNER");
       this.s = this.s8(RankListItemInfo.class);
       this.q = this.t8("FRAGMENT");
       this.t = this.t8("DETAIL_PAGE_LIST");
       return;
    }
}
