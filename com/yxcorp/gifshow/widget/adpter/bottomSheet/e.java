package com.yxcorp.gifshow.widget.adpter.bottomSheet.e;
import com.google.android.material.bottomsheet.BottomSheetBehavior$c;
import com.yxcorp.gifshow.widget.adpter.bottomSheet.f;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.widget.adpter.bottomSheet.f$d;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public class e extends BottomSheetBehavior$c	// class@0018f2
{
    public final f a;

    public void e(f p0){
       this.a = p0;
       super();
    }
    public void a(View p0,float p1){
    }
    public void b(View p0,int p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoe, "1")) {
          return;
       }
       if (p1 == 5) {
          f c = this.a.c;
          if (c != null) {
             c.p1();
          }
       }
       if (p1 == 3) {
          this.a.a.setPeekHeight(p0.getMeasuredHeight());
       }
       return;
    }
}
