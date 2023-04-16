package ji1.b;
import erd.g;
import com.kuaishou.live.common.core.component.gift.domain.effect.task.combo.LiveEffectRechargeGiftComboTask;
import java.lang.Object;
import java.lang.Long;
import java.lang.StringBuilder;
import java.lang.String;
import java.util.List;
import com.kuaishou.android.live.log.b;

public final class b implements g	// class@002bb2
{
    public final LiveEffectRechargeGiftComboTask b;

    public void b(LiveEffectRechargeGiftComboTask p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b tb = this.b;
       tb.L();
       b.r(LiveEffectRechargeGiftComboTask.y, "countDown£¬ and clear rendering task, task = "+tb);
    }
}
