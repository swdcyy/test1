package com.kwai.video.wayne.player.MediaPlayerInstanceRecord;
import com.kwai.video.wayne.player.OnPlayerInstanceHandler;
import com.kwai.video.wayne.player.InstancePriority;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class MediaPlayerInstanceRecord	// class@000ca8
{
    public final int id;
    public final OnPlayerInstanceHandler instanceHandler;
    public InstancePriority priority;

    public void MediaPlayerInstanceRecord(int p0,OnPlayerInstanceHandler p1,InstancePriority p2){
       a.p(p1, "instanceHandler");
       a.p(p2, "priority");
       super();
       this.id = p0;
       this.instanceHandler = p1;
       this.priority = p2;
    }
    public final int getId(){
       return this.id;
    }
    public final OnPlayerInstanceHandler getInstanceHandler(){
       return this.instanceHandler;
    }
    public final InstancePriority getPriority(){
       return this.priority;
    }
    public final void setPriority(InstancePriority p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MediaPlayerInstanceRecord.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.priority = p0;
       return;
    }
}
