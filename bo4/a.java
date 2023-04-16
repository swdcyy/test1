package bo4.a;
import java.lang.Runnable;
import android.app.Activity;
import java.lang.String;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import com.kuaishou.pagedy.container.widget.TroubleShootingFloatingView;
import android.content.Context;
import com.kuaishou.pagedy.container.widget.FloatingView;
import java.lang.Exception;

public final class a implements Runnable	// class@0003a7
{
    public final Activity b;
    public final String c;
    public final String d;
    public final Fragment e;

    public void a(Activity p0,String p1,String p2,Fragment p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void run(){
       a tb = this.b;
       a tc = this.c;
       a td = this.d;
       a te = this.e;
       try{
          new TroubleShootingFloatingView(tb, tc, td).p(te);
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       return;
    }
}
