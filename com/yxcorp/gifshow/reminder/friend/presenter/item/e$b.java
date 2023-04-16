package com.yxcorp.gifshow.reminder.friend.presenter.item.e$b;
import ekd.f$j;
import com.yxcorp.gifshow.reminder.friend.presenter.item.e;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;

public class e$b extends f$j	// class@001acf
{
    public final e a;

    public void e$b(e p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$b.class, "1")) {
          return;
       }
       this.a.P8();
       return;
    }
    public void onAnimationEnd(Animator p0,boolean p1){
       if (PatchProxy.isSupport(e$b.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, e$b.class, "2")) {
          return;
       }
       this.a.P8();
       return;
    }
}
