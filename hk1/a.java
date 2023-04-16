package hk1.a;
import java.lang.Runnable;
import com.kuaishou.live.common.core.component.gift.domain.slot.view.LiveGiftSlotItemView;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.Object;
import ekd.j;
import com.kuaishou.live.common.core.component.gift.domain.slot.view.LiveGiftSlotBaseView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.ImageView;

public final class a implements Runnable	// class@0026f8
{
    public final LiveGiftSlotItemView b;
    public final CDNUrl[] c;

    public void a(LiveGiftSlotItemView p0,CDNUrl[] p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       a tb = this.b;
       a tc = this.c;
       if (!j.h(tc)) {
          tb.i.U(tc);
       }else {
          tb.i.setVisibility(8);
       }
       return;
    }
}
