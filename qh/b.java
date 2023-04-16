package qh.b;
import erd.g;
import com.gifshow.kuaishou.thanos.milano.MilanoAttachCallbackPresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;

public final class b implements g	// class@0029d8
{
    public final MilanoAttachCallbackPresenter b;

    public void b(MilanoAttachCallbackPresenter p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (!p0.booleanValue()) {
          tb.R8();
       }
       return;
    }
}
