package com.eclipsesource.v8.utils.MemoryManager$MemoryManagerReferenceHandler;
import com.eclipsesource.v8.ReferenceHandler;
import com.eclipsesource.v8.utils.MemoryManager;
import java.lang.Object;
import com.eclipsesource.v8.utils.MemoryManager$1;
import com.eclipsesource.v8.V8Value;
import java.util.ArrayList;
import java.util.Iterator;

public class MemoryManager$MemoryManagerReferenceHandler implements ReferenceHandler	// class@001015
{
    public final MemoryManager this$0;

    public void MemoryManager$MemoryManagerReferenceHandler(MemoryManager p0){
       this.this$0 = p0;
       super();
    }
    public void MemoryManager$MemoryManagerReferenceHandler(MemoryManager p0,MemoryManager$1 p1){
       super(p0);
    }
    public void v8HandleCreated(V8Value p0){
       this.this$0.references.add(p0);
    }
    public void v8HandleDisposed(V8Value p0){
       MemoryManager$MemoryManagerReferenceHandler tthis$0 = this.this$0;
       if (tthis$0.releasing == null) {
          Iterator iterator = tthis$0.references.iterator();
          while (iterator.hasNext()) {
             if (iterator.next() == p0) {
                iterator.remove();
                break ;
             }
          }
       }
       return;
    }
}
