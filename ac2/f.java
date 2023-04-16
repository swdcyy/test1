package ac2.f;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.show.luckystar.currentinfo.c;
import java.lang.Object;
import android.view.View;
import java.lang.Runnable;

public final class f implements View$OnClickListener	// class@0000b0
{
    public final c b;

    public void f(c p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       this.b.w.run();
    }
}
