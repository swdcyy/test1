package com.kuaishou.live.core.voiceparty.userlevel.decoration.DecorationViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import androidx.lifecycle.LiveData;
import sx2.f;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.userlevel.decoration.DecorationViewController$viewModel$2;
import com.kuaishou.live.core.voiceparty.userlevel.decoration.DecorationViewController$$special$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import sx2.j;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.core.voiceparty.userlevel.decoration.DecorationViewController$$special$$inlined$viewModels$2;
import msd.a;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import androidx.lifecycle.LifecycleOwner;
import xh3.b;
import xh3.l;
import sx2.g;
import androidx.lifecycle.Observer;
import android.view.ViewGroup$LayoutParams;
import lnc.a1;
import sx2.h;
import sx2.i;
import android.view.View$OnClickListener;
import com.kwai.robust.PatchProxyResult;
import qrd.p;

public final class DecorationViewController extends ViewController	// class@001a82
{
    public final p j;
    public final int k;

    public void DecorationViewController(int p0,LiveData p1,f p2){
       a.p(p1, "dataProvider");
       a.p(p2, "decorationService");
       super();
       this.k = p0;
       this.j = new ViewModelLazy(m0.d(j.class), new DecorationViewController$$special$$inlined$viewModels$2(new DecorationViewController$$special$$inlined$viewModels$1(this)), new DecorationViewController$viewModel$2(p1, p2));
    }
    public void F2(){
       DecorationViewController uDecorationV = DecorationViewController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uDecorationV, "2")) {
          return;
       }
       this.Q2(R.layout.arg_RES_7f0d16a6);
       if (!PatchProxy.applyVoid(objArray, this, uDecorationV, "3")) {
          View view = this.A2(0x7f0a0a71);
          View view1 = this.A2(0x7f0a2dd9);
          b.c(this.A2(R.id.avatar_view), this, this.V2().f);
          LifecycleOwner lifecycleOwn = this;
          l.e(this.A2(R.id.selection_bg), lifecycleOwn, this.V2().u0(), false, 4, null);
          l.e(this.A2(R.id.lock_view), lifecycleOwn, this.V2().c, false, 4, null);
          this.V2().d.observe(this, new g(this.A2(R.id.unlock_level)));
          ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
          if (layoutParams != null) {
             if (this.k == 1) {
                layoutParams.width = a1.e(96.00f);
                layoutParams.height = a1.e(96.00f);
             }else {
                layoutParams.width = a1.e(88.00f);
                layoutParams.height = a1.e(88.00f);
             }
          }
          this.V2().e.observe(this, new h(view, view1));
          this.P2().setOnClickListener(new i(this));
       }
       return;
    }
    public final j V2(){
       Object obj = PatchProxy.apply(null, this, DecorationViewController.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.j.getValue();
    }
}
