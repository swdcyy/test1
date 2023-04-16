package cgd.d;
import u07.u;
import cgd.b$b;
import bgd.a;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.util.Objects;
import java.lang.String;
import com.kwai.framework.cache.a;
import java.lang.Integer;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.kwai.library.widget.button.SlipSwitchButton;

public final class d implements u	// class@000324
{
    public final b$b b;
    public final a c;
    public final int d;

    public void d(b$b p0,a p1,int p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void a(t p0,View p1){
       d tb = this.b;
       d tc = this.c;
       Objects.requireNonNull(tb);
       a.q(tc.c(), true);
       tb.a(tc, true);
       tb.n.m0(this.d, Integer.valueOf(999));
       tb.m.setSwitch(true);
    }
}
