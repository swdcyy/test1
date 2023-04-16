package hj2.d;
import android.view.View$OnClickListener;
import hj2.e;
import com.kuaishou.screencast.ScreencastDeviceInfo;
import java.lang.Object;
import android.view.View;
import hj2.e$a;

public final class d implements View$OnClickListener	// class@002dad
{
    public final e b;
    public final ScreencastDeviceInfo c;

    public void d(e p0,ScreencastDeviceInfo p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onClick(View p0){
       d tc = this.c;
       e f = this.b.F;
       if (f != null && tc != null) {
          f.c(tc);
       }
       return;
    }
}
