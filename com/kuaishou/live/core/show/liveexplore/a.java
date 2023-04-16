package com.kuaishou.live.core.show.liveexplore.a;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.live.core.show.liveexplore.c;
import com.kuaishou.live.core.show.liveexplore.LiveExploreChannelDetailActivity$a;
import java.lang.Object;
import com.kwai.framework.model.channel.HotChannel;

public class a extends Accessor	// class@000c74
{
    public final LiveExploreChannelDetailActivity$a c;
    public final c d;

    public void a(c p0,LiveExploreChannelDetailActivity$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.b;
    }
    public void set(Object p0){
       this.c.b = p0;
    }
}
