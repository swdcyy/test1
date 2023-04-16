package com.yxcorp.gifshow.comment.presenter.global.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.comment.presenter.global.g$a;
import com.yxcorp.gifshow.comment.presenter.global.g$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.comment.log.a;
import java.util.Set;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import qvb.q;
import qvb.j;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import el9.c0;
import erd.g;
import crd.b;
import el9.a0;
import io.reactivex.internal.functions.Functions;
import el9.y;
import el9.z;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import el9.b0;
import java.util.Objects;
import android.os.SystemClock;
import com.yxcorp.gifshow.comment.CommentParams;
import com.yxcorp.gifshow.comment.CommentConfig;
import yk9.d;

public class g extends PresenterV2	// class@0010f8
{
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public final n F;
    public final q G;
    public RecyclerFragment p;
    public CommentParams q;
    public CommentConfig r;
    public d s;
    public a t;
    public Set u;
    public t v;
    public t w;
    public t x;
    public boolean y;
    public long z;

    public void g(){
       super();
       this.F = new g$a(this);
       this.G = new g$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, g.class, "2")) {
          return;
       }
       this.y = false;
       this.C = true;
       this.t.h(false);
       this.u.add(this.F);
       this.p.q().h(this.G);
       this.X7(this.p.m().subscribe(new c0(this)));
       g e = Functions.e;
       this.X7(this.v.subscribe(new a0(this), e));
       this.X7(this.w.subscribe(new y(this), e));
       this.X7(this.x.subscribe(new z(this)));
       this.X7(this.p.Z0().subscribe(new b0(this), e));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, g.class, "5")) {
          return;
       }
       this.u.remove(this.F);
       this.p.q().f(this.G);
       return;
    }
    public boolean P8(){
       boolean b = (this.C != null && (this.A != null && this.D != null))? true: false;
       return b;
    }
    public final void R8(){
       g tt;
       a uoa = a.class;
       String str = "3";
       if (PatchProxy.applyVoid(null, this, g.class, str)) {
          return;
       }
       if (this.P8() && this.E == null) {
          this.t.f();
          tt = this.t;
          Objects.requireNonNull(tt);
          if (!PatchProxy.applyVoid(null, tt, uoa, "2")) {
             tt.j();
          }
          this.E = true;
       }else if(this.E != null && !this.P8()){
          tt = this.t;
          Objects.requireNonNull(tt);
          if (!PatchProxy.applyVoid(null, tt, uoa, str)) {
             tt.i();
          }
          this.E = false;
       }
       return;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, g.class, "4")) {
          return;
       }
       if (this.B != null && (this.A != null && !this.z)) {
          this.z = SystemClock.elapsedRealtime();
       }
    label_0022 :
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       this.q = this.q8(CommentParams.class);
       this.r = this.q8(CommentConfig.class);
       this.s = this.q8(d.class);
       this.t = this.q8(a.class);
       this.u = this.r8("COMMENT_SCROLL_LISTENERS");
       this.v = this.r8("COMMENT_PAGES_ATTACH_OBSERVABLE");
       this.w = this.r8("COMMENT_SHOW_PANEL_OBSERVABLE");
       this.x = this.r8("COMMENT_HIDE_PANEL_OBSERVABLE");
       return;
    }
}
