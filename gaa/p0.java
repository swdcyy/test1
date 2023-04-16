package gaa.p0;
import n3d.a;
import gaa.w0;
import java.lang.Object;
import android.content.Intent;
import nm6.d;

public final class p0 implements a	// class@002444
{
    public final w0 b;

    public void p0(w0 p0){
       this.b = p0;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       p0 tb = this.b;
       if (tb.e.a() != null) {
          tb.e.a().onActivityCallback(p0, p1, p2);
       }
       return;
    }
}
