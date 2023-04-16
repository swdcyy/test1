package kd9.y;
import u07.u;
import com.yxcorp.gifshow.camera.record.base.b;
import k2b.e0;
import java.lang.Object;
import u07.t;
import android.view.View;
import kd9.u;
import com.kwai.library.widget.popup.common.c;
import java.lang.String;
import kd9.c0;

public final class y implements u	// class@002c73
{
    public final boolean b;
    public final b c;
    public final e0 d;

    public void y(boolean p0,b p1,e0 p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void a(t p0,View p1){
       y tc = this.c;
       y td = this.d;
       if (this.b != null) {
          tc.m(new u());
       }
       p0.o();
       if (td != null) {
          c0.a(td, "right_corner_to_close");
       }
       return;
    }
}
