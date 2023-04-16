package ci9.i;
import java.lang.Runnable;
import ci9.l;
import android.view.View;
import java.lang.Object;
import android.util.SparseArray;
import java.lang.Integer;
import com.yxcorp.gifshow.camera.record.base.d;
import com.yxcorp.gifshow.camera.record.CameraLogger;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class i implements Runnable	// class@0005f9
{
    public final l b;
    public final View c;

    public void i(l p0,View p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       i tb = this.b;
       int i = tb.t.get(this.c.getId()).intValue();
       d e = tb.e;
       if (!PatchProxy.isSupport(CameraLogger.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(i), Integer.valueOf(1), e, null, CameraLogger.class, "18")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "RECORD_MULTI_TIME";
          uElementPack.name = CameraLogger.f(i, 1);
          uElementPack.index = 1;
          u1.C0("", e, 3, uElementPack, null);
       }
       return;
    }
}
