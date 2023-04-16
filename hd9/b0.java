package hd9.b0;
import com.yxcorp.gifshow.camera.record.followshoot.f$b;
import com.yxcorp.gifshow.camera.record.followshoot.d;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.followshoot.f;
import java.util.Objects;
import j8c.a;
import java.lang.String;
import q87.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class b0 implements f$b	// class@002606
{
    public final d a;

    public void b0(d p0){
       this.a = p0;
    }
    public final void a(f p0){
       b0 ta = this.a;
       Objects.requireNonNull(ta);
       Object[] objArray = new Object[0];
       a.D().A("UseSampleController", "onCompletion .", objArray);
       if (PatchProxy.applyVoid(null, ta, d.class, "50")) {
       }else {
          ta.E2(0);
          ta.z2();
       }
       return;
    }
}
