package n01.d;
import android.view.View$OnClickListener;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.tips.LiveGiftBoxBatchTipsView;
import java.lang.Object;
import android.view.View;
import java.util.Objects;

public final class d implements View$OnClickListener	// class@003261
{
    public final LiveGiftBoxBatchTipsView b;
    public final View$OnClickListener c;

    public void d(LiveGiftBoxBatchTipsView p0,View$OnClickListener p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onClick(View p0){
       d tb = this.b;
       d tc = this.c;
       Objects.requireNonNull(tb);
       if (tc != null) {
          tc.onClick(p0);
       }
       tb.M();
       return;
    }
}
