package androidx.appcompat.app.e$c;
import a2.p0;
import androidx.appcompat.app.e;
import java.lang.Object;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;

public class e$c implements p0	// class@000591
{
    public final e a;

    public void e$c(e p0){
       this.a = p0;
       super();
    }
    public void a(View p0){
       this.a.h.getParent().invalidate();
    }
}
