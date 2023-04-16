package btd.m;
import btd.b;
import java.util.concurrent.TimeUnit;
import java.lang.System;
import java.lang.String;

public final class m extends b	// class@0002ed
{
    public static final m c;

    static {
       m.c = new m();
    }
    public void m(){
       super(TimeUnit.NANOSECONDS);
    }
    public long c(){
       return System.nanoTime();
    }
    public String toString(){
       return "TimeSource\(System.nanoTime\(\)\)";
    }
}
