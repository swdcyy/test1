package in8.s;
import in8.m;
import com.facebook.react.bridge.ReadableMap;
import hn8.b;
import java.lang.String;
import java.util.Map;
import hn8.f;
import java.lang.Object;
import com.facebook.react.bridge.JavaOnlyMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Integer;
import java.lang.Class;
import in8.t;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.ReadableArray;
import java.lang.Double;
import java.lang.IllegalStateException;

public class s extends m	// class@0026e8
{
    public final Map a;

    public void s(int p0,ReadableMap p1,b p2){
       super(p0, p1, p2);
       this.a = f.b(p1.getMap("style"));
    }
    public Object evaluate(){
       JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
       Iterator iterator = this.a.entrySet().iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return javaOnlyMap;
          }
          Map$Entry uEntry = iterator.next();
          m om = this.mNodesManager.a(uEntry.getValue().intValue(), m.class);
          if (om instanceof t) {
             javaOnlyMap.putArray(uEntry.getKey(), om.value());
          }else {
             Object obj = om.value();
             if (obj instanceof Double) {
                javaOnlyMap.putDouble(uEntry.getKey(), obj.doubleValue());
             }else if(obj instanceof String){
                javaOnlyMap.putString(uEntry.getKey(), obj);
             }else {
                break ;
             }
          }
       }
       throw new IllegalStateException("Wrong style form");
    }
}
