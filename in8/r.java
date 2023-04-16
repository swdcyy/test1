package in8.r;
import in8.m;
import com.facebook.react.bridge.ReadableMap;
import hn8.b;
import java.lang.String;
import hn8.a;
import java.lang.Object;
import in8.u;
import java.lang.Class;

public class r extends m	// class@0026e7
{
    public int a;
    public int b;

    public void r(int p0,ReadableMap p1,b p2){
       super(p0, p1, p2);
       this.a = a.a(p1, "what", "Reanimated: First argument passed to set node is either of wrong type or is missing.");
       this.b = a.a(p1, "value", "Reanimated: Second argument passed to set node is either of wrong type or is missing.");
    }
    public Object evaluate(){
       Object obj = this.mNodesManager.b(this.b);
       this.mNodesManager.a(this.a, u.class).b(obj);
       return obj;
    }
}
