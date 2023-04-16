package hd9.k;
import erd.g;
import com.yxcorp.gifshow.camera.record.followshoot.b;
import java.lang.Object;
import jd9.g;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.followshoot.d;

public final class k implements g	// class@002619
{
    public final b b;

    public void k(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       k tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, b.class, "7")) {
       }else if(p0.a != null){
          tb.M = true;
          tb.y2();
       }else {
          tb.M = false;
          tb.z2();
       }
       return;
    }
}
