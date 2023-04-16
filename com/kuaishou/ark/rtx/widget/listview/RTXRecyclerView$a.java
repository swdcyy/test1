package com.kuaishou.ark.rtx.widget.listview.RTXRecyclerView$a;
import androidx.recyclerview.widget.RecyclerView$r;
import com.kuaishou.ark.rtx.widget.listview.RTXRecyclerView;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.tkruntime.v8.V8Object;
import tx4.y;
import com.tachikoma.core.bridge.c;
import com.tachikoma.core.component.TKBaseNativeModule;
import com.tkruntime.v8.V8Value;
import com.tkruntime.v8.V8Function;
import java.lang.Throwable;
import wp8.a;
import kr.a;
import sp8.b$a;
import com.tachikoma.core.component.e;

public class RTXRecyclerView$a extends RecyclerView$r	// class@000f9b
{
    public final RTXRecyclerView a;

    public void RTXRecyclerView$a(RTXRecyclerView p0){
       this.a = p0;
       super();
    }
    public void b(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(RTXRecyclerView$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, RTXRecyclerView$a.class, "1")) {
          return;
       }
       if (y.a(this.a.onScrollCallback)) {
          V8Object v8Object = this.a.getJSContext().l();
          V8Object v8Object1 = this.a.getJSContext().l();
          v8Object1.add("x", p1);
          v8Object1.add("y", p2);
          v8Object.add("contentOffset", v8Object1);
          Object[] objArray = new Object[]{v8Object};
          this.a.onScrollCallback.call(null, objArray);
          v8Object.setWeak();
          v8Object1.setWeak();
       }
       this.a.dispatchEvent("scroll", new a(p0, p1, p2));
       return;
    }
}
