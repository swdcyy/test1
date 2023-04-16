package ba4.c;
import v94.a;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.viewbinder.LiveMerchantContainerAnimViewBinder;
import kotlin.jvm.internal.Ref$ObjectRef;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.marketing.base.widget.LiveMerchantScaleRecyclerView;
import android.view.ViewGroup;
import android.view.View;
import ekd.m1;
import kotlin.jvm.internal.a;

public final class c extends a	// class@00034f
{
    public final LiveMerchantContainerAnimViewBinder a;
    public final Ref$ObjectRef b;

    public void c(LiveMerchantContainerAnimViewBinder p0,Ref$ObjectRef p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       int childCount = LiveMerchantContainerAnimViewBinder.S8(this.a).getChildCount();
       int i = 0;
       while (i < childCount) {
          View childAt = LiveMerchantContainerAnimViewBinder.S8(this.a).getChildAt(i);
          if (childAt != null) {
             childAt = m1.f(childAt, R.id.live_merchant_container_item_anim_layout);
             if (childAt == null) {
                childAt = null;
             }
             if (childAt != null && !a.g(this.b.element, childAt)) {
                childAt.setVisibility(4);
             }
          }
       label_0042 :
          i = i + 1;
       }
       return;
    }
}
