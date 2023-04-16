package com.kuaishou.house.live.explain.view.HouseExplainView;
import android.widget.FrameLayout;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.house.live.explain.view.HouseExplainView$b;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import zg0.d;
import com.kuaishou.house.live.explain.view.HouseExplainView$a;

public final class HouseExplainView extends FrameLayout	// class@000788
{
    public View b;
    public HouseLiveExplainMessage c;
    public d d;
    public HouseExplainView$a e;
    public d$a f;
    public HashMap g;

    public void HouseExplainView(Context p0){
       a.p(p0, "context");
       super(p0);
       this.f = new HouseExplainView$b(this);
    }
    public void HouseExplainView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
       this.f = new HouseExplainView$b(this);
    }
    public void HouseExplainView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.f = new HouseExplainView$b(this);
    }
    public final void a(int p0){
       if (PatchProxy.isSupport(HouseExplainView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, HouseExplainView.class, "2")) {
          return;
       }
       HouseExplainView td = this.d;
       if (td != null) {
          td.a(p0);
       }
       return;
    }
    public final void setViewStateListener(HouseExplainView$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HouseExplainView.class, "3")) {
          return;
       }
       a.p(p0, "listener");
       this.e = p0;
       return;
    }
}
