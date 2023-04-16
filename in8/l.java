package in8.l;
import in8.m;
import com.facebook.react.bridge.ReadableMap;
import hn8.b;
import java.lang.String;
import com.facebook.react.bridge.ReadableArray;
import hn8.f;
import java.lang.Object;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.Arguments;
import java.lang.Class;
import java.lang.Double;
import com.facebook.react.bridge.WritableMap;

public class l extends m	// class@0026c2
{
    public final int[] a;

    public void l(int p0,ReadableMap p1,b p2){
       super(p0, p1, p2);
       this.a = f.a(p1.getArray("input"));
    }
    public Object evaluate(){
       WritableArray writableArra = Arguments.createArray();
       int i = 0;
       l ta = this.a;
       while (i < ta.length) {
          m om = this.mNodesManager.a(ta[i], m.class);
          if (om.value() == null) {
             writableArra.pushNull();
          }else {
             Object obj = om.value();
             if (obj instanceof String) {
                writableArra.pushString(obj);
             }else {
                writableArra.pushDouble(om.doubleValue().doubleValue());
             }
          }
          i = i + 1;
       }
       WritableMap writableMap = Arguments.createMap();
       writableMap.putInt("id", this.mNodeID);
       writableMap.putArray("args", writableArra);
       this.mNodesManager.e("onReanimatedCall", writableMap);
       return m.ZERO;
    }
}
