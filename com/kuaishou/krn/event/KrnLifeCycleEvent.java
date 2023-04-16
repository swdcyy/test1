package com.kuaishou.krn.event.KrnLifeCycleEvent;
import com.kuaishou.krn.event.KrnLifeCycleEvent$EventType;
import com.kuaishou.krn.model.LaunchModel;
import java.lang.Object;

public class KrnLifeCycleEvent	// class@000869
{
    public LaunchModel a;
    public KrnLifeCycleEvent$EventType b;

    public void KrnLifeCycleEvent(KrnLifeCycleEvent$EventType p0,LaunchModel p1){
       super();
       this.a = p1;
       this.b = p0;
    }
    public KrnLifeCycleEvent$EventType a(){
       return this.b;
    }
    public LaunchModel b(){
       return this.a;
    }
}
