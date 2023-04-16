package com.kwai.feature.api.live.service.show.share.event.LiveShareStatusEvent;
import com.kwai.feature.api.live.service.show.share.event.LiveShareStatusEvent$LiveShareStatus;
import java.lang.Object;
import java.lang.String;
import com.kwai.feature.api.live.service.show.share.LiveShareResponse;

public class LiveShareStatusEvent	// class@001021
{
    public LiveShareStatusEvent$LiveShareStatus a;
    public Object b;
    public String c;
    public LiveShareResponse d;
    public LiveShareStatusEvent$a e;

    public void LiveShareStatusEvent(LiveShareStatusEvent$LiveShareStatus p0,Object p1,String p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public void LiveShareStatusEvent(LiveShareStatusEvent$LiveShareStatus p0,Object p1,String p2,LiveShareResponse p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
}
