package hk9.b;
import kk9.c;
import java.lang.Object;
import com.yxcorp.gifshow.comment.editor.CommentEditorConfig;
import android.app.Activity;
import kk9.d;
import com.yxcorp.gifshow.comment.fragment.CommentsFragment;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$Arguments;
import java.lang.StringBuilder;
import lnc.a1;
import com.kwai.framework.model.user.User;
import com.kuaishou.android.model.mix.QComment;
import lu7.f;
import java.util.HashSet;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.emotionsdk.bean.EmotionInfo;
import com.yxcorp.gifshow.models.QMedia;
import android.os.Bundle;
import com.yxcorp.utility.TextUtils;
import java.lang.CharSequence;
import ak5.j;
import com.yxcorp.plugin.emotion.fragment.EmotionFloatEditorFragment;
import yca.a;
import com.kwai.feature.component.commonfragment.baseeditor.FloatEditorFragment;
import uh5.e;
import androidx.fragment.app.Fragment;

public class b implements c	// class@002694
{
    public CommentEditorConfig a;
    public QPhoto b;
    public boolean c;

    public void b(){
       super();
       this.a = new CommentEditorConfig();
    }
    public BaseEditorFragment a(Activity p0,d p1,CommentsFragment p2){
       EmotionFloatEditorFragment uEmotionFloa;
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, b.class, "2");
       if (p0 != patchProxyRe) {
          return p0;
       }
       d e = p1.e;
       d f = p1.f;
       d i = p1.i;
       BaseEditorFragment$Arguments uArguments = PatchProxy.applyFourRefs(e, f, i, p1, this, b.class, "1");
       if (uArguments != patchProxyRe) {
       }else {
          BaseEditorFragment$Arguments uArguments1 = new BaseEditorFragment$Arguments();
          if (f == null && e != null) {
             if (this.a.mEditorMode == true) {
                uArguments1.setEnableSingleLineHint(true);
                uArguments1.setHintText(a1.p(R.string.arg_RES_7f10428c)+": "+f.a(e.getUser()));
             }else {
                uArguments1.setHintText(a1.r(R.string.arg_RES_7f10428e, f.a(e.getUser())));
             }
          }else {
             uArguments1.setHintText(f);
          }
          uArguments1.setAtFromAtPanelUidSet(p1.n);
          e = p1.k;
          if (e != null) {
             uArguments1.setCommentOpenType(e);
          }
          e = p1.h;
          if (e != Integer.MAX_VALUE) {
             uArguments1.setTextLimit(e);
          }
          b = false;
          BaseEditorFragment$Arguments uArguments2 = uArguments1.setEnableAtFriends(true).setEnableInputAt(true).setMonitorTextChange(true).setCancelWhileKeyboardHidden(true).setShowLeftBtn(b).setEnableEmoji(true);
          if (this.a.mEnablePicture != null) {
             b tb = this.b;
             if (tb != null && tb.enablePictureCommentForPhoto()) {
                b = true;
             }
          }
          uArguments2 = uArguments2.setEnableSendPicture(b).setShowEmojiFirst(p1.c).setOnlyShowKwaiEmoji(true).setShowAtFloatPanel(p1.d).setEnableNewGifEmotions(this.a.mEnableEmotion).setSendBtnPermanent(true);
          f = p1.m;
          if (f == null) {
             CommentEditorConfig mForceDayNig = this.a.mForceDayNightMode;
          }
          uArguments2 = uArguments2.setForceDayNightMode(f).setShowUserAlias(true).setInterceptEvent(true).setEmotionInfo(i).setQMediaInfo(p1.j).setEnableEditorOpt(true).setShowAtGuideTips(p1.l).setTextLimit(this.a.mEditorTextLimit).setTheme(this.a.mFloatEditorTheme);
          b ta = this.a;
          CommentEditorConfig mEnableAtLim = ta.mEnableAtLimit;
          CommentEditorConfig uCommentEdit = -1;
          CommentEditorConfig mAtFriendMax = (mEnableAtLim != null)? ta.mAtFriendMaxLimit: -1;
          if (mEnableAtLim != null) {
             uCommentEdit = ta.mAtFriendMaxLimitToastResId;
          }
          uArguments = uArguments2.setAtFriendMaxLimit(mAtFriendMax, uCommentEdit).setSelectUserBizId(this.a.mSelectUserBizId).setEnableFinishShowWithSpace(true);
       }
       uArguments.setForceNewEditorStyle(true);
       Bundle uBundle = uArguments.build();
       uBundle.putCharSequence("text", TextUtils.k(p1.g));
       if (j.o().t()) {
          if (this.a.mEnableEmotion != null) {
             uEmotionFloa = EmotionFloatEditorFragment.vi(uBundle);
          }else {
             uEmotionFloa = EmotionFloatEditorFragment.ui(uBundle);
          }
       }else if(this.c == null){
          a.a("comment_keyboard_emoji", "emoji_not_ready", "");
          this.c = true;
       }
       j.o().d();
       uEmotionFloa = new FloatEditorFragment();
       if (e.f()) {
          if (uEmotionFloa instanceof EmotionFloatEditorFragment) {
             uEmotionFloa.Pi(true);
          }else {
             uEmotionFloa.ri(true);
          }
       }
       uEmotionFloa.setArguments(uBundle);
       return uEmotionFloa;
    }
    public b b(CommentEditorConfig p0){
       this.a = p0;
       return this;
    }
    public b c(QPhoto p0){
       this.b = p0;
       return this;
    }
}
