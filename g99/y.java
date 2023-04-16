package g99.y;
import androidx.lifecycle.Observer;
import g99.a0;
import java.lang.Object;
import java.lang.Float;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.atlas_detail.common.presenter.toolbar.ToolbarStyle;
import com.yxcorp.gifshow.atlas_detail.common.presenter.toolbar.ToolbarScrollStatus;
import android.view.View;
import zf6.l;

public final class y implements Observer	// class@002457
{
    public final a0 b;

    public void y(a0 p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       y tb = this.b;
       Objects.requireNonNull(tb);
       a0 uoa0 = a0.class;
       Object[] objArray = null;
       if (p0.floatValue() - 0x3f800000 >= 0) {
          if (!PatchProxy.applyVoid(objArray, tb, uoa0, "6") && tb.f == ToolbarStyle.SCROLL_SENSITIVE) {
             tb.e(ToolbarScrollStatus.FULLY_SOLID);
          }
       }else if(p0.floatValue() <= 0){
          if (!PatchProxy.applyVoid(objArray, tb, uoa0, "7") && tb.f == ToolbarStyle.SCROLL_SENSITIVE) {
             tb.e(ToolbarScrollStatus.FULLY_TRANSPARENT);
          }
       }else {
          float f = p0.floatValue();
          if (!PatchProxy.isSupport(uoa0) || (!PatchProxy.applyVoidOneRefs(Float.valueOf(f), tb, uoa0, "8") && tb.f == ToolbarStyle.SCROLL_SENSITIVE)) {
             tb.e(ToolbarScrollStatus.IN_TRANSITION);
             if (!PatchProxy.isSupport(uoa0) || !PatchProxy.applyVoidOneRefs(Float.valueOf(f), tb, uoa0, "10")) {
                tb.d.setVisibility(8);
                tb.b.setBackgroundColor((l.n(0x222222, 0xf6f6f6) | ((int)(0x437f0000 * f) << 24)));
                tb.b(f);
             }
          }
       }
       return;
    }
}
