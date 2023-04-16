package aq3.e;
import erd.g;
import com.kuaishou.live.tuna.presenter.b;
import java.lang.Object;
import com.kuaishou.live.tuna.model.LiveTunaPreRequestResponse$Data;
import java.util.Objects;
import com.kuaishou.livestream.message.nano.LiveBsStateMessages$SCLiveCurrentBsState;

public final class e implements g	// class@0002a0
{
    public final b b;

    public void e(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       e tb = this.b;
       Objects.requireNonNull(tb);
       tb.b9(p0.mIconMsg, true);
    }
}
