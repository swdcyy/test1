package b8a.s2$g;
import erd.g;
import b8a.s2;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.homepage.SlidePlayNextGuideConfig;

public final class s2$g implements g	// class@0003ec
{
    public final s2 b;

    public void s2$g(s2 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s2$g.class, "1")) {
       }else if(p0.longValue() - (long)s2.P8(this.b).mCountdownTime < 0 && this.b.S8()){
          this.b.Y8();
       }
       return;
    }
}
