package com.kuaishou.live.core.voiceparty.userlevel.levelcard.detailinfo.DetailInfoCardItemViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import androidx.lifecycle.LiveData;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ux2.i;
import android.view.View;
import java.util.Objects;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.kuaishou.live.core.voiceparty.userlevel.levelcard.detailinfo.DetailInfoCardItemViewController$onCreate$viewModel$2;
import com.kuaishou.live.core.voiceparty.userlevel.levelcard.detailinfo.DetailInfoCardItemViewController$onCreate$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import ux2.j;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.core.voiceparty.userlevel.levelcard.detailinfo.DetailInfoCardItemViewController$onCreate$$inlined$viewModels$2;
import msd.a;
import qrd.p;
import ux2.b;
import androidx.lifecycle.Observer;
import com.kuaishou.live.mvvm.viewmodel.state.LiveDataOperators;
import ux2.c;
import ux2.d;
import ux2.e;
import ux2.f;
import ux2.g;
import ux2.h;

public final class DetailInfoCardItemViewController extends ViewController	// class@001aab
{
    public final LiveData j;

    public void DetailInfoCardItemViewController(LiveData p0){
       a.p(p0, "dataProvider");
       super();
       this.j = p0;
    }
    public void F2(){
       String str = "1";
       if (PatchProxy.applyVoid(null, this, DetailInfoCardItemViewController.class, str)) {
          return;
       }
       this.Q2(R.layout.arg_RES_7f0d0e5b);
       View view = this.P2();
       Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
       i oi = new i(view, this);
       j value = new ViewModelLazy(m0.d(j.class), new DetailInfoCardItemViewController$onCreate$$inlined$viewModels$2(new DetailInfoCardItemViewController$onCreate$$inlined$viewModels$1(this)), new DetailInfoCardItemViewController$onCreate$viewModel$2(this)).getValue();
       if (!PatchProxy.applyVoidOneRefs(value, oi, i.class, str)) {
          a.p(value, "detailInfoCardItemViewModel");
          value.a.observe(oi.l, new b(oi));
          LiveDataOperators.c(value.c, value.d).observe(oi.l, new c(oi));
          LiveDataOperators.c(value.i, value.j).observe(oi.l, new d(oi));
          value.o.observe(oi.l, new e(oi));
          value.k.observe(oi.l, new f(oi));
          value.b.observe(oi.l, new g(oi));
          value.e.observe(oi.l, new h(oi));
       }
       return;
    }
}
