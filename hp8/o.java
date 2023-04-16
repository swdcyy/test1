package hp8.o;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.drawable.Drawable;

public class o extends BitmapDrawable	// class@0025d6
{
    public Drawable a;

    public void o(){
       super();
    }
    public void draw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "1")) {
          return;
       }
       o ta = this.a;
       if (ta != null) {
          ta.draw(p0);
       }
       return;
    }
}
