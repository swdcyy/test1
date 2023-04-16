package com.kwai.slide.play.detail.rightactionbar.follow.element.a;
import androidx.lifecycle.Observer;
import com.kwai.slide.play.detail.rightactionbar.follow.element.f;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import android.view.View;
import qp7.d;
import android.view.ViewGroup;
import com.yxcorp.gifshow.widget.popup.a;
import android.app.Activity;
import com.kwai.library.widget.popup.bubble.BubbleInterface$Position;
import com.kwai.library.widget.popup.bubble.a$c;
import com.yxcorp.gifshow.widget.popup.KwaiBubbleOption;
import lnc.a1;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.slide.play.detail.rightactionbar.follow.element.d;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import ns7.y;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.bubble.a;

public final class a implements Observer	// class@001853
{
    public final f b;

    public void a(f p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       a tb = this.b;
       boolean b = p0.booleanValue();
       Objects.requireNonNull(tb);
       f uof = f.class;
       if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), tb, uof, "8")) {
          tb.p().requestDisallowInterceptTouchEvent(true);
          a uoa = new a(tb.h);
          uoa.D0(BubbleInterface$Position.LEFT);
          uoa.K0(KwaiBubbleOption.e);
          uoa.o0(tb.m);
          uoa.q0(true);
          uoa.B0((- a1.e(5.00f)));
          uoa.C0(0);
          uoa.z(true);
          uoa.L(new d(tb, b));
          uoa.M(new y(tb));
          uoa.A(true);
          uoa.v(true);
          tb.z = uoa.X();
       }
       return;
    }
}
