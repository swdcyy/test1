package com.kuaishou.live.effect.rescue.LiveEffectTaskSurvivorPool$FIFOTaskSurvivorCache;
import java.util.LinkedList;
import com.kuaishou.live.effect.rescue.LiveEffectTaskSurvivorPool$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import rz2.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.List;
import java.lang.Long;
import java.util.ArrayList;
import java.util.Iterator;
import pz2.c;
import pz2.a;

public class LiveEffectTaskSurvivorPool$FIFOTaskSurvivorCache extends LinkedList	// class@001b1a
{
    public final LiveEffectTaskSurvivorPool$a mCallback;
    public final int mMaxSize;

    public void LiveEffectTaskSurvivorPool$FIFOTaskSurvivorCache(int p0,LiveEffectTaskSurvivorPool$a p1){
       super();
       this.mMaxSize = p0;
       this.mCallback = p1;
    }
    public final void b(int p0,int p1){
       if (PatchProxy.isSupport(LiveEffectTaskSurvivorPool$FIFOTaskSurvivorCache.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, LiveEffectTaskSurvivorPool$FIFOTaskSurvivorCache.class, "5")) {
          return;
       }
       while (this.size() > p0 && !this.isEmpty()) {
          this.mCallback.a(this.removeFirst(), p1);
       }
       return;
    }
    public boolean dequeue(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveEffectTaskSurvivorPool$FIFOTaskSurvivorCache.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.mCallback.a(p0, 1);
       return this.remove(p0);
    }
    public List dequeueTasksByMagicFaceId(long p0){
       ArrayList obj;
       if (PatchProxy.isSupport(LiveEffectTaskSurvivorPool$FIFOTaskSurvivorCache.class)) {
          obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, LiveEffectTaskSurvivorPool$FIFOTaskSurvivorCache.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ArrayList();
       Iterator iterator = this.iterator();
       while (iterator.hasNext()) {
          a uoa = iterator.next();
          if (!uoa.c().b() - p0) {
             iterator.remove();
             this.mCallback.a(uoa, 2);
             obj.add(uoa);
          }
       }
       return obj;
    }
    public void enqueue(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveEffectTaskSurvivorPool$FIFOTaskSurvivorCache.class, "1")) {
          return;
       }
       this.addLast(p0);
       this.b(this.mMaxSize, 4);
       return;
    }
    public void evictAll(){
       if (PatchProxy.applyVoid(null, this, LiveEffectTaskSurvivorPool$FIFOTaskSurvivorCache.class, "4")) {
          return;
       }
       this.b(-1, 3);
       return;
    }
}
