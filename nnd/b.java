package nnd.b;
import java.lang.Runnable;
import nnd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import yld.a;

public final class b implements Runnable	// class@001e91
{
    public final a b;
    public final boolean c;

    public void b(a p0,boolean p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.b.I().U0(this.c);
       return;
    }
}
