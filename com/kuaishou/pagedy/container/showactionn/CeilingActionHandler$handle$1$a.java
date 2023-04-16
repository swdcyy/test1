package com.kuaishou.pagedy.container.showactionn.CeilingActionHandler$handle$1$a;
import java.lang.Runnable;
import android.view.View;
import com.kuaishou.pagedy.container.showactionn.CeilingActionHandler$handle$1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.pagedy.container.widget.DynamicRootListContainer;

public final class CeilingActionHandler$handle$1$a implements Runnable	// class@000a5e
{
    public final View b;
    public final CeilingActionHandler$handle$1 c;

    public void CeilingActionHandler$handle$1$a(View p0,CeilingActionHandler$handle$1 p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, CeilingActionHandler$handle$1$a.class, "1")) {
          return;
       }
       if (this.b.getHeight() > 10) {
          this.c.$container.setCeilingHeight(this.b.getHeight());
       }
       PatchProxy.onMethodExit(CeilingActionHandler$handle$1$a.class, "1");
       return;
    }
}
