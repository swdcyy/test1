package eja.e1$a;
import com.yxcorp.gifshow.widget.m;
import eja.e1;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import y8c.d;
import ja5.c;

public class e1$a extends m	// class@0026be
{
    public final e1 c;

    public void e1$a(e1 p0,boolean p1){
       this.c = p0;
       super(p1);
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e1$a.class, "1")) {
          return;
       }
       e1$a tc = this.c;
       if (tc.A != null) {
          tc.R8(p0, tc.B, tc.z.get());
       }else {
          tc.P8(p0, tc.B);
       }
       return;
    }
}
