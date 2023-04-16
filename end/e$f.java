package end.e$f;
import java.lang.Runnable;
import end.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import kod.a;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;

public final class e$f implements Runnable	// class@000dac
{
    public final e b;

    public void e$f(e p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, e$f.class, "1")) {
          return;
       }
       this.b.S().k();
       return;
    }
}
