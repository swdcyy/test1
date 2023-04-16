package com.swmansion.reanimated.nodes.EventNode;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import in8.m;
import com.facebook.react.bridge.ReadableMap;
import hn8.b;
import java.lang.String;
import com.facebook.react.bridge.ReadableArray;
import java.util.List;
import java.util.ArrayList;
import com.swmansion.reanimated.nodes.EventNode$a;
import java.lang.Object;
import java.lang.Double;
import com.facebook.react.bridge.WritableMap;
import java.util.Objects;
import in8.u;
import java.lang.Class;
import java.lang.IllegalArgumentException;
import com.facebook.react.bridge.WritableArray;
import java.lang.RuntimeException;

public class EventNode extends m implements RCTEventEmitter	// class@000c9f
{
    public final List mMapping;

    public void EventNode(int p0,ReadableMap p1,b p2){
       super(p0, p1, p2);
       this.mMapping = EventNode.processMapping(p1.getArray("argMapping"));
    }
    public static List processMapping(ReadableArray p0){
       int i = p0.size();
       ArrayList uArrayList = new ArrayList(i);
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          uArrayList.add(new EventNode$a(p0.getArray(i1)));
       }
       return uArrayList;
    }
    public Double evaluate(){
       return m.ZERO;
    }
    public Object evaluate(){
       return this.evaluate();
    }
    public void receiveEvent(int p0,String p1,WritableMap p2){
       if (p2 == null) {
          throw new IllegalArgumentException("Animated events must have event data.");
       }
       int i = 0;
       while (i < this.mMapping.size()) {
          EventNode$a uoa = this.mMapping.get(i);
          Objects.requireNonNull(uoa);
          ReadableMap readableMap = p2;
          int i1 = 0;
          while (true) {
             Double uDouble = null;
             if (readableMap != null) {
                EventNode$a b = uoa.b;
                int i2 = b.length - 1;
                if (i1 < i2) {
                   object oobject = b[i1];
                   readableMap = (readableMap.hasKey(oobject))? readableMap.getMap(oobject): uDouble;
                   i1 = i1 + 1;
                }else if(readableMap != null){
                   EventNode$a b1 = uoa.b;
                   int i3 = b1.length - 1;
                   object oobject1 = b1[i3];
                   if (readableMap.hasKey(oobject1)) {
                      uDouble = Double.valueOf(readableMap.getDouble(oobject1));
                   }
                }
                if (uDouble != null) {
                   this.mNodesManager.a(uoa.a, u.class).b(uDouble);
                }
                i++;
             }else {
                goto label_0034 ;
             }
          }
          return;
       }
    }
    public void receiveTouches(String p0,WritableArray p1,WritableArray p2){
       throw new RuntimeException("receiveTouches is not support by animated events");
    }
}
