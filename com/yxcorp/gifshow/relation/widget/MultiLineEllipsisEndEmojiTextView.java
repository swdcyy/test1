package com.yxcorp.gifshow.relation.widget.MultiLineEllipsisEndEmojiTextView;
import com.yxcorp.gifshow.widget.EmojiTextView;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import android.text.Layout;
import java.lang.CharSequence;
import java.lang.Math;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.Layout$Alignment;
import java.lang.Integer;
import android.text.TextUtils$TruncateAt;

public class MultiLineEllipsisEndEmojiTextView extends EmojiTextView	// class@001a61
{
    public int v;
    public SpannableStringBuilder w;

    public void MultiLineEllipsisEndEmojiTextView(Context p0){
       super(p0);
       this.v = 0;
       this.w = new SpannableStringBuilder();
    }
    public void MultiLineEllipsisEndEmojiTextView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.v = 0;
       this.w = new SpannableStringBuilder();
    }
    public void MultiLineEllipsisEndEmojiTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.v = 0;
       this.w = new SpannableStringBuilder();
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MultiLineEllipsisEndEmojiTextView.class, "2")) {
          return;
       }
       int i = 1;
       if (this.v == i) {
          super.onDraw(p0);
          return;
       }else {
          Layout layout = this.getLayout();
          if (layout == null || layout.getLineCount() <= this.v) {
             super.onDraw(p0);
             return;
          }else {
             CharSequence text = layout.getText();
             int i1 = Math.min(layout.getLineEnd((this.v - i)), text.length());
             this.w.clear();
             this.w.append(text.subSequence(0, i1)).append("бн");
             StaticLayout staticLayout = new StaticLayout(this.w, this.getPaint(), this.getWidth(), Layout$Alignment.ALIGN_NORMAL, 0x3f800000, 0, false);
             while (i.getLineCount() > this.v) {
                this.w.clear();
                i1 = i1 - 1;
                this.w.append(text.subSequence(0, i1)).append("бн");
                staticLayout = new StaticLayout(this.w, this.getPaint(), this.getWidth(), Layout$Alignment.ALIGN_NORMAL, 0x3f800000, 0, false);
             }
             this.setText(this.w);
             super.onDraw(p0);
             return;
          }
       }
    }
    public void setMaxLines(int p0){
       if (PatchProxy.isSupport(MultiLineEllipsisEndEmojiTextView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, MultiLineEllipsisEndEmojiTextView.class, "1")) {
          return;
       }
       this.v = p0;
       int i = (p0 == 1)? p0: p0 + 1;
       super.setMaxLines(i);
       if (p0 == 1) {
          this.setEllipsize(TextUtils$TruncateAt.END);
       }else {
          this.setEllipsize(null);
       }
       return;
    }
}
