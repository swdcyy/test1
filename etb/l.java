package etb.l;
import msd.l;
import com.yxcorp.gifshow.notice.box.event.NoticeBoxSettingEvent;
import java.lang.Object;
import com.yxcorp.gifshow.notice.box.data.NoticeBoxPlateSetting;
import java.lang.Boolean;

public final class l implements l	// class@002802
{
    public final NoticeBoxSettingEvent b;

    public void l(NoticeBoxSettingEvent p0){
       this.b = p0;
    }
    public final Object invoke(Object p0){
       boolean b = (p0.mPlateId == this.b.mPlateId)? true: false;
       return Boolean.valueOf(b);
    }
}
