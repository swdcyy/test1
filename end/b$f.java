package end.b$f;
import java.lang.Runnable;
import end.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import kod.a;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;

public final class b$f implements Runnable	// class@000da1
{
    public final b b;

    public void b$f(b p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, b$f.class, "1")) {
          return;
       }
       this.b.S().R();
       return;
    }
}
