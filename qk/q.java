package qk.q;
import java.util.concurrent.ConcurrentMap;
import qk.r;
import java.lang.Object;
import java.util.Map;

public abstract class q extends r implements ConcurrentMap	// class@002a13
{

    public void q(){
       super();
    }
    public Object delegate(){
       return this.delegate();
    }
    public Map delegate(){
       return this.delegate();
    }
    public abstract ConcurrentMap delegate();
    public Object putIfAbsent(Object p0,Object p1){
       return this.delegate().putIfAbsent(p0, p1);
    }
    public boolean remove(Object p0,Object p1){
       return this.delegate().remove(p0, p1);
    }
    public Object replace(Object p0,Object p1){
       return this.delegate().replace(p0, p1);
    }
    public boolean replace(Object p0,Object p1,Object p2){
       return this.delegate().replace(p0, p1, p2);
    }
}
