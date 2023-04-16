package ms1.b$a;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.multiline.view.icontext.LiveMultiLineIconTextView;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import bld.b;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import kotlin.jvm.internal.a;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;

public final class b$a implements Observer	// class@003202
{
    public final LiveMultiLineIconTextView b;

    public void b$a(LiveMultiLineIconTextView p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
       }else {
          b uob = new b();
          uob.g(KwaiRadiusStyles.FULL);
          a.o(p0, "it");
          uob.v(p0.intValue());
          this.b.setBackground(uob.a());
       }
       return;
    }
}
