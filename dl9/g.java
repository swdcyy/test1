package dl9.g;
import fya.b$b;
import dl9.m;
import java.lang.Object;
import com.kuaishou.android.model.mix.CashTag;
import android.view.View;
import fya.c;
import com.kuaishou.android.model.mix.QComment$CommentViewBindEntity;
import com.kuaishou.android.model.mix.QComment;
import fya.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.util.Map;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$TagPackage;
import java.lang.Integer;
import java.lang.Number;

public final class g implements b$b	// class@001f65
{
    public final m a;

    public void g(m p0){
       this.a = p0;
    }
    public boolean a(CashTag p0,View p1){
       return c.a(this, p0, p1);
    }
    public final void b(CashTag p0,View p1){
       ClientContent$ContentPackage uContentPack;
       ClientEvent$ElementPackage uElementPack;
       g ta = this.a;
       m t = ta.t;
       QComment$CommentViewBindEntity mIsUserInfo = ta.r.getEntity().mIsUserInfo;
       if (!PatchProxy.isSupport(d.class) || (PatchProxy.applyVoidThreeRefs(p0, t, Boolean.valueOf(mIsUserInfo), null, d.class, "2") || (p0 != null && t != null))) {
          CashTag mType = p0.mType;
          int i = 2;
          QPhoto qPhoto = 3;
          int i1 = 1;
          if (mType == i1 || mType == qPhoto) {
             String str = (mType == qPhoto)? 1: null;
             uContentPack = new ClientContent$ContentPackage();
             uContentPack.photoPackage = w1.f(t.mEntity);
             ClientContent$TagPackage tagPackage = new ClientContent$TagPackage();
             uContentPack.tagPackage = tagPackage;
             tagPackage.name = p0.mShowText;
             tagPackage.identity = p0.mId;
             tagPackage.type = i;
             i3 oi3 = i3.f();
             CashTag tack = p0.tack;
             String str1 = (tack == null)? null: tack.get("kg_id");
             oi3.d("kg_id", str1);
             str = (str)? "TAIL_TAG": "KNOWLEDGE_CARD";
             oi3.d("reinforce_type", str);
             if (p0.mType != i1) {
                i1 = 0;
             }
             oi3.c("reinforce_judge", Integer.valueOf(i1));
             tagPackage.params = oi3.e();
             uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "CLICK_TAG";
             i3 oi31 = i3.f();
             String str2 = (mIsUserInfo != null)? "COMMENT_PANEL": "COMMENT_PANEL_MACHINE_RECO";
             oi31.d("tag_area", str2);
             uElementPack.params = oi31.e();
             u1.M(null, null, 1, uElementPack, uContentPack, null);
          }else if(mType == i){
             uContentPack = new ClientContent$ContentPackage();
             uContentPack.photoPackage = w1.f(t.mEntity);
             uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "HIGHLIGHT_TAG";
             i3 oi32 = i3.f();
             d.a(p0.tack, oi32);
             uElementPack.params = oi32.e();
             u1.M(null, null, 1, uElementPack, uContentPack, null);
          }
       }
       return;
    }
}
