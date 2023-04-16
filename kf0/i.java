package kf0.i;
import erd.g;
import kf0.f$b;
import java.lang.Object;
import com.google.gson.JsonArray;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class i implements g	// class@002d10
{
    public final f$b b;

    public void i(f$b p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
       }else {
          a.p(p0, "data");
          this.b.onSuccess(p0);
       }
       return;
    }
}
