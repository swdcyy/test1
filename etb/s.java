package etb.s;
import erd.g;
import etb.v;
import java.lang.Object;
import ysb.c;
import java.util.Objects;
import com.yxcorp.gifshow.notice.box.data.NoticeBoxPlateSetting;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;

public final class s implements g	// class@00280b
{
    public final v b;

    public void s(v p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       s tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.mResult == 1) {
          p0 = tb.s;
          p0.mIsMuted = p0.mIsMuted ^ 1;
          p0.notifyChanged();
       }
       return;
    }
}
