package com.yxcorp.gifshow.bottom.sheet.f$a;
import com.google.android.material.bottomsheet.BottomSheetBehavior$c;
import com.yxcorp.gifshow.bottom.sheet.f;
import android.view.View;
import com.yxcorp.gifshow.bottom.sheet.BottomSheetParams;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import qa9.q;
import java.lang.Integer;
import java.util.Objects;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;
import java.lang.StringBuilder;
import java.lang.System;

public class f$a extends BottomSheetBehavior$c	// class@001c67
{
    public final long a;
    public final boolean b;
    public final View c;
    public final BottomSheetParams d;
    public final f e;

    public void f$a(f p0,long p1,boolean p2,View p3,BottomSheetParams p4){
       this.e = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       super();
    }
    public void a(View p0,float p1){
       f$a uoa = f$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, uoa, "2")) {
          return;
       }
       if (this.b != null && Float.compare(p1, Float.NaN)) {
          this.c.setAlpha(((p1 + 0x3f800000) * this.d.mBackgroundDimAmount));
       }
       return;
    }
    public void b(View p0,int p1){
       Object[] objArray;
       f b;
       f$a uoa = f$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1")) {
          return;
       }
       int i = 1;
       if (p1 == 5) {
          objArray = new Object[i];
          objArray[0] = this.e.c;
          f.d("Content[%1$s] is hidden", objArray);
          b = this.e.b;
          Objects.requireNonNull(b);
          if (!PatchProxy.applyVoid(null, b, q.class, "7")) {
             b.c.onNext(Boolean.FALSE);
          }
       }else if(p1 == 3){
          objArray = new Object[i];
          objArray[0] = this.e.c+", cost time is "+(System.currentTimeMillis() - this.a);
          f.d("Content[%1$s] is shown", objArray);
          b = this.e.b;
          Objects.requireNonNull(b);
          if (!PatchProxy.applyVoid(null, b, q.class, "6")) {
             b.c.onNext(Boolean.TRUE);
          }
       }
       return;
    }
}
