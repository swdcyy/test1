package com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenterV2$mPageListObserver$2$a;
import qvb.q;
import com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenterV2$mPageListObserver$2;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenter;
import com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenterV2;
import ekd.k1;
import qvb.p;
import android.view.View;
import qvb.n0;
import qvb.a;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import qvb.i;
import com.yxcorp.gifshow.profile.util.ProfileLastSeenUtil;
import com.yxcorp.gifshow.profile.kslog.KsLogProfileTag;
import java.lang.StringBuilder;
import v2c.e;
import v2c.g;
import wkd.b;
import o3c.l;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import s1c.r0;
import com.kwai.framework.model.user.User;
import wh5.c;
import com.kwai.components.social.util.network.NetworkTrace;
import li5.a;
import brd.t;
import cjd.e;
import erd.o;
import com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenterV2$mPageListObserver$2$a$a;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenterV2$mPageListObserver$2$a$b;
import java.lang.Runnable;
import android.view.ViewGroup;

public final class UserProfileLastSeenPresenterV2$mPageListObserver$2$a implements q	// class@001479
{
    public final UserProfileLastSeenPresenterV2$mPageListObserver$2 b;

    public void UserProfileLastSeenPresenterV2$mPageListObserver$2$a(UserProfileLastSeenPresenterV2$mPageListObserver$2 p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       UserProfileLastSeenPresenterV2$mPageListObserver$2$a omPageListOb = UserProfileLastSeenPresenterV2$mPageListObserver$2$a.class;
       if (PatchProxy.isSupport(omPageListOb) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, omPageListOb, "3")) {
          return;
       }
       this.b.this$0.Q9(false);
       if (this.b.this$0.h9() == 3) {
          return;
       }
       if (p0) {
          this.b.this$0.I9(1);
       }else {
          UserProfileLastSeenPresenterV2$mPageListObserver$2 this$0 = this.b.this$0;
          this$0.I9((this$0.e9() + 1));
       }
       this.b.this$0.X8();
       return;
    }
    public void Z1(boolean p0,boolean p1){
       UserProfileLastSeenPresenterV2$mPageListObserver$2$a omPageListOb = UserProfileLastSeenPresenterV2$mPageListObserver$2$a.class;
       if (PatchProxy.isSupport(omPageListOb) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, omPageListOb, "1")) {
          return;
       }
       this.b.this$0.L9(k1.i());
       return;
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       View view;
       UserProfileLastSeenPresenterV2$mPageListObserver$2 this$0;
       UserProfileLastSeenPresenterV2$mPageListObserver$2$a omPageListOb = UserProfileLastSeenPresenterV2$mPageListObserver$2$a.class;
       if (PatchProxy.isSupport(omPageListOb) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, omPageListOb, "2")) {
          return;
       }
       boolean b = false;
       this.b.this$0.Q9(b);
       if (this.b.this$0.h9() == 3) {
          return;
       }
       int i = -1;
       if (p0) {
          this.b.this$0.O9(i);
          this.b.this$0.I9(1);
          this.b.this$0.K9(b);
          this.b.this$0.J9(b);
          view = this.b.this$0.m9();
          if (view != null) {
             UserProfileLastSeenPresenterV2$mPageListObserver$2$a omPageListOb1 = (!view.getVisibility())? 1: null;
             if (omPageListOb1 == 1) {
                view = this.b.this$0.m9();
                if (view != null) {
                   view.setVisibility(8);
                }
             }
          }
       }else if(this.b.this$0.B9() == i){
          this$0 = this.b.this$0;
          this$0.I9((this$0.e9() + 1));
       }else {
       label_01f7 :
          return;
       }
       if (this.b.this$0.j9() < this.b.this$0.s9().getCount()) {
          int i1 = this.b.this$0.j9();
          int count = this.b.this$0.s9().getCount();
          while (i1 < count) {
             Object item = this.b.this$0.s9().getItem(i1);
             a.o(item, "mPageList.getItem\(index\)");
             if (ProfileLastSeenUtil.b(this.b.this$0.l9(), item, this.b.this$0.s9())) {
                g.h(KsLogProfileTag.PHOTO_LAST_SEEN, "find last seen index: "+i1);
                this.b.this$0.O9(i1);
                break ;
             }
             i1++;
          }
       }
       this.b.this$0.ba(b);
       if (this.b.this$0.B9() == i && !this.b.this$0.U9()) {
          this$0 = this.b.this$0;
          this$0.U0 = true;
          Object obj = b.a(0x37313f08);
          UserProfileLastSeenPresenterV2$mPageListObserver$2 this$01 = this.b.this$0;
          Objects.requireNonNull(this$01);
          UserProfileLastSeenPresenter userProfileL = PatchProxy.apply(null, this$01, UserProfileLastSeenPresenter.class, "11");
          if (userProfileL != PatchProxyResult.class) {
          }else {
             userProfileL = this$01.u;
             if (userProfileL == null) {
                a.S("mProfilePageParam");
             }
          }
          r0 b1 = userProfileL.b;
          a.o(b1, "mProfilePageParam.mUser");
          String id = b1.getId();
          this$0.X7(obj.k(id, this.b.this$0.l9(), c.j(), this.b.this$0.D9(), a.c("UserProfileLastSeenPresenterV2")).map(new e()).subscribe(new UserProfileLastSeenPresenterV2$mPageListObserver$2$a$a(this)));
       }
       view = this.b.this$0.m9();
       if (view == null || (view.getVisibility() && !this.b.this$0.U9())) {
          this.b.this$0.x9().post(new UserProfileLastSeenPresenterV2$mPageListObserver$2$a$b(this));
       }
       if (this.b.this$0.B9() == i) {
          this$0 = this.b.this$0;
          this$0.K9(this$0.s9().getCount());
          if (this.b.this$0.q9() && !this.b.this$0.X9()) {
             this.b.this$0.X8();
          }
          this.b.this$0.ba(1);
       }
       this$0 = this.b.this$0;
       if (this$0.X0 != null) {
          this$0.aa();
          goto label_01f7 ;
       }else {
          goto label_01f7 ;
       }
    }
}
