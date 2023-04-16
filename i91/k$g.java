package i91.k$g;
import z1.a;
import java.util.ArrayList;
import java.lang.Object;
import lt.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class k$g implements a	// class@00286c
{
    public final ArrayList a;
    public final float b;
    public final float c;

    public void k$g(ArrayList p0,float p1,float p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$g.class, "1")) {
       }else if(p0 != null){
          p0.h(this.a, this.b, this.c);
       }
       return;
    }
}
