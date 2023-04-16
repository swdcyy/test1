package b3d.w;
import n3d.a;
import java.lang.Object;
import android.content.Intent;

public final class w implements a	// class@000348
{
    public final a b;

    public void w(a p0){
       this.b = p0;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       w tb = this.b;
       if (tb != null) {
          tb.onActivityCallback(p0, p1, p2);
       }
       return;
    }
}
