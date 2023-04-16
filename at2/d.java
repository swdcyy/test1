package at2.d;
import android.animation.AnimatorListenerAdapter;
import kotlin.jvm.internal.Ref$IntRef;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import at2.e;
import java.util.Objects;
import java.lang.Integer;
import java.util.HashMap;
import pm8.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;

public final class d extends AnimatorListenerAdapter	// class@0002c6
{
    public final Ref$IntRef a;
    public final int b;

    public void d(Ref$IntRef p0,int p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       e d;
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       d ta = this.a;
       int i = ta.element + 1;
       ta.element = i;
       if (i == 4) {
          d = e.d;
          Objects.requireNonNull(d);
          e.b.remove(Integer.valueOf(this.b));
          Objects.requireNonNull(d);
          if (!PatchProxy.applyVoid(null, d, e.class, "3")) {
             e.c = false;
             SharedPreferences$Editor uEditor = a.a.edit();
             uEditor.putBoolean("voicePartyMicSeatBreathingGuideShowed", 1);
             g.a(uEditor);
          }
       }else if(p0 != null){
          p0.start();
       }
       return;
    }
}
