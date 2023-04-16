package com.kuaishou.merchant.live.cart.onsale.anchor.LiveAnchorOnSaleFragment$b;
import j54.g;
import com.kuaishou.merchant.live.cart.onsale.anchor.LiveAnchorOnSaleFragment;
import java.lang.Object;
import com.kuaishou.merchant.api.core.model.Commodity;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lnc.a1;
import android.view.View;
import java.lang.Number;
import java.util.Objects;
import com.kuaishou.merchant.api.core.model.Commodity$InterpretationInfo;

public class LiveAnchorOnSaleFragment$b implements g	// class@001900
{
    public final LiveAnchorOnSaleFragment a;

    public void LiveAnchorOnSaleFragment$b(LiveAnchorOnSaleFragment p0){
       this.a = p0;
       super();
    }
    public int[] a(Commodity p0){
       p0 = PatchProxy.applyOneRefs(p0, this, LiveAnchorOnSaleFragment$b.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       int[] ointArray = new int[]{a1.a(0x7f0605c8),a1.a(0x7f061be4)};
       return ointArray;
    }
    public int b(){
       return 3;
    }
    public void c(Commodity p0,View p1){
       p0.mStartTwinkleAnimation = false;
    }
    public int d(){
       return 0x7f0a18ae;
    }
    public int e(Commodity p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAnchorOnSaleFragment$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Objects.requireNonNull(this.a);
       obj = 1;
       if (p0 != null) {
          Commodity mInterpretat = p0.mInterpretationInfo;
          if (mInterpretat != null && (mInterpretat.mInterpretStatus == obj && p0.isCopyForInterpret != null)) {
          label_0029 :
             if (obj) {
                return a1.a(0x7f060410);
             }else {
                return a1.a(0x7f061be4);
             }
          }
       }
       obj = 0;
       goto label_0029 ;
    }
    public int getDuration(){
       return 2000;
    }
}
