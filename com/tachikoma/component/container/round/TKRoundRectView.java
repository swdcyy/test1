package com.tachikoma.component.container.round.TKRoundRectView;
import com.tachikoma.core.component.view.TKView;
import gx4.f;
import android.content.Context;
import android.view.View;
import com.tachikoma.core.component.TKYogaLayout;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.tachikoma.component.container.round.RoundTKYogaLayout;
import java.lang.Integer;
import iq8.n;
import com.tachikoma.core.component.e;
import com.tachikoma.component.container.round.RoundTKYogaLayout$RadiusMode;

public class TKRoundRectView extends TKView	// class@000cee
{

    public void TKRoundRectView(f p0){
       super(p0);
    }
    public View createViewInstance(Context p0){
       return this.createViewInstance(p0);
    }
    public TKYogaLayout createViewInstance(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TKRoundRectView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new RoundTKYogaLayout(p0);
    }
    public void setBorderRadius(int p0){
       TKRoundRectView tKRoundRectV = TKRoundRectView.class;
       if (PatchProxy.isSupport(tKRoundRectV) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, tKRoundRectV, "2")) {
          return;
       }
       this.getView().h((float)n.b(p0), RoundTKYogaLayout$RadiusMode.ALL);
       return;
    }
    public void setBottomLeftRadius(int p0){
       TKRoundRectView tKRoundRectV = TKRoundRectView.class;
       if (PatchProxy.isSupport(tKRoundRectV) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, tKRoundRectV, "6")) {
          return;
       }
       this.getView().h((float)n.b(p0), RoundTKYogaLayout$RadiusMode.BOTTOM_LEFT);
       return;
    }
    public void setBottomRightRadius(int p0){
       TKRoundRectView tKRoundRectV = TKRoundRectView.class;
       if (PatchProxy.isSupport(tKRoundRectV) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, tKRoundRectV, "5")) {
          return;
       }
       this.getView().h((float)n.b(p0), RoundTKYogaLayout$RadiusMode.BOTTOM_RIGHT);
       return;
    }
    public void setTopLeftRadius(int p0){
       TKRoundRectView tKRoundRectV = TKRoundRectView.class;
       if (PatchProxy.isSupport(tKRoundRectV) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, tKRoundRectV, "3")) {
          return;
       }
       this.getView().h((float)n.b(p0), RoundTKYogaLayout$RadiusMode.TOP_LEFT);
       return;
    }
    public void setTopRightRadius(int p0){
       TKRoundRectView tKRoundRectV = TKRoundRectView.class;
       if (PatchProxy.isSupport(tKRoundRectV) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, tKRoundRectV, "4")) {
          return;
       }
       this.getView().h((float)n.b(p0), RoundTKYogaLayout$RadiusMode.TOP_RIGHT);
       return;
    }
}
