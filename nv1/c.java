package nv1.c;
import java.lang.Runnable;
import com.kuaishou.live.common.core.component.pendant.miniwidget.base.container.a;
import java.lang.Object;
import androidx.viewpager.widget.ViewPager$l;

public final class c implements Runnable	// class@0033d9
{
    public final a b;

    public void c(a p0){
       this.b = p0;
    }
    public final void run(){
       this.b.j.onPageSelected(0);
    }
}
