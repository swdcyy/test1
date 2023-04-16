package az0.o;
import android.view.View$OnClickListener;
import com.kuaishou.live.audience.component.gift.gift.LiveGiftReceiverListDialog$e;
import java.lang.Object;
import android.view.View;
import com.kuaishou.live.audience.component.gift.gift.LiveGiftReceiverListDialog;
import com.kuaishou.live.common.core.component.gift.gift.audience.LiveGiftReceiver;
import com.kuaishou.live.audience.component.gift.gift.LiveGiftReceiverListDialog$f;

public final class o implements View$OnClickListener	// class@0002dd
{
    public final LiveGiftReceiverListDialog$e b;

    public void o(LiveGiftReceiverListDialog$e p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       o tb = this.b;
       LiveGiftReceiverListDialog e = tb.t.E;
       if (e != null) {
          e.a(tb.s);
       }
       return;
    }
}
