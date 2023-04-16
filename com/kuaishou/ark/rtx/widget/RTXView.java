package com.kuaishou.ark.rtx.widget.RTXView;
import com.tachikoma.core.component.view.TKView;
import gx4.f;
import com.tkruntime.v8.V8Object;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.HashMap;
import com.tachikoma.core.component.e;

public class RTXView extends TKView	// class@000f9a
{

    public void RTXView(f p0){
       super(p0);
    }
    public void addBefore(V8Object p0,V8Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RTXView.class, "2")) {
          return;
       }
       this.insertBefore(p0, p1);
       return;
    }
    public void addChild(V8Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RTXView.class, "1")) {
          return;
       }
       this.add(p0);
       return;
    }
    public void setStyle(HashMap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RTXView.class, "3")) {
          return;
       }
       e tstyle = this.style;
       if (tstyle != null && tstyle.equals(p0)) {
          return;
       }
       super.setStyle(p0);
       return;
    }
}
