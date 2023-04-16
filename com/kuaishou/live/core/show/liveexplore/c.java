package com.kuaishou.live.core.show.liveexplore.c;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kuaishou.live.core.show.liveexplore.LiveExploreChannelDetailActivity$a;
import com.kwai.framework.model.channel.HotChannel;
import com.kuaishou.live.core.show.liveexplore.a;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.live.core.show.liveexplore.b;
import mm8.a;

public final class c implements b	// class@000c76
{

    public void c(){
       super();
    }
    public void a(a p0,Object p1){
       HotChannel hotChannel = HotChannel.class;
       a uoa = new a(this, p1);
       try{
          p0.h(hotChannel, uoa);
          p0.h(LiveExploreChannelDetailActivity$a.class, new b(this, p1));
          return;
       }catch(java.lang.IllegalArgumentException e0){
       }
    }
    public a b(Object p0){
       return a.a(this, p0);
    }
    public b init(){
       return a.b(this);
    }
}
