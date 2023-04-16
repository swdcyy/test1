package com.yxcorp.gifshow.v3.editor.effectv2.vb.HighlightTimeViewBinder$mLifecycleObserver$1;
import androidx.lifecycle.LifecycleObserver;
import com.yxcorp.gifshow.v3.editor.effectv2.vb.HighlightTimeViewBinder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import faa.a;
import q87.c;
import jn9.b;
import mqc.a;

public final class HighlightTimeViewBinder$mLifecycleObserver$1 implements LifecycleObserver	// class@000f6b
{
    public final HighlightTimeViewBinder b;

    public void HighlightTimeViewBinder$mLifecycleObserver$1(HighlightTimeViewBinder p0){
       this.b = p0;
       super();
    }
    public final void onStop(){
       if (PatchProxy.applyVoid(null, this, HighlightTimeViewBinder$mLifecycleObserver$1.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("HighlightTimeViewBinder", "onStop ", objArray);
       this.b.Q().e();
       return;
    }
}
