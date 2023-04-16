package b3d.x;
import n3d.a;
import java.lang.Object;
import android.content.Intent;

public final class x implements a	// class@000349
{
    public final a b;

    public void x(a p0){
       this.b = p0;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       x tb = this.b;
       if (tb != null) {
          tb.onActivityCallback(p0, p1, p2);
       }
       return;
    }
}
