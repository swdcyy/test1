package com.yxcorp.gifshow.detail.view.SlidePlayAlphaEmojiTextView;
import androidx.emoji.widget.EmojiTextView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import android.view.View;
import android.widget.TextView;

public class SlidePlayAlphaEmojiTextView extends EmojiTextView	// class@001a5e
{
    public boolean d;

    public void SlidePlayAlphaEmojiTextView(Context p0){
       super(p0);
       this.d = true;
    }
    public void SlidePlayAlphaEmojiTextView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.d = true;
    }
    public void SlidePlayAlphaEmojiTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.d = true;
    }
    public void setAlphaEnable(boolean p0){
       this.d = p0;
    }
    public void setPressed(boolean p0){
       if (PatchProxy.isSupport(SlidePlayAlphaEmojiTextView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, SlidePlayAlphaEmojiTextView.class, "1")) {
          return;
       }
       super.setPressed(p0);
       if (p0 && this.d != null) {
          this.setAlpha(0x3f000000);
       }else {
          this.setAlpha(0x3f800000);
       }
       return;
    }
}
