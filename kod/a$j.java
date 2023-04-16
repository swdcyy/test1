package kod.a$j;
import java.lang.Runnable;
import kod.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;

public final class a$j implements Runnable	// class@001801
{
    public final a b;

    public void a$j(a p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, a$j.class, "1")) {
          return;
       }
       this.b.S().e0();
       return;
    }
}
