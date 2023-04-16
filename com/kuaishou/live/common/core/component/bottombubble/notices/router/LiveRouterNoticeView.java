package com.kuaishou.live.common.core.component.bottombubble.notices.router.LiveRouterNoticeView;
import com.yxcorp.widget.selector.view.SelectShapeRelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View$OnClickListener;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.bottombubble.notices.router.LiveRouterNoticeView$a;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.view.ViewGroup;
import jc1.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Boolean;

public class LiveRouterNoticeView extends SelectShapeRelativeLayout	// class@000ff0
{
    public KwaiImageView c;
    public TextView d;
    public TextView e;
    public ViewGroup f;
    public TextView g;

    public void LiveRouterNoticeView(Context p0){
       super(p0, null);
    }
    public void LiveRouterNoticeView(Context p0,AttributeSet p1){
       super(p0, p1, -1);
    }
    public void LiveRouterNoticeView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public final View$OnClickListener c(View$OnClickListener p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveRouterNoticeView.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveRouterNoticeView$a(this, p0);
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, LiveRouterNoticeView.class, "1")) {
          return;
       }
       super.onFinishInflate();
       this.d = this.findViewById(0x7f0a1b4c);
       this.e = this.findViewById(0x7f0a1b5b);
       this.c = this.findViewById(0x7f0a1b4b);
       this.f = this.findViewById(0x7f0a1b5a);
       this.g = this.findViewById(0x7f0a1b59);
       this.setClickable(true);
       a.b(this.d);
       a.b(this.e);
       return;
    }
    public void setButtonClickListener(View$OnClickListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveRouterNoticeView.class, "6")) {
          return;
       }
       this.g.setOnClickListener(this.c(p0));
       return;
    }
    public void setButtonTitle(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveRouterNoticeView.class, "4")) {
          return;
       }
       if (!TextUtils.x(p0)) {
          this.g.setVisibility(0);
          this.g.setText(p0);
          this.f.setVisibility(0);
       }
       return;
    }
    public void setContainerClickListener(View$OnClickListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveRouterNoticeView.class, "5")) {
          return;
       }
       this.setOnClickListener(this.c(p0));
       return;
    }
    public final void setContentIconShape(boolean p0){
       if (PatchProxy.isSupport(LiveRouterNoticeView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveRouterNoticeView.class, "8")) {
          return;
       }
       a.a(p0, this.c);
       return;
    }
    public final void setFirstLineContent(CharSequence p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveRouterNoticeView.class, "9")) {
          return;
       }
       if (TextUtils.x(p0)) {
          return;
       }
       this.d.setText(p0);
       this.d.setVisibility(0);
       return;
    }
    public final void setSecondLineContent(CharSequence p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveRouterNoticeView.class, "10")) {
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
