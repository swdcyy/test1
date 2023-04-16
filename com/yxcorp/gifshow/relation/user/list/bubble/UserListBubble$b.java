package com.yxcorp.gifshow.relation.user.list.bubble.UserListBubble$b;
import com.kwai.library.widget.popup.common.PopupInterface$b;
import java.lang.Object;
import android.view.View;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import lnc.a1;
import h2.f;
import h2.b;
import h2.c;
import h2.g;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;

public final class UserListBubble$b implements PopupInterface$b	// class@001a12
{
    public final boolean a;

    public void UserListBubble$b(boolean p0){
       this.a = p0;
       super();
    }
    public final Animator a(View p0){
       f obj = PatchProxy.applyOneRefs(p0, this, UserListBubble$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "view");
       float f = 2.00f;
       p0.setPivotX(((float)p0.getWidth() - ((float)a1.d(R.dimen.arg_RES_7f0700f1) / f)));
       int i = 0x7f0700f0;
       float f1 = (this.a != null)? (float)a1.d(i) / f: (float)p0.getHeight() - ((float)a1.d(i) / f);
       p0.setPivotY(f1);
       obj = new f(p0, b.p, 0x3f800000);
       g og = obj.r();
       a.o(og, "spring");
       og.g(0x4395cf5c);
       og = obj.r();
       a.o(og, "spring");
       og.e(0x3f3d70a4);
       obj.k(0);
       obj.l(0);
       obj.n();
       obj = new f(p0, b.q, 0x3f800000);
       g og1 = obj.r();
       a.o(og1, "spring");
       og1.g(0x4395cf5c);
       og1 = obj.r();
       a.o(og1, "spring");
       og1.e(0x3f3d70a4);
       obj.k(0);
       obj.l(0);
       obj.n();
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(p0, View.ALPHA, new float[2]{0,0x3f800000});
       objectAnimat.setDuration(120);
       objectAnimat.setInterpolator(new LinearInterpolator());
       return objectAnimat;
    }
}
