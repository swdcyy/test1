package bf6.e;
import u07.u;
import bf6.h;
import android.app.Activity;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Intent;
import java.lang.StringBuilder;
import android.app.Application;
import o56.a;
import android.net.Uri;
import ekd.w0;
import bf6.a$b;
import java.lang.Throwable;
import q87.c;

public final class e implements u	// class@000492
{
    public final h b;
    public final Activity c;

    public void e(h p0,Activity p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void a(t p0,View p1){
       e tb = this.b;
       e tc = this.c;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(tc, tb, h.class, "6")) {
       }else {
          boolean b = true;
          try{
             tb.c(b);
             tc.startActivity(new Intent("android.intent.action.VIEW", w0.f("market://details?id="+a.b().getPackageName())));
          }catch(java.lang.Exception e4){
             Object[] objArray = new Object[0];
             a$b.a.u("launch_market_error", e4, objArray);
          }
       }
    }
}
