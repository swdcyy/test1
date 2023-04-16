package az0.q;
import w07.l;
import az0.s;
import java.lang.Object;
import u07.t;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.kwai.library.widget.popup.common.c;
import android.widget.TextView;
import lnc.a1;

public final class q implements l	// class@0002df
{
    public final s a;

    public void q(s p0){
       this.a = p0;
    }
    public final void apply(Object p0){
       q ta = this.a;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoidOneRefs(p0, ta, s.class, "2")) {
       }else if(p0 == null){
          p0 = p0.z();
          if (p0 != null) {
             p0 = p0.findViewById(R.id.positive);
             if (p0 instanceof TextView) {
                p0.setTextColor(a1.a(R.color.arg_RES_7f061d91));
             }
          }
       }
       return;
    }
}
