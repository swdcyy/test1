package c68.a;
import com.mini.app.fragment.LoadingMiniAppFragment$a;
import c68.c;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Runnable;
import android.os.Handler;
import yd8.b;
import h88.c;

public final class a implements LoadingMiniAppFragment$a	// class@0003b8
{
    public final c a;

    public void a(c p0){
       this.a = p0;
    }
    public final void onDestroy(){
       a ta = this.a;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoid(null, ta, c.class, "8")) {
       }else if(ta.h != null){
          c g = ta.g;
          if (g != null) {
             ta.b.removeCallbacks(g);
          }
          ta.g(ta.f, b.a(0x4b320, "page_invalid"));
       }
       return;
    }
}
