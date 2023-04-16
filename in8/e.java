package in8.e;
import hn8.b$c;
import in8.m;
import com.facebook.react.bridge.ReadableMap;
import hn8.b;
import java.lang.Object;
import java.lang.Double;

public class e extends m implements b$c	// class@0026b8
{
    public boolean a;

    public void e(int p0,ReadableMap p1,b p2){
       super(p0, p1, p2);
    }
    public void a(){
       if (this.a != null) {
          this.markUpdated();
          this.mNodesManager.d(this);
       }
       return;
    }
    public void b(){
       if (this.a != null) {
          return;
       }
       this.a = true;
       this.mNodesManager.d(this);
       return;
    }
    public void d(){
       this.a = false;
    }
    public Object evaluate(){
       return Double.valueOf(this.mNodesManager.o);
    }
}
