package com.kuaishou.live.common.core.component.comments.LiveCommentDynamicBackgroundView;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.comments.widget.LiveCommentsNormalItemView;
import android.widget.LinearLayout$LayoutParams;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.graphics.drawable.Drawable;
import java.lang.CharSequence;
import r81.c;
import com.lsjwzh.widget.text.FastTextView;
import java.lang.Integer;
import android.text.TextUtils$TruncateAt;
import java.lang.Boolean;
import java.lang.Float;

public class LiveCommentDynamicBackgroundView extends LinearLayout	// class@001057
{
    public LiveCommentsNormalItemView b;
    public LiveCommentsNormalItemView c;

    public void LiveCommentDynamicBackgroundView(Context p0){
       super(p0, null);
    }
    public void LiveCommentDynamicBackgroundView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveCommentDynamicBackgroundView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveCommentDynamicBackgroundView.class, "1")) {
       }else {
          this.b = new LiveCommentsNormalItemView(p0);
          this.c = new LiveCommentsNormalItemView(p0);
          this.addView(this.b, new LinearLayout$LayoutParams(-2, -2));
          this.addView(this.c, new LinearLayout$LayoutParams(-2, -2));
          this.c.setVisibility(8);
       }
       return;
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveCommentDynamicBackgroundView.class, "7")) {
          return;
       }
       this.c.setBackground(objArray);
       this.c.setText("");
       this.b.setText("");
       return;
    }
    public void b(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveCommentDynamicBackgroundView.class, "3")) {
          return;
       }
       this.b.setGravity(16);
       this.c.setGravity(16);
       this.b.setViewStyle(p0);
       this.c.p(true);
       this.c.setTextSize(p0.h());
       this.c.setClickable(p0.i());
       this.c.i(p0.e(), 0x3f800000);
       return;
    }
    public final void c(View p0,int p1){
       if (PatchProxy.isSupport(LiveCommentDynamicBackgroundView.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LiveCommentDynamicBackgroundView.class, "10")) {
          return;
       }
       if (p0.getVisibility() != p1) {
          p0.setVisibility(p1);
       }
       return;
    }
    public void d(CharSequence p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveCommentDynamicBackgroundView.class, "6")) {
          return;
       }
       this.b.setText(p0);
       this.b.q();
       this.c(this.b, 0);
       this.c(this.c, 8);
       return;
    }
    public void e(CharSequence p0,Drawable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveCommentDynamicBackgroundView.class, "4")) {
          return;
       }
       this.c.setText(p0);
       this.c.setBackground(p1);
       this.c(this.b, 8);
       this.c(this.c, 0);
       return;
    }
    public void setEllipsize(TextUtils$TruncateAt p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveCommentDynamicBackgroundView.class, "9")) {
          return;
       }
       int i = p0.ordinal() + 1;
       this.b.setEllipsize(i);
       this.c.setEllipsize(i);
       return;
    }
    public void setHasLastPadding2Dp(boolean p0){
       if (PatchProxy.isSupport(LiveCommentDynamicBackgroundView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveCommentDynamicBackgroundView.class, "5")) {
          return;
       }
       this.c.setLastPadding2Dp(p0);
       this.b.setLastPadding2Dp(p0);
       return;
    }
    public void setIs6DpPadding(boolean p0){
       if (PatchProxy.isSupport(LiveCommentDynamicBackgroundView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveCommentDynamicBackgroundView.class, "11")) {
          return;
       }
       this.c.setIs6DpPadding(p0);
       this.b.setIs6DpPadding(p0);
       return;
    }
    public void setSingleLine(boolean p0){
       if (PatchProxy.isSupport(LiveCommentDynamicBackgroundView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveCommentDynamicBackgroundView.class, "8")) {
          return;
       }
       if (p0) {
          this.c.setMaxLines(1);
          this.b.setMaxLines(1);
       }else {
          this.c.setMaxLines(Integer.MAX_VALUE);
          this.b.setMaxLines(Integer.MAX_VALUE);
       }
       return;
    }
    public void setTextSize(float p0){
       if (PatchProxy.isSupport(LiveCommentDynamicBackgroundView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, LiveCommentDynamicBackgroundView.class, "2")) {
          return;
       }
       this.b.setTextSize(p0);
       this.c.setTextSize(p0);
       return;
    }
}
