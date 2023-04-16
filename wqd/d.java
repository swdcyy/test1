package wqd.d;
import java.lang.Object;
import wqd.e;

public interface abstract d	// class@00290a
{

    boolean compareAndSet(Object p0,Object p1);
    Object get();
    Object getAndRemove();
    Object getAndSet(Object p0);
    e key();
    void remove();
    void set(Object p0);
    Object setIfAbsent(Object p0);
}
