package com.yxcorp.gifshow.detail.comment.widget.PressedSpanEmojiTextView;
import com.yxcorp.gifshow.widget.EmojiTextView;
import android.content.Context;
import rzc.c;
import android.util.AttributeSet;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.library.widget.textview.KwaiBaseTextView;
import java.lang.CharSequence;
import android.text.Spannable;
import android.widget.TextView;

public class PressedSpanEmojiTextView extends EmojiTextView	// class@001396
{
    public c v;

    public void PressedSpanEmojiTextView(Context p0){
       super(p0);
       this.v = new c();
    }
    public void PressedSpanEmojiTextView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.v = new c();
    }
    public void PressedSpanEmojiTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.v = new c();
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PressedSpanEmojiTextView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.p() && (this.getText() instanceof Spannable && this.v.a(p0, this.getText(), this))) {
          return true;
       }
       return super.onTouchEvent(p0);
    }
    public void setEnableTextScroll(boolean p0){
       if (PatchProxy.isSupport(PressedSpanEmojiTextView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PressedSpanEmojiTextView.class, "1")) {
          return;
       }
       this.v.b(p0);
       return;
    }
}
