package a1.b;
import android.content.Context;
import java.lang.Object;
import a1.b$a;
import a1.b$b;
import android.os.Handler;
import android.os.Handler$Callback;
import a1.b$d;
import android.view.ViewGroup;
import a1.b$e;
import a1.b$c;

public final class b	// class@000045
{
    public LayoutInflater a;
    public Handler b;
    public b$d c;
    public Handler$Callback d;

    public void b(Context p0){
       super();
       this.d = new b$a(this);
       this.a = new b$b(p0);
       this.b = new Handler(this.d);
       this.c = b$d.b();
    }
    public void a(int p0,ViewGroup p1,b$e p2){
       b$c uoc = this.c.c();
       uoc.a = this;
       uoc.c = p0;
       uoc.b = p1;
       uoc.e = p2;
       this.c.a(uoc);
    }
}
