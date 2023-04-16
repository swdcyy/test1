package com.yxcorp.gifshow.hotword_v2.widget.SearchBubbleView$h;
import ub.a;
import com.yxcorp.gifshow.hotword_v2.widget.SearchBubbleView;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.image.KwaiImageView;

public final class SearchBubbleView$h extends a	// class@00190d
{
    public final SearchBubbleView b;

    public void SearchBubbleView$h(SearchBubbleView p0){
       this.b = p0;
       super();
    }
    public void onFailure(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SearchBubbleView$h.class, "1")) {
          return;
       }
       SearchBubbleView f = this.b.f;
       if (f != null) {
          f.setImageResource(R.drawable.arg_RES_7f081ece);
       }
       return;
    }
}
