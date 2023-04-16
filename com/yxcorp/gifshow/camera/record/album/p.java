package com.yxcorp.gifshow.camera.record.album.p;
import android.view.animation.Animation$AnimationListener;
import com.yxcorp.gifshow.camera.record.album.o;
import java.lang.Object;
import android.view.animation.Animation;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.camera.record.base.d;
import android.app.Activity;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.camera.record.CameraLogger;
import jg9.a1;
import jg9.a1$a;
import com.yxcorp.gifshow.camera.bubble.b;
import com.yxcorp.gifshow.camera.bubble.RecordBubbleItem;
import ra9.c;
import android.view.View;
import sb9.t;
import com.yxcorp.gifshow.bubble.b$c;
import com.yxcorp.gifshow.camera.record.album.n;
import com.yxcorp.gifshow.camera.bubble.b$c;
import com.yxcorp.gifshow.bubble.a;
import com.yxcorp.gifshow.bubble.PostBubbleManager;

public class p implements Animation$AnimationListener	// class@001cc0
{
    public final o b;

    public void p(o p0){
       this.b = p0;
       super();
    }
    public void onAnimationEnd(Animation p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "1")) {
          return;
       }
       p tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, o.class, "36") && (!tb.e.isFinishing() && !CameraLogger.d(tb.d))) {
          a1 uoa1 = tb.d.d(a1.j.a());
          if (!uoa1.b() || (uoa1.c() && tb.w != null)) {
             b uob = new b(RecordBubbleItem.SAVE_TO_ALBUM).n(tb.t).A(R.string.arg_RES_7f1048b8);
             uob.q(5000);
             uob = uob.z(new t(tb));
             uob.v(n.a);
             tb.w.n(uob);
          }
       }
    label_0077 :
       return;
    }
    public void onAnimationRepeat(Animation p0){
    }
    public void onAnimationStart(Animation p0){
    }
}
