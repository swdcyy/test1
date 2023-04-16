package cy9.c;
import n3d.a;
import java.lang.Runnable;
import java.lang.Object;
import android.content.Intent;

public final class c implements a	// class@001e33
{
    public final Runnable b;

    public void c(Runnable p0){
       this.b = p0;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       this.b.run();
    }
}
