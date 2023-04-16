package in8.c;
import in8.m;
import com.facebook.react.bridge.ReadableMap;
import hn8.b;
import java.lang.String;
import com.facebook.react.bridge.ReadableArray;
import hn8.f;
import java.lang.Object;
import java.lang.Class;

public class c extends m	// class@0026b6
{
    public final int[] a;

    public void c(int p0,ReadableMap p1,b p2){
       super(p0, p1, p2);
       this.a = f.a(p1.getArray("block"));
    }
    public Object evaluate(){
       m om = null;
       int i = 0;
       c ta = this.a;
       while (i < ta.length) {
          om = this.mNodesManager.a(ta[i], m.class).value();
          i = i + 1;
       }
       return om;
    }
}
