package com.kuaishou.live.common.core.component.multiline.renderpart.basicline.LiveAudienceMultiLineBasicViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import oq1.e;
import oq1.b;
import sq1.a;
import nq1.a;
import sz1.e;
import xp5.i;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.ViewModelProvider;
import com.kuaishou.live.common.core.component.multiline.renderpart.basicline.LiveAudienceMultiLineBasicViewController$b;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewModelProvider$Factory;
import com.kuaishou.live.common.core.component.multiline.renderpart.basicline.LiveAudienceMultiLineBasicViewController$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.view.ViewGroup;
import ir1.c;
import androidx.lifecycle.ViewModel;
import com.kuaishou.live.common.core.component.multiline.renderpart.basicline.databinding.LiveAudienceMultiLineBasicDataBinding;
import hr1.a;
import ir1.b;
import com.kuaishou.live.common.core.component.multiline.renderpart.basicline.LiveAudienceMultiLineBasicViewController$onCreate$1;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;
import ir1.a;
import msd.a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.multiline.renderpart.basicline.databinding.a;
import com.kwai.robust.PatchProxyResult;
import jr1.a;

public class LiveAudienceMultiLineBasicViewController extends ViewController	// class@001548
{
    public final ViewModelProvider j;
    public ViewGroup k;
    public final a l;
    public LiveAudienceMultiLineBasicDataBinding m;
    public final e n;
    public final b o;
    public final a p;
    public final a q;
    public final e r;
    public final i s;

    public void LiveAudienceMultiLineBasicViewController(e p0,b p1,a p2,a p3,e p4,i p5){
       a.p(p1, "lineLogParamsProvider");
       a.p(p2, "roomDelegate");
       a.p(p3, "lineBasicModel");
       a.p(p4, "interactManager");
       a.p(p5, "logPackageProvider");
       super();
       this.n = p0;
       this.o = p1;
       this.p = p2;
       this.q = p3;
       this.r = p4;
       this.s = p5;
       this.j = new ViewModelProvider(this, new LiveAudienceMultiLineBasicViewController$b(this));
       this.l = new LiveAudienceMultiLineBasicViewController$a(this);
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceMultiLineBasicViewController.class, "1")) {
          return;
       }
       this.Q2(R.layout.arg_RES_7f0d0a23);
       this.k = this.A2(0x7f0a21c3);
       ViewModel viewModel = this.j.get(c.class);
       a.o(viewModel, "viewModelProvider.get\(Li¡­sicViewModel::class.java\)");
       LiveAudienceMultiLineBasicDataBinding liveAudience = new LiveAudienceMultiLineBasicDataBinding(this.n, this.o, this.p, this.l, viewModel, this.r, this.s);
       this.m = v1;
       b uob = new b(this.l);
       LiveAudienceMultiLineBasicViewController tk = this.k;
       if (tk == null) {
          a.S("topTagContainer");
       }
       LiveAudienceMultiLineBasicViewController$onCreate$1 oonCreate$1 = new LiveAudienceMultiLineBasicViewController$onCreate$1(this);
       if (!PatchProxy.applyVoidFourRefs(this, tk, viewModel, oonCreate$1, uob, b.class, "1")) {
          a.p(this, "lifecycleOwner");
          a.p(tk, "tagViewContainer");
          a.p(viewModel, "viewModel");
          a.p(oonCreate$1, "getTopTagVc");
          LiveData liveData = Transformations.distinctUntilChanged(viewModel.u0());
          a.h(liveData, "Transformations.distinctUntilChanged\(this\)");
          liveData.observe(this, new a(uob, tk, oonCreate$1));
       }
       return;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceMultiLineBasicViewController.class, "3")) {
          return;
       }
       LiveAudienceMultiLineBasicViewController tm = this.m;
       if (tm == null) {
          a.S("dataBinding");
       }
       tm.d();
       return;
    }
    public ViewController V2(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceMultiLineBasicViewController.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a();
    }
}
