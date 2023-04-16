package g93.h$b;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.kuaishou.live.lite.benefitcard.common.LiveLiteBenefitCardLineAdapter;
import java.lang.Object;
import com.kuaishou.live.core.show.benefitcard.model.LiveBenefitCardLineInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import java.util.Objects;
import lnc.a1;
import java.util.List;
import com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter;

public final class h$b implements Observer	// class@002add
{
    public final RecyclerView b;
    public final LiveLiteBenefitCardLineAdapter c;

    public void h$b(RecyclerView p0,LiveLiteBenefitCardLineAdapter p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$b.class, "1")) {
       }else {
          h$b tb = this.b;
          ViewGroup$LayoutParams layoutParams = tb.getLayoutParams();
          Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
          layoutParams.height = a1.e((float)p0.mLineHeight);
          tb.setLayoutParams(layoutParams);
          p0 = p0.mElementList;
          if (p0 != null) {
             this.c.O0(p0);
          }
       }
       return;
    }
}
