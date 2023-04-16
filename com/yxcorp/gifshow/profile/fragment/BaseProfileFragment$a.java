package com.yxcorp.gifshow.profile.fragment.BaseProfileFragment$a;
import j1b.a;
import com.yxcorp.gifshow.profile.fragment.BaseProfileFragment;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.lang.StringBuilder;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle$State;
import android.os.SystemClock;
import hn5.i0;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import s1c.v;
import java.lang.System;
import s1c.a;
import java.lang.Boolean;
import com.yxcorp.gifshow.profile.common.event.RxPageBus;
import com.yxcorp.gifshow.profile.state.ProfileRefreshStatus;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.profile.tab.DynamicTabHostFragment;
import b9c.y;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import y8c.g;
import g9c.a;

public class BaseProfileFragment$a implements a	// class@001306
{
    public final BaseProfileFragment a;

    public void BaseProfileFragment$a(BaseProfileFragment p0){
       this.a = p0;
       super();
    }
    public void q(int p0){
       BaseProfileFragment$a ta;
       BaseProfileFragment$a uoa = BaseProfileFragment$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       boolean b = false;
       boolean b1 = true;
       if (p0) {
          ta = this.a;
          if (ta.N == null) {
             ta.N = b1;
             if (ta.O != null) {
                ta.O = b;
                if (ta.getView() == null) {
                   StringBuilder str = "curr="+this.a.getLifecycle().getCurrentState()+"&vis="+p0+"&pret=";
                   if (this.a.L != null) {
                      b = true;
                   }
                   i0.b("smoothToProfileCrashInfo", str+b+"&time="+(SystemClock.elapsedRealtime() - this.a.P));
                }
                uoa = this.a;
                uoa.wh(uoa.E, uoa.F);
                this.a.xh();
                b = true;
             }
          }
       }
       if (p0 == 2) {
          ta = this.a;
          if (ta.E != null) {
             ta.Q = String.valueOf(System.currentTimeMillis());
             ta = this.a;
             ta.E.mIsFullyShown = b1;
             ta.F.d.e("PROFILE_FULL_SHOW", "MAIN_KEY", Boolean.TRUE);
             if (!b) {
                uoa = this.a;
                if (uoa.E.mFirstLoadUserProfile != null) {
                   uoa.w5(ProfileRefreshStatus.PROFILE);
                }else {
                   Objects.requireNonNull(uoa);
                   Object[] objArray = null;
                   if (!PatchProxy.applyVoid(objArray, uoa, BaseProfileFragment.class, "15")) {
                      Fragment uFragment = PatchProxy.apply(objArray, uoa, BaseProfileFragment.class, "16");
                      if (uFragment != PatchProxyResult.class) {
                      }else {
                         uFragment = uoa.t();
                         if (uFragment instanceof y) {
                            uFragment = uFragment.t();
                         }
                      }
                      if (uFragment instanceof RecyclerFragment && (uFragment.g7() != null && uFragment.g7().R0())) {
                         uoa.a();
                      }
                   }
                }
             }
          }
       }
       this.a.Eh(p0);
       return;
    }
}
