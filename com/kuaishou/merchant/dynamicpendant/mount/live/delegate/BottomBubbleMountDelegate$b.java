package com.kuaishou.merchant.dynamicpendant.mount.live.delegate.BottomBubbleMountDelegate$b;
import f14.g$c;
import com.kuaishou.merchant.dynamicpendant.mount.live.delegate.BottomBubbleMountDelegate;
import java.lang.String;
import f14.g;
import com.kwaishou.merchant.daccore.data.model.PendantMountInfo;
import bq5.h;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import f08.f;
import f08.f$a;
import java.util.Map;
import ot3.u0;
import f08.b;
import java.lang.StringBuilder;
import f08.b$a;
import bq5.f;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import bq5.b;
import android.view.View;
import dp3.g;
import kotlin.jvm.internal.a;

public final class BottomBubbleMountDelegate$b implements g$c	// class@0016a0
{
    public final BottomBubbleMountDelegate a;
    public final String b;
    public final String c;
    public final g d;
    public final PendantMountInfo e;
    public final h f;
    public final Ref$ObjectRef g;

    public void BottomBubbleMountDelegate$b(BottomBubbleMountDelegate p0,String p1,String p2,g p3,PendantMountInfo p4,h p5,Ref$ObjectRef p6){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       super();
    }
    public final void onShow(){
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, BottomBubbleMountDelegate$b.class, "1")) {
          return;
       }
       f$a a = f.a;
       f$a.t(a, this.b, this.c, "Bubble onShow", null, false, false, 56, null);
       if (this.d.k() - null <= 0) {
          this.d.B(u0.b());
          b$a.e(b.a, this.e.getMaterialId()+" bubble showTime:"+this.d.k(), objArray, 2, objArray);
       }
       BottomBubbleMountDelegate$b tf = this.f;
       f uof = (tf != null)? tf.t3(): objArray;
       BottomBubbleMountDelegate$b ta = this.a;
       BottomBubbleMountDelegate$b td = this.d;
       Objects.requireNonNull(ta);
       Object[] obj = PatchProxy.applyTwoRefs(td, uof, ta, BottomBubbleMountDelegate.class, "3");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(uof != null){
          obj = uof.c();
       }else {
          obj = objArray;
       }
       if (obj instanceof b) {
          View view = obj.getView();
          if (td != null) {
             objArray = td.b;
          }
          if (view != null && (objArray != null && a.g(view, objArray))) {
             b = true;
          }
       }
    label_00a0 :
       b = false;
       if (b) {
          this.g.element = uof;
       }else {
          f$a.t(a, this.b, this.c, "addOnShowListener currentBottomBubbleItem not equal bubble", null, false, false, 56, null);
       }
       return;
    }
}
