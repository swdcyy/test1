package c01.c;
import com.kuaishou.live.audience.component.gift.gift.LiveGiftReceiverListDialog$b;
import c01.e;
import java.lang.Object;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;

public final class c implements LiveGiftReceiverListDialog$b	// class@00043d
{
    public final e a;

    public void c(e p0){
       this.a = p0;
    }
    public final void onClose(){
       e x = this.a.x;
       if (x != null) {
          x.dismissAllowingStateLoss();
       }
       return;
    }
}
