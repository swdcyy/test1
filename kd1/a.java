package kd1.a;
import bq5.d;
import kd1.b;
import com.kuaishou.live.common.core.component.bottombubble.notices.sendgift.LiveAudienceSendGiftInfo;
import com.yxcorp.gifshow.models.Gift;
import java.lang.Object;
import bq5.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import xp5.i;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
import mc1.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$GiftPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MoreInfoPackageV2;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import k2b.u1;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import lm1.i;

public final class a implements d	// class@002cf6
{
    public final b a;
    public final LiveAudienceSendGiftInfo b;
    public final Gift c;

    public void a(b p0,LiveAudienceSendGiftInfo p1,Gift p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public boolean a(){
       return c.d(this);
    }
    public void b(){
       c.b(this);
    }
    public void onDismiss(){
       c.a(this);
    }
    public void onShow(){
       ClientEvent$ElementPackage uElementPack;
       ClientContent$ContentPackage uContentPack;
       ClientContent$GiftPackage giftPackage;
       ClientContent$MoreInfoPackageV2 moreInfoPack;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "1")) {
          return;
       }
       Integer giftId = this.b.getGiftId();
       if (giftId != null) {
          int i = giftId.intValue();
          ClientContent$LiveStreamPackage liveStreamPa = this.a.b.a();
          a tb = this.b;
          LiveCommentNoticeBaseInfo mNoticeType = tb.mNoticeType;
          LiveCommentNoticeBaseInfo mBizId = tb.mBizId;
          String str = this.a.e(tb);
          a uoa = a.class;
          if (PatchProxy.isSupport(uoa)) {
             Object[] objArray1 = new Object[]{liveStreamPa,Integer.valueOf(mNoticeType),Integer.valueOf(i),mBizId,str};
             if (!PatchProxy.applyVoid(objArray1, objArray, uoa, "16")) {
             }
          }else {
          }
       }
    label_0090 :
       b.Z(LiveLogTag.LIVE_BUBBLE_NOTICE, "[LiveAudienceSendGiftHandler][createBubbleItem]：强提醒类型为SEND_GIFT ITEM展示 ");
       this.a.f(this.a.d(this.c), "PRE_SEND_GIFT", "CLIENT_COMMENT_NOTICE_GIFT_SHOW", "[LiveAudienceSendGiftHandler][createBubbleItem] :show send gift comment notice gift  ", 1);
       return;
    }
}
