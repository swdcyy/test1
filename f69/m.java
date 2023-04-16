package f69.m;
import n3d.a;
import java.lang.Runnable;
import java.lang.Object;
import android.content.Intent;

public final class m implements a	// class@0022bc
{
    public final Runnable b;

    public void m(Runnable p0){
       this.b = p0;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       this.b.run();
    }
}
