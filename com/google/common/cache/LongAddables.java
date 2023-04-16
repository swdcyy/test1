package com.google.common.cache.LongAddables;
import com.google.common.cache.LongAdder;
import com.google.common.cache.LongAddables$a;
import com.google.common.cache.LongAddables$b;
import pk.d;
import java.lang.Object;
import ok.x;

public final class LongAddables	// class@001779
{
    public static final x a;

    static {
       LongAdder longAdder = new LongAdder();
       LongAddables$a uoa = new LongAddables$a();
       LongAddables.a = uoa;
    }
    public static d a(){
       return LongAddables.a.get();
    }
}
