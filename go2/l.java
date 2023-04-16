package go2.l;
import go2.l$a;
import nsd.u;
import java.lang.Object;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.graphics.drawable.Drawable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;

public final class l	// class@002b65
{
    public static final l$a a;

    static {
       l.a = new l$a(null);
    }
    public void l(){
       super();
    }
    public static final void a(KwaiImageView p0,float p1,Drawable p2){
       if (PatchProxy.isSupport(l.class) && PatchProxy.applyVoidThreeRefs(p0, Float.valueOf(p1), null, null, l.class, "1")) {
          return;
       }
       l.a.a(p0, p1, null);
       return;
    }
}
