package c50.a$c;
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

public final class a$c implements View$OnClickListener	// class@0002ee
{
    public final SelectShapeImageView b;

    public void a$c(SelectShapeImageView p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$c.class, "1")) {
          return;
       }
       a$c tb = this.b;
       a.o(tb, "verifySwitcher");
       int i = tb.isSelected() ^ 0x01;
       a$c tb1 = this.b;
       a.o(tb1, "verifySwitcher");
       ImageView$ScaleType fIT_END = (i)? ImageView$ScaleType.FIT_END: ImageView$ScaleType.FIT_START;
       tb1.setScaleType(fIT_END);
       l.l("HAR_VERIFY", Boolean.valueOf(i));
       tb1 = this.b;
       a.o(tb1, "verifySwitcher");
       tb1.setSelected(i);
       return;
    }
}
