package in8.i;
import in8.m;
import com.facebook.react.bridge.ReadableMap;
import hn8.b;
import java.lang.String;
import hn8.a;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import java.lang.Object;
import java.lang.Class;

public class i extends m	// class@0026bf
{
    public final String a;
    public final int b;

    public void i(int p0,ReadableMap p1,b p2){
       super(p0, p1, p2);
       try{
          String str = "message";
          this.a = p1.getString(str);
          this.b = a.a(p1, "value", "Reanimated: Second argument passed to debug node is either of wrong type or is missing.");
          return;
       }catch(com.facebook.react.bridge.NoSuchKeyException e0){
          throw new JSApplicationCausedNativeException("Reanimated: First argument passed to debug node is either of wrong type or is missing.");
       }
    }
    public Object evaluate(){
       Object obj = this.mNodesManager.a(this.b, m.class).value();
       Object[] objArray = new Object[]{this.a,obj};
       String.format("%s %s", objArray);
       return obj;
    }
}
