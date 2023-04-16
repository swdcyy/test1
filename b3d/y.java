package b3d.y;
import n3d.a;
import java.lang.Object;
import android.content.Intent;

public final class y implements a	// class@00034a
{
    public final a b;

    public void y(a p0){
       this.b = p0;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       y tb = this.b;
       if (tb != null) {
          tb.onActivityCallback(p0, p1, p2);
       }
       return;
    }
}
