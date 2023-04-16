package com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenter$mPageListObserver$2$a;
import qvb.q;
import com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenter$mPageListObserver$2;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenter;
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
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenter$mPageListObserver$2$a$a;
import java.lang.Runnable;
import android.view.ViewGroup;

public final class UserProfileLastSeenPresenter$mPageListObserver$2$a implements q	// class@001468
{
    public final UserProfileLastSeenPresenter$mPageListObserver$2 b;

    public void UserProfileLastSeenPresenter$mPageListObserver$2$a(UserProfileLastSeenPresenter$mPageListObserver$2 p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       UserProfileLastSeenPresenter$mPageListObserver$2$a omPageListOb = UserProfileLastSeenPresenter$mPageListObserver$2$a.class;
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
          UserProfileLastSeenPresenter$mPageListObserver$2 this$0 = this.b.this$0;
          this$0.I9((this$0.e9() + 1));
       }
       this.b.this$0.Y8();
       return;
    }
    public void Z1(boolean p0,boolean p1){
       UserProfileLastSeenPresenter$mPageListObserver$2$a omPageListOb = UserProfileLastSeenPresenter$mPageListObserver$2$a.class;
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
       UserProfileLastSeenPresenter$mPageListObserver$2$a omPageListOb = UserProfileLastSeenPresenter$mPageListObserver$2$a.class;
       if (PatchProxy.isSupport(omPageListOb) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, omPageListOb, "2")) {
          return;
       }
       int b = false;
       this.b.this$0.Q9(b);
       if (this.b.this$0.h9() == 3) {
          return;
       }
       int i = -1;
       int i1 = 1;
       if (p0) {
          this.b.this$0.O9(i);
          this.b.this$0.I9(i1);
          this.b.this$0.K9(b);
          this.b.this$0.J9(b);
          View view = this.b.this$0.m9();
          if (view != null) {
             if (!view.getVisibility()) {
                b = true;
             }
             if (b == i1) {
                View view1 = this.b.this$0.m9();
                if (view1 != null) {
                   view1.setVisibility(8);
                }
             }
          }
       }else if(this.b.this$0.B9() == i){
          UserProfileLastSeenPresenter$mPageListObserver$2 this$01 = this.b.this$0;
          this$01.I9((this$01.e9() + i1));
       }else {
       label_0139 :
          return;
       }
       if (this.b.this$0.j9() < this.b.this$0.s9().getCount()) {
          b = this.b.this$0.j9();
          i1 = this.b.this$0.s9().getCount();
          while (b < i1) {
             Object item = this.b.this$0.s9().getItem(b);
             a.o(item, "mPageList.getItem\(index\)");
             if (ProfileLastSeenUtil.b(this.b.this$0.l9(), item, this.b.this$0.s9())) {
                g.h(KsLogProfileTag.PHOTO_LAST_SEEN, "find last seen index: "+b);
                this.b.this$0.O9(b);
                break ;
             }
             b = b + 1;
          }
       }
       if (this.b.this$0.B9() == i) {
          UserProfileLastSeenPresenter$mPageListObserver$2 this$0 = this.b.this$0;
          this$0.K9(this$0.s9().getCount());
          if (!p0 || !this.b.this$0.u9()) {
             this.b.this$0.Y8();
             goto label_0139 ;
          }else {
             goto label_0139 ;
          }
       }else {
          this.b.this$0.x9().post(new UserProfileLastSeenPresenter$mPageListObserver$2$a$a(this));
          goto label_0139 ;
       }
    }
}
