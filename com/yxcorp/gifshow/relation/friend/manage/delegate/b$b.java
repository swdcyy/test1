package com.yxcorp.gifshow.relation.friend.manage.delegate.b$b;
import sfc.a;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import tac.c;

public final class b$b extends a	// class@0018c5
{
    public final boolean c;
    public final BaseFeed d;
    public final boolean e;

    public void b$b(boolean p0,BaseFeed p1,boolean p2){
       this.c = p0;
       this.d = p1;
       this.e = p2;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "1")) {
          return;
       }
       a.p(p0, "e");
       if (this.c != null) {
          super.b(p0);
       }
       c.a(this.d, this.e, "reverse_removed");
       return;
    }
}
