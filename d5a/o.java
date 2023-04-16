package d5a.o;
import java.lang.Runnable;
import f5a.b;
import com.yxcorp.gifshow.detail.presenter.landscape.LandscapeEntranceVMPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class o implements Runnable	// class@001e89
{
    public final b b;
    public final LandscapeEntranceVMPresenter c;

    public void o(b p0,LandscapeEntranceVMPresenter p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, o.class, "1")) {
          return;
       }
       this.c.V8(this.b);
       PatchProxy.onMethodExit(o.class, "1");
       return;
    }
}
