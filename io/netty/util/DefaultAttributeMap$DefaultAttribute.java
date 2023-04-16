package io.netty.util.DefaultAttributeMap$DefaultAttribute;
import wqd.d;
import java.util.concurrent.atomic.AtomicReference;
import wqd.e;
import java.lang.Object;

public final class DefaultAttributeMap$DefaultAttribute extends AtomicReference implements d	// class@0010dd
{
    public final DefaultAttributeMap$DefaultAttribute head;
    public final e key;
    public DefaultAttributeMap$DefaultAttribute next;
    public DefaultAttributeMap$DefaultAttribute prev;
    public boolean removed;
    public static final long serialVersionUID = 0xdb10c4603a66307d;

    public void DefaultAttributeMap$DefaultAttribute(DefaultAttributeMap$DefaultAttribute p0,e p1){
       super();
       this.head = p0;
       this.key = p1;
    }
    public void DefaultAttributeMap$DefaultAttribute(e p0){
       super();
       this.head = this;
       this.key = p0;
    }
    public final void a(){
       DefaultAttributeMap$DefaultAttribute thead = this.head;
       _monitor_enter(thead);
       DefaultAttributeMap$DefaultAttribute tprev = this.prev;
       if (tprev != null) {
          tprev.next = this.next;
          DefaultAttributeMap$DefaultAttribute tnext = this.next;
          if (tnext != null) {
             tnext.prev = tprev;
          }
          this.prev = null;
          this.next = null;
       }
       _monitor_exit(thead);
       return;
    }
    public Object getAndRemove(){
       this.removed = true;
       this.a();
       return this.getAndSet(null);
    }
    public e key(){
       return this.key;
    }
    public void remove(){
       this.removed = true;
       this.set(null);
       this.a();
    }
    public Object setIfAbsent(Object p0){
       Object obj = null;
       while (!this.compareAndSet(obj, p0)) {
          obj = this.get();
          if (obj != null) {
             break ;
          }
       }
       return obj;
    }
}
