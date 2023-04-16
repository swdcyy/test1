package c44.d;
import java.lang.Runnable;
import com.kuaishou.merchant.live.cart.onsale.audience.pendant.ginseng.GinsengPendantData;
import android.view.View;
import com.kuaishou.merchant.live.cart.onsale.audience.model.ComponentInfo;
import c44.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.widget.LinearLayout;
import android.view.ViewGroup$LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;
import com.google.android.material.appbar.AppBarLayout$Behavior;
import com.google.android.material.appbar.ViewOffsetBehavior;
import com.google.android.material.appbar.AppBarLayout$c;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.CharSequence;
import android.widget.TextView;
import com.yxcorp.utility.TextUtils;
import android.widget.ImageView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import c44.e;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import c44.b;
import android.view.View$OnClickListener;
import c44.d$a;
import ekd.k1;

public final class d implements Runnable	// class@0004b0
{
    public final GinsengPendantData b;
    public final View c;
    public final ComponentInfo d;
    public final a e;

    public void d(GinsengPendantData p0,View p1,ComponentInfo p2,a p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void run(){
       e a;
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, d.class, "1")) {
          return;
       }
       d te = this.e;
       d tc = this.c;
       d tb = this.b;
       Objects.requireNonNull(te);
       a uoa = a.class;
       if (!PatchProxy.applyVoidTwoRefs(tc, tb, te, uoa, "6")) {
          a b = te.B;
          if (b != null) {
             View view = b.findViewById(R.id.tab_layout);
             int measuredHeig = (view != null)? view.getMeasuredHeight(): 0;
             te.C = b.getMeasuredHeight() - measuredHeig;
             ViewGroup$LayoutParams layoutParams = b.getLayoutParams();
             if (!layoutParams instanceof CoordinatorLayout$LayoutParams) {
                layoutParams = objArray;
             }
             CoordinatorLayout$Behavior uBehavior = (layoutParams != null)? layoutParams.f(): objArray;
             if (uBehavior instanceof AppBarLayout$Behavior) {
                objArray = uBehavior;
             }
             int topAndBottom = (objArray != null)? objArray.getTopAndBottomOffset(): 0;
             b.c(te.D);
             tc.setPadding(0, 0, 0, (te.C + topAndBottom));
          }
          a r = te.r;
          if (r != null) {
             r.setText(tb.getTitle());
          }
          r = te.q;
          String image = tb.getImage();
          if (!PatchProxy.applyVoidTwoRefs(r, image, te, uoa, "7") && r != null) {
             if (!TextUtils.x(image)) {
                r.setVisibility(0);
                r.L(image);
             }else {
                r.setVisibility(8);
             }
          }
          a = e.a;
          uoa = te.w;
          if (uoa == null) {
             a.S("mLiveBaseContext");
          }
          a.b(uoa.getLiveStreamPackage(), tb.getTitle());
          tc.setVisibility(0);
          tc.setOnClickListener(new b(te, tb, tc));
       }
       k1.s(new d$a(this), this.e, this.b.getDisplayMs());
       PatchProxy.onMethodExit(d.class, "1");
       return;
    }
}
