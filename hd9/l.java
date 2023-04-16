package hd9.l;
import erd.g;
import com.yxcorp.gifshow.camera.record.followshoot.b;
import java.lang.Object;
import mc9.a;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.io.File;
import com.yxcorp.gifshow.camera.record.followshoot.d;

public final class l implements g	// class@00261b
{
    public final b b;

    public void l(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       l tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, b.class, "20")) {
       }else if(p0.c == 2){
          tb.I = p0.a;
          tb.J = p0.b.getAbsolutePath();
          tb.h2();
          tb.L2();
       }
       return;
    }
}
