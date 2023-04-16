package ii9.z;
import java.lang.Runnable;
import ii9.v$e;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.base.d;
import androidx.fragment.app.Fragment;
import e17.i;
import j8c.a;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;
import ii9.v;
import com.yxcorp.gifshow.camerasdk.q;

public final class z implements Runnable	// class@002851
{
    public final v$e b;
    public final int c;
    public final boolean d;

    public void z(v$e p0,int p1,boolean p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       z tb = this.b;
       z tc = this.c;
       z td = this.d;
       if (tb.c.f.isAdded()) {
          int i = 0x7f110668;
          if (tc == 3) {
             i.a(i, R.string.arg_RES_7f1004ab);
          }else {
             i.a(i, R.string.arg_RES_7f103b10);
          }
          Object[] objArray = new Object[0];
          a.D().w("WhatsUpTakePicture", "onCaptureFailed "+tc+" reset", objArray);
          if (td == null) {
             v$e c = tb.c;
             d h = c.h;
             if (h != null && c.C == null) {
                h.d1();
             }
          }
          tb.c.m2();
       }
       return;
    }
}
