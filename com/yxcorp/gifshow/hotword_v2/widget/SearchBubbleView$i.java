package com.yxcorp.gifshow.hotword_v2.widget.SearchBubbleView$i;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.hotword_v2.widget.SearchBubbleView;
import twa.f;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import rwa.a;

public final class SearchBubbleView$i implements View$OnClickListener	// class@00190e
{
    public final SearchBubbleView b;
    public final f c;

    public void SearchBubbleView$i(SearchBubbleView p0,f p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchBubbleView$i.class, "1")) {
          return;
       }
       this.c.a(this.b.g);
       return;
    }
}
