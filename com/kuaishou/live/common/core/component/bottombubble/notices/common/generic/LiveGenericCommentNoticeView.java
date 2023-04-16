package com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.LiveGenericCommentNoticeView;
import com.yxcorp.widget.selector.view.SelectShapeRelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.ImageView;
import java.lang.Integer;
import android.graphics.LinearGradient;
import android.text.TextPaint;
import android.widget.TextView;
import java.lang.CharSequence;
import android.graphics.Shader$TileMode;
import android.graphics.Shader;
import android.view.View;
import android.widget.RelativeLayout;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.view.ViewGroup;
import jc1.a;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import xb.t$b;
import java.lang.Boolean;
import com.yxcorp.utility.TextUtils;
import android.view.View$OnClickListener;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.LiveGenericCommentNoticeView$a;

public class LiveGenericCommentNoticeView extends SelectShapeRelativeLayout	// class@000f91
{
    public KwaiImageView c;
    public TextView d;
    public TextView e;
    public ViewGroup f;
    public TextView g;

    public void LiveGenericCommentNoticeView(Context p0){
       super(p0, null);
    }
    public void LiveGenericCommentNoticeView(Context p0,AttributeSet p1){
       super(p0, p1, -1);
    }
    public void LiveGenericCommentNoticeView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void c(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGenericCommentNoticeView.class, "4")) {
          return;
       }
       if (q.f(p0)) {
          return;
       }
       this.c.P(p0);
       this.c.setVisibility(0);
       return;
    }
    public void d(int p0,int p1){
       if (PatchProxy.isSupport(LiveGenericCommentNoticeView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, LiveGenericCommentNoticeView.class, "13")) {
          return;
       }
       LinearGradient linearGradie = new LinearGradient(0, 0, ((float)this.g.getText().length() * this.g.getPaint().getTextSize()), 0, p0, p1, Shader$TileMode.CLAMP);
       this.g.getPaint().setShader(v0);
       this.g.invalidate();
       return;
    }
    public TextView getRightButton(){
       return this.g;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, LiveGenericCommentNoticeView.class, "1")) {
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
    public void setContentIconPlaceHolder(int p0){
       if (PatchProxy.isSupport(LiveGenericCommentNoticeView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveGenericCommentNoticeView.class, "7")) {
          return;
       }
       this.c.getHierarchy().E(p0, t$b.a);
       return;
    }
    public final void setContentIconShape(boolean p0){
       if (PatchProxy.isSupport(LiveGenericCommentNoticeView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveGenericCommentNoticeView.class, "6")) {
          return;
       }
       a.a(p0, this.c);
       return;
    }
    public void setContentIconVisibility(int p0){
       if (PatchProxy.isSupport(LiveGenericCommentNoticeView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveGenericCommentNoticeView.class, "8")) {
          return;
       }
       this.c.setVisibility(p0);
       return;
    }
    public void setFirstLineContent(CharSequence p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGenericCommentNoticeView.class, "9")) {
          return;
       }
       if (TextUtils.x(p0)) {
          return;
       }
       this.d.setText(p0);
       return;
    }
    public void setRightButtonContent(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGenericCommentNoticeView.class, "12")) {
          return;
       }
       if (TextUtils.x(p0)) {
          return;
       }
       this.g.setText(p0);
       this.f.setVisibility(0);
       return;
    }
    public void setRightButtonOnClickListener(View$OnClickListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGenericCommentNoticeView.class, "3")) {
          return;
       }
       this.g.setOnClickListener(new LiveGenericCommentNoticeView$a(this, p0));
       return;
    }
    public void setRightButtonTextColor(int p0){
       if (PatchProxy.isSupport(LiveGenericCommentNoticeView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveGenericCommentNoticeView.class, "15")) {
          return;
       }
       this.g.setTextColor(p0);
       return;
    }
    public void setSecondLineContent(CharSequence p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGenericCommentNoticeView.class, "10")) {
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
