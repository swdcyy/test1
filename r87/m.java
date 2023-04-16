package r87.m;
import java.lang.Object;
import java.util.LinkedList;

public class m	// class@002324
{
    public final LinkedList a;
    public static final m b;

    static {
       m.b = new m();
    }
    public void m(){
       super();
       this.a = new LinkedList();
    }
    public static m a(){
       return m.b;
    }
    public LinkedList b(){
       m ta = this.a;
       _monitor_enter(ta);
       if (this.a.isEmpty()) {
          _monitor_exit(ta);
          return new LinkedList();
       }else {
          _monitor_exit(ta);
          return this.a.pop();
       }
    }
}
