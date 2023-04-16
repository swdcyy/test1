package com.kuaishou.pagedy.container.showactionn.CeilingActionHandler$a;
import lo4.k;
import com.kuaishou.pagedy.container.showactionn.CeilingActionHandler;
import java.lang.Object;
import android.view.ViewGroup;
import com.kuaishou.bowl.core.component.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.kwai.robust.PatchProxyResult;

public final class CeilingActionHandler$a implements k	// class@000a5a
{
    public boolean a;
    public final CeilingActionHandler b;

    public void CeilingActionHandler$a(CeilingActionHandler p0){
       this.b = p0;
       super();
    }
    public void a(ViewGroup p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CeilingActionHandler$a.class, "1")) {
          return;
       }
       if (this.a == null) {
          this.b.d(p0, p1);
          this.a = true;
       }
       if (p0 != null) {
          p0.setVisibility(0);
       }
       return;
    }
    public View b(){
       Object obj = PatchProxy.apply(null, this, CeilingActionHandler$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return null;
    }
    public void c(ViewGroup p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CeilingActionHandler$a.class, "2")) {
          return;
       }
       if (p0 != null) {
          p0.setVisibility(4);
       }
       return;
    }
    public void release(){
       this.a = false;
    }
}
