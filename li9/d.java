package li9.d;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.rn.ktv.KtvSchemeDispatchActivity;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class d implements Runnable	// class@002df0
{
    public final KtvSchemeDispatchActivity b;

    public void d(KtvSchemeDispatchActivity p0){
       this.b = p0;
    }
    public final void run(){
       d tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, KtvSchemeDispatchActivity.class, "21")) {
       }else {
          tb.finish();
       }
       return;
    }
}
