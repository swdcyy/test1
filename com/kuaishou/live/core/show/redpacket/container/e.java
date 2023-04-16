package com.kuaishou.live.core.show.redpacket.container.e;
import z1.a;
import com.kuaishou.live.core.show.redpacket.container.f;
import uw1.f;
import java.lang.Object;
import java.util.Objects;
import java.util.ArrayList;
import rg2.y;
import java.lang.String;
import java.util.List;

public final class e implements a	// class@000e72
{
    public final f a;
    public final f b;
    public final boolean c;

    public void e(f p0,f p1,boolean p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final void accept(Object p0){
       p0 = this.a;
       e tb = this.b;
       Objects.requireNonNull(p0);
       ArrayList uArrayList = new ArrayList();
       uArrayList.add(new y(tb));
       p0.V8(uArrayList, tb.a(), null, this.c);
    }
}
