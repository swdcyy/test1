package t30.d;
import java.lang.Object;
import java.util.ArrayList;
import t30.b;
import t30.c;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.database.ContentObserver;

public class d	// class@00245b
{
    public Context a;
    public List b;
    public Uri c;

    public void d(){
       super();
       this.b = new ArrayList();
    }
    public void d(b p0){
       super();
       this.b = new ArrayList();
    }
    public static d b(){
       return c.a;
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "3")) {
          return;
       }
       this.a.getContentResolver().notifyChange(this.c, null);
       return;
    }
}
