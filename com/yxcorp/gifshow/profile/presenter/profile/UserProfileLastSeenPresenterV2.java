package com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenterV2;
import com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenter;
import com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenterV2$a;
import nsd.u;
import com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenterV2$mPageListObserver$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ekd.k1;
import android.widget.ImageView;
import com.kwai.library.widget.refresh.path.PathLoadingView;
import android.view.View;
import com.kwai.social.startup.follow.model.ProfileLastSeenConfig;
import java.lang.Number;
import com.kwai.social.startup.follow.model.SearchLoadConfig;
import com.kwai.social.startup.follow.model.FeedLoadConfig;
import qvb.n0;
import com.yxcorp.gifshow.profile.kslog.KsLogProfileTag;
import java.lang.StringBuilder;
import v2c.e;
import v2c.g;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenterV2$b;
import java.lang.Runnable;
import android.view.ViewGroup;
import com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenterV2$c;
import qvb.q;

public final class UserProfileLastSeenPresenterV2 extends UserProfileLastSeenPresenter	// class@00147b
{
    public boolean U0;
    public int V0;
    public boolean W0;
    public boolean X0;
    public boolean Y0;
    public final p Z0;
    public static final UserProfileLastSeenPresenterV2$a a1;

    static {
       UserProfileLastSeenPresenterV2.a1 = new UserProfileLastSeenPresenterV2$a(null);
    }
    public void UserProfileLastSeenPresenterV2(){
       super();
       this.V0 = -2;
       this.Z0 = s.c(new UserProfileLastSeenPresenterV2$mPageListObserver$2(this));
    }
    public boolean G9(int p0){
       UserProfileLastSeenPresenterV2 userProfileL = UserProfileLastSeenPresenterV2.class;
       if (PatchProxy.isSupport(userProfileL)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, userProfileL, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = (this.B9() == -1 && this.q9())? true: false;
       return b;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, UserProfileLastSeenPresenterV2.class, "9")) {
          return;
       }
       super.J8();
       k1.n("DelayLoading");
       this.Z9();
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, UserProfileLastSeenPresenterV2.class, "5")) {
          return;
       }
       UserProfileLastSeenPresenter tL = this.L;
       if (tL != null) {
          tL.setVisibility(8);
       }
       PathLoadingView pathLoadingV = this.k9();
       if (pathLoadingV != null) {
          pathLoadingV.setVisibility(0);
       }
       pathLoadingV = this.k9();
       if (pathLoadingV != null) {
          pathLoadingV.k();
       }
       this.E9();
       this.M9(true);
       this.X0 = true;
       this.aa();
       return;
    }
    public final int T9(boolean p0,ProfileLastSeenConfig p1){
       ProfileLastSeenConfig obj;
       UserProfileLastSeenPresenterV2 userProfileL = UserProfileLastSeenPresenterV2.class;
       if (PatchProxy.isSupport(userProfileL)) {
          obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), p1, this, userProfileL, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       obj = null;
       ProfileLastSeenConfig mSearchLoadC = (p1 != null)? p1.mSearchLoadConfig: obj;
       if (p1 != null) {
          obj = p1.mFeedLoadConfig;
       }
       if (this.D9() && mSearchLoadC != null) {
          SearchLoadConfig preLoadLimit = (p0)? mSearchLoadC.preLoadLimit: mSearchLoadC.directlyLoadLimit;
          return preLoadLimit;
       }else if(obj != null){
          FeedLoadConfig preLoadLimit1 = (p0)? obj.preLoadLimit: obj.directlyLoadLimit;
          return preLoadLimit1;
       }else {
          return 0;
       }
    }
    public final boolean U9(){
       return this.U0;
    }
    public final int V9(){
       return this.V0;
    }
    public void X8(){
       if (PatchProxy.applyVoid(null, this, UserProfileLastSeenPresenterV2.class, "6")) {
          return;
       }
       if (this.B9() == -1 && (this.s9().hasMore() && this.q9())) {
          g.h(KsLogProfileTag.PHOTO_LAST_SEEN, "try load more mAlreadyRequestTime: "+this.e9());
          this.Q9(true);
          this.s9().load();
       }
    label_0048 :
       return;
    }
    public final boolean X9(){
       return this.Y0;
    }
    public final boolean Y9(){
       return this.W0;
    }
    public void Z8(){
       if (PatchProxy.applyVoid(null, this, UserProfileLastSeenPresenterV2.class, "4")) {
          return;
       }
       int i = this.c9(this.x9(), 100);
       boolean b = true;
       if (i < 0 && this.J == null) {
          this.J = b;
          this.x9().post(new UserProfileLastSeenPresenterV2$b(this));
          return;
       }else if(this.B9() != -1 && i >= this.B9()){
          this.J9(2);
          View view = this.m9();
          if (view != null) {
             view.setVisibility(8);
          }
       }else {
          this.J9(b);
          this.R9();
       }
       return;
    }
    public final void Z9(){
       if (PatchProxy.applyVoid(null, this, UserProfileLastSeenPresenterV2.class, "8")) {
          return;
       }
       PathLoadingView pathLoadingV = this.k9();
       if (pathLoadingV != null && pathLoadingV.n() == true) {
          pathLoadingV = this.k9();
          if (pathLoadingV != null) {
             pathLoadingV.a();
          }
       }
       pathLoadingV = this.k9();
       if (pathLoadingV != null) {
          pathLoadingV.setVisibility(8);
       }
       return;
    }
    public final void aa(){
       if (PatchProxy.applyVoid(null, this, UserProfileLastSeenPresenterV2.class, "7")) {
          return;
       }
       if (this.B9() == -1) {
          this.X8();
       }else {
          k1.s(new UserProfileLastSeenPresenterV2$c(this), "DelayLoading", 500);
       }
       return;
    }
    public final void ba(boolean p0){
       this.Y0 = p0;
    }
    public q t9(){
       Object obj = PatchProxy.apply(null, this, UserProfileLastSeenPresenterV2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.Z0.getValue();
    }
}
