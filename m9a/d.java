package m9a.d;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.comment.CommentConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.comment.CommentPageListConfig;
import com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils;
import com.yxcorp.gifshow.comment.CommentTipsConfig;
import nx9.c;
import com.yxcorp.gifshow.comment.editor.CommentEditorConfig;
import com.yxcorp.gifshow.comment.utils.d;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.feature.api.feed.detail.router.biz.normal.NormalDetailBizParam;
import lnc.a1;
import com.kuaishou.android.model.mix.QComment;
import com.yxcorp.gifshow.entity.QPreInfo;
import com.yxcorp.gifshow.comment.CommentParams;

public final class d	// class@002f79
{

    public void d(){
       super();
    }
    public static CommentConfig a(QPhoto p0){
       CommentConfig obj = PatchProxy.applyOneRefs(p0, null, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new CommentConfig();
       obj.mPageListConfig = d.b(p0);
       obj.mLocationAfterAddComment = true;
       obj.mEnableFixScrollError = true;
       obj.mEnableShowCaptionTitle = NasaExperimentUtils.H();
       obj.mTipsConfig.mForceTipsCenter = true;
       obj.mAutoSendAttachPageEvent = true;
       obj.mEnableShowPermissionTips = true;
       obj.mEnableSubItemAnimation = true;
       obj.mEnableNewLikeDislikeUi = c.b();
       CommentConfig mEditorConfi = obj.mEditorConfig;
       mEditorConfi.mFloatEditorTheme = 0x7f110143;
       mEditorConfi.mSelectUserBizId = 1003;
       mEditorConfi.mEditorMode = 0;
       return obj;
    }
    public static CommentPageListConfig b(QPhoto p0){
       CommentPageListConfig obj = PatchProxy.applyOneRefs(p0, null, d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new CommentPageListConfig();
       obj.enableCommentEmotion();
       obj.setHotCommentType(d.c(p0));
       obj.setCommentPanelType(1);
       obj.enableLimitFirstRequestMinDuration();
       obj.enableSinkComment();
       obj.enableFirstPageNoNetOpt();
       if (!NasaExperimentUtils.g() && !TextUtils.x(p0.getCaption())) {
          obj.enableUserInfoInComment();
       }
       if (!p0.isArticle()) {
          obj.enableSinkComment();
       }
       return obj;
    }
    public static CommentConfig c(QPhoto p0,NormalDetailBizParam p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       CommentConfig obj = PatchProxy.applyTwoRefs(p0, p1, null, uod, "5");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new CommentConfig();
       CommentPageListConfig uCommentPage = PatchProxy.applyOneRefs(p0, null, uod, "6");
       if (uCommentPage != patchProxyRe) {
       }else {
          uCommentPage = new CommentPageListConfig();
          if (!p0.isArticle()) {
             uCommentPage.enableSinkComment();
             uCommentPage.enableCommentEmotion();
          }
          uCommentPage.enableFoldComment();
          uCommentPage.setHotCommentType(d.c(p0));
          uCommentPage.setCommentPanelType(2);
       }
       obj.mPageListConfig = uCommentPage;
       obj.mEnableSubItemAnimation = true;
       boolean b = (p1 != null && p1.mDisableAutoReply != null)? true: false;
       obj.mDisableAutoReply = b;
       b = (p1 != null && p1.mAnchorToCommentItemTopWithOffset != null)? true: false;
       obj.mAnchorToCommentItemTopWithOffset = b;
       boolean b1 = (p1 != null && (p1.mShowEditor == null && p1.mScrollToComment != null))? true: false;
       obj.mNeedScrollToComment = b1;
       obj.mIsSupportWhiteComment = true;
       obj.mAutoSendAttachPageEvent = true;
       obj.mEnableFixScrollError = false;
       b1.mSelectUserBizId = 1001;
       obj.mEnableNewLikeDislikeUi = c.b();
       obj.mPageCategory = 4;
       obj.mPage = 7;
       obj.mAvoidAdaptEditorPanelCoverList = true;
       b1.mForceTipsCenter = false;
       b1.mBottomEditorHint = null;
       obj.mFloatButtonHidingSpace = a1.e(150.00f);
       obj.mEnableLastViewedButton = p0.isArticle() ^ true;
       obj.mEnableLastViewedCheckHeader = true;
       return obj;
    }
    public static CommentParams d(QPhoto p0,QComment p1,QPreInfo p2,NormalDetailBizParam p3,String p4){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          p3 = PatchProxy.apply(objArray, null, uod, "2");
          if (p3 != PatchProxyResult.class) {
             return p3;
          }
       }
       CommentParams uCommentPara = new CommentParams();
       uCommentPara.mComment = p1;
       uCommentPara.mPreInfo = p2;
       uCommentPara.mQPhoto = p0;
       uCommentPara.mCommentLoggerSource = "DETAIL";
       uCommentPara.mLogWatchId = p4;
       return uCommentPara;
    }
}
