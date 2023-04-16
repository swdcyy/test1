package fx9.j;
import sxc.k;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.w;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import lnc.i3;
import com.kuaishou.android.model.mix.PhotoCommentVoteInfo;
import com.kuaishou.android.model.mix.PhotoCommentVoteInfo$UserVoteStatus;
import k2b.u1;

public class j extends k	// class@002375
{

    public void j(){
       super();
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, j.class, "1")) {
          return;
       }
       super.E8();
       if (!w.e0(this.D)) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, k.class, "15")) {
          boolean b = true;
          this.G = b;
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "COMMENT_VOTE";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.photoPackage = w1.f(this.D.getEntity());
          i3 oi3 = i3.f();
          k tE = this.E;
          if (tE != null) {
             PhotoCommentVoteInfo mUserVoteSta = tE.mUserVoteStatus;
             if (mUserVoteSta != null && mUserVoteSta.mHasVoted != null) {
             label_0052 :
                String str = (b)? "TRUE": "FALSE";
                oi3.d("isVote", str);
                uElementPack.params = oi3.e();
                u1.u0(6, uElementPack, uContentPack);
             }
          }
          b = false;
          goto label_0052 ;
       }
       return;
    }
}
