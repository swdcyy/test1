package com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.viewbinder.LiveMerchantContainerAnimViewBinder$b;
import e84.a;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.viewbinder.LiveMerchantContainerAnimViewBinder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ca4.a;
import java.util.Objects;
import java.lang.Integer;
import kotlin.jvm.internal.Ref$BooleanRef;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ba4.b;
import java.lang.Runnable;
import android.view.ViewGroup;

public final class LiveMerchantContainerAnimViewBinder$b implements a	// class@001c22
{
    public final LiveMerchantContainerAnimViewBinder a;

    public void LiveMerchantContainerAnimViewBinder$b(LiveMerchantContainerAnimViewBinder p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, LiveMerchantContainerAnimViewBinder$b.class, "1")) {
          return;
       }
       LiveMerchantContainerAnimViewBinder b = this.a.B;
       if (b == null) {
          a.S("mViewModel");
       }
       if (b != null) {
          b.r0(this.a.E);
       }
       LiveMerchantContainerAnimViewBinder$b ta = this.a;
       LiveMerchantContainerAnimViewBinder e = ta.E;
       Objects.requireNonNull(ta);
       LiveMerchantContainerAnimViewBinder liveMerchant = LiveMerchantContainerAnimViewBinder.class;
       if (!PatchProxy.isSupport(liveMerchant) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(e), ta, liveMerchant, "7")) {
          if (e <= null) {
             ta.e9();
          }else {
             Ref$BooleanRef uBooleanRef = new Ref$BooleanRef();
             uBooleanRef.element = false;
             LiveMerchantContainerAnimViewBinder y = ta.y;
             String str = "mContainerRecyclerView";
             if (y == null) {
                a.S(str);
             }
             RecyclerView$LayoutManager layoutManage = y.getLayoutManager();
             if (layoutManage != null) {
                layoutManage.scrollToPosition(e);
             }
             e = ta.y;
             if (e == null) {
                a.S(str);
             }
             e.post(new b(ta, layoutManage, uBooleanRef));
          }
       }
       return;
    }
}
