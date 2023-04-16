package com.yxcorp.gifshow.profile.fragment.ProfilePhotoFragment$a;
import qvb.q;
import com.yxcorp.gifshow.profile.fragment.ProfilePhotoFragment;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import qvb.p;
import java.lang.Integer;
import com.yxcorp.gifshow.profile.fragment.BaseProfileFeedFragment;
import s1c.r0;
import s1c.a;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import j5c.b;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.profile.common.event.RxPageBus;
import y8c.t;
import y8c.g;
import brd.t;
import java.util.concurrent.TimeUnit;
import k3c.p1;
import erd.o;
import t45.d;
import brd.z;
import k3c.n1;
import k3c.o1;
import erd.g;
import crd.b;

public class ProfilePhotoFragment$a implements q	// class@001311
{
    public final ProfilePhotoFragment b;

    public void ProfilePhotoFragment$a(ProfilePhotoFragment p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       if (PatchProxy.isSupport(ProfilePhotoFragment$a.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, ProfilePhotoFragment$a.class, "2")) {
          return;
       }
       if (this.b.getActivity() == null) {
          return;
       }
       this.b.Lh();
       return;
    }
    public void Z1(boolean p0,boolean p1){
       p.d(this, p0, p1);
    }
    public final void b(int p0){
       b uob;
       ProfilePhotoFragment$a uoa = ProfilePhotoFragment$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "4")) {
          return;
       }
       this.b.Lh();
       uoa = this.b;
       BaseProfileFeedFragment g = uoa.G;
       if (g != null) {
          r0 e = g.e;
          if (e != null && g.c != 3) {
             a d = e.d;
             BaseProfileFeedFragment k = uoa.K;
             boolean b = uoa.q().hasMore();
             i oi = this.b.q();
             if (PatchProxy.isSupport(b.class)) {
                uob = PatchProxy.applyFourRefs(Integer.valueOf(k), Boolean.valueOf(b), Integer.valueOf(p0), oi, null, b.class, "2");
                if (uob != PatchProxyResult.class) {
                label_0065 :
                   d.b("PROFILE_FEED_LOAD", "MAIN_KEY", uob);
                }
             }
             uob = new b(k, b, p0, oi);
             goto label_0065 ;
          }
       }
       return;
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       ProfilePhotoFragment$a uoa = ProfilePhotoFragment$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa, "1")) {
          return;
       }
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa, "3")) {
          this.b.sh().j();
          this.b.g7().Y0(p0);
          p1.T = t.just(Integer.valueOf(-1)).delay(200, TimeUnit.MILLISECONDS).map(new p1(this)).subscribeOn(d.c).observeOn(d.a).subscribe(new n1(this), new o1(this));
       }
       return;
    }
}
