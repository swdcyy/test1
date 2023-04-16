package com.yxcorp.gifshow.camera.record.frame.a$a;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.camera.record.frame.a;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.a;
import q87.c;
import com.yxcorp.gifshow.camera.record.frame.c$e;

public class a$a extends AnimatorListenerAdapter	// class@000dd5
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("CameraViewFrameController", "animSwitch end", objArray);
       a$a ta = this.a;
       ta.r = null;
       ta.s.r1();
       return;
    }
}
