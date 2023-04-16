package com.yxcorp.gifshow.hotword_v2.widget.SearchBubbleView$changeState$alphaBlock$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.hotword_v2.widget.SearchBubbleView;
import java.lang.Object;
import java.lang.Number;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import android.view.ViewGroup;
import wsd.m;
import androidx.core.view.ViewGroupKt;
import androidx.core.view.ViewGroupKt$a;
import java.util.Iterator;
import android.view.View;
import usd.q;
import android.graphics.drawable.GradientDrawable;

public final class SearchBubbleView$changeState$alphaBlock$1 extends Lambda implements l	// class@001906
{
    public final SearchBubbleView this$0;

    public void SearchBubbleView$changeState$alphaBlock$1(SearchBubbleView p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0.floatValue());
       return l1.a;
    }
    public final void invoke(float p0){
       if (PatchProxy.isSupport(SearchBubbleView$changeState$alphaBlock$1.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, SearchBubbleView$changeState$alphaBlock$1.class, "1")) {
          return;
       }
       int i = (int)(p0 * (float)255);
       Iterator iterator = ViewGroupKt.b(this.this$0).iterator();
       while (iterator.hasNext()) {
          iterator.next().setAlpha((float)q.u(i, 1));
       }
       this.this$0.j.setAlpha(i);
       return;
    }
}
