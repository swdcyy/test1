package com.kuaishou.live.core.show.profilecard.lefttoparea.LiveProfileLeftTopAreaPresenter$onBind$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.kuaishou.live.core.show.profilecard.lefttoparea.LiveProfileLeftTopAreaPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kuaishou.live.core.show.profilecard.http.LiveUserProfileExtraInfo;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import wj2.r;
import com.kuaishou.live.core.show.profilecard.LiveProfileMode;
import oe2.b;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import t02.a0;
import t02.r1;
import ff2.b;
import android.app.Activity;
import com.kwai.framework.model.user.UserProfile;
import com.kuaishou.live.core.show.showprofile.LiveProfileParams;
import vq5.d;
import com.kwai.framework.model.user.UserInfo;
import bf2.a;

public final class LiveProfileLeftTopAreaPresenter$onBind$1 extends FunctionReferenceImpl implements l	// class@000dd7
{

    public void LiveProfileLeftTopAreaPresenter$onBind$1(LiveProfileLeftTopAreaPresenter p0){
       super(1, p0, LiveProfileLeftTopAreaPresenter.class, "updateProfileLeftTopAreaController", "updateProfileLeftTopAreaController\(Lcom/kuaishou/live/core/show/profilecard/http/LiveUserProfileExtraInfo;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(LiveUserProfileExtraInfo p0){
       r w2;
       a0 p2;
       a0 uoa0;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveProfileLeftTopAreaPresenter$onBind$1.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, LiveProfileLeftTopAreaPresenter.class, "4")) {
          a.p(p0, "liveUserProfileExtraInfo");
          if (treceiver.x != null) {
             LiveProfileLeftTopAreaPresenter w = treceiver.w;
             String str = "liveProfileCallerContext";
             if (w == null) {
                a.S(str);
             }
             if (w.m != LiveProfileMode.ESCROW_VIEW_SELF) {
                w = treceiver.w;
                if (w == null) {
                   a.S(str);
                }
                if (w.m != LiveProfileMode.SPECIAL_ROLE) {
                   w = treceiver.w;
                   if (w == null) {
                      a.S(str);
                   }
                   if (w.m != LiveProfileMode.ESCROW_VIEW_AUDIENCE) {
                      if (p0.mGiftAchievementEntranceInfo != null) {
                         LiveProfileLeftTopAreaPresenter w1 = treceiver.w;
                         if (w1 == null) {
                            a.S(str);
                         }
                         LiveProfileLeftTopAreaPresenter x = treceiver.x;
                         a.m(x);
                         treceiver.v = new b(w1, treceiver.getContext(), x);
                      }else if(p0.mLiveProfileNobleEntranceInfo != null){
                         w = treceiver.w;
                         if (w == null) {
                            a.S(str);
                         }
                         UserProfile userProfile = null;
                         if (w.w != null) {
                            w = treceiver.w;
                            if (w == null) {
                               a.S(str);
                            }
                            w2 = w.w;
                            if (w2 != null) {
                               p2 = w2.p2;
                            label_00a9 :
                               uoa0 = p2;
                            label_00ac :
                               LiveProfileLeftTopAreaPresenter w3 = treceiver.w;
                               if (w3 == null) {
                                  a.S(str);
                               }
                               Activity activity = treceiver.getActivity();
                               LiveProfileLeftTopAreaPresenter b = treceiver.B;
                               if (b != null) {
                                  UserProfile userProfile1 = b.getUserProfile();
                                  if (userProfile1 != null) {
                                     userProfile = userProfile1.mProfile;
                                  }
                               }
                               LiveProfileLeftTopAreaPresenter x1 = treceiver.x;
                               a.m(x1);
                               b uob = new b(w3, activity, uoa0, userProfile, x1);
                               treceiver.v = p2;
                            }
                         }else {
                            w = treceiver.w;
                            if (w == null) {
                               a.S(str);
                            }
                            if (w.x != null) {
                               w = treceiver.w;
                               if (w == null) {
                                  a.S(str);
                               }
                               w2 = w.x;
                               if (w2 != null) {
                                  p2 = w2.q1;
                                  goto label_00a9 ;
                               }
                            }
                         }
                      label_00ab :
                         uoa0 = userProfile;
                         goto label_00ac ;
                      }
                   }
                }
             }
          label_00d1 :
             LiveProfileLeftTopAreaPresenter v = treceiver.v;
             if (v != null) {
                v.a(p0);
             }
          }
       }
       return;
    }
}
