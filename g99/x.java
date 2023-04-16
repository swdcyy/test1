package g99.x;
import androidx.lifecycle.Observer;
import g99.a0;
import java.lang.Object;
import com.yxcorp.gifshow.atlas_detail.common.presenter.toolbar.ToolbarStyle;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.atlas_detail.common.presenter.toolbar.ToolbarScrollStatus;
import android.view.View;

public final class x implements Observer	// class@002456
{
    public final a0 b;

    public void x(a0 p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       x tb = this.b;
       Objects.requireNonNull(tb);
       a0 uoa0 = a0.class;
       ToolbarStyle wHITE_SOLID = ToolbarStyle.WHITE_SOLID;
       if (p0 == wHITE_SOLID) {
          if (!PatchProxy.applyVoid(null, tb, uoa0, "5")) {
             tb.f = wHITE_SOLID;
             tb.e(ToolbarScrollStatus.FULLY_SOLID);
          }
       }else if(PatchProxy.applyVoid(null, tb, uoa0, "4")){
          tb.f = ToolbarStyle.SCROLL_SENSITIVE;
          tb.c.setBackgroundColor(0);
          tb.e(ToolbarScrollStatus.FULLY_TRANSPARENT);
       }
       return;
    }
}
