package com.yxcorp.gifshow.ad.union.AdUnionShopCardView$initView$3;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.ad.union.AdUnionShopCardView;
import java.lang.Object;
import android.view.View;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.ad.union.AdUnionShopCardView$a;

public final class AdUnionShopCardView$initView$3 extends Lambda implements l	// class@001869
{
    public final AdUnionShopCardView this$0;

    public void AdUnionShopCardView$initView$3(AdUnionShopCardView p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdUnionShopCardView$initView$3.class, "1")) {
          return;
       }
       a.p(p0, "it");
       AdUnionShopCardView$a mCardClickLi = this.this$0.getMCardClickListener();
       if (mCardClickLi != null) {
          mCardClickLi.b();
       }
       return;
    }
}
