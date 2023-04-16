package pc.e$b;
import com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor$b;
import pc.e;
import java.util.List;
import java.lang.Object;
import android.graphics.Bitmap;
import com.facebook.common.references.a;

public class e$b implements AnimatedImageCompositor$b	// class@002910
{
    public final List a;
    public final e b;

    public void e$b(e p0,List p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(int p0,Bitmap p1){
    }
    public a b(int p0){
       return a.d(this.a.get(p0));
    }
}
