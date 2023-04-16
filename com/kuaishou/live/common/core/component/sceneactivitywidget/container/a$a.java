package com.kuaishou.live.common.core.component.sceneactivitywidget.container.a$a;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.common.core.component.sceneactivitywidget.container.a;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveInteractiveWidgetConfig;
import kx1.a;
import ekd.k1;
import lx1.f;
import java.lang.Runnable;

public class a$a extends AnimatorListenerAdapter	// class@00176c
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
       super.onAnimationEnd(p0);
       a$a ta = this.a;
       Objects.requireNonNull(ta);
       a uoa = a.class;
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, ta, uoa, "8")) {
          if (!PatchProxy.applyVoid(objArray, ta, uoa, "10")) {
             a e = ta.e;
             int i = (ta.h != null)? 0x7f081352: 0x7f081353;
             e.setImageResource(i);
          }
          if (ta.h != null) {
             ta.d.setVisibility(8);
             ta.c.setVisibility(0);
             ta.g();
          }else if(PatchProxy.applyVoid(objArray, ta, uoa, "9")){
             k1.n(ta);
             f uof = new f(ta);
             LiveConfigStartupResponse$LiveInteractiveWidgetConfig mWidgetDispl = a.a().mWidgetDisplayDurationMs;
             if (mWidgetDispl <= 0) {
                mWidgetDispl = 5000;
             }
             k1.s(uof, ta, mWidgetDispl);
          }
       }
       return;
    }
}
