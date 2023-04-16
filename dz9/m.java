package dz9.m;
import mf5.w0;
import v6a.m0;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import le5.a;
import java.util.Objects;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.CommonMeta;
import kp.r1;
import ra6.a;
import com.kuaishou.android.model.mix.FeedBackInterestManagementEntrance;
import kf5.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import xh7.b;
import qh7.b;
import qh7.a;
import ez9.b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class m extends w0	// class@002018
{
    public final BaseFragment C;
    public final GifshowActivity D;
    public final PhotoDetailParam E;
    public final QPhoto F;
    public final FeedBackInterestManagementEntrance G;
    public final SlidePageConfig H;

    public void m(m0 p0,SlidePageConfig p1){
       a a;
       a.p(p0, "callerContext");
       a.p(p1, "pageConfig");
       super("interest_management");
       this.H = p1;
       this.C = p0.b;
       a = p0.a;
       Objects.requireNonNull(a, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
       this.D = a;
       a c = p0.c;
       this.E = c;
       PhotoDetailParam mPhoto = c.mPhoto;
       this.F = mPhoto;
       a.o(mPhoto, "mPhoto");
       CommonMeta mInterestMan = r1.w0(mPhoto.getEntity()).mInterestManagementEntrance;
       this.G = mInterestMan;
       this.L(R.drawable.arg_RES_7f080b0e);
       int i = a.d();
       FeedBackInterestManagementEntrance uFeedBackInt = null;
       if (i != 2) {
          if (i != 3) {
             if (mInterestMan != null) {
                uFeedBackInt = mInterestMan.mCHSText;
             }
          }else if(mInterestMan != null){
             uFeedBackInt = mInterestMan.mENGText;
          }
       }else if(mInterestMan != null){
          uFeedBackInt = mInterestMan.mTCText;
       }
       if (uFeedBackInt != null) {
          this.U(uFeedBackInt);
       }
       this.H(true);
       return;
    }
    public boolean E(){
       boolean b = (this.G != null)? true: false;
       return b;
    }
    public void d(w0 p0,g p1){
       b a;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, m.class, "1")) {
          return;
       }
       a.p(p0, "item");
       a.p(p1, "panel");
       m tG = this.G;
       b uob = null;
       if (tG != null) {
          FeedBackInterestManagementEntrance mUrl = tG.mUrl;
          if (mUrl != null) {
             a.b(b.j(this.D, mUrl), uob);
          }
       }
       p1.a();
       a = b.a;
       m tF = this.F;
       a.o(tF, "mPhoto");
       m tC = this.C;
       a.o(tC, "mFragment");
       m tG1 = this.G;
       if (tG1 != null) {
          uob = tG1.mCHSText;
       }
       a.a(tF, tC, uob);
       return;
    }
    public void onShow(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, m.class, "2")) {
          return;
       }
       b a = b.a;
       m tF = this.F;
       a.o(tF, "mPhoto");
       m tC = this.C;
       a.o(tC, "mFragment");
       m tG = this.G;
       if (tG != null) {
          objArray = tG.mCHSText;
       }
       a.b(tF, tC, objArray);
       return;
    }
}
