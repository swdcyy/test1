package com.yxcorp.gifshow.ad.half.b$b;
import com.yxcorp.gifshow.ad.half.AdBottomSheetBehavior$b;
import com.yxcorp.gifshow.ad.half.b;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;

public class b$b extends AdBottomSheetBehavior$b	// class@001783
{
    public final b a;

    public void b$b(b p0){
       this.a = p0;
       super();
    }
    public void a(View p0,float p1){
    }
    public void b(View p0,int p1){
       if (PatchProxy.isSupport(b$b.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, b$b.class, "1")) {
          return;
       }
       if (p1 == 5) {
          this.a.cancel();
       }
       return;
    }
}
