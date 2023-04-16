package c50.a$a;
import android.view.View$OnClickListener;
import com.yxcorp.widget.selector.view.SelectShapeImageView;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.widget.ImageView;
import android.widget.ImageView$ScaleType;
import java.lang.Boolean;
import xf6.l;

public final class a$a implements View$OnClickListener	// class@0002ec
{
    public final SelectShapeImageView b;

    public void a$a(SelectShapeImageView p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       a$a tb = this.b;
       a.o(tb, "showSwitcher");
       int i = tb.isSelected() ^ 0x01;
       a$a tb1 = this.b;
       a.o(tb1, "showSwitcher");
       ImageView$ScaleType fIT_END = (i)? ImageView$ScaleType.FIT_END: ImageView$ScaleType.FIT_START;
       tb1.setScaleType(fIT_END);
       l.l("HAR_SHOW", Boolean.valueOf(i));
       tb1 = this.b;
       a.o(tb1, "showSwitcher");
       tb1.setSelected(i);
       return;
    }
}
