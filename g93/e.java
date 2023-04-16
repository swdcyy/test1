package g93.e;
import androidx.recyclerview.widget.RecyclerView$n;
import g93.g;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.live.core.show.benefitcard.model.LiveBenefitCardInfo;
import lnc.a1;

public final class e extends RecyclerView$n	// class@002ad8
{
    public final g a;

    public void e(g p0){
       this.a = p0;
       super();
    }
    public void c(Rect p0,View p1,RecyclerView p2,RecyclerView$y p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, e.class, "1")) {
          return;
       }
       a.p(p0, "outRect");
       a.p(p1, "view");
       a.p(p2, "parent");
       a.p(p3, "state");
       int childLayoutP = p2.getChildLayoutPosition(p1);
       e ta = this.a;
       Objects.requireNonNull(ta);
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          og = PatchProxy.applyOneRefs(Integer.valueOf(childLayoutP), ta, og, "7");
          if (og != PatchProxyResult.class) {
             childLayoutP = og.intValue();
          }else {
          label_004b :
             LiveBenefitCardInfo mCardType = ta.j.mCardType;
             og = 1;
             if (mCardType == og && childLayoutP == og) {
                childLayoutP = a1.e(2.00f);
             }else if(mCardType == 2 && childLayoutP == 2){
                childLayoutP = a1.e(6.00f);
             }else {
                childLayoutP = 0;
             }
          }
       }else {
          goto label_004b ;
       }
       p0.set(0, childLayoutP, 0, 0);
       return;
    }
}
