package com.kuaishou.live.common.core.component.multipk.game.vc.bangs.LiveMultiPkPunishBangsVC;
import com.kuaishou.live.viewcontroller.ViewController;
import ut1.d;
import zs1.b;
import ft1.b;
import ws1.c;
import msd.a;
import st1.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.multipk.game.vc.bangs.LiveMultiPkPunishBangsVC$countDownViewModel$2;
import com.kuaishou.live.common.core.component.multipk.game.vc.bangs.LiveMultiPkPunishBangsVC$$special$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import lt1.e;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.common.core.component.multipk.game.vc.bangs.LiveMultiPkPunishBangsVC$$special$$inlined$viewModels$2;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.common.core.component.multipk.game.vc.bangs.LiveMultiPkPunishBangsVC$c;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.multipk.game.vc.bangs.LiveMultiPkPunishBangsVC$d;
import android.widget.TextView;
import xh3.g;
import com.kuaishou.live.common.core.component.multipk.game.vc.bangs.LiveMultiPkPunishBangsVC$b;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import com.yxcorp.plugin.live.widget.LiveNoShrinkTextView;
import lt1.d;
import java.lang.Boolean;
import lt1.c;
import java.lang.CharSequence;
import qrd.p;

public class LiveMultiPkPunishBangsVC extends ViewController	// class@00160d
{
    public View j;
    public TextView k;
    public TextView l;
    public e m;
    public final p n;
    public final d o;
    public final b p;
    public final b q;
    public final c r;
    public final a s;
    public final a t;

    public void LiveMultiPkPunishBangsVC(d p0,b p1,b p2,c p3,a p4,a p5){
       a.p(p0, "countDownModel");
       a.p(p1, "coreModel");
       a.p(p2, "gameModel");
       a.p(p3, "pkContainerLayout");
       a.p(p4, "isAnchor");
       a.p(p5, "logDelegate");
       super();
       this.o = p0;
       this.p = p1;
       this.q = p2;
       this.r = p3;
       this.s = p4;
       this.t = p5;
       this.n = new ViewModelLazy(m0.d(e.class), new LiveMultiPkPunishBangsVC$$special$$inlined$viewModels$2(new LiveMultiPkPunishBangsVC$$special$$inlined$viewModels$1(this)), new LiveMultiPkPunishBangsVC$countDownViewModel$2(this));
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, LiveMultiPkPunishBangsVC.class, "2")) {
          return;
       }
       this.X2().w0().observe(this, new LiveMultiPkPunishBangsVC$c(this));
       this.X2().v0().observe(this, new LiveMultiPkPunishBangsVC$d(this));
       return;
    }
    public void V2(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiPkPunishBangsVC.class, "4")) {
          return;
       }
       a.p(p0, "viewModel");
       LiveMultiPkPunishBangsVC tl = this.l;
       if (tl != null) {
          g.a(tl, this, p0.u0());
       }
       tl = this.k;
       if (tl != null) {
          tl.setOnClickListener(new LiveMultiPkPunishBangsVC$b(p0));
       }
       return;
    }
    public View W2(ViewGroup p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveMultiPkPunishBangsVC.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "root");
       a.p(p1, "title");
       Context context = p0.getContext();
       a.o(context, "context");
       this.l = d.b(context);
       if (this.s.invoke().booleanValue()) {
          this.k = d.a(context, 0x7f102934);
       }
       return c.d(c.d(new c(context).b(p1), this.l, null, 2, null), this.k, null, 2, null).e();
    }
    public final e X2(){
       Object obj = PatchProxy.apply(null, this, LiveMultiPkPunishBangsVC.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.n.getValue();
    }
    public final View Y2(){
       return this.j;
    }
    public void Z2(){
    }
}
