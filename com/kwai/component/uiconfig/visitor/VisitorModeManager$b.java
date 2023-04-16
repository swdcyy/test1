package com.kwai.component.uiconfig.visitor.VisitorModeManager$b;
import java.lang.Runnable;
import k2b.o0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.logger.config.b;
import com.kwai.component.uiconfig.visitor.VisitorModeManager;
import java.util.Objects;
import y96.c;
import y96.m;

public final class VisitorModeManager$b implements Runnable	// class@000bef
{
    public final o0 b;

    public void VisitorModeManager$b(o0 p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, VisitorModeManager$b.class, "1")) {
          return;
       }
       VisitorModeManager$b tb = this.b;
       String str = VisitorModeManager.e();
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(str, tb, b.class, "7")) {
          c.b();
          tb.u.mGrantBrowseType = str;
          tb.k();
       }
       return;
    }
}
