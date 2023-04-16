package end.b$e;
import java.lang.Runnable;
import end.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import kod.a;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;

public final class b$e implements Runnable	// class@000da0
{
    public final b b;

    public void b$e(b p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, b$e.class, "1")) {
          return;
       }
       this.b.S().k();
       return;
    }
}
