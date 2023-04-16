package com.yxcorp.gifshow.widget.ControlSpeedLayout$a;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.widget.ControlSpeedLayout;
import android.view.View;
import android.widget.TextView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.util.ArrayList;
import android.graphics.Typeface;

public class ControlSpeedLayout$a extends AnimatorListenerAdapter	// class@001809
{
    public final View a;
    public final TextView b;
    public final ControlSpeedLayout c;

    public void ControlSpeedLayout$a(ControlSpeedLayout p0,View p1,TextView p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ControlSpeedLayout$a.class, "2")) {
          return;
       }
       super.onAnimationEnd(p0);
       if (!PatchProxy.applyVoid(null, this, ControlSpeedLayout$a.class, "1")) {
          Iterator iterator = this.c.m.iterator();
          boolean b = false;
          while (iterator.hasNext()) {
             View view = iterator.next();
             if (view != this.a) {
                view.setSelected(b);
             }
          }
          iterator = this.c.n.iterator();
          while (iterator.hasNext()) {
             TextView textView = iterator.next();
             if (textView != this.b) {
                textView.setTextColor(-1);
                textView.setTypeface(Typeface.defaultFromStyle(b));
             }
          }
          this.a.setSelected(true);
          this.b.setTextColor(ControlSpeedLayout.y);
          this.b.setTypeface(Typeface.defaultFromStyle(true));
          ControlSpeedLayout$a tc = this.c;
          tc.u = null;
          tc.v = null;
       }
       return;
    }
}
