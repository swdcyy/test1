package com.yxcorp.gifshow.widget.BubbleHintNewStyleFragment$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.widget.BubbleHintNewStyleFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;
import android.widget.TextView;

public class BubbleHintNewStyleFragment$a implements ViewTreeObserver$OnGlobalLayoutListener	// class@0017f7
{
    public final BubbleHintNewStyleFragment b;

    public void BubbleHintNewStyleFragment$a(BubbleHintNewStyleFragment p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, BubbleHintNewStyleFragment$a.class, "1")) {
          return;
       }
       this.b.O.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       if (this.b.O.getLineCount() > 1) {
          BubbleHintNewStyleFragment$a tb = this.b;
          tb.O.setTextSize((float)tb.L);
       }
       return;
    }
}
