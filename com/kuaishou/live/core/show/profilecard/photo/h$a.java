package com.kuaishou.live.core.show.profilecard.photo.h$a;
import androidx.recyclerview.widget.GridLayoutManager$b;
import com.kuaishou.live.core.show.profilecard.photo.h;
import androidx.recyclerview.widget.GridLayoutManager;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class h$a extends GridLayoutManager$b	// class@000de3
{
    public final GridLayoutManager e;
    public final h f;

    public void h$a(h p0,GridLayoutManager p1){
       this.f = p0;
       this.e = p1;
       super();
    }
    public int f(int p0){
       h$a uoa = h$a.class;
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
