package bd4.f;
import erd.g;
import bd4.g;
import java.lang.Object;
import com.yxcorp.gifshow.feed.response.PhotoResponse;
import java.util.List;
import com.kuaishou.merchant.transaction.base.detail.guesslike.GuessLikePhotoListHolder;

public final class f implements g	// class@00038b
{
    public final g b;

    public void f(g p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       f tb = this.b;
       tb.C.updatePhotoModelInfo(p0.getItems());
       tb.X8();
    }
}
