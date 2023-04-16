package com.kuaishou.live.common.core.component.hotspot.ranklist.LiveHotSpotRankListViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import java.lang.String;
import yn1.h;
import yn1.i;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.hotspot.ranklist.LiveHotSpotRankListViewController$onCreate$viewModel$2;
import com.kuaishou.live.common.core.component.hotspot.ranklist.LiveHotSpotRankListViewController$onCreate$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import yn1.j;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.common.core.component.hotspot.ranklist.LiveHotSpotRankListViewController$onCreate$$inlined$viewModels$2;
import msd.a;
import com.kuaishou.live.common.core.component.hotspot.ranklist.LiveHotSpotRankListDataBinding;
import android.view.View;
import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import qrd.p;
import androidx.lifecycle.LiveData;
import yn1.a;
import androidx.lifecycle.Observer;
import yn1.b;
import yn1.c;
import com.kuaishou.live.mvvm.viewmodel.state.LiveEvent;
import yn1.e;
import yn1.f;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import yn1.g;

public final class LiveHotSpotRankListViewController extends ViewController	// class@00143b
{
    public final String j;
    public final h k;
    public final i l;

    public void LiveHotSpotRankListViewController(String p0,h p1,i p2){
       a.p(p1, "delegate");
       a.p(p2, "logger");
       super();
       this.j = p0;
       this.k = p1;
       this.l = p2;
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, LiveHotSpotRankListViewController.class, "1")) {
          return;
       }
       this.Q2(R.layout.arg_RES_7f0d0c29);
       LiveHotSpotRankListDataBinding liveHotSpotR = new LiveHotSpotRankListDataBinding(this, this.P2(), this.B2(), this.k, this.l);
       j value = new ViewModelLazy(m0.d(j.class), new LiveHotSpotRankListViewController$onCreate$$inlined$viewModels$2(new LiveHotSpotRankListViewController$onCreate$$inlined$viewModels$1(this)), new LiveHotSpotRankListViewController$onCreate$viewModel$2(this)).getValue();
       if (!PatchProxy.applyVoidOneRefs(value, v0, LiveHotSpotRankListDataBinding.class, "3")) {
          a.p(value, "viewModel");
          value.x0().observe(v0.i, new a(v0));
          value.v0().observe(v0.i, new b(v0));
          value.c.observe(v0.i, new c(v0));
          value.w0().observe(v0.i, new e(v0, value));
          v0.b.setOnClickListener(new f(value));
          value.d.observe(v0.i, new g(v0));
       }
       return;
    }
}
