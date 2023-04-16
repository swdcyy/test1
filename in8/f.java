package in8.f;
import in8.m;
import com.facebook.react.bridge.ReadableMap;
import hn8.b;
import java.lang.String;
import hn8.a;
import java.lang.Double;
import java.lang.Class;
import java.lang.Object;

public abstract class f extends m	// class@0026bc
{
    public int a;

    public void f(int p0,ReadableMap p1,b p2){
       super(p0, p1, p2);
       this.a = a.a(p1, "clock", "Reanimated: Argument passed to clock node is either of wrong type or is missing.");
    }
    public abstract Double b(m p0);
    public Double evaluate(){
       return this.b(this.mNodesManager.a(this.a, m.class));
    }
    public Object evaluate(){
       return this.evaluate();
    }
}
