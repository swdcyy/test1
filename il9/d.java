package il9.d;
import android.view.View;
import il9.b$b;
import java.lang.Object;
import java.lang.ref.WeakReference;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;

public class d	// class@00286a
{
    public final WeakReference a;
    public final WeakReference b;
    public int c;

    public void d(View p0,b$b p1){
       super();
       this.b = new WeakReference(p1);
       this.a = new WeakReference(p0);
    }
    public boolean a(boolean p0,boolean p1){
       b$b obj;
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uod, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (this.c > null) {
          return true;
       }else {
          obj = this.b.get();
          if (obj == null) {
             return false;
          }else if(!obj.f()){
             return obj.b(p1);
          }else if(p0){
             obj.d();
             return false;
          }else {
             return true;
          }
       }
    }
    public void b(int p0){
       this.c = p0;
    }
}
