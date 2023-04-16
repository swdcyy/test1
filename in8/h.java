package in8.h;
import in8.m;
import com.facebook.react.bridge.ReadableMap;
import hn8.b;
import java.lang.String;
import hn8.a;
import java.lang.Object;
import java.lang.Number;

public class h extends m	// class@0026be
{
    public final int a;
    public final int b;
    public final int c;

    public void h(int p0,ReadableMap p1,b p2){
       super(p0, p1, p2);
       this.a = a.a(p1, "cond", "Reanimated: First argument passed to cond node is either of wrong type or is missing.");
       this.b = a.a(p1, "ifBlock", "Reanimated: Second argument passed to cond node is either of wrong type or is missing.");
       String str = "elseBlock";
       str = (p1.hasKey(str))? a.a(p1, str, "Reanimated: Second argument passed to cond node is either of wrong type or is missing."): -1;
       this.c = str;
       return;
    }
    public Object evaluate(){
       Double uDouble;
       h obj = this.mNodesManager.b(this.a);
       if (obj instanceof Number && obj.doubleValue()) {
          obj = this.b;
          uDouble = (obj != -1)? this.mNodesManager.b(obj): m.ZERO;
          return uDouble;
       }else {
          obj = this.c;
          uDouble = (obj != -1)? this.mNodesManager.b(obj): m.ZERO;
          return uDouble;
       }
    }
}
