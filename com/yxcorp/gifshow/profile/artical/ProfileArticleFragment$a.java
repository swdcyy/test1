package com.yxcorp.gifshow.profile.artical.ProfileArticleFragment$a;
import qvb.q;
import com.yxcorp.gifshow.profile.artical.ProfileArticleFragment;
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
import com.kwai.framework.model.user.UserOwnerCount;
import androidx.fragment.app.Fragment;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import s1c.a;
import j5c.b;
import com.yxcorp.gifshow.profile.common.event.RxPageBus;
import y8c.t;

public class ProfileArticleFragment$a implements q	// class@001218
{
    public final ProfileArticleFragment b;

    public void ProfileArticleFragment$a(ProfileArticleFragment p0){
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
       ProfileArticleFragment$a uoa = ProfileArticleFragment$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa, "1")) {
          return;
       }
       this.b.g7().Y0(p0);
       ProfileArticleFragment$a uoa1 = -1;
       if (!this.b.q().hasMore()) {
          uoa1 = this.b;
          b = uoa1.F.b;
          if (b == null) {
             return;
          }else {
             uoa1 = uoa1.q().getCount();
             b.mArticlePublic = uoa1;
          }
       }
       if (!this.b.isAdded()) {
          return;
       }else {
          this.b.F.b.notifyChanged();
          ProfileArticleFragment$a tb = this.b;
          ProfileArticleFragment f = tb.F;
          if (f != null) {
             r0 e = f.e;
             if (e != null) {
                e.d.b("PROFILE_FEED_LOAD", "MAIN_KEY", b.a(f.c, tb.q().hasMore(), uoa1));
             }
          }
          this.b.sh().j();
          return;
       }
    }
}
