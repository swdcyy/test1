package ii9.x;
import java.lang.Runnable;
import ii9.y;
import com.kwai.camerasdk.ErrorCode$Result;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.base.d;
import androidx.fragment.app.Fragment;
import e17.i;
import j8c.a;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;
import ii9.v;

public final class x implements Runnable	// class@00284f
{
    public final y b;
    public final ErrorCode$Result c;

    public void x(y p0,ErrorCode$Result p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       x tb = this.b;
       x tc = this.c;
       if (tb.a.f.isAdded()) {
          i.a(R.style.arg_RES_7f110668, 0x7f103b10);
          Object[] objArray = new Object[0];
          a.D().w("WhatsUpTakePicture", "onCaptureFailed "+tc.getName()+" reset", objArray);
          tb.a.m2();
       }
       return;
    }
}
