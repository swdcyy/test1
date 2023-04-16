package com.kuaishou.merchant.dynamicpendant.LiveDACPresenter$initPendantManager$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.merchant.dynamicpendant.LiveDACPresenter;
import com.kuaishou.merchant.dynamicpendant.LiveDACPresenter$initPendantManager$1;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwaishou.merchant.daccore.b;

public final class LiveDACPresenter$initPendantManager$2 extends Lambda implements a	// class@00168f
{
    public final LiveDACPresenter$initPendantManager$1 $create$1;
    public final LiveDACPresenter this$0;

    public void LiveDACPresenter$initPendantManager$2(LiveDACPresenter p0,LiveDACPresenter$initPendantManager$1 p1){
       this.this$0 = p0;
       this.$create$1 = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, LiveDACPresenter$initPendantManager$2.class, "1")) {
          return;
       }
       if (this.this$0.s == null) {
          this.$create$1.invoke();
       }
       LiveDACPresenter$initPendantManager$2 tthis$0 = this.this$0;
       if (tthis$0.E == null) {
          LiveDACPresenter s = tthis$0.s;
          if (s != null) {
             s.f();
          }
          this.this$0.E = true;
       }
       return;
    }
}
