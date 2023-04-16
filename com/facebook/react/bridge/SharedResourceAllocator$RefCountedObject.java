package com.facebook.react.bridge.SharedResourceAllocator$RefCountedObject;
import com.facebook.react.bridge.SharedResourceAllocator;
import java.lang.Object;
import od.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class SharedResourceAllocator$RefCountedObject	// class@001238
{
    public final Object mObject;
    public int refCount;
    public final SharedResourceAllocator this$0;

    public void SharedResourceAllocator$RefCountedObject(SharedResourceAllocator p0,Object p1){
       this.this$0 = p0;
       super();
       this.mObject = p1;
       this.refCount = 1;
       a.c(p1);
    }
    public Object getAndRef(){
       Object obj = PatchProxy.apply(null, this, SharedResourceAllocator$RefCountedObject.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.refCount = this.refCount + 1;
       a.c(this.mObject);
       return this.mObject;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, SharedResourceAllocator$RefCountedObject.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "RefCountedObject:"+this.refCount+" "+this.mObject;
    }
    public int unRef(){
       int i = this.refCount - 1;
       this.refCount = i;
       return i;
    }
}
