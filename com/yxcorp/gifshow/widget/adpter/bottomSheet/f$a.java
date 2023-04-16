package com.yxcorp.gifshow.widget.adpter.bottomSheet.f$a;
import ekd.f$j;
import com.yxcorp.gifshow.widget.adpter.bottomSheet.f;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.widget.adpter.bottomSheet.f$d;

public class f$a extends f$j	// class@0018f3
{
    public final f a;

    public void f$a(f p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "1")) {
          return;
       }
       this.a.c.p1();
       return;
    }
}
