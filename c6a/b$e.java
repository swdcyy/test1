package c6a.b$e;
import android.view.View$OnClickListener;
import c6a.b;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import kzc.d;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.widget.popup.KwaiDialogOption;
import android.graphics.drawable.Drawable;
import com.kwai.library.widget.popup.common.c$b;
import c6a.a;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import u07.t;
import com.kwai.library.widget.popup.common.c;

public final class b$e implements View$OnClickListener	// class@000560
{
    public final b b;

    public void b$e(b p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$e.class, "1")) {
          return;
       }
       b$e tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, tb, b.class, "3")) {
          if (tb.p == null) {
             Activity activity = tb.getActivity();
             a.m(activity);
             d uod = new d(activity);
             uod.b1(KwaiDialogOption.d);
             uod.w(objArray);
             uod.L(new a(tb));
             tb.p = uod.b0();
          }else if(tb.r != null){
             tb.x = 0;
             b y = tb.y;
             if (y != null) {
                tb.R8(y);
                tb.W8();
             }
          }
          b p = tb.p;
          if (p != null) {
             p.Z();
          }
       }
       return;
    }
}
