package com.kuaishou.live.common.core.component.bottombubble.notices.chatnotice.LiveCommonChatNoticeView;
import com.yxcorp.widget.selector.view.SelectShapeRelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import com.kuaishou.live.core.show.chat.model.LiveChatCommonNoticeConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.kuaishou.live.core.show.commentnotice.model.LiveCommentNoticeButtonInfo;
import java.util.List;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.ImageView;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.view.ViewGroup;
import jc1.a;
import android.view.View$OnClickListener;
import com.kwai.robust.PatchProxyResult;
import ic1.c;
import com.yxcorp.utility.TextUtils;
import java.lang.Boolean;

public class LiveCommonChatNoticeView extends SelectShapeRelativeLayout	// class@000f8a
{
    public KwaiImageView c;
    public KwaiImageView d;
    public TextView e;
    public ViewGroup f;
    public TextView g;

    public void LiveCommonChatNoticeView(Context p0){
       super(p0, null);
    }
    public void LiveCommonChatNoticeView(Context p0,AttributeSet p1){
       super(p0, p1, -1);
    }
    public void LiveCommonChatNoticeView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void c(LiveChatCommonNoticeConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveCommonChatNoticeView.class, "2")) {
          return;
       }
       this.setFirstLineContent(p0.mDesc);
       this.setButtonTitle(p0.mButton.mBtnTitle);
       LiveChatCommonNoticeConfig mIconUrl = p0.mIconUrl;
       if (!PatchProxy.applyVoidOneRefs(mIconUrl, this, LiveCommonChatNoticeView.class, "3") && !mIconUrl.isEmpty()) {
          this.c.P(mIconUrl);
          this.c.setVisibility(0);
       }
       p0 = p0.mBackgroundUrl;
       if (!PatchProxy.applyVoidOneRefs(p0, this, LiveCommonChatNoticeView.class, "4") && !p0.isEmpty()) {
          this.d.P(p0);
          this.d.setVisibility(0);
       }
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, LiveCommonChatNoticeView.class, "1")) {
          return;
       }
       super.onFinishInflate();
       this.e = this.findViewById(0x7f0a1b4c);
       this.c = this.findViewById(0x7f0a1b4b);
       this.f = this.findViewById(0x7f0a1b5a);
       this.g = this.findViewById(0x7f0a1b59);
       this.d = this.findViewById(0x7f0a1b3b);
       this.setClickable(true);
       a.b(this.e);
       return;
    }
    public void setButtonClickListener(View$OnClickListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveCommonChatNoticeView.class, "8")) {
          return;
       }
       LiveCommonChatNoticeView tf = this.f;
       c uoc = PatchProxy.applyOneRefs(p0, this, LiveCommonChatNoticeView.class, "9");
       if (uoc != PatchProxyResult.class) {
       }else {
          uoc = new c(this, p0);
       }
       tf.setOnClickListener(uoc);
       return;
    }
    public void setButtonTitle(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveCommonChatNoticeView.class, "7")) {
          return;
       }
       if (!TextUtils.x(p0)) {
          this.g.setVisibility(0);
          this.g.setText(p0);
          this.f.setVisibility(0);
       }
       return;
    }
    public final void setContentIconShape(boolean p0){
       if (PatchProxy.isSupport(LiveCommonChatNoticeView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveCommonChatNoticeView.class, "5")) {
          return;
       }
       a.a(p0, this.c);
       return;
    }
    public final void setFirstLineContent(CharSequence p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveCommonChatNoticeView.class, "6")) {
          return;
       }
       if (TextUtils.x(p0)) {
          return;
       }
       this.e.setText(p0);
       this.e.setVisibility(0);
       return;
    }
}
