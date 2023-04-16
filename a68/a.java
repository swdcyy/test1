package a68.a;
import android.os.CancellationSignal$OnCancelListener;
import a68.c;
import mh8.b$a;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import zi8.n1;
import java.lang.Boolean;
import com.mini.app.installer.f;
import java.util.Map;
import mh8.b;
import com.mini.d;

public final class a implements CancellationSignal$OnCancelListener	// class@00003d
{
    public final c a;
    public final b$a b;

    public void a(c p0,b$a p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void onCancel(){
       b$a c;
       a ta = this.a;
       a tb = this.b;
       Objects.requireNonNull(ta);
       if (!PatchProxy.isSupport(c.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(0x4b320), "cancel", tb, ta, c.class, "2")) {
          c = tb.c;
          if (!c.a().booleanValue()) {
             c.b(Boolean.TRUE);
             ta.d.d(ta.b);
             ta.d.a.remove(ta.b);
             tb.b.c(Integer.valueOf(0x4b320), "cancel");
          }
       }
       d.c("DialogLoading", "installSubPackage fail cancel ");
       return;
    }
}
