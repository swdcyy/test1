package e63.q0;
import erd.g;
import com.kuaishou.live.gzone.v2.profile.e;
import java.lang.Object;
import wca.n;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.UserProfile;
import com.kuaishou.live.core.show.showprofile.LiveProfileParams;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.framework.model.user.User$FollowStatus;
import android.widget.TextView;
import t02.a0;
import com.kuaishou.live.core.show.fansgroup.http.LiveFansGroupIntimacyInfo;
import kg1.g;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import e63.l1;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import com.yxcorp.utility.n;
import kg1.e;
import java.util.List;
import qvb.a;
import java.util.Iterator;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public final class q0 implements g	// class@00266b
{
    public final e b;

    public void q0(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a0 r1;
       q0 tb = this.b;
       Objects.requireNonNull(tb);
       e uoe = e.class;
       if (PatchProxy.applyVoidOneRefs(p0, tb, uoe, "47")) {
       }else if(!(p0.a.getId()).equals(tb.r.getUserProfile().mProfile.mId)){
          if (p0.a.getFollowStatus() == User$FollowStatus.FOLLOWING) {
             tb.r.getUserProfile().isFollowing = true;
          }else if(p0.a.getFollowStatus() == User$FollowStatus.UNFOLLOW){
             tb.r.getUserProfile().isFollowing = false;
          }else if(p0.a.getFollowStatus() == User$FollowStatus.FOLLOW_REQUESTING){
             tb.r.getUserProfile().isFollowing = false;
             tb.r.getUserProfile().isFollowRequesting = true;
          }
          if (p0.d == null) {
             int b = tb.r.getUserProfile().isFollowingOrFollowRequesting();
             tb.d1 = b;
             if (b) {
                tb.K9();
                tb.R9(true);
             }else {
                tb.O9();
                tb.R9(true);
             }
             if (!PatchProxy.applyVoid(null, tb, uoe, "19") && (tb.p1 != null && tb.I1 != null)) {
                b = -1;
                int i = 8;
                if (!tb.r.getUserProfile().isFollowingOrFollowRequesting()) {
                   tb.p1.setVisibility(i);
                   tb.J9(b);
                }else if(tb.H1 != null){
                   uoe = tb.B;
                   if (uoe != null) {
                      r1 = uoe.r1;
                      if (r1 != null) {
                         if (r1.Qi().mStatus == true) {
                            tb.p1.setText(R.string.arg_RES_7f10241d);
                            tb.p1.setVisibility(0);
                            if (tb.v1 == null) {
                               l1.a(true, tb.B.Z2.a());
                               tb.v1 = true;
                            }
                         }else if(tb.B.r1.Qi().mStatus == 3){
                            tb.p1.setText(R.string.arg_RES_7f102619);
                            tb.p1.setVisibility(0);
                            if (tb.v1 == null) {
                               l1.a(0, tb.B.Z2.a());
                               tb.v1 = true;
                            }
                         }else {
                            tb.p1.setVisibility(i);
                         }
                      }else {
                      label_011d :
                         tb.p1.setVisibility(i);
                      }
                   }else {
                      goto label_011d ;
                   }
                   if (!tb.p1.getVisibility()) {
                      b = n.c(a.a().a(), 64.00f);
                   }
                   tb.J9(b);
                }else {
                   tb.p1.setVisibility(i);
                   tb.J9(b);
                }
             }
             if (tb.I1 != null && tb.d1 != null) {
                uoe = tb.B;
                if (uoe != null) {
                   r1 = uoe.r1;
                   if (r1 != null) {
                      r1.Bh();
                   }
                }
             }
             Iterator iterator = tb.U0.getItems().iterator();
             while (iterator.hasNext()) {
                BaseFeed uBaseFeed = iterator.next();
                if (uBaseFeed != null) {
                   User user = r1.T1(uBaseFeed);
                   if (user != null && ((user.getId()).equals(p0.a.getId()) && user.getFollowStatus() != p0.a.getFollowStatus())) {
                      user.setFollowStatus(p0.a.getFollowStatus());
                   }
                }
             }
          }
          if (p0.e != null) {
             ExceptionHandler.handleException(a.a().a(), p0.e);
          }
       }
       return;
    }
}
