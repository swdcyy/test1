package end.e$g;
import java.lang.Runnable;
import end.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import kod.a;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;

public final class e$g implements Runnable	// class@000dad
{
    public final e b;

    public void e$g(e p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, e$g.class, "1")) {
          return;
       }
       this.b.S().R();
       return;
    }
}
