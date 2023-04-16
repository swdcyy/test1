package eja.m0$b;
import erd.g;
import eja.m0;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import xl8.b;
import java.lang.Boolean;
import wh5.c;

public final class m0$b implements g	// class@0026d8
{
    public final m0 b;

    public void m0$b(m0 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m0$b.class, "1")) {
       }else {
          p0 = this.b.r;
          if (p0 == null) {
             a.S("mFollowSelectorIsDefault");
          }
          if (!p0.a().booleanValue() || c.b()) {
             m0.s = true;
          }
       }
       return;
    }
}
