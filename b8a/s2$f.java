package b8a.s2$f;
import erd.g;
import b8a.s2;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.homepage.SlidePlayNextGuideConfig;

public final class s2$f implements g	// class@0003eb
{
    public final s2 b;

    public void s2$f(s2 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s2$f.class, "1")) {
       }else if(p0.longValue() - ((long)s2.P8(this.b).getMStartTime() * 1000) >= 0 && this.b.S8()){
          this.b.Y8();
       }
       return;
    }
}
