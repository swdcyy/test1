package com.eclipsesource.v8.debug.EventData;
import com.eclipsesource.v8.Releasable;
import com.eclipsesource.v8.V8Object;
import java.lang.Object;
import com.eclipsesource.v8.V8Value;

public class EventData implements Releasable	// class@000ff4
{
    public V8Object v8Object;

    public void EventData(V8Object p0){
       super();
       this.v8Object = p0.twin();
    }
    public void close(){
       if (!this.v8Object.isReleased()) {
          this.v8Object.close();
       }
       return;
    }
    public void release(){
       this.close();
    }
}
