package in8.k;
import in8.m;
import com.facebook.react.bridge.ReadableMap;
import hn8.b;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;

public class k extends m	// class@0026c1
{
    public final int a;

    public void k(int p0,ReadableMap p1,b p2){
       super(p0, p1, p2);
       this.a = p1.getInt("what");
    }
    public Object evaluate(){
       return this.mNodesManager.a(this.a, m.class).value();
    }
}
