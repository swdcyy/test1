package bia.i;
import erd.g;
import bia.j;
import java.lang.Object;
import tga.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Boolean;
import xl8.b;

public final class i implements g	// class@0003c9
{
    public final j b;

    public void i(j p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
       }else {
          a.p(p0, "event");
          this.b.a.d(Boolean.valueOf(p0.a));
       }
       return;
    }
}
