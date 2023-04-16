package in8.d;
import in8.m;
import com.facebook.react.bridge.ReadableMap;
import hn8.b;
import java.lang.String;
import com.facebook.react.bridge.ReadableArray;
import hn8.f;
import java.lang.Object;
import in8.p;
import hn8.e;
import java.lang.StringBuilder;
import java.lang.Class;
import java.lang.Integer;
import java.util.Stack;

public class d extends m	// class@0026b7
{
    public String a;
    public final int b;
    public final int[] c;
    public final int[] d;

    public void d(int p0,ReadableMap p1,b p2){
       super(p0, p1, p2);
       this.b = p1.getInt("what");
       this.d = f.a(p1.getArray("params"));
       this.c = f.a(p1.getArray("args"));
    }
    public Object evaluate(){
       b p;
       p op = p.class;
       p = this.mNodesManager.p;
       this.a = p.b;
       p.b = this.mNodesManager.p.b+'/'+String.valueOf(this.mNodeID);
       int i = 0;
       int i1 = 0;
       d td = this.d;
       while (i1 < td.length) {
          p op1 = this.mNodesManager.a(td[i1], op);
          op1.c = this.a;
          op1.b.push(Integer.valueOf(this.c[i1]));
          i1 = i1 + 1;
       }
       Object obj = this.mNodesManager.a(this.b, m.class).value();
       td = this.d;
       while (i < td.length) {
          this.mNodesManager.a(td[i], op).b.pop();
          i = i + 1;
       }
       this.mNodesManager.p.b = this.a;
       return obj;
    }
}
