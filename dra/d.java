package dra.d;
import java.lang.Runnable;
import com.yxcorp.gifshow.growth.vfc.model.GrowthVfcModel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dra.c;
import com.yxcorp.gifshow.growth.vfc.GrowthVfcUtilKt;

public final class d implements Runnable	// class@002507
{
    public final GrowthVfcModel b;

    public void d(GrowthVfcModel p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       GrowthVfcUtilKt.b(this.b, c.b, c.c);
       c.a = null;
       c.b = null;
       c.c = null;
       return;
    }
}
