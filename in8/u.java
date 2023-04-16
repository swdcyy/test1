package in8.u;
import in8.m;
import com.facebook.react.bridge.ReadableMap;
import hn8.b;
import java.lang.String;
import com.facebook.react.bridge.ReadableType;
import java.lang.Double;
import java.lang.IllegalStateException;
import java.lang.Object;

public class u extends m	// class@0026ee
{
    public Object a;

    public void u(int p0,ReadableMap p1,b p2){
       super(p0, p1, p2);
       Object obj = null;
       if (p1 == null || !p1.hasKey("value")) {
          this.a = obj;
          return;
       }else {
          ReadableType type = p1.getType("value");
          if (type == ReadableType.String) {
             this.a = p1.getString("value");
          }else if(type == ReadableType.Number){
             this.a = Double.valueOf(p1.getDouble("value"));
          }else if(type == ReadableType.Null){
             this.a = obj;
          }else {
             throw new IllegalStateException("Not supported value type. Must be boolean, number or string");
          }
          return;
       }
    }
    public void b(Object p0){
       this.a = p0;
       this.forceUpdateMemoizedValue(p0);
    }
    public Object evaluate(){
       return this.a;
    }
}
