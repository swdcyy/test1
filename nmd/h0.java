package nmd.h0;
import java.lang.Runnable;
import nmd.f0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import yld.a;

public final class h0 implements Runnable	// class@001e5a
{
    public final f0 b;
    public final boolean c;

    public void h0(f0 p0,boolean p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, h0.class, "1")) {
          return;
       }
       this.b.I().T0(this.c, this.b.n);
       return;
    }
}
