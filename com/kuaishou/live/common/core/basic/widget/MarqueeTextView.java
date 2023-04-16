package com.kuaishou.live.common.core.basic.widget.MarqueeTextView;
import android.widget.TextView;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Rect;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.text.TextUtils$TruncateAt;
import android.view.View;

public class MarqueeTextView extends TextView	// class@000f2f
{
    public boolean b;

    public void MarqueeTextView(Context p0){
       super(p0);
       this.b = false;
    }
    public void MarqueeTextView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = false;
    }
    public void MarqueeTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = false;
    }
    public boolean isFocused(){
       return this.b;
    }
    public void onFocusChanged(boolean p0,int p1,Rect p2){
       if (PatchProxy.isSupport(MarqueeTextView.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), Integer.valueOf(p1), p2, this, MarqueeTextView.class, "2")) {
          return;
       }
       super.onFocusChanged(this.b, p1, p2);
       return;
    }
    public void onWindowFocusChanged(boolean p0){
       if (PatchProxy.isSupport(MarqueeTextView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, MarqueeTextView.class, "4")) {
          return;
       }
       super.onWindowFocusChanged(this.b);
       return;
    }
    public void setMarqueeEnable(boolean p0){
       if (PatchProxy.isSupport(MarqueeTextView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, MarqueeTextView.class, "1")) {
          return;
       }
       if (this.b != p0) {
          this.b = p0;
          if (p0) {
             this.setEllipsize(TextUtils$TruncateAt.MARQUEE);
             this.setSelected(true);
          }else {
             this.setEllipsize(TextUtils$TruncateAt.END);
          }
          this.onWindowFocusChanged(p0);
       }
       return;
    }
    public void setPressed(boolean p0){
       if (PatchProxy.isSupport(MarqueeTextView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, MarqueeTextView.class, "3")) {
          return;
       }
       super.setPressed(p0);
       float f = (p0)? 0x3f4ccccd: 0x3f800000;
       this.setAlpha(f);
       return;
    }
}
