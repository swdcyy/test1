package com.yxcorp.gifshow.listcomponent.layoutmanager.ExposeLinearLayoutManagerEx$a;
import com.yxcorp.gifshow.listcomponent.layoutmanager.ExposeLinearLayoutManagerEx;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import w0b.f;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class ExposeLinearLayoutManagerEx$a	// class@001a6d
{
    public int a;
    public int b;
    public boolean c;
    public final ExposeLinearLayoutManagerEx d;

    public void ExposeLinearLayoutManagerEx$a(ExposeLinearLayoutManagerEx p0){
       this.d = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, ExposeLinearLayoutManagerEx$a.class, "1")) {
          return;
       }
       int i = (this.c != null)? this.d.s.g(): this.d.s.i();
       this.b = i;
       return;
    }
    public void b(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ExposeLinearLayoutManagerEx$a.class, "4")) {
          return;
       }
       boolean b = true;
       this.b = (this.c != null)? (this.d.s.b(p0) + this.d.W0(p0, this.c, b)) + this.d.s.k(): this.d.s.e(p0) + this.d.W0(p0, this.c, b);
       this.a = this.d.getPosition(p0);
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ExposeLinearLayoutManagerEx$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "AnchorInfo{mPosition="+this.a+", mCoordinate="+this.b+", mLayoutFromEnd="+this.c+'}';
    }
}
