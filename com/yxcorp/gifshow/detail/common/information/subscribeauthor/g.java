package com.yxcorp.gifshow.detail.common.information.subscribeauthor.g;
import qp7.d;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import ag6.a;
import qp7.x0;
import xy9.j;
import android.widget.Button;
import com.yxcorp.gifshow.detail.model.SubscribeAuthorConfig;
import java.lang.reflect.Type;
import uw9.c;
import com.yxcorp.gifshow.detail.model.SnackBarConfig;
import lnc.a1;
import java.lang.CharSequence;
import android.widget.TextView;
import xy9.g;
import java.util.Objects;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import pp7.b;
import com.yxcorp.gifshow.detail.common.information.subscribeauthor.g$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.detail.common.information.subscribeauthor.g$b;
import android.animation.Animator;
import android.animation.ValueAnimator;
import xy9.f;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import xy9.h;
import android.animation.Animator$AnimatorListener;

public class g extends d	// class@00145f
{
    public TextView l;
    public Button m;
    public Button n;
    public View o;
    public Animator p;

    public void g(){
       super();
    }
    public View i(){
       Object obj = PatchProxy.apply(null, this, g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.c(LayoutInflater.from(this.h), 0x7f0d03a8, this.g, false);
    }
    public void q(x0 p0){
       g og = g.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, og, "3")) {
       }else {
          this.m.setText(R.string.arg_RES_7f10525d);
          this.n.setText(R.string.arg_RES_7f103944);
          g tl = this.l;
          String str = PatchProxy.apply(null, this, og, "4");
          if (str != PatchProxyResult.class) {
          }else {
             SubscribeAuthorConfig subscribeAut = c.t(SubscribeAuthorConfig.class);
             str = (subscribeAut != null && (subscribeAut.b() != null && subscribeAut.b().a() != null))? subscribeAut.b().a(): a1.p(R.string.arg_RES_7f104b10);
          }
          tl.setText(str);
          og = new g(this);
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoidOneRefs(og, p0, j.class, "2")) {
             p0.d.d(p0.c(), og);
          }
       }
       return;
    }
    public void r(){
       if (PatchProxy.applyVoid(null, this, g.class, "2")) {
          return;
       }
       this.m = this.p().findViewById(0x7f0a318b);
       this.n = this.p().findViewById(0x7f0a2d8a);
       this.l = this.p().findViewById(0x7f0a141b);
       View view = this.p().findViewById(R.id.interest_adjust_view);
       this.o = view;
       view.setClickable(true);
       this.n.setOnClickListener(new g$a(this));
       this.m.setOnClickListener(new g$b(this));
       return;
    }
    public void v(){
       g og = g.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, og, "5")) {
          return;
       }
       ValueAnimator valueAnimato = PatchProxy.apply(objArray, this, og, "7");
       if (valueAnimato != PatchProxyResult.class) {
       }else {
          ValueAnimator valueAnimato1 = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
          valueAnimato1.addUpdateListener(new f(this, this.o.getHeight()));
          valueAnimato1.setDuration(250);
          valueAnimato1.addListener(new h(this));
          valueAnimato = valueAnimato1;
       }
       this.p = valueAnimato;
       if (valueAnimato.isRunning()) {
          this.p.cancel();
       }
       this.p.start();
       return;
    }
}
