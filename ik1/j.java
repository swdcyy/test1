package ik1.j;
import erd.g;
import com.kuaishou.live.common.core.component.gift.gift.i;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveUserStatusResponse;
import java.util.Objects;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;

public final class j implements g	// class@00292f
{
    public final i b;

    public void j(i p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       j tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 != null) {
          tb.x = e0.i(p0.mCurrentUserHeadWidget);
          tb.y = e0.i(p0.mCurrentUserHeadWidgetAnimation);
       }
       return;
    }
}
