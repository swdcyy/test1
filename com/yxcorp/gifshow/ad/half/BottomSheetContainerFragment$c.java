package com.yxcorp.gifshow.ad.half.BottomSheetContainerFragment$c;
import com.yxcorp.gifshow.ad.half.AdBottomSheetBehavior$b;
import com.yxcorp.gifshow.ad.half.BottomSheetContainerFragment;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import com.yxcorp.gifshow.ad.half.BottomSheetContainerFragment$b;
import com.yxcorp.gifshow.ad.half.AdBottomSheetBehavior;
import com.yxcorp.gifshow.ad.half.BottomSheetContainerFragment$a;

public final class BottomSheetContainerFragment$c extends AdBottomSheetBehavior$b	// class@00177f
{
    public final BottomSheetContainerFragment a;

    public void BottomSheetContainerFragment$c(BottomSheetContainerFragment p0){
       this.a = p0;
       super();
    }
    public void a(View p0,float p1){
       if (PatchProxy.isSupport(BottomSheetContainerFragment$c.class) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, BottomSheetContainerFragment$c.class, "2")) {
          return;
       }
       a.p(p0, "bottomSheet");
       return;
    }
    public void b(View p0,int p1){
       BottomSheetContainerFragment f;
       BottomSheetContainerFragment$c uoc = BottomSheetContainerFragment$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoc, "1")) {
          return;
       }
       a.p(p0, "bottomSheet");
       BottomSheetContainerFragment$c ta = this.a;
       if (ta.b != null && (p1 == 3 || p1 == 4)) {
          ta.b = false;
          ta.Vg(true);
       }
       if (p1 != 1) {
          if (p1 != 3) {
             if (p1 == 5) {
                f = this.a.f;
                if (f != null) {
                   f.Ib(true);
                }
             }
          }else {
             ta = this.a;
             BottomSheetContainerFragment e = ta.e;
             if (e != null) {
                e.p = true;
             }
             if (BottomSheetContainerFragment.Ug(ta).b()) {
                ta = this.a;
                if (ta.b == null) {
                   f = ta.f;
                   if (f != null) {
                      f.Ib(3);
                   }
                }
             }
          }
       }else if(BottomSheetContainerFragment.Ug(this.a).g == null){
          f = this.a.e;
          if (f != null) {
             f.setState(3);
          }
       }
       return;
    }
}
