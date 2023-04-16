package gx0.g;
import lf3.g;
import com.kuaishou.live.audience.component.blessingbag.e;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagNotice;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.core.basic.model.LiveAudienceBlessBagConfig;
import com.kuaishou.live.core.basic.model.LiveAudienceBlessBagConfig$CampaignConfig;
import java.lang.CharSequence;
import com.kuaishou.livestream.message.nano.LiveRevenueBlessgingBagProto$BlessingBagWidgeContentWithStyle;
import com.yxcorp.utility.TextUtils;
import lf3.f;

public final class g implements g	// class@00259c
{
    public final e b;

    public void g(e p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       boolean b;
       g tb = this.b;
       Objects.requireNonNull(tb);
       e uoe = e.class;
       if (PatchProxy.applyVoidOneRefs(p0, tb, uoe, "13")) {
       }else {
          String str = "LiveAudienceBlessingBagPresenter";
          if (p0 == null) {
             b.P(LiveLogTag.LIVE_BLESSING_BAG.appendTag(str), "msg == null");
          }else if(tb.getActivity() == null){
             LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagNotice obj = PatchProxy.apply(null, tb, uoe, "8");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else {
                uoe = tb.F;
                if (uoe == null) {
                   b.P(LiveLogTag.LIVE_BLESSING_BAG.appendTag(str), "canShowNotice, mBlessBagConfig == null");
                }else if(uoe.mEnableBlessBagCampaign == null){
                   b.P(LiveLogTag.LIVE_BLESSING_BAG.appendTag(str), "canShowNotice, mEnableBlessBagCampaign is false");
                }else if(uoe.mCampaignConfig == null){
                   b.P(LiveLogTag.LIVE_BLESSING_BAG.appendTag(str), "canShowNotice, mBlessBagConfig.mCampaignConfig == null");
                }else if(!tb.Y8()){
                   b.P(LiveLogTag.LIVE_BLESSING_BAG.appendTag(str), "canShowNotice, canShowNoticeBySpAndFrequency\(\) == false");
                }else {
                   b = tb.F.mCampaignConfig.mPrimaryJobFinish;
                }
                b = false;
             }
             if (b == null) {
                b.P(LiveLogTag.LIVE_BLESSING_BAG.appendTag(str), "can not ShowNotice");
             }else {
                obj = p0.noticeTextCaption;
                if (obj != null) {
                   CharSequence[] uCharSequenc = new CharSequence[]{obj.content};
                   if (!TextUtils.y(uCharSequenc)) {
                      tb.c9(p0, 0);
                   }
                }
             }
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
