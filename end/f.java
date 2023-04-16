package end.f;
import java.lang.Runnable;
import end.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import kod.a;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;

public final class f implements Runnable	// class@000db0
{
    public final e b;

    public void f(e p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       this.b.S().R();
       return;
    }
}
