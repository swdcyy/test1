package com.yxcorp.gifshow.v3.editor.effectv2.vb.HighlightTimeViewBinder$a$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.v3.editor.effectv2.vb.HighlightTimeViewBinder$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import jn9.b;
import mqc.a;
import com.yxcorp.gifshow.component.postlistcomponent.SelectScrollOption;

public final class HighlightTimeViewBinder$a$a implements Runnable	// class@000f65
{
    public final int b;
    public final HighlightTimeViewBinder$a c;

    public void HighlightTimeViewBinder$a$a(int p0,HighlightTimeViewBinder$a p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, HighlightTimeViewBinder$a$a.class, "1")) {
          return;
       }
       b.E(this.c.b.Q(), this.b, true, null, 4, null);
       PatchProxy.onMethodExit(HighlightTimeViewBinder$a$a.class, "1");
       return;
    }
}
