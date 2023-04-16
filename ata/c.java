package ata.c;
import zq6.u;
import ata.a;
import java.lang.Object;
import co5.n;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.widget.RedPointNotifyView;
import android.view.View;

public final class c implements u	// class@0002f6
{
    public final a a;

    public void c(a p0){
       this.a = p0;
       super();
    }
    public void onChange(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
       }else {
          c ta = this.a;
          if (ta.e != null) {
             if (p0.a != null) {
                a.a(ta).setVisibility(0);
             }else {
                a.a(ta).setVisibility(8);
             }
          }
       }
       return;
    }
}
