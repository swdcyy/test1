package ii9.v$e;
import hg9.n;
import ii9.v;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import ii9.z;
import java.lang.Runnable;
import ekd.k1;
import java.io.File;
import android.graphics.Bitmap;
import ii9.a0;

public class v$e implements n	// class@00284c
{
    public final boolean b;
    public final v c;

    public void v$e(v p0,boolean p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void n0(int p0){
       v$e uoe = v$e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoe, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("WhatsUpTakePicture", "onCaptureFailed "+p0, objArray);
       k1.o(new z(this, p0, this.b));
       return;
    }
    public void t0(File p0,Bitmap p1,int p2){
       if (PatchProxy.isSupport(v$e.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, v$e.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("WhatsUpTakePicture", "onCaptureBitmapSuccess", objArray);
       k1.o(new a0(this, this.b, p1));
       return;
    }
    public void x0(File p0,Bitmap p1,int p2){
    }
}
