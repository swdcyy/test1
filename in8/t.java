package in8.t;
import in8.m;
import com.facebook.react.bridge.ReadableMap;
import hn8.b;
import java.lang.String;
import com.facebook.react.bridge.ReadableArray;
import java.util.ArrayList;
import in8.t$b;
import in8.t$a;
import in8.t$d;
import java.lang.Object;
import in8.t$c;
import com.facebook.react.bridge.ReadableType;
import java.lang.Double;
import java.util.List;
import java.util.Iterator;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.JavaOnlyArray;

public class t extends m	// class@0026ed
{
    public List a;

    public void t(int p0,ReadableMap p1,b p2){
       super(p0, p1, p2);
       ReadableArray array = p1.getArray("transform");
       ArrayList uArrayList = new ArrayList(array.size());
       int i = 0;
       while (i < array.size()) {
          ReadableMap map = array.getMap(i);
          String str = map.getString("property");
          String str1 = "nodeID";
          t$a uoa = null;
          if (map.hasKey(str1)) {
             t$b uob = new t$b(uoa);
             uob.a = str;
             uob.b = map.getInt(str1);
             uArrayList.add(uob);
          }else {
             t$c uoc = new t$c(uoa);
             uoc.a = str;
             str = "value";
             String str2 = (map.getType(str) == ReadableType.String)? map.getString(str): Double.valueOf(map.getDouble(str));
             uoc.b = str2;
             uArrayList.add(uoc);
          }
          i++;
       }
       this.a = uArrayList;
       return;
    }
    public Object evaluate(){
       ArrayList uArrayList = new ArrayList(this.a.size());
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          t$d uod = iterator.next();
          Object[] objArray = new Object[]{uod.a,uod.a(this.mNodesManager)};
          uArrayList.add(JavaOnlyMap.of(objArray));
       }
       return JavaOnlyArray.from(uArrayList);
    }
}
