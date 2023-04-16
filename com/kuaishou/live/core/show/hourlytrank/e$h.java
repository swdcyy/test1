package com.kuaishou.live.core.show.hourlytrank.e$h;
import java.util.Comparator;
import com.kuaishou.live.core.show.hourlytrank.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.google.protobuf.nano.MessageNano;
import java.lang.Integer;
import java.lang.Comparable;
import xrd.b;

public final class e$h implements Comparator	// class@000c0a
{
    public final e b;

    public void e$h(e p0){
       this.b = p0;
       super();
    }
    public final int compare(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefsWithListener(p0, p1, this, e$h.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       PatchProxy.onMethodExit(e$h.class, "1");
       return b.f(Integer.valueOf(this.b.a(p0)), Integer.valueOf(this.b.a(p1)));
    }
}
