package ik1.m;
import ok.o;
import com.kuaishou.live.common.core.component.gift.gift.i;
import java.lang.Object;
import lm1.h;
import java.util.Objects;
import com.kuaishou.live.basic.model.QLiveMessage;
import com.kuaishou.live.common.core.component.gift.data.message.BroadcastGiftMessage;
import java.util.Set;

public final class m implements o	// class@002932
{
    public final i b;

    public void m(i p0){
       this.b = p0;
    }
    public final boolean apply(Object p0){
       m tb = this.b;
       Objects.requireNonNull(tb);
       boolean b = (p0 != null && !tb.M.contains(p0.b().mMergeKey))? true: false;
       return b;
    }
}
