package com.yxcorp.gifshow.detail.presenter.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.presenter.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import com.kuaishou.android.model.mix.CoCreateInfo;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.kuaishou.android.model.mix.CoCreateInfo$CoCreateMember;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.User$FollowStatus;
import yl8.b;
import brd.t;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import y4a.b;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import y4a.c;
import y4a.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import io.reactivex.subjects.PublishSubject;

public class a extends PresenterV2	// class@0016ce
{
    public QPhoto p;
    public BaseFragment q;
    public SlidePlayViewModel r;
    public PublishSubject s;
    public t t;
    public CoCreatorsFragment u;
    public boolean v;
    public CoCreateInfo w;
    public final a x;

    public void a(){
       super();
       this.x = new a$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.q.getParentFragment());
       this.r = slidePlayVie;
       slidePlayVie.P(this.q, this.x);
       CoCreateInfo coCreateInfo = this.p.getCoCreateInfo();
       this.w = coCreateInfo;
       if (coCreateInfo != null && coCreateInfo.mMembers != null) {
          if (coCreateInfo.mUserList == null) {
             coCreateInfo.mUserList = new ArrayList();
             Iterator iterator = this.w.mMembers.iterator();
             while (iterator.hasNext()) {
                CoCreateInfo$CoCreateMember uCoCreateMem = iterator.next();
                User user = new User();
                user.mId = String.valueOf(uCoCreateMem.mUserId);
                user.mFollowStatus = (uCoCreateMem.mIsFollowing != null)? User$FollowStatus.FOLLOWING: User$FollowStatus.UNFOLLOW;
                user.b();
                this.X7(user.observable().subscribe(new b(this), Functions.e));
                this.w.mUserList.add(user);
             }
          }
          this.X7(this.s.subscribe(new c(this), Functions.e));
          this.X7(this.t.subscribe(new a(this)));
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "6")) {
          return;
       }
       a tr = this.r;
       if (tr != null) {
          a tq = this.q;
          if (tq != null) {
             tr.D(tq, this.x);
          }
       }
       tr = this.w;
       if (tr != null) {
          tr.mUserList = null;
       }
       this.u = null;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.p = this.q8(QPhoto.class);
       this.q = this.r8("DETAIL_FRAGMENT");
       this.s = this.r8("SHOW_CO_CREATE_PANEL");
       this.t = this.r8("PREPARE_PICTURE_IN_PICTURE_MODE_OBSERVABLE");
       return;
    }
}
