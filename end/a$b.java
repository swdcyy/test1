package end.a$b;
import java.lang.Runnable;
import end.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import yld.a;

public final class a$b implements Runnable	// class@000d9a
{
    public final a b;
    public final boolean c;

    public void a$b(a p0,boolean p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, a$b.class, "1")) {
          return;
       }
       this.b.I().U0(this.c);
       return;
    }
}
