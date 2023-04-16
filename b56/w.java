package b56.w;
import java.lang.Runnable;
import com.kwai.feed.player.ui.e;
import java.lang.Object;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import android.animation.Animator;
import com.yxcorp.utility.Log;
import android.view.View;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.TimeInterpolator;
import b56.x;
import android.animation.Animator$AnimatorListener;

public final class w implements Runnable	// class@000416
{
    public final e b;

    public void w(e p0){
       this.b = p0;
    }
    public final void run(){
       boolean b;
       w tb = this.b;
       Objects.requireNonNull(tb);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, uoe, "5")) {
       }else {
          e obj = PatchProxy.apply(objArray, tb, uoe, "3");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else {
             obj = tb.b;
             if (obj == null || !obj.isRunning()) {
                obj = tb.c;
                if (obj == null || !obj.isRunning()) {
                   b = false;
                }
             }
             b = true;
          }
          if (b) {
             Log.g("PanelAnimHelper", "exit running abort");
          }else {
             ObjectAnimator objectAnimat = PatchProxy.apply(objArray, tb, uoe, "7");
             if (objectAnimat != patchProxyRe) {
             }else {
                float[] uofloatArray = new float[]{tb.a.getTranslationX(),(float)tb.a.getWidth()};
                objectAnimat = ObjectAnimator.ofFloat(tb.a, View.TRANSLATION_X, uofloatArray);
                objectAnimat.setInterpolator(new AccelerateDecelerateInterpolator());
                objectAnimat.addListener(new x(tb));
             }
             tb.c = objectAnimat;
             objectAnimat.start();
          }
       }
       return;
    }
}
