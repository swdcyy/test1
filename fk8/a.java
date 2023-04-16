package fk8.a;
import fk8.c;
import java.lang.Object;
import dk8.a;
import android.app.Activity;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class a implements c	// class@00230e
{

    public void a(){
       super();
    }
    public void a(boolean p0,Object p1,a p2){
       this.b(p0, p1, p2);
    }
    public void b(boolean p0,Activity p1,a p2){
       a.p(p1, "nativePage");
       p1.finish();
       if (!p0) {
          p1.overridePendingTransition(0, 0);
       }else if(p2 == null){
          p1.overridePendingTransition(0, 0);
       }else {
          p1.overridePendingTransition(p2.b(), p2.a());
       }
       return;
    }
}
