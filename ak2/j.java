package ak2.j;
import java.lang.Runnable;
import ak2.l;
import java.lang.Object;
import com.kuaishou.live.common.core.basic.optimizeui.ViewElement;
import android.view.View;
import ea1.b;

public final class j implements Runnable	// class@0000ed
{
    public final l b;

    public void j(l p0){
       this.b = p0;
    }
    public final void run(){
       b.a(this.b.p, ViewElement.TOP_BAR);
    }
}
