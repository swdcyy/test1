package com.kuaishou.commercial.tvc.TvcPluginImplWrapper$i;
import erd.g;
import com.kuaishou.commercial.tvc.TvcPluginImplWrapper;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import lm9.a$b;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import yx.j0;
import lm9.a;

public final class TvcPluginImplWrapper$i implements g	// class@00169f
{
    public final TvcPluginImplWrapper b;
    public final LiveStreamFeed c;
    public final a$b d;
    public final boolean e;

    public void TvcPluginImplWrapper$i(TvcPluginImplWrapper p0,LiveStreamFeed p1,a$b p2,boolean p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TvcPluginImplWrapper$i.class, "1")) {
       }else {
          a.o(p0, "isSuccess");
          if (p0.booleanValue()) {
             p0 = new Object[0];
             j0.f("TvcPluginImplWrapper", "tvc plugin loaded success", p0);
             this.b.n().RI(this.c, this.d, this.e);
          }
       }
       return;
    }
}
