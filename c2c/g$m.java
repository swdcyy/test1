package c2c.g$m;
import android.view.View$OnClickListener;
import c2c.g;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import b2c.a;
import com.yxcorp.download.DownloadManager;

public final class g$m implements View$OnClickListener	// class@00050b
{
    public final g b;

    public void g$m(g p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, g$m.class, "1")) {
          return;
       }
       try{
          g s = this.b.s;
          if (s != null && !PatchProxy.applyVoid(null, s, a.class, "3")) {
             DownloadManager.n().c(s.c);
             s.c = -1;
          }
       label_0029 :
          PatchProxy.onMethodExit(g$m.class, "1");
          return;
       }catch(java.lang.IllegalStateException e0){
       }
    }
}
