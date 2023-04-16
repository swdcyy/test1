package io.netty.util.internal.PlatformDependent$AtomicLongCounter;
import zqd.e;
import java.util.concurrent.atomic.AtomicLong;
import io.netty.util.internal.PlatformDependent$a;

public final class PlatformDependent$AtomicLongCounter extends AtomicLong implements e	// class@00111a
{
    public static final long serialVersionUID = 0x388c80422f257dc9;

    public void PlatformDependent$AtomicLongCounter(){
       super();
    }
    public void PlatformDependent$AtomicLongCounter(PlatformDependent$a p0){
       super();
    }
    public void add(long p0){
       this.addAndGet(p0);
    }
    public void decrement(){
       this.decrementAndGet();
    }
    public void increment(){
       this.incrementAndGet();
    }
    public long value(){
       return this.get();
    }
}
