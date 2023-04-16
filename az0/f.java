package az0.f;
import erd.g;
import com.kuaishou.live.audience.component.gift.gift.b;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveTimeConsumingUserStatusResponse;
import java.util.Objects;
import java.util.List;
import com.kuaishou.live.common.core.component.gift.gift.i;

public final class f implements g	// class@0002d4
{
    public final b b;

    public void f(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       f tb = this.b;
       Objects.requireNonNull(tb);
       tb.b9(p0.mLiveGiftSlotGrades);
       tb.c9(p0.mLiveGiftSlotSpecialComboList);
    }
}
