package com.kuaishou.live.tuna.explain.view.TunaExplainView;
import android.widget.FrameLayout;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.tuna.explain.view.TunaExplainView$b;
import android.util.AttributeSet;
import up3.b;
import com.kuaishou.live.tuna.explain.view.TunaExplainView$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class TunaExplainView extends FrameLayout	// class@000fa5
{
    public View b;
    public TunaLiveExplainMessage c;
    public b d;
    public TunaExplainView$a e;
    public a f;
    public boolean g;
    public b$a h;
    public HashMap i;

    public void TunaExplainView(Context p0){
       a.p(p0, "context");
       super(p0);
       this.h = new TunaExplainView$b(this);
    }
    public void TunaExplainView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
       this.h = new TunaExplainView$b(this);
    }
    public void TunaExplainView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.h = new TunaExplainView$b(this);
    }
    public final b getRender(){
       return this.d;
    }
    public final void setViewStateListener(TunaExplainView$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TunaExplainView.class, "2")) {
          return;
       }
       a.p(p0, "listener");
       this.e = p0;
       return;
    }
}
