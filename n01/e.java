package n01.e;
import java.lang.Runnable;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.tips.LiveGiftBoxBatchTipsView;
import java.lang.Object;

public final class e implements Runnable	// class@003262
{
    public final LiveGiftBoxBatchTipsView b;

    public void e(LiveGiftBoxBatchTipsView p0){
       this.b = p0;
    }
    public final void run(){
       LiveGiftBoxBatchTipsView.L(this.b);
    }
}
