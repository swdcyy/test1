package h01.o$c;
import h01.y;
import h01.o;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.basic.activity.x;
import t02.a0;
import androidx.fragment.app.FragmentActivity;
import java.util.Objects;
import android.content.Context;
import com.kuaishou.live.common.core.basic.widget.h$a;
import com.kuaishou.live.common.core.basic.widget.h;
import android.app.Dialog;
import h01.k;
import android.content.DialogInterface$OnDismissListener;

public class o$c implements y	// class@0025f3
{
    public final o a;

    public void o$c(o p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, o$c.class, "1")) {
          return;
       }
       o$c ta = this.a;
       FragmentActivity activity = ta.p.R().getActivity();
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(activity, ta, o.class, "16") && ta.I == null) {
          h$a uoa = h.a(activity);
          uoa.b(R.string.arg_RES_7f10465c);
          Dialog uDialog = uoa.a();
          uDialog.setOnDismissListener(new k(ta));
          uDialog.show();
          ta.I = true;
       }
       return;
    }
}
