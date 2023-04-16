package com.eclipsesource.v8.utils.MemoryManager;
import com.eclipsesource.v8.V8;
import java.lang.Object;
import java.util.ArrayList;
import com.eclipsesource.v8.utils.MemoryManager$MemoryManagerReferenceHandler;
import com.eclipsesource.v8.utils.MemoryManager$1;
import com.eclipsesource.v8.ReferenceHandler;
import java.lang.IllegalStateException;
import java.lang.String;
import com.eclipsesource.v8.V8Value;
import com.eclipsesource.v8.V8Locker;
import java.util.Iterator;

public class MemoryManager	// class@001016
{
    public MemoryManager$MemoryManagerReferenceHandler memoryManagerReferenceHandler;
    public ArrayList references;
    public boolean released;
    public boolean releasing;
    public V8 v8;

    public void MemoryManager(V8 p0){
       super();
       this.references = new ArrayList();
       this.releasing = false;
       this.released = false;
       this.v8 = p0;
       MemoryManager$MemoryManagerReferenceHandler memoryManage = new MemoryManager$MemoryManagerReferenceHandler(this, null);
       this.memoryManagerReferenceHandler = memoryManage;
       p0.addReferenceHandler(memoryManage);
    }
    public final void checkReleased(){
       if (this.released == null) {
          return;
       }
       throw new IllegalStateException("Memory manager released");
    }
    public int getObjectReferenceCount(){
       this.checkReleased();
       return this.references.size();
    }
    public boolean isReleased(){
       return this.released;
    }
    public void persist(V8Value p0){
       this.v8.getLocker().checkThread();
       this.checkReleased();
       this.references.remove(p0);
    }
    public void release(){
       this.v8.getLocker().checkThread();
       if (this.released != null) {
          return;
       }
       this.releasing = true;
       Iterator iterator = this.references.iterator();
       while (iterator.hasNext()) {
          iterator.next().close();
       }
       this.v8.removeReferenceHandler(this.memoryManagerReferenceHandler);
       this.references.clear();
       this.releasing = false;
       this.released = true;
       return;
    }
}
