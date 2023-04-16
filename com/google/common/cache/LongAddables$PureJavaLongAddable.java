package com.google.common.cache.LongAddables$PureJavaLongAddable;
import pk.d;
import java.util.concurrent.atomic.AtomicLong;
import com.google.common.cache.LongAddables$a;

public final class LongAddables$PureJavaLongAddable extends AtomicLong implements d	// class@001776
{

    public void LongAddables$PureJavaLongAddable(){
       super();
    }
    public void LongAddables$PureJavaLongAddable(LongAddables$a p0){
       super();
    }
    public void add(long p0){
       this.getAndAdd(p0);
    }
    public void increment(){
       this.getAndIncrement();
    }
    public long sum(){
       return this.get();
    }
}
