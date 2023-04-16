package gaa.a0;
import n3d.a;
import gaa.h0;
import java.lang.Object;
import android.content.Intent;
import nm6.d;

public final class a0 implements a	// class@002424
{
    public final h0 b;

    public void a0(h0 p0){
       this.b = p0;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       a0 tb = this.b;
       if (tb.g.a() != null) {
          tb.g.a().onActivityCallback(p0, p1, p2);
       }
       return;
    }
}
