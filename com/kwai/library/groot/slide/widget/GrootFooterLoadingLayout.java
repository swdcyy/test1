package com.kwai.library.groot.slide.widget.GrootFooterLoadingLayout;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.kwai.library.groot.slide.widget.GrootFooterLoadingLayout$a;

public class GrootFooterLoadingLayout extends FrameLayout	// class@000844
{
    public KwaiLoadingView b;
    public View c;
    public a d;
    public GrootFooterLoadingLayout$a e;

    public void GrootFooterLoadingLayout(Context p0){
       super(p0);
    }
    public void GrootFooterLoadingLayout(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void GrootFooterLoadingLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void setContentView(View p0){
       this.c = p0;
    }
    public void setOnLoadingMoreListener(GrootFooterLoadingLayout$a p0){
       this.e = p0;
    }
}
