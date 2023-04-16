package cta.f;
import erd.g;
import com.yxcorp.gifshow.homepage.kcube.dynamic.KCubeDynamicTabManagerImpl;
import java.util.List;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class f implements g	// class@0023b5
{
    public final KCubeDynamicTabManagerImpl b;
    public final List c;

    public void f(KCubeDynamicTabManagerImpl p0,List p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
       }else {
          this.b.n(true, this.c, "delay");
       }
       return;
    }
}
