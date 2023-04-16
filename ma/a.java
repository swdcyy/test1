package ma.a;
import java.lang.Runnable;
import com.contrarywind.view.WheelView;
import java.lang.Object;
import ka.b;

public class a implements Runnable	// class@0025bb
{
    public final WheelView b;

    public void a(WheelView p0){
       this.b = p0;
       super();
    }
    public void run(){
       a tb = this.b;
       tb.f.b(tb.getCurrentItem());
    }
}
