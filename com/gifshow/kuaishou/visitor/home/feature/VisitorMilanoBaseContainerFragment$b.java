package com.gifshow.kuaishou.visitor.home.feature.VisitorMilanoBaseContainerFragment$b;
import com.kwai.component.uiconfig.visitor.VisitorModeManager$a;
import com.gifshow.kuaishou.visitor.home.feature.VisitorMilanoBaseContainerFragment;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class VisitorMilanoBaseContainerFragment$b implements VisitorModeManager$a	// class@0015de
{
    public final VisitorMilanoBaseContainerFragment a;

    public void VisitorMilanoBaseContainerFragment$b(VisitorMilanoBaseContainerFragment p0){
       this.a = p0;
       super();
    }
    public void a(String p0,String p1){
    }
    public void b(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VisitorMilanoBaseContainerFragment$b.class, "1")) {
          return;
       }
       if (("VISITOR").equals(p0)) {
          p0.V = true;
       }
       return;
    }
}
