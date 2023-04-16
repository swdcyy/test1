package ml1.a;
import android.view.View$OnClickListener;
import com.kuaishou.live.common.core.component.gift.gift.audience.v2.widget.LiveGiftHonorNamingView;
import java.lang.Object;
import android.view.View;
import com.kuaishou.live.common.core.component.gift.data.giftbox.honornaming.LiveGiftItemHintItem;
import com.kuaishou.live.common.core.component.gift.gift.audience.v2.widget.LiveGiftHonorNamingView$a;

public final class a implements View$OnClickListener	// class@0031ba
{
    public final LiveGiftHonorNamingView b;

    public void a(LiveGiftHonorNamingView p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       a tb = this.b;
       LiveGiftHonorNamingView d = tb.d;
       if (d != null) {
          d.a(tb.b);
       }
       return;
    }
}
