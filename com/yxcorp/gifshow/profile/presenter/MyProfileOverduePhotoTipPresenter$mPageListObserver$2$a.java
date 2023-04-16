package com.yxcorp.gifshow.profile.presenter.MyProfileOverduePhotoTipPresenter$mPageListObserver$2$a;
import qvb.q;
import com.yxcorp.gifshow.profile.presenter.MyProfileOverduePhotoTipPresenter$mPageListObserver$2;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import com.yxcorp.gifshow.profile.presenter.MyProfileOverduePhotoTipPresenter;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import qvb.n0;
import com.yxcorp.gifshow.model.response.ProfileFeedResponse;
import com.yxcorp.gifshow.model.ProfileTubeCardInfo;
import java.util.Collection;
import com.yxcorp.gifshow.profile.presenter.MyProfileOverduePhotoTipPresenter$mPageListObserver$2$a$a;
import java.lang.Runnable;
import ekd.k1;
import qvb.a;
import android.os.MessageQueue$IdleHandler;
import z5c.n2;

public final class MyProfileOverduePhotoTipPresenter$mPageListObserver$2$a implements q	// class@001421
{
    public final MyProfileOverduePhotoTipPresenter$mPageListObserver$2 b;

    public void MyProfileOverduePhotoTipPresenter$mPageListObserver$2$a(MyProfileOverduePhotoTipPresenter$mPageListObserver$2 p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       p.a(this, p0, p1);
    }
    public void Z1(boolean p0,boolean p1){
       p.d(this, p0, p1);
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       MyProfileOverduePhotoTipPresenter r;
       ProfileTubeCardInfo profileTubeC;
       MyProfileOverduePhotoTipPresenter$mPageListObserver$2$a omPageListOb = MyProfileOverduePhotoTipPresenter$mPageListObserver$2$a.class;
       if (PatchProxy.isSupport(omPageListOb) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, omPageListOb, "1")) {
          return;
       }
       if (p0) {
          MyProfileOverduePhotoTipPresenter$mPageListObserver$2 this$0 = this.b.this$0;
          Objects.requireNonNull(this$0);
          Object obj = PatchProxy.apply(null, this$0, MyProfileOverduePhotoTipPresenter.class, "3");
          if (obj != PatchProxyResult.class) {
             this$0 = obj.booleanValue();
          }else {
             r = this$0.r;
             if (r == null) {
                a.S("mPageList");
             }
             ProfileFeedResponse profileFeedR = r.L0();
             if (profileFeedR != null) {
                profileTubeC = profileFeedR.getProfileTubeCardInfo();
                if (profileTubeC != null) {
                   profileTubeC = profileTubeC.mProfileTubeCards;
                   if (profileTubeC != null && (profileTubeC.isEmpty() ^ 1) == 1) {
                      profileTubeC = true;
                   }
                }
             }
             profileTubeC = false;
          }
          if (this$0) {
             k1.r(new MyProfileOverduePhotoTipPresenter$mPageListObserver$2$a$a(this), 500);
          }else {
             r = this.b.this$0.r;
             if (r == null) {
                a.S("mPageList");
             }
             if (!r.isEmpty()) {
                n2.b(this.b.this$0.S8());
             }else {
                this.b.this$0.R8();
             }
          }
       }
       return;
    }
}
