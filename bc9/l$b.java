package bc9.l$b;
import androidx.lifecycle.Observer;
import bc9.l;
import java.lang.Object;
import cc9.q;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.assistant.a;
import com.yxcorp.gifshow.camera.record.assistant.a$b;
import kotlin.jvm.internal.a;
import sa6.b;

public final class l$b implements Observer	// class@0003f4
{
    public final l b;

    public void l$b(l p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l$b.class, "1")) {
       }else if(!this.b.g2().D()){
          a.o(p0, "state");
          this.b.g2().q().b(p0);
       }
       return;
    }
}
