package com.kuaishou.live.common.core.component.bottombubble.notices.subscribe.LiveSubscribeAnchorNoticeView;
import com.yxcorp.widget.selector.view.SelectShapeRelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import com.kuaishou.live.common.core.component.bottombubble.notices.subscribe.LiveSubscribeAnchorNoticeInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.facebook.drawee.generic.RoundingParams;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import java.util.List;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.image.callercontext.ImageSource;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;
import android.widget.RelativeLayout;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.graphics.Typeface;
import jc1.a;
import com.yxcorp.utility.TextUtils;
import android.view.View$OnClickListener;
import com.kuaishou.live.common.core.component.bottombubble.notices.subscribe.LiveSubscribeAnchorNoticeView$a;

public class LiveSubscribeAnchorNoticeView extends SelectShapeRelativeLayout	// class@001009
{
    public KwaiImageView c;
    public TextView d;
    public TextView e;
    public TextView f;

    public void LiveSubscribeAnchorNoticeView(Context p0){
       super(p0, null);
    }
    public void LiveSubscribeAnchorNoticeView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveSubscribeAnchorNoticeView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void c(LiveSubscribeAnchorNoticeInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveSubscribeAnchorNoticeView.class, "2")) {
          return;
       }
       this.setFirstLineContent(p0.mSubTitle);
       this.setSecondLineContent(p0.mDescription);
       if (!PatchProxy.applyVoid(null, this, LiveSubscribeAnchorNoticeView.class, "7")) {
          RoundingParams roundingPara = new RoundingParams();
          roundingPara.q(true);
          this.c.getHierarchy().L(roundingPara);
       }
       p0 = p0.mContentIconUrls;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveSubscribeAnchorNoticeView.class, "6") || (p0 != null && !p0.isEmpty())) {
          a$a uoa = a.d();
          uoa.b(":ks-features:ft-live:live-features:live-common");
          uoa.d(ImageSource.ICON);
          this.c.S(p0, uoa.a());
          this.c.setVisibility(0);
       }
    label_0068 :
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, LiveSubscribeAnchorNoticeView.class, "5")) {
          return;
       }
       this.f.setEnabled(false);
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, LiveSubscribeAnchorNoticeView.class, "1")) {
          return;
       }
       super.onFinishInflate();
       this.d = this.findViewById(0x7f0a1b4c);
       this.e = this.findViewById(0x7f0a1b5b);
       this.c = this.findViewById(0x7f0a1b4b);
       this.f = this.findViewById(0x7f0a1b59);
       this.setClickable(true);
       this.e.setTypeface(Typeface.DEFAULT, true);
       a.b(this.d);
       a.b(this.e);
       return;
    }
    public final void setFirstLineContent(CharSequence p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveSubscribeAnchorNoticeView.class, "8")) {
          return;
       }
       if (TextUtils.x(p0)) {
          return;
       }
       this.d.setText(p0);
       return;
    }
    public void setRightButtonContent(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveSubscribeAnchorNoticeView.class, "4")) {
          return;
       }
       if (TextUtils.x(p0)) {
          return;
       }
       this.f.setText(p0);
       return;
    }
    public void setRightButtonOnClickListener(View$OnClickListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveSubscribeAnchorNoticeView.class, "3")) {
          return;
       }
       this.f.setOnClickListener(new LiveSubscribeAnchorNoticeView$a(this, p0));
       return;
    }
    public final void setSecondLineContent(CharSequence p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveSubscribeAnchorNoticeView.class, "9")) {
          return;
       }
       if (TextUtils.x(p0)) {
          return;
       }
       this.e.setText(p0);
       this.e.setVisibility(0);
       this.d.setMaxLines(1);
       return;
    }
}
