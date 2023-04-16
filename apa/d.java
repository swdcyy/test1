package apa.d;
import k2b.s1;
import apa.b;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import kotlin.jvm.internal.a;

public final class d implements s1	// class@0002a1
{
    public final b b;

    public void d(b p0){
       this.b = p0;
       super();
    }
    public final void d(String p0,int p1,String p2){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, d.class, "1")) {
          return;
       }
       if (p1 == 1 || p1 == 3) {
          a.o(p0, "page2");
          p1.a = p0;
       }else if(p1 == 2){
          p0.a = "";
       }
       return;
    }
}
