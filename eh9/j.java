package eh9.j;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.tab.CameraScrollTabViewGroupV2;
import java.lang.Object;
import android.widget.Scroller;
import j8c.a;
import java.lang.String;
import q87.c;
import com.yxcorp.gifshow.camera.record.tab.CameraScrollTabViewGroupV2$d;
import java.lang.StringBuilder;

public final class j implements Runnable	// class@002151
{
    public final CameraScrollTabViewGroupV2 b;

    public void j(CameraScrollTabViewGroupV2 p0){
       this.b = p0;
    }
    public final void run(){
       j tb = this.b;
       if (!tb.n.isFinished()) {
       }else {
          int i = 0;
          if (tb.w != null) {
             Object[] objArray = new Object[i];
             a.D().w("CameraScrollTabViewGroupV2", "isExpanding, skip scroll", objArray);
          }else if(tb.A()){
             tb.B(tb.i);
          }else {
             Object[] objArray1 = new Object[i];
             a.D().w("CameraScrollTabViewGroupV2", "scroll finish :  "+tb.getCurrentScrollX(), objArray1);
             tb.C(tb.i);
          }
       }
       return;
    }
}
