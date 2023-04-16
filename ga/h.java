package ga.h;
import ea.e;
import ga.k;
import java.lang.Object;
import android.view.View;
import java.util.List;
import ga.k$a;
import java.lang.String;
import ga.k$b;

public final class h implements e	// class@002065
{
    public final k a;

    public void h(k p0){
       this.a = p0;
    }
    public final void a(int p0,int p1,int p2,View p3){
       h ta = this.a;
       ta.n = true;
       k$a c = ta.c.get(p0).get(p1).c;
       object oobject = (ta.b.get(p0).b).split("#")[1];
       object oobject1 = (ta.c.get(p0).get(p1).b).split("#")[1];
       k g = ta.g;
       String str = "--";
       if (oobject.equals(str)) {
          oobject = "";
       }
       if (oobject1.equals(str)) {
          oobject1 = "";
       }
       g.a(c, oobject, oobject1);
       return;
    }
}
