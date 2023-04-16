package com.yxcorp.gifshow.share.widget.ForwardGridFragment$adaptScreenOrientation$$inlined$apply$lambda$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.share.widget.ForwardPageFragment;
import com.yxcorp.gifshow.share.widget.ForwardGridFragment;
import java.util.List;
import kotlin.jvm.internal.Ref$IntRef;
import java.lang.Object;
import mhc.p1;
import java.lang.Number;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.KwaiDialogFragment;

public final class ForwardGridFragment$adaptScreenOrientation$$inlined$apply$lambda$1 extends Lambda implements p	// class@001cb9
{
    public final int $colCount$inlined;
    public final Ref$IntRef $i$inlined;
    public final List $items$inlined;
    public final int $rowCount$inlined;
    public final ForwardPageFragment $this_apply;
    public final ForwardGridFragment this$0;

    public void ForwardGridFragment$adaptScreenOrientation$$inlined$apply$lambda$1(ForwardPageFragment p0,ForwardGridFragment p1,List p2,Ref$IntRef p3,int p4,int p5){
       this.$this_apply = p0;
       this.this$0 = p1;
       this.$items$inlined = p2;
       this.$i$inlined = p3;
       this.$colCount$inlined = p4;
       this.$rowCount$inlined = p5;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       this.invoke(p0, p1.intValue());
       return l1.a;
    }
    public final void invoke(p1 p0,int p1){
       if (PatchProxy.isSupport2(ForwardGridFragment$adaptScreenOrientation$$inlined$apply$lambda$1.class, "1") && PatchProxy.applyVoidTwoRefsWithListener(p0, Integer.valueOf(p1), this, ForwardGridFragment$adaptScreenOrientation$$inlined$apply$lambda$1.class, "1")) {
          return;
       }
       a.p(p0, "op");
       if (this.$this_apply.isAdded()) {
          this.this$0.dismissAllowingStateLoss();
          ForwardGridFragment e = this.this$0.E;
          if (e != null) {
             l1 ol1 = e.invoke(p0, Integer.valueOf(p1));
          }
       }
       PatchProxy.onMethodExit(ForwardGridFragment$adaptScreenOrientation$$inlined$apply$lambda$1.class, "1");
       return;
    }
}
