package li9.c;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.rn.ktv.KtvSchemeDispatchActivity;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class c implements Runnable	// class@002def
{
    public final KtvSchemeDispatchActivity b;

    public void c(KtvSchemeDispatchActivity p0){
       this.b = p0;
    }
    public final void run(){
       c tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, KtvSchemeDispatchActivity.class, "20")) {
       }else {
          tb.finish();
       }
       return;
    }
}
