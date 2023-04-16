package k59.s2$b$c;
import erd.g;
import k59.s2$b;
import java.lang.Object;
import android.graphics.Bitmap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import k59.s2;
import im8.f;
import android.view.View;
import android.graphics.drawable.BitmapDrawable;
import android.content.res.Resources;
import lnc.a1;
import android.graphics.drawable.Drawable;

public final class s2$b$c implements g	// class@002b15
{
    public final s2$b b;

    public void s2$b$c(s2$b p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s2$b$c.class, "1")) {
       }else {
          s2 q = this.b.a.q;
          if (q != null) {
             View view = q.get();
             if (view != null) {
                view.setBackground(new BitmapDrawable(a1.m(), p0));
             }
          }
       }
       return;
    }
}
