package nz9.g;
import erd.g;
import nz9.z0;
import java.lang.Object;
import com.trello.rxlifecycle3.android.FragmentEvent;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class g implements g	// class@003222
{
    public final z0 b;

    public void g(z0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       g tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, z0.class, "5")) {
       }else if(p0 == FragmentEvent.DESTROY_VIEW){
          tb.N0();
       }
       return;
    }
}
