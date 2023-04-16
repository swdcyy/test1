package bbc.v;
import erd.g;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import com.yxcorp.gifshow.model.IntimateRelationDialogParams;
import java.lang.Object;
import com.yxcorp.gifshow.relation.intimate.model.IntimateRelationDialogResponse;
import ekd.k1;
import com.kwai.framework.model.user.IntimateTag;
import wkd.b;
import com.kwai.user.base.intimate.b;
import com.yxcorp.gifshow.model.IntimateRelationInfo;
import java.lang.String;
import java.util.Map;
import com.yxcorp.gifshow.model.IntimateRelationDialogParams$ToastInfo;

public final class v implements g	// class@00043c
{
    public final ProgressFragment b;
    public final IntimateRelationDialogParams c;
    public final g d;

    public void v(ProgressFragment p0,IntimateRelationDialogParams p1,g p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       v tc = this.c;
       v td = this.d;
       k1.n("loading");
       this.b.dismiss();
       IntimateRelationDialogResponse mIntimateTag = p0.mIntimateTag;
       if (mIntimateTag == null || p0.mRelationStatus == 2) {
          mIntimateTag = new IntimateTag();
          mIntimateTag.level = tc.isFromAgree;
          mIntimateTag.nickName = b.a(0x40193068).c(tc.mIntimateType).mName;
       }
       tc.setOwnerName(p0.mOwnerName).setTargetName(p0.mTargetName).setOwnerHeadUrl(p0.mOwnerHeadUrl).setTargetHeadUrl(p0.mTargetHeadUrl).setEnableProfileShow(p0.mEnableProfileShow).setRelationCounts(p0.mRelationCounts).setRelationStatus(p0.mRelationStatus).setEnableInviteToday(p0.mEnableInviteToday).setEnableChangeToday(p0.mEnableChangeToday).setOwnerSex(p0.mOwnerSex).setTitle(p0.mTitle).setSubTitle(p0.mSubTitle).setCanRebuild(p0.mCanReBuild).setHasInvited(p0.mHaveIntimatePropose).setCurrentIntimateType(p0.mIntimateType).setIntimateTag(mIntimateTag).setToastInfo(p0.mToastInfo).setEnableIntimateEntranceIntensify(p0.mEnableIntimateEntranceIntensify).setNeedShowGuide(p0.mNeedShowGuide);
       if (td != null) {
          td.accept(tc);
       }
       return;
    }
}
