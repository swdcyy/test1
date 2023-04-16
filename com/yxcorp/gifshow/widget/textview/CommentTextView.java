package com.yxcorp.gifshow.widget.textview.CommentTextView;
import com.yxcorp.gifshow.widget.EmojiTextView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.widget.TextView;
import com.yxcorp.gifshow.widget.textview.CommentTextView$a;

public class CommentTextView extends EmojiTextView	// class@0019cd
{
    public CommentTextView$a v;

    public void CommentTextView(Context p0){
       super(p0);
    }
    public void CommentTextView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void CommentTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(CommentTextView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, CommentTextView.class, "1")) {
          return;
       }
       super.onMeasure(p0, p1);
       CommentTextView tv = this.v;
       if (tv != null) {
          tv.a(this.getMeasuredWidth(), this.getMeasuredHeight());
       }
       return;
    }
    public void setOnMeasureListener(CommentTextView$a p0){
       this.v = p0;
    }
}
