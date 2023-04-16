package com.kwai.video.wayne.player.InstancePriority;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class InstancePriority extends Enum	// class@000ca1
{
    public final int priority;
    public static final InstancePriority[] $VALUES;
    public static final InstancePriority PriorityBackground;
    public static final InstancePriority PriorityDecode;
    public static final InstancePriority PriorityFocus;
    public static final InstancePriority PriorityForeground;

    static {
       InstancePriority instancePrio1;
       InstancePriority[] instancePrio = new InstancePriority[]{instancePrio1,instancePrio1,instancePrio1,instancePrio1};
       instancePrio1 = new InstancePriority("PriorityFocus", 0, 0);
       InstancePriority.PriorityFocus = instancePrio1;
       instancePrio1 = new InstancePriority("PriorityForeground", 1, 1);
       InstancePriority.PriorityForeground = instancePrio1;
       instancePrio1 = new InstancePriority("PriorityDecode", 2, 3);
       InstancePriority.PriorityDecode = instancePrio1;
       instancePrio1 = new InstancePriority("PriorityBackground", 3, 4);
       InstancePriority.PriorityBackground = instancePrio1;
       InstancePriority.$VALUES = instancePrio;
    }
    public void InstancePriority(String p0,int p1,int p2){
       super(p0, p1);
       this.priority = p2;
    }
    public static InstancePriority valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, InstancePriority.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(InstancePriority.class, p0);
    }
    public static InstancePriority[] values(){
       Object obj = PatchProxy.apply(null, null, InstancePriority.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return InstancePriority.$VALUES.clone();
    }
    public final int getPriority(){
       return this.priority;
    }
}
