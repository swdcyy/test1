package com.kwai.live.gzone.emotion.m$b;
import androidx.recyclerview.widget.GridLayoutManager$b;
import com.kwai.live.gzone.emotion.m;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.live.gzone.emotion.k;
import androidx.recyclerview.widget.GridLayoutManager;

public class m$b extends GridLayoutManager$b	// class@000ceb
{
    public final m e;

    public void m$b(m p0){
       this.e = p0;
       super();
    }
    public int f(int p0){
       m$b uob = m$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (this.e.x.f0(p0) == 2) {
          return this.e.w.getSpanCount();
       }else {
          return 1;
       }
    }
}
