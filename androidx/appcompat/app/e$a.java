package androidx.appcompat.app.e$a;
import a2.o0;
import androidx.appcompat.app.e;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContainer;
import a2.i0;

public class e$a extends o0	// class@00058f
{
    public final e a;

    public void e$a(e p0){
       this.a = p0;
       super();
    }
    public void a(View p0){
       e k;
       e$a ta = this.a;
       if (ta.x != null) {
          k = ta.k;
          if (k != null) {
             float f = 0;
             k.setTranslationY(f);
             this.a.h.setTranslationY(f);
          }
       }
       this.a.h.setVisibility(8);
       this.a.h.setTransitioning(false);
       ta = this.a;
       ta.C = null;
       ta.t0();
       k = this.a.g;
       if (k != null) {
          i0.p0(k);
       }
       return;
    }
}
