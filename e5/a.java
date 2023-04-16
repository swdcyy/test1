package e5.a;
import e5.a$a;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import android.view.View;
import android.graphics.Rect;
import java.lang.Boolean;

public class a	// class@001efe
{
    public e a;
    public Map b;
    public View c;
    public Rect d;
    public Map e;
    public Map f;

    public void a(a$a p0){
       super();
       this.a = p0.b;
       this.c = p0.a;
       this.b = p0.c;
       this.e = new HashMap();
       this.f = new HashMap();
    }
    public Map a(){
       return this.b;
    }
    public Rect b(View p0){
       return this.e.get(p0);
    }
    public boolean c(View p0){
       if (this.f.containsKey(p0)) {
          return this.f.get(p0).booleanValue();
       }
       return false;
    }
}
