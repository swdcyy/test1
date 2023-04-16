package com.kwai.slide.play.detail.rightactionbar.reward.RewardElementView;
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
import kotlin.jvm.internal.a;
import qp7.x0;
import ts7.d;
import ts7.a;
import java.util.Objects;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import pp7.b;
import ts7.c;
import java.lang.Integer;
import java.util.HashMap;
import com.kwai.slide.play.detail.rightactionbar.reward.RewardElementView$onViewCreated$1;
import com.kwai.slide.play.detail.rightactionbar.reward.RewardElementView$a;
import android.view.View$OnClickListener;
import bt7.e;
import qp7.t0;

public final class RewardElementView extends d	// class@001871
{
    public c l;
    public HashMap m;

    public void RewardElementView(){
       super();
    }
    public View i(){
       View obj = PatchProxy.apply(null, this, RewardElementView.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.c(LayoutInflater.from(this.k()), R.layout.arg_RES_7f0d03c7, this.m(), false);
       a.o(obj, "LayoutInflater.from\(cont¡­, parentView, false\n    \)");
       return obj;
    }
    public void q(x0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RewardElementView.class, "2")) {
       }else {
          a.p(p0, "viewModel");
          a uoa = new a(this);
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoidOneRefs(uoa, p0, d.class, "3")) {
             a.p(uoa, "observer");
             p0.d.d(p0.c(), uoa);
          }
       }
       return;
    }
    public void r(){
       RewardElementView rewardElemen = RewardElementView.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, rewardElemen, "1")) {
          return;
       }
       int i = 0x7f0a3601;
       if (PatchProxy.isSupport(rewardElemen)) {
          View obj = PatchProxy.applyOneRefs(Integer.valueOf(i), this, rewardElemen, "4");
          if (obj != PatchProxyResult.class) {
             objArray = obj;
          }else if(this.m == null){
             this.m = new HashMap();
          }
          obj = this.m.get(Integer.valueOf(i));
          if (obj == null) {
             obj = this.j0();
             if (obj != null) {
                obj = obj.findViewById(i);
                this.m.put(Integer.valueOf(i), obj);
             }
          }
          objArray = obj;
       }else {
          goto label_0029 ;
       }
       a.o(objArray, "reward_icon");
       c uoc = new c(objArray);
       this.l = uoc;
       a.m(uoc);
       uoc.b = new RewardElementView$onViewCreated$1(this);
       this.p().setOnClickListener(new RewardElementView$a(this));
       e.b.a(this.j(), this.p());
       return;
    }
}
