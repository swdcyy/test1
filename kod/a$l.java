package kod.a$l;
import java.lang.Runnable;
import kod.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;

public final class a$l implements Runnable	// class@001803
{
    public final a b;

    public void a$l(a p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, a$l.class, "1")) {
          return;
       }
       this.b.S().e0();
       return;
    }
}
