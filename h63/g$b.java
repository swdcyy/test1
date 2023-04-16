package h63.g$b;
import h63.g;
import java.lang.Object;
import h63.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatTextView;
import h63.g$a;
import android.graphics.drawable.ColorDrawable;
import android.view.View;

public abstract class g$b	// class@002c7b
{
    public final g a;

    public void g$b(g p0){
       this.a = p0;
       super();
    }
    public void g$b(g p0,b p1){
       super(p0);
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, g$b.class, "1")) {
          return;
       }
       this.a.d.setTextColor(this.e());
       this.a.e.setTextColor(this.e());
       this.a.d.setCompoundDrawablesWithIntrinsicBounds(this.c(), objArray, this.d(), objArray);
       g$a f = this.a.f.f;
       f.setColor(this.b());
       this.a.b.setBackground(f);
       return;
    }
    public abstract int b();
    public abstract Drawable c();
    public abstract Drawable d();
    public abstract int e();
}
