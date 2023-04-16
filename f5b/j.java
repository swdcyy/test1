package f5b.j;
import com.yxcorp.gifshow.magic.ui.magicemoji.search.widget.AnimTranslationDrawableView$b;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.jvm.internal.a;
import java.lang.Math;

public final class j implements AnimTranslationDrawableView$b	// class@0028af
{
    public final View a;

    public void j(View p0){
       this.a = p0;
       super();
    }
    public int a(){
       j obj = PatchProxy.apply(null, this, j.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       a.o(obj, "selectTabView");
       return (int)(float)Math.floor((double)(obj.getAlpha() * (float)255));
    }
}
