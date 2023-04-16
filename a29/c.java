package a29.c;
import erd.g;
import a29.k;
import java.lang.Object;
import com.trello.rxlifecycle3.android.FragmentEvent;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class c implements g	// class@00002f
{
    public final k b;

    public void c(k p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, k.class, "9")) {
       }else if(p0 == FragmentEvent.DESTROY_VIEW){
          tb.u0();
       }
       return;
    }
}
