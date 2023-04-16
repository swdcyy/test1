package com.kuaishou.live.core.voiceparty.micseats.pendant.EmptyPendantViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import ts2.f;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatStyle;
import androidx.lifecycle.LiveData;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.EmptyPendantViewController$viewModel$2;
import com.kuaishou.live.core.voiceparty.micseats.pendant.EmptyPendantViewController$$special$$inlined$viewModelDelegate$1;
import msd.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.EmptyPendantViewController$viewModelDelegate$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import jt2.c;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.core.voiceparty.micseats.pendant.EmptyPendantViewController$viewModelDelegate$$inlined$viewModels$2;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.micseats.pendant.StyleKt;
import msd.l;
import it2.t;
import java.lang.Enum;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import lnc.a1;
import android.content.res.ColorStateList;
import com.kuaishou.live.core.voiceparty.micseats.pendant.EmptyPendantViewController$bindingMediaStyle$2;
import androidx.lifecycle.LifecycleOwner;
import xh3.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.EmptyPendantViewController$bindingVideoStyle$2;
import com.kwai.robust.PatchProxyResult;
import qrd.p;

public final class EmptyPendantViewController extends ViewController	// class@0015fd
{
    public final p j;
    public final MicSeatStyle k;

    public void EmptyPendantViewController(f p0,MicSeatStyle p1,LiveData p2){
       a.p(p0, "micSeatStateService");
       a.p(p1, "style");
       a.p(p2, "micSeatId");
       super();
       this.k = p1;
       this.j = new ViewModelLazy(m0.d(c.class), new EmptyPendantViewController$viewModelDelegate$$inlined$viewModels$2(new EmptyPendantViewController$viewModelDelegate$$inlined$viewModels$1(this)), new EmptyPendantViewController$$special$$inlined$viewModelDelegate$1(new EmptyPendantViewController$viewModel$2(p0, p2)));
    }
    public void F2(){
       View view;
       EmptyPendantViewController uEmptyPendan = EmptyPendantViewController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uEmptyPendan, "2")) {
          return;
       }
       this.S2(StyleKt.c(R.layout.arg_RES_7f0d16be, StyleKt.a(this.k)));
       if (!PatchProxy.applyVoid(objArray, this, uEmptyPendan, "3")) {
          int i = t.a[this.k.ordinal()];
          if (i != 1) {
             if (i != 2) {
                if (!PatchProxy.applyVoid(objArray, this, uEmptyPendan, "4")) {
                   ImageView imageView = this.A2(R.id.avatar_view);
                   imageView.setAlpha(0x3f000000);
                   imageView.setImageResource(R.drawable.arg_RES_7f082507);
                   imageView.setBackgroundResource(R.drawable.arg_RES_7f081515);
                }
             }else if(PatchProxy.applyVoid(objArray, this, uEmptyPendan, "6")){
                view = this.A2(R.id.avatar_view);
                View view1 = view;
                view1.setSupportImageTintList(ColorStateList.valueOf(a1.a(R.color.arg_RES_7f060801)));
                view1.setBackgroundResource(R.drawable.arg_RES_7f081515);
                view1.setAlpha(0x3f000000);
                a.a(view, this, this.V2().u0(), EmptyPendantViewController$bindingMediaStyle$2.INSTANCE);
             }
          }else if(PatchProxy.applyVoid(objArray, this, uEmptyPendan, "5")){
             view = this.A2(R.id.avatar_view);
             view.setSupportImageTintList(ColorStateList.valueOf(a1.a(R.color.arg_RES_7f060801)));
             a.a(view, this, this.V2().u0(), EmptyPendantViewController$bindingVideoStyle$2.INSTANCE);
          }
       }
       return;
    }
    public final c V2(){
       Object obj = PatchProxy.apply(null, this, EmptyPendantViewController.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.j.getValue();
    }
}
