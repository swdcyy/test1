package com.kwai.live.gzone.widget.LiveGzoneMarqueeTextView;
import com.kwai.library.widget.textview.KwaiSimpleMediumStyleTextView;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Rect;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.widget.TextView;
import android.text.TextUtils$TruncateAt;
import android.view.View;

public class LiveGzoneMarqueeTextView extends KwaiSimpleMediumStyleTextView	// class@000e7b
{
    public boolean r;

    public void LiveGzoneMarqueeTextView(Context p0){
       super(p0);
       this.r = false;
    }
    public void LiveGzoneMarqueeTextView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.r = false;
    }
    public void LiveGzoneMarqueeTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.r = false;
    }
    public boolean isFocused(){
       return this.r;
    }
    public void onFocusChanged(boolean p0,int p1,Rect p2){
       if (PatchProxy.isSupport(LiveGzoneMarqueeTextView.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), Integer.valueOf(p1), p2, this, LiveGzoneMarqueeTextView.class, "2")) {
          return;
       }
       super.onFocusChanged(this.r, p1, p2);
       return;
    }
    public void onWindowFocusChanged(boolean p0){
       if (PatchProxy.isSupport(LiveGzoneMarqueeTextView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveGzoneMarqueeTextView.class, "4")) {
          return;
       }
       super.onWindowFocusChanged(this.r);
       return;
    }
    public void setMarqueeEnable(boolean p0){
       if (PatchProxy.isSupport(LiveGzoneMarqueeTextView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveGzoneMarqueeTextView.class, "1")) {
          return;
       }
       if (this.r != p0) {
          this.r = p0;
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
       if (PatchProxy.isSupport(LiveGzoneMarqueeTextView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveGzoneMarqueeTextView.class, "3")) {
          return;
       }
       super.setPressed(p0);
       float f = (p0)? 0x3f4ccccd: 0x3f800000;
       this.setAlpha(f);
       return;
    }
}
