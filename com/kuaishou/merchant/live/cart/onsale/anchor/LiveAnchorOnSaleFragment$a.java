package com.kuaishou.merchant.live.cart.onsale.anchor.LiveAnchorOnSaleFragment$a;
import j54.e;
import com.kuaishou.merchant.live.cart.onsale.anchor.LiveAnchorOnSaleFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import aa0.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import j54.d;
import com.kuaishou.merchant.api.core.model.Commodity;
import com.kuaishou.merchant.live.cart.onsale.anchor.LiveAnchorOnSaleFragment$c;
import io.reactivex.subjects.PublishSubject;
import com.kuaishou.merchant.api.core.model.Commodity$GatherPopularityInfo;

public class LiveAnchorOnSaleFragment$a implements e	// class@0018ff
{
    public final LiveAnchorOnSaleFragment a;

    public void LiveAnchorOnSaleFragment$a(LiveAnchorOnSaleFragment p0){
       this.a = p0;
       super();
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveAnchorOnSaleFragment$a.class, "2")) {
          return;
       }
       LiveAnchorOnSaleFragment$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, LiveAnchorOnSaleFragment.class, "12")) {
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putBoolean("merchant_anchor_show_linkage", false);
          g.a(uEditor);
       }
       return;
    }
    public boolean b(){
       Object obj = PatchProxy.apply(null, this, LiveAnchorOnSaleFragment$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.hh();
    }
    public String c(){
       return d.c(this);
    }
    public void d(Commodity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAnchorOnSaleFragment$a.class, "3")) {
          return;
       }
       if (p0 != null) {
          p0.mStartTwinkleAnimation = true;
          this.a.q.p.onNext(Boolean.TRUE);
       }
       return;
    }
    public boolean e(Commodity p0){
       p0 = p0.mGatherPopularityInfo;
       boolean b = (p0 != null && (p0.mSupportQuickCreate != null && p0.mAlreadySet == null))? true: false;
       return b;
    }
    public void f(){
       d.b(this);
    }
    public void onUnbindLocateEvent(){
       d.f(this);
    }
}
