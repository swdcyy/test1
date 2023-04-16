package com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment$showListener$1;
import msd.q;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment;
import java.lang.Object;
import uo7.i0;
import android.view.View;
import java.lang.Number;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import mhc.o0;
import mhc.p1;

public final class ForwardGridSectionFragment$showListener$1 extends Lambda implements q	// class@001cd1
{
    public final ForwardGridSectionFragment this$0;

    public void ForwardGridSectionFragment$showListener$1(ForwardGridSectionFragment p0){
       this.this$0 = p0;
       super(3);
    }
    public Object invoke(Object p0,Object p1,Object p2){
       this.invoke(p0, p1, p2.intValue());
       return l1.a;
    }
    public final void invoke(i0 p0,View p1,int p2){
       if (PatchProxy.isSupport(ForwardGridSectionFragment$showListener$1.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, ForwardGridSectionFragment$showListener$1.class, "1")) {
          return;
       }
       a.p(p0, "op");
       a.p(p1, "view");
       o0 oo0 = this.this$0.Rh();
       if (oo0 != null) {
          oo0.g(this.this$0.Ph(p0), p1);
       }
       return;
    }
}
