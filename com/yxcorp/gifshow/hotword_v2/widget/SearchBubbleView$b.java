package com.yxcorp.gifshow.hotword_v2.widget.SearchBubbleView$b;
import uwa.d;
import java.lang.Object;
import com.yxcorp.gifshow.hotword_v2.widget.SearchBubbleView;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.graphics.drawable.GradientDrawable;
import lnc.a1;
import j06.b;
import android.widget.TextView;
import android.graphics.Typeface;
import android.widget.ImageView;

public final class SearchBubbleView$b implements d	// class@001904
{

    public void SearchBubbleView$b(){
       super();
    }
    public void a(SearchBubbleView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchBubbleView$b.class, "1")) {
          return;
       }
       a.p(p0, "view");
       SearchBubbleView j = p0.j;
       j.setDither(true);
       j.setColor(a1.a(R.color.arg_RES_7f061a0f));
       j.setCornerRadius((float)b.a0);
       j.setStroke(a1.e(0x3f000000), a1.a(R.color.arg_RES_7f060633));
       j = p0.c;
       if (j != null) {
          j.setTextColor(a1.a(R.color.arg_RES_7f060801));
       }
       j = p0.c;
       if (j != null) {
          j.setAlpha(0x3f4ccccd);
       }
       j = p0.c;
       if (j != null) {
          j.setTypeface(Typeface.DEFAULT_BOLD);
       }
       p0 = p0.e;
       if (p0 != null) {
          p0.setColorFilter(a1.a(R.color.arg_RES_7f060649));
       }
       return;
    }
}
