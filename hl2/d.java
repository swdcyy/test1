package hl2.d;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.show.template.LiveActivityPopupDialog;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;

public class d implements View$OnClickListener	// class@002dbe
{
    public final LiveActivityPopupDialog b;

    public void d(LiveActivityPopupDialog p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       this.b.dismissAllowingStateLoss();
       LiveActivityPopupDialog b = this.b.B;
       if (b != null) {
          b.onClick(p0);
       }
       return;
    }
}
