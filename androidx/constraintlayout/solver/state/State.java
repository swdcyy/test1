package androidx.constraintlayout.solver.state.State;
import java.lang.Integer;
import java.lang.Object;
import java.util.HashMap;
import androidx.constraintlayout.solver.state.a;
import g1.b;

public class State	// class@000686
{
    public HashMap a;
    public HashMap b;
    public final a c;
    public int d;
    public static final Integer e;

    static {
       State.e = Integer.valueOf(0);
    }
    public void State(){
       super();
       this.a = new HashMap();
       this.b = new HashMap();
       a uoa = new a(this);
       this.c = uoa;
       this.d = 0;
       this.a.put(State.e, uoa);
    }
    public b a(Object p0){
       return this.a.get(p0);
    }
}
