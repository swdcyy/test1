package com.kwai.component.taskdispatcher.logger.CapacityQueue;
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.Integer;

public final class CapacityQueue extends LinkedList	// class@000b8b
{
    public final int maxSize;

    public void CapacityQueue(int p0){
       super();
       this.maxSize = p0;
    }
    public boolean add(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CapacityQueue.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.size() >= this.maxSize) {
          this.pop();
       }
       return super.add(p0);
    }
    public int getSize(){
       Object obj = PatchProxy.apply(null, this, CapacityQueue.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return super.size();
    }
    public boolean offer(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CapacityQueue.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.add(p0);
    }
    public final Object remove(int p0){
       if (PatchProxy.isSupport(CapacityQueue.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, CapacityQueue.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.removeAt(p0);
    }
    public Object removeAt(int p0){
       if (PatchProxy.isSupport(CapacityQueue.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, CapacityQueue.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return super.remove(p0);
    }
    public final int size(){
       Object obj = PatchProxy.apply(null, this, CapacityQueue.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.getSize();
    }
}
