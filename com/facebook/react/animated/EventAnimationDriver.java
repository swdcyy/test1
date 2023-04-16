package com.facebook.react.animated.EventAnimationDriver;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import java.util.List;
import sd.s;
import java.lang.Object;
import java.lang.String;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.ReadableMap;
import java.lang.IllegalArgumentException;
import com.facebook.react.bridge.WritableArray;
import java.lang.RuntimeException;

public class EventAnimationDriver implements RCTEventEmitter	// class@00117f
{
    public List mEventPath;
    public s mValueNode;

    public void EventAnimationDriver(List p0,s p1){
       super();
       this.mEventPath = p0;
       this.mValueNode = p1;
    }
    public void receiveEvent(int p0,String p1,WritableMap p2){
       if (p2 == null) {
          throw new IllegalArgumentException("Native animated events must have event data.");
       }
       p0 = 0;
       int i = this.mEventPath.size() - 1;
       while (p0 < i) {
          ReadableMap map = p2.getMap(this.mEventPath.get(p0));
          p0++;
       }
       EventAnimationDriver tmEventPath = this.mEventPath;
       p0.f = p2.getDouble(tmEventPath.get((tmEventPath.size() - 1)));
       return;
    }
    public void receiveTouches(String p0,WritableArray p1,WritableArray p2){
       throw new RuntimeException("receiveTouches is not support by native animated events");
    }
}
