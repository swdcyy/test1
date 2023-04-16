package com.kuaishou.live.core.show.screenrecord.g;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import ij2.d0;
import com.kuaishou.live.core.show.screenrecord.LiveAudienceScreenRecordPreviewFragment;
import java.lang.Object;
import com.kuaishou.live.core.show.screenrecord.LiveAudienceScreenRecordContainerFragment$c;

public class g extends Accessor	// class@000fe3
{
    public final LiveAudienceScreenRecordPreviewFragment c;
    public final d0 d;

    public void g(d0 p0,LiveAudienceScreenRecordPreviewFragment p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.m;
    }
    public void set(Object p0){
       this.c.m = p0;
    }
}
