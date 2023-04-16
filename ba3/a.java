package ba3.a;
import com.kuaishou.live.viewcontroller.ViewController;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.lite.comment.view.ItemViewControllerFactory$a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public abstract class a extends ViewController	// class@00033d
{
    public final int j;
    public final LiveData k;
    public final ItemViewControllerFactory$a l;

    public void a(LiveData p0,ItemViewControllerFactory$a p1){
       a.p(p0, "position");
       a.p(p1, "dependence");
       super();
       this.k = p0;
       this.l = p1;
       this.j = 0x7f060875;
    }
    public final ItemViewControllerFactory$a V2(){
       return this.l;
    }
    public final LiveData W2(){
       return this.k;
    }
    public final int X2(){
       return this.j;
    }
}
