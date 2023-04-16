package me9.m$f;
import erd.g;
import me9.m;
import java.lang.Object;
import j4b.n;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import me9.m$c;
import com.google.gson.JsonObject;
import java.util.Objects;
import kotlin.jvm.internal.a;

public final class m$f implements g	// class@003006
{
    public final m b;

    public void m$f(m p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m$f.class, "1")) {
       }else {
          n a = p0.a;
          JsonObject jsonObject = null;
          SimpleMagicFace mId = (a != null)? a.mId: jsonObject;
          a = (mId == null || !mId.length())? 1: null;
          if (a || !(p0.a.mId).equals(this.b.d.a())) {
             this.b.d.c(jsonObject);
             m d = this.b.d;
             p0 = p0.a;
             if (p0 != null) {
                jsonObject = p0.mId;
             }
             if (jsonObject == null) {
                jsonObject = "";
             }
             Objects.requireNonNull(d);
             if (!PatchProxy.applyVoidOneRefs(jsonObject, d, m$c.class, "1")) {
                a.p(jsonObject, "<set-?>");
                d.b = jsonObject;
             }
          }
       }
       return;
    }
}
