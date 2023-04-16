package com.yxcorp.gifshow.detail.view.CommentGuessView;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import com.yxcorp.gifshow.detail.view.CommentGuessView$a;

public class CommentGuessView extends LinearLayout	// class@001a3d
{
    public TextView b;
    public KwaiImageView c;
    public CommentGuessSearch d;
    public CommentGuessView$b e;
    public Map f;
    public final n1 g;

    public void CommentGuessView(Context p0){
       super(p0, null);
    }
    public void CommentGuessView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void CommentGuessView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.g = new CommentGuessView$a(this);
    }
}
