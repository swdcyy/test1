package com.yxcorp.gifshow.helper.FriendClapNewView$c;
import java.lang.Runnable;
import com.yxcorp.gifshow.helper.FriendClapNewView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.view.View;
import lnc.a1;
import h2.f;
import h2.b;
import h2.c;
import h2.g;
import android.util.Property;
import android.animation.ObjectAnimator;

public class FriendClapNewView$c implements Runnable	// class@001625
{
    public final FriendClapNewView b;

    public void FriendClapNewView$c(FriendClapNewView p0){
       this.b = p0;
       super();
    }
    public void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, FriendClapNewView$c.class, "1")) {
          return;
       }
       FriendClapNewView$c tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, FriendClapNewView.class, "9")) {
          FriendClapNewView e = tb.e;
          e.setPivotX((float)(e.getWidth() - a1.d(R.dimen.arg_RES_7f07030d)));
          e = tb.e;
          e.setPivotY((float)e.getHeight());
          tb.i = new f(tb.e, b.p);
          tb.j = new f(tb.e, b.q);
          g og = new g();
          og.g(320.86f);
          og.e(0x3f400000);
          tb.i.t(og);
          tb.j.t(og);
          tb.i.l(0);
          tb.j.l(0);
          tb.i.k(0.30f);
          tb.j.k(0.30f);
          tb.i.q(0x3f800000);
          tb.j.q(0x3f800000);
          ObjectAnimator.ofFloat(tb.e, View.ALPHA, new float[2]{0,0x3f800000}).setDuration(120).start();
       }
       return;
    }
}
