package c01.g;
import com.kuaishou.live.core.basic.widget.LiveDialogContainerFragment$c;
import c01.e;
import com.kuaishou.live.audience.component.gift.gift.LiveGiftReceiverListDialog;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;

public class g implements LiveDialogContainerFragment$c	// class@000442
{
    public final LiveGiftReceiverListDialog a;
    public final e b;

    public void g(e p0,LiveGiftReceiverListDialog p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       e x = this.b.x;
       if (x != null) {
          x = x.getChildFragmentManager().beginTransaction();
          x.f(R.id.live_bottom_dialog_container_root, this.a);
          x.m();
       }
       return;
    }
}
