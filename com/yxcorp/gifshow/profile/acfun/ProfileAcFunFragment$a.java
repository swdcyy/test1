package com.yxcorp.gifshow.profile.acfun.ProfileAcFunFragment$a;
import qvb.q;
import com.yxcorp.gifshow.profile.acfun.ProfileAcFunFragment;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import y8c.g;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import qvb.i;
import s1c.r0;
import com.kwai.framework.model.user.User;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.user.UserOwnerCount;
import androidx.fragment.app.Fragment;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import s1c.a;
import j5c.b;
import com.yxcorp.gifshow.profile.common.event.RxPageBus;
import y8c.t;

public final class ProfileAcFunFragment$a implements q	// class@0011e9
{
    public final ProfileAcFunFragment b;

    public void ProfileAcFunFragment$a(ProfileAcFunFragment p0){
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
       r0 b;
       ProfileAcFunFragment$a uoa = ProfileAcFunFragment$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa, "1")) {
          return;
       }
       this.b.g7().Y0(p0);
       ProfileAcFunFragment$a uoa1 = -1;
       if (!this.b.q().hasMore()) {
          b = this.b.Gh().b;
          if (b != null) {
             i oi = this.b.q();
             a.o(oi, "pageList");
             int count = oi.getCount();
             b.mArticlePublic = count;
             uoa1 = count;
          }else {
             return;
          }
       }
       if (!this.b.isAdded()) {
          return;
       }else {
          this.b.Gh().b.notifyChanged();
          r0 e = this.b.Gh().e;
          if (e != null) {
             e.d.b("PROFILE_FEED_LOAD", "MAIN_KEY", b.a(this.b.Gh().c, this.b.q().hasMore(), uoa1));
          }
          this.b.sh().j();
          return;
       }
    }
}
