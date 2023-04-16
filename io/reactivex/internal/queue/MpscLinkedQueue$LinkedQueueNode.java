package io.reactivex.internal.queue.MpscLinkedQueue$LinkedQueueNode;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;

public final class MpscLinkedQueue$LinkedQueueNode extends AtomicReference	// class@001924
{
    public Object value;
    public static final long serialVersionUID = 0x215dab4a52b27c94;

    public void MpscLinkedQueue$LinkedQueueNode(){
       super();
    }
    public void MpscLinkedQueue$LinkedQueueNode(Object p0){
       super();
       this.spValue(p0);
    }
    public Object getAndNullValue(){
       this.spValue(null);
       return this.lpValue();
    }
    public Object lpValue(){
       return this.value;
    }
    public MpscLinkedQueue$LinkedQueueNode lvNext(){
       return this.get();
    }
    public void soNext(MpscLinkedQueue$LinkedQueueNode p0){
       this.lazySet(p0);
    }
    public void spValue(Object p0){
       this.value = p0;
    }
}
