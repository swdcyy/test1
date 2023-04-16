package ed1.c;
import bq5.d;
import ed1.d;
import java.lang.Object;
import bq5.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import s81.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;

public class c implements d	// class@0020e8
{
    public final d a;

    public void c(d p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       return c.d(this);
    }
    public void b(){
       c.b(this);
    }
    public void onDismiss(){
       c.a(this);
    }
    public void onShow(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putInt("livePayBulletNoticeShowTimes", (a.n() + 1));
       g.a(uEditor);
       return;
    }
}
