package fna.m;
import erd.g;
import msd.p;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Boolean;

public final class m implements g	// class@00298e
{
    public final p b;

    public void m(p p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "1")) {
       }else {
          a.o(p0, "it");
          this.b.invoke(p0, Boolean.FALSE);
       }
       return;
    }
}
