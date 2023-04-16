package com.yxcorp.gifshow.share.widget.slide.ForwardBottomSheetDialogFragment$a;
import com.google.android.material.bottomsheet.BottomSheetBehavior$c;
import com.yxcorp.gifshow.share.widget.slide.ForwardBottomSheetDialogFragment;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Integer;

public final class ForwardBottomSheetDialogFragment$a extends BottomSheetBehavior$c	// class@001d33
{
    public final ForwardBottomSheetDialogFragment a;

    public void ForwardBottomSheetDialogFragment$a(ForwardBottomSheetDialogFragment p0){
       this.a = p0;
       super();
    }
    public void a(View p0,float p1){
       if (PatchProxy.isSupport2(ForwardBottomSheetDialogFragment$a.class, "2") && PatchProxy.applyVoidTwoRefsWithListener(p0, Float.valueOf(p1), this, ForwardBottomSheetDialogFragment$a.class, "2")) {
          return;
       }
       a.p(p0, "bottomSheet");
       PatchProxy.onMethodExit(ForwardBottomSheetDialogFragment$a.class, "2");
       return;
    }
    public void b(View p0,int p1){
       if (PatchProxy.isSupport2(ForwardBottomSheetDialogFragment$a.class, "1") && PatchProxy.applyVoidTwoRefsWithListener(p0, Integer.valueOf(p1), this, ForwardBottomSheetDialogFragment$a.class, "1")) {
          return;
       }
       a.p(p0, "bottomSheet");
       if (p1 == 5) {
          this.a.Ih();
       }
       PatchProxy.onMethodExit(ForwardBottomSheetDialogFragment$a.class, "1");
       return;
    }
}
