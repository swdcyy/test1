package com.kuaishou.live.common.core.component.toptemporarymessage.enhance.view.e;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.common.core.component.toptemporarymessage.enhance.view.LiveTempEnhanceView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import com.kuaishou.live.common.core.component.toptemporarymessage.enhance.view.d;
import java.lang.Runnable;
import yb7.p;

public class e extends AnimatorListenerAdapter	// class@0017b3
{
    public final LiveTempEnhanceView a;

    public void e(LiveTempEnhanceView p0){
       this.a = p0;
       super();
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       super.onAnimationStart(p0);
       this.a.b.setVisibility(0);
       p.f(new d(this), this.a, 300);
       return;
    }
}
