package com.yxcorp.gifshow.hotword_v2.widget.SearchBubbleView$changeState$runBlock$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.hotword_v2.widget.SearchBubbleView;
import java.lang.Object;
import java.lang.Number;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.widget.FrameLayout;
import android.view.ViewGroup;
import wsd.m;
import androidx.core.view.ViewGroupKt;
import androidx.core.view.ViewGroupKt$a;
import java.util.Iterator;
import android.view.View;

public final class SearchBubbleView$changeState$runBlock$1 extends Lambda implements p	// class@001907
{
    public final SearchBubbleView this$0;

    public void SearchBubbleView$changeState$runBlock$1(SearchBubbleView p0){
       this.this$0 = p0;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       return Boolean.valueOf(this.invoke(p0.floatValue(), p1.intValue()));
    }
    public final boolean invoke(float p0,int p1){
       if (PatchProxy.isSupport(SearchBubbleView$changeState$runBlock$1.class)) {
          Object obj = PatchProxy.applyTwoRefs(Float.valueOf(p0), Integer.valueOf(p1), this, SearchBubbleView$changeState$runBlock$1.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       float f = (float)(this.this$0.getWidth() - this.this$0.getHeight()) * ((float)1 - p0);
       SearchBubbleView$changeState$runBlock$1 tthis$0 = this.this$0;
       tthis$0.c((int)f, 0, tthis$0.getWidth(), this.this$0.getHeight());
       Iterator iterator = ViewGroupKt.b(this.this$0).iterator();
       while (iterator.hasNext()) {
          iterator.next().setTranslationX(f);
       }
       this.this$0.setVisibility(p1);
       return 1;
    }
}
