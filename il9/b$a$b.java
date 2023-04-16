package il9.b$a$b;
import android.view.View$OnAttachStateChangeListener;
import il9.b$a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import il9.b$b;

public class b$a$b implements View$OnAttachStateChangeListener	// class@002865
{
    public final b$a b;

    public void b$a$b(b$a p0){
       this.b = p0;
       super();
    }
    public void onViewAttachedToWindow(View p0){
    }
    public void onViewDetachedFromWindow(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a$b.class, "1")) {
          return;
       }
       this.b.f.e();
       p0.removeOnAttachStateChangeListener(this);
       return;
    }
}
