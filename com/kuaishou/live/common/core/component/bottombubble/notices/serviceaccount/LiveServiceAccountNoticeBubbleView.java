package com.kuaishou.live.common.core.component.bottombubble.notices.serviceaccount.LiveServiceAccountNoticeBubbleView;
import com.yxcorp.widget.selector.view.SelectShapeRelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.widget.RelativeLayout;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import jc1.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import c15.b;

public class LiveServiceAccountNoticeBubbleView extends SelectShapeRelativeLayout	// class@000ff9
{
    public KwaiImageView c;
    public TextView d;
    public TextView e;

    public void LiveServiceAccountNoticeBubbleView(Context p0){
       super(p0, null);
    }
    public void LiveServiceAccountNoticeBubbleView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveServiceAccountNoticeBubbleView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, LiveServiceAccountNoticeBubbleView.class, "1")) {
          return;
       }
       super.onFinishInflate();
       this.c = this.findViewById(0x7f0a1ce0);
       this.d = this.findViewById(0x7f0a1ce1);
       this.e = this.findViewById(0x7f0a1cdf);
       this.setClickable(true);
       a.b(this.d);
       return;
    }
    public void setRightButtonContent(CharSequence p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveServiceAccountNoticeBubbleView.class, "3")) {
          return;
       }
       if (!TextUtils.isEmpty(p0)) {
          b.a("«øÃ·–—£¨LiveServiceAccountNoticeBubbleView setRightButtonContent:"+p0);
          this.e.setText(p0);
       }
       return;
    }
    public final void setTitleContent(CharSequence p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveServiceAccountNoticeBubbleView.class, "4")) {
          return;
       }
       if (TextUtils.isEmpty(p0)) {
          return;
       }
       this.d.setText(p0);
       this.d.setVisibility(0);
       return;
    }
}
