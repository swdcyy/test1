package bz4.a;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.ViewTreeObserver;
import zy4.a;

public final class a implements ViewTreeObserver$OnPreDrawListener	// class@0003f2
{
    public final View b;
    public final View c;

    public void a(View p0,View p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public boolean onPreDraw(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.b.getViewTreeObserver().removeOnPreDrawListener(this);
       this.b.setPivotX(0);
       this.b.setPivotY((float)this.c.getHeight());
       this.b.setScaleX(a.c);
       this.b.setScaleY(a.c);
       return true;
    }
}
