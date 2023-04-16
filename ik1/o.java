package ik1.o;
import ok.o;
import com.kuaishou.live.common.core.component.gift.gift.i;
import java.lang.Object;
import lm1.h;
import com.kuaishou.live.basic.model.QLiveMessage;
import com.kuaishou.live.core.show.gift.GiftMessage;
import java.util.Set;
import java.lang.StringBuilder;
import java.lang.String;

public final class o implements o	// class@002934
{
    public final i b;

    public void o(i p0){
       this.b = p0;
    }
    public final boolean apply(Object p0){
       o tb = this.b;
       boolean b = tb.M.contains(p0.b().mMergeKey);
       if (b) {
          tb.X8(p0, 601, "[LiveGiftFeedBasePresenter][showMagicGiftEffects]mergeKey:"+p0.b().mMergeKey);
       }
       return (b ^ 0x01);
    }
}
