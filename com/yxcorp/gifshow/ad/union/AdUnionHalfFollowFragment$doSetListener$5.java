package com.yxcorp.gifshow.ad.union.AdUnionHalfFollowFragment$doSetListener$5;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.ad.union.AdUnionHalfFollowFragment;
import java.lang.Object;
import android.view.View;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.ad.union.AdUnionHalfFollowFragment$Companion$FollowStyleModel;

public final class AdUnionHalfFollowFragment$doSetListener$5 extends Lambda implements l	// class@001864
{
    public final AdUnionHalfFollowFragment this$0;

    public void AdUnionHalfFollowFragment$doSetListener$5(AdUnionHalfFollowFragment p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdUnionHalfFollowFragment$doSetListener$5.class, "1")) {
          return;
       }
       a.p(p0, "it");
       AdUnionHalfFollowFragment$doSetListener$5 tthis$0 = this.this$0;
       if (tthis$0.q == AdUnionHalfFollowFragment$Companion$FollowStyleModel.GUIDE_OPEN_LIVING) {
          tthis$0.ih();
          AdUnionHalfFollowFragment.mh(this.this$0, 141, 19, 17, false, 8, null);
       }else {
          AdUnionHalfFollowFragment.dh(tthis$0).setEnabled(false);
          this.this$0.hh();
          AdUnionHalfFollowFragment.lh(this.this$0, 922, 0, 0, true, 6, null);
       }
       return;
    }
}
