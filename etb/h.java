package etb.h;
import lnc.c3$a;
import etb.n;
import com.yxcorp.gifshow.notice.box.event.NoticeBoxSettingEvent;
import java.lang.Object;
import com.yxcorp.gifshow.notice.box.data.NoticeBoxPlateSetting;
import java.util.Objects;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;

public final class h implements c3$a	// class@0027f7
{
    public final n a;
    public final NoticeBoxSettingEvent b;

    public void h(n p0,NoticeBoxSettingEvent p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void apply(Object p0){
       h ta = this.a;
       Objects.requireNonNull(ta);
       boolean b = true;
       if (this.b.mIsMute == b) {
       }else {
          b = false;
       }
       p0.mIsMuted = b;
       p0.notifyChanged();
       ta.P8();
       return;
    }
}
