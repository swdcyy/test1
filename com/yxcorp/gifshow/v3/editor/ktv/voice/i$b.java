package com.yxcorp.gifshow.v3.editor.ktv.voice.i$b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.v3.editor.ktv.voice.i;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import oa0.a;
import android.widget.RadioButton;
import android.view.ViewTreeObserver;

public class i$b implements ViewTreeObserver$OnGlobalLayoutListener	// class@001006
{
    public final View b;
    public final i c;

    public void i$b(i p0,View p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, i$b.class, "1")) {
          return;
       }
       if (a.S() == 0x7f0a0c7d) {
          this.c.q.performClick();
       }else if(a.S() == 0x7f0a0c79){
          this.c.r.performClick();
       }else {
          this.c.p.performClick();
       }
       this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       return;
    }
}
