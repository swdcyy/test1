package ap3.j;
import java.lang.Runnable;
import android.app.Activity;
import androidx.fragment.app.c;
import lp3.e;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.live.report.e;

public final class j implements Runnable	// class@000299
{
    public final Activity b;
    public final c c;
    public final e d;
    public final String e;

    public void j(Activity p0,c p1,e p2,String p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void run(){
       e.b(this.b, this.c, this.d, this.e);
    }
}
