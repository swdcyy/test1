package ba3.f;
import android.content.DialogInterface$OnClickListener;
import com.kuaishou.live.lite.comment.view.item.SimpleCommentMessageViewController;
import com.kuaishou.live.lite.comment.model.SimpleCommentMessage;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.lite.comment.view.ItemViewControllerFactory$a;
import ba3.a;
import ip3.a;
import com.kuaishou.live.lite.comment.LiveLiteCommentEditorService;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.live.lite.comment.LiveLiteCommentEditorService$EditorPanel;
import java.lang.CharSequence;
import java.util.Objects;
import com.kwai.component.misc.report.ReportInfo;
import android.app.Activity;
import com.kuaishou.live.viewcontroller.ViewController;
import com.yxcorp.gifshow.activity.GifshowActivity;
import e93.a;
import xp5.g;
import android.text.TextUtils;
import com.kuaishou.live.lite.comment.model.AbstractCommentMessage;
import td3.o;
import com.kuaishou.live.lite.userstatus.LiveLiteUserStatusResponse;
import lnc.i3;
import java.lang.Long;
import java.lang.Number;
import androidx.fragment.app.c;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import or5.b;
import xp5.i;
import k2b.e0;
import kotlin.jvm.internal.a;
import lp3.e;
import com.kwai.feature.api.live.service.basic.baseinfo.LiveSceneInfoService$LiveSceneInfo;
import com.kuaishou.live.report.e;
import s93.r;
import lnc.a1;

public final class f implements DialogInterface$OnClickListener	// class@000342
{
    public final SimpleCommentMessageViewController b;
    public final SimpleCommentMessage c;

    public void f(SimpleCommentMessageViewController p0,SimpleCommentMessage p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(DialogInterface p0,int p1){
       LiveLiteCommentEditorService liveLiteComm;
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, f.class, "1")) {
          return;
       }
       if (p1 == 0x7f101fbc) {
          b.Z(LiveLogTag.LIVE_LITE_COMMENT, this.b.m+" showActionDialog at");
          liveLiteComm = this.b.V2().b().get();
          if (liveLiteComm != null) {
             liveLiteComm.gm('@'+this.c.getUserInfo().mName+' ', LiveLiteCommentEditorService$EditorPanel.INPUT_PANEL, "LONG_PRESS_AITA");
          }
       }else if(p1 == 0x7f1007b5){
          b.Z(LiveLogTag.LIVE_LITE_COMMENT, this.b.m+" showActionDialog copy");
          liveLiteComm = this.b.V2().b().get();
          if (liveLiteComm != null) {
             liveLiteComm.gm(this.c.getContent(), LiveLiteCommentEditorService$EditorPanel.INPUT_PANEL, "LONG_PRESS_COPY");
          }
       }else if(p1 == 0x7f10169b){
          b.Z(LiveLogTag.LIVE_LITE_COMMENT, this.b.m+" showActionDialog inform");
          f tb = this.b;
          f tc = this.c;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(tc, tb, SimpleCommentMessageViewController.class, "7")) {
             ReportInfo reportInfo = new ReportInfo();
             Activity uActivity = tb.B2();
             Objects.requireNonNull(uActivity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
             reportInfo.mRefer = uActivity.getUrl();
             uActivity = tb.B2();
             Objects.requireNonNull(uActivity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
             reportInfo.mPreRefer = uActivity.U2();
             reportInfo.mSourceType = (TextUtils.equals(tc.getUserInfo().mId, tb.V2().a().d()))? "live": "audience";
             reportInfo.mLiveId = tb.V2().a().getLiveStreamId();
             reportInfo.mCommentContent = tc.getContent();
             UserInfo mEncryptUid = (tc.isAnonymous())? tc.getUserInfo().mEncryptUid: tc.getUserInfo().mId;
             reportInfo.mReportedUserId = mEncryptUid;
             reportInfo.mEntrySource = "live_lite_comment_long_press";
             LiveLiteUserStatusResponse liveLiteUser = tb.V2().h().D1();
             if (liveLiteUser != null && liveLiteUser.mIsAnonymousLive != null) {
                reportInfo.mEntrySource = "live_lite_anonymous_comment_long_press";
             }
             i3 oi3 = i3.f();
             oi3.d("liveCommentId", tc.getId());
             oi3.c("liveCommentTime", Long.valueOf(tc.getTime()));
             oi3.c("liveCommentType", Integer.valueOf(1));
             oi3.d("liveCommentContent", tc.getContent());
             reportInfo.mExtraParams = oi3.e();
             e0 page = tb.V2().e().getPage();
             a.o(page, "dependence.logPackageProvider.page");
             e.d(tb.B2(), tb.V2().d(), reportInfo, null, null, tb.V2().a().j0(), page.o(), reportInfo.mExtraParams, 9);
          }
       }
       String str = a1.p(p1);
       a.o(str, "CommonUtil.string\(which\)");
       r.a.a(this.b.V2().e(), this.c.isAnonymous(), str);
       return;
    }
}
