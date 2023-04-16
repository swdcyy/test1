package com.yxcorp.gifshow.hotword_v2.widget.SearchBubbleView$changeStateTemporary$runBlock$1;
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

public final class SearchBubbleView$changeStateTemporary$runBlock$1 extends Lambda implements p	// class@001908
{
    public final SearchBubbleView this$0;

    public void SearchBubbleView$changeStateTemporary$runBlock$1(SearchBubbleView p0){
       this.this$0 = p0;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       return Boolean.valueOf(this.invoke(p0.floatValue(), p1.intValue()));
    }
    public final boolean invoke(float p0,int p1){
       if (PatchProxy.isSupport(SearchBubbleView$changeStateTemporary$runBlock$1.class)) {
          Object obj = PatchProxy.applyTwoRefs(Float.valueOf(p0), Integer.valueOf(p1), this, SearchBubbleView$changeStateTemporary$runBlock$1.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       this.this$0.setVisibility(p1);
       this.this$0.setAlpha(p0);
       return true;
    }
}
