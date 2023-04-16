package me9.j$c;
import erd.g;
import me9.j;
import java.lang.Object;
import re9.z;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ne9.c;
import com.google.gson.JsonObject;
import le9.h;
import le9.d;
import fg6.a;
import com.google.gson.Gson;
import kotlin.jvm.internal.a;

public final class j$c implements g	// class@002ff4
{
    public final j b;

    public void j$c(j p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j$c.class, "1")) {
       }else {
          j$c tb = this.b;
          tb.c = p0.a;
          p0 = a.a.q(new c(5800, "", tb.h()));
          a.o(p0, "Gsons.KWAI_GSON.toJson\(response\)");
          this.b.a().b(p0);
       }
       return;
    }
}
