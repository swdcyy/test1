package com.kuaishou.live.common.core.component.bottombubble.notices.gift.LiveAudienceSendGiftPromptView;
import com.yxcorp.widget.selector.view.SelectShapeRelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.widget.RelativeLayout;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import com.kuaishou.live.common.core.component.bottombubble.notices.gift.LiveAudienceSendGiftPromptView$a;
import android.view.View$OnClickListener;
import lnc.a1;
import va1.j0;
import jc1.a;
import java.lang.CharSequence;
import java.util.List;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.LiveGenericCommentNoticeInfo;
import android.text.TextUtils;
import com.kuaishou.live.core.show.commentnotice.model.LiveCommentNoticeButtonInfo;
import msd.a;

public final class LiveAudienceSendGiftPromptView extends SelectShapeRelativeLayout	// class@000fbf
{
    public KwaiImageView c;
    public TextView d;
    public TextView e;
    public TextView f;
    public a g;
    public HashMap h;

    public void LiveAudienceSendGiftPromptView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void LiveAudienceSendGiftPromptView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void LiveAudienceSendGiftPromptView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
    }
    public void LiveAudienceSendGiftPromptView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceSendGiftPromptView.class, "1")) {
          return;
       }
       super.onFinishInflate();
       View view = m1.f(this.getRootView(), R.id.live_comment_notice_gift_prompt_anchor_image_view);
       a.o(view, "ViewBindUtils.bindWidget¡­prompt_anchor_image_view\)");
       this.c = view;
       view = m1.f(this.getRootView(), R.id.live_comment_notice_gift_prompt_first_line_content_text_view);
       a.o(view, "ViewBindUtils.bindWidget¡­t_line_content_text_view\)");
       this.d = view;
       view = m1.f(this.getRootView(), R.id.live_comment_notice_gift_prompt_description_text_view);
       a.o(view, "ViewBindUtils.bindWidget¡­pt_description_text_view\)");
       this.e = view;
       int i = 0x7f0a1b51;
       view = m1.f(this.getRootView(), i);
       a.o(view, "ViewBindUtils.bindWidget¡­_prompt_send_gift_button\)");
       this.f = view;
       m1.a(this.getRootView(), new LiveAudienceSendGiftPromptView$a(this), i);
       LiveAudienceSendGiftPromptView tf = this.f;
       if (tf == null) {
          a.S("mGiftPromptSendGiftBtnTitle");
       }
       j0.a(tf, a1.a(R.color.arg_RES_7f060753), a1.a(R.color.arg_RES_7f060cfd));
       tf = this.d;
       if (tf == null) {
          a.S("mGiftPromptFirstLineContentTextView");
       }
       a.b(tf);
       tf = this.e;
       if (tf == null) {
          a.S("mGiftPromptSecondLineContentTextView");
       }
       a.b(tf);
       return;
    }
    public final void setFirstLineContent(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceSendGiftPromptView.class, "3")) {
          return;
       }
       LiveAudienceSendGiftPromptView td = this.d;
       if (td == null) {
          a.S("mGiftPromptFirstLineContentTextView");
       }
       td.setText(p0);
       return;
    }
    public final void setIcon(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceSendGiftPromptView.class, "2")) {
          return;
       }
       a.p(p0, "anchorImageUrls");
       LiveAudienceSendGiftPromptView tc = this.c;
       if (tc == null) {
          a.S("mGiftPromptGiftImageView");
       }
       tc.P(p0);
       return;
    }
    public final void setNoticeInfo(LiveGenericCommentNoticeInfo p0){
       LiveAudienceSendGiftPromptView td;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceSendGiftPromptView.class, "7")) {
          return;
       }
       a.p(p0, "commentNotice");
       LiveGenericCommentNoticeInfo mContentIcon = p0.mContentIconUrls;
       a.o(mContentIcon, "commentNotice.mContentIconUrls");
       this.setIcon(mContentIcon);
       String str = "mGiftPromptSecondLineContentTextView";
       String str1 = "mGiftPromptFirstLineContentTextView";
       if (TextUtils.isEmpty(p0.mDescription)) {
          td = this.d;
          if (td == null) {
             a.S(str1);
          }
          td.setMaxLines(2);
          td = this.e;
          if (td == null) {
             a.S(str);
          }
          td.setVisibility(8);
       }else {
          td = this.d;
          if (td == null) {
             a.S(str1);
          }
          td.setMaxLines(1);
          td = this.e;
          if (td == null) {
             a.S(str);
          }
          td.setVisibility(0);
       }
       this.setFirstLineContent(p0.mSubTitle);
       this.setSecondLineContent(p0.mDescription);
       p0 = p0.mButtonInfo;
       if (p0 != null) {
          this.setSendGiftButtonTitle(p0.mBtnTitle);
       }
       return;
    }
    public final void setOnGiftPromptClickListener(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceSendGiftPromptView.class, "6")) {
          return;
       }
       a.p(p0, "sendGiftCallback");
       this.g = p0;
       return;
    }
    public final void setSecondLineContent(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceSendGiftPromptView.class, "4")) {
          return;
       }
       LiveAudienceSendGiftPromptView te = this.e;
       if (te == null) {
          a.S("mGiftPromptSecondLineContentTextView");
       }
       te.setText(p0);
       return;
    }
    public final void setSendGiftButtonTitle(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceSendGiftPromptView.class, "5")) {
          return;
       }
       if (!TextUtils.isEmpty(p0)) {
          LiveAudienceSendGiftPromptView tf = this.f;
          if (tf == null) {
             a.S("mGiftPromptSendGiftBtnTitle");
          }
          tf.setText(p0);
       }
       return;
    }
}
