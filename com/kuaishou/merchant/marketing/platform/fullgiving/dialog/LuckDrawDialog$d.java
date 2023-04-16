package com.kuaishou.merchant.marketing.platform.fullgiving.dialog.LuckDrawDialog$d;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.merchant.marketing.platform.fullgiving.dialog.LuckDrawDialog;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.marketing.platform.fullgiving.dialog.LuckDrawDialog$b;
import java.util.Objects;
import kotlin.jvm.internal.a;
import android.widget.TextView;
import android.animation.ValueAnimator;
import i84.c;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import i84.d;
import android.animation.Animator$AnimatorListener;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;

public final class LuckDrawDialog$d extends m	// class@001b12
{
    public final LuckDrawDialog c;

    public void LuckDrawDialog$d(LuckDrawDialog p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LuckDrawDialog$d.class, "1")) {
          return;
       }
       LuckDrawDialog i = this.c.I;
       if (i != null) {
          i.b();
       }
       LuckDrawDialog$d tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(null, tc, LuckDrawDialog.class, "6")) {
          LuckDrawDialog t = tc.t;
          if (t == null) {
             a.S("mRandomTextView1");
          }
          int height = t.getHeight();
          int[] ointArray = new int[]{0,height};
          ValueAnimator valueAnimato = ValueAnimator.ofInt(ointArray);
          if (valueAnimato != null) {
             valueAnimato.setDuration(100);
          }
          if (valueAnimato != null) {
             valueAnimato.addUpdateListener(new c(tc, height));
          }
          if (valueAnimato != null) {
             valueAnimato.addListener(new d(tc, height));
          }
          if (valueAnimato != null) {
             valueAnimato.setInterpolator(new LinearInterpolator());
          }
          if (valueAnimato != null) {
             valueAnimato.start();
          }
       }
       return;
    }
}
