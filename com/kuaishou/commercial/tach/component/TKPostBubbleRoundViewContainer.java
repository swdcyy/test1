package com.kuaishou.commercial.tach.component.TKPostBubbleRoundViewContainer;
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
import com.kuaishou.commercial.tach.component.RoundClipTKYogaLayout;
import java.lang.Float;
import com.tachikoma.core.component.e;
import lnc.a1;

public class TKPostBubbleRoundViewContainer extends TKView	// class@001660
{

    public void TKPostBubbleRoundViewContainer(f p0){
       super(p0);
    }
    public View createViewInstance(Context p0){
       return this.createViewInstance(p0);
    }
    public TKYogaLayout createViewInstance(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TKPostBubbleRoundViewContainer.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new RoundClipTKYogaLayout(p0);
    }
    public void setClipRadius(float p0){
       TKPostBubbleRoundViewContainer tKPostBubble = TKPostBubbleRoundViewContainer.class;
       if (PatchProxy.isSupport(tKPostBubble) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, tKPostBubble, "2")) {
          return;
       }
       View view = this.getView();
       if (view instanceof RoundClipTKYogaLayout) {
          view.setClipRadius((float)a1.e(p0));
       }
       return;
    }
}
