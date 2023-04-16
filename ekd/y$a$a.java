package ekd.y$a$a;
import java.lang.Runnable;
import ekd.y$a;
import java.lang.Object;
import android.graphics.drawable.Drawable;

public class y$a$a implements Runnable	// class@000d85
{
    public final y$a b;

    public void y$a$a(y$a p0){
       this.b = p0;
       super();
    }
    public void run(){
       this.b.b.invalidateSelf();
    }
}
