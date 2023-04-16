package com.kuaishou.live.locallife.explain.view.LocalLifeExplainView;
import android.widget.FrameLayout;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.locallife.explain.view.LocalLifeExplainView$b;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import df3.b;
import com.kuaishou.live.locallife.explain.view.LocalLifeExplainView$a;

public final class LocalLifeExplainView extends FrameLayout	// class@000c23
{
    public View b;
    public LocalLifeLiveExplainMessage c;
    public b d;
    public LocalLifeExplainView$a e;
    public b$a f;
    public HashMap g;

    public void LocalLifeExplainView(Context p0){
       a.p(p0, "context");
       super(p0);
       this.f = new LocalLifeExplainView$b(this);
    }
    public void LocalLifeExplainView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
       this.f = new LocalLifeExplainView$b(this);
    }
    public void LocalLifeExplainView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.f = new LocalLifeExplainView$b(this);
    }
    public final void a(int p0){
       if (PatchProxy.isSupport(LocalLifeExplainView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LocalLifeExplainView.class, "2")) {
          return;
       }
       LocalLifeExplainView td = this.d;
       if (td != null) {
          td.a(p0);
       }
       return;
    }
    public final void setViewStateListener(LocalLifeExplainView$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocalLifeExplainView.class, "3")) {
          return;
       }
       a.p(p0, "listener");
       this.e = p0;
       return;
    }
}
