package com.kuaishou.live.lite.end.b;
import mq5.h;
import com.kuaishou.live.lite.end.LiveLiteEndBizPresenter;
import java.lang.Object;
import com.kwai.feature.api.live.base.service.livestop.LiveAudienceEndReason;
import mq5.g;
import java.util.Objects;
import ua3.a;
import java.lang.String;
import java.lang.Runnable;
import e93.f;

public final class b implements h	// class@0008de
{
    public final LiveLiteEndBizPresenter b;

    public void b(LiveLiteEndBizPresenter p0){
       this.b = p0;
    }
    public void fa(LiveAudienceEndReason p0){
       g.a(this, p0);
    }
    public final void k(){
       b tb = this.b;
       Objects.requireNonNull(tb);
       f.i("onLiveStop", new a(tb), tb);
    }
}
