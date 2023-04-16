package c58.a;
import w78.c;
import c58.b;
import java.lang.Object;
import android.os.Message;
import java.util.Objects;
import com.mini.app.runtime.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import g68.e;
import com.mini.d;
import android.util.SparseArray;
import g68.f;
import com.mini.app.page.g;
import com.kuaishou.webkit.WebView;
import com.mini.app.page.b;

public final class a implements c	// class@0003b5
{
    public final b a;

    public void a(b p0){
       this.a = p0;
    }
    public final void a(Message p0){
       b g;
       b a = this.a.a;
       Objects.requireNonNull(a);
       if (PatchProxy.applyVoid(null, a, f.class, "17")) {
       }else {
          f h = a.h;
          Objects.requireNonNull(h);
          if (!PatchProxy.applyVoid(null, h, e.class, "24")) {
             if (d.f()) {
                d.c("WebViewPageMgr", "clear WebView cache.");
             }
             int i = 0;
             while (i < h.c.size()) {
                f a1 = h.c.valueAt(i).a;
                if (a1 != null && !PatchProxy.applyVoid(null, a1, g.class, "65")) {
                   g n = a1.n;
                   boolean b = true;
                   if (n != null) {
                      n.clearCache(b);
                   }
                   g p = a1.p;
                   if (p != null && !PatchProxy.applyVoid(null, p, b.class, "86")) {
                      g = p.g;
                      if (g != null) {
                         g.clearCache(b);
                      }
                   }
                }
             label_006e :
                i = i + 1;
             }
          }
       }
       return;
    }
}
