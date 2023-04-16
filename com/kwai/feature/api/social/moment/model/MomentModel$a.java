package com.kwai.feature.api.social.moment.model.MomentModel$a;
import pw5.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class MomentModel$a extends a	// class@00118a
{
    public int e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public String j;

    public void MomentModel$a(){
       super();
       this.g = 0;
    }
    public boolean equals(Object p0){
       MomentModel$a uoa = MomentModel$a.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, uoa, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || uoa != p0.getClass()) {
          return false;
       }
       if (this.g != p0.g) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       return this.g;
    }
}
