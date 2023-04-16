package com.kuaishou.live.common.core.component.bottombubble.notices.gzone.c;
import com.kuaishou.live.common.core.component.bottombubble.notices.gzone.g$a;
import com.kuaishou.live.common.core.component.bottombubble.notices.gzone.e;
import com.kuaishou.live.common.core.component.bottombubble.notices.gzone.LiveGzoneCommonNoticeInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.LiveGenericCommentNoticeView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.LiveGenericCommentNoticeInfo;
import com.kuaishou.live.core.show.commentnotice.model.LiveCommentNoticeButtonInfo;
import zc1.b;
import android.view.View$OnClickListener;
import android.widget.RelativeLayout;
import android.view.View;
import com.kuaishou.live.common.core.component.bottombubble.notices.gzone.LiveGzoneCommonNoticeInfo$ExtraInfo;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import xp5.i;
import k2b.e0;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
import dz1.a;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ScreenPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$MoreInfoPackage;
import com.yxcorp.utility.TextUtils;
import k2b.u1;
import s51.c;
import lp3.c;
import lp3.e;
import android.content.Context;
import nc1.k;

public class c extends g$a	// class@000fc4
{
    public final LiveGzoneCommonNoticeInfo a;
    public final e b;

    public void c(e p0,LiveGzoneCommonNoticeInfo p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(LiveGenericCommentNoticeView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       super.a(p0);
       LiveGenericCommentNoticeInfo mButtonInfo = this.a.mButtonInfo;
       if (mButtonInfo != null) {
          p0.setRightButtonContent(mButtonInfo.mBtnTitle);
       }
       p0.setOnClickListener(new b(this, this.a, p0));
       return;
    }
    public void b(LiveGenericCommentNoticeInfo p0,View p1){
       String str;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "1")) {
          return;
       }
       LiveGenericCommentNoticeInfo mExtraInfo = p0.mExtraInfo;
       ClientEvent$ElementPackage obj = null;
       LiveGzoneCommonNoticeInfo$ExtraInfo mSubBizType = (mExtraInfo instanceof LiveGzoneCommonNoticeInfo$ExtraInfo)? mExtraInfo.mSubBizType: obj;
       ClientContent$LiveStreamPackage liveStreamPa = this.b.e.a();
       e0 page = this.b.e.getPage();
       LiveGenericCommentNoticeInfo mDescription = p0.mDescription;
       LiveCommentNoticeBaseInfo mNoticeType = p0.mNoticeType;
       LiveCommentNoticeBaseInfo mBizType = p0.mBizType;
       LiveCommentNoticeBaseInfo mBizId = p0.mBizId;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{liveStreamPa,page,mDescription,Integer.valueOf(mNoticeType),Integer.valueOf(mBizType),mBizId,mSubBizType};
          if (PatchProxy.applyVoid(objArray, obj, uoa, "45")) {
          label_00d9 :
             if (p0.mButtonInfo != null) {
                this.b.d.a(c.class).r4(p0.mButtonInfo.mBtnUrl, p1.getContext());
                this.b.d.a(k.class).D6();
             }
             return;
          }
       }
       obj = new ClientEvent$ElementPackage();
       obj.action2 = "LIVE_GZONE_COMMENT_NOTICE_BTN";
       i3 oi3 = i3.f();
       if (mNoticeType != 9) {
          switch (mNoticeType){
              case 'e':
                str = "comment";
                break;
              case 'f':
                str = "like";
                break;
              case 'g':
                str = (mBizType == 35)? "gameWeekStar": "commonNotice";
                break;
              default:
                str = String.valueOf(mNoticeType);
          }
       }else {
          str = "free_gift";
       }
       oi3.d("type", str);
       oi3.d("text", mDescription);
       oi3.c("biz_type", Integer.valueOf(mBizType));
       if (mSubBizType != null) {
          oi3.d("notice_biz_type", mSubBizType);
       }
       obj.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = liveStreamPa;
       uContentPack.screenPackage = a.d();
       ClientContentWrapper$ContentWrapper uContentWrap = new ClientContentWrapper$ContentWrapper();
       ClientContentWrapper$MoreInfoPackage moreInfoPack = new ClientContentWrapper$MoreInfoPackage();
       moreInfoPack.type = String.valueOf(mNoticeType);
       moreInfoPack.id = TextUtils.k(mBizId);
       uContentWrap.moreInfoPackage = moreInfoPack;
       u1.M("2470851", page, 1, obj, uContentPack, uContentWrap);
       goto label_00d9 ;
    }
}
