package com.yxcorp.gifshow.hotword_v2.widget.SearchBubbleView$g;
import java.lang.Runnable;
import com.yxcorp.gifshow.hotword_v2.widget.SearchBubbleView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.FrameLayout;

public final class SearchBubbleView$g implements Runnable	// class@00190c
{
    public final SearchBubbleView b;

    public void SearchBubbleView$g(SearchBubbleView p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, SearchBubbleView$g.class, "1")) {
          return;
       }
       if (!this.b.getVisibility()) {
          SearchBubbleView$g tb = this.b;
          tb.c(0, 0, tb.getWidth(), this.b.getHeight());
       }
       return;
    }
}
