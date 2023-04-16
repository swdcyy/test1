package com.kuaishou.live.gzone.v2.profile.j$a;
import androidx.recyclerview.widget.GridLayoutManager$b;
import com.kuaishou.live.gzone.v2.profile.j;
import androidx.recyclerview.widget.GridLayoutManager;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class j$a extends GridLayoutManager$b	// class@001ced
{
    public final GridLayoutManager e;
    public final j f;

    public void j$a(j p0,GridLayoutManager p1){
       this.f = p0;
       this.e = p1;
       super();
    }
    public int f(int p0){
       j$a uoa = j$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (this.f.y1(p0) || this.f.x1(p0)) {
          return this.e.getSpanCount();
       }else {
          return 1;
       }
    }
}
