package com.yxcorp.gifshow.music.cloudmusic.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import lob.l0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import jqb.j;
import com.yxcorp.gifshow.music.cloudmusic.g$a;
import android.view.View$OnLayoutChangeListener;
import android.view.View;
import com.yxcorp.gifshow.music.cloudmusic.g$b;
import com.google.android.material.appbar.AppBarLayout$c;
import com.google.android.material.appbar.AppBarLayout;
import lob.n0;
import lob.m0;
import erd.g;
import crd.b;
import brd.t;
import ekd.m1;
import com.yxcorp.gifshow.music.cloudmusic.MusicFragment;

public class g extends PresenterV2	// class@002017
{
    public int A;
    public int B;
    public int C;
    public int D;
    public boolean E;
    public int F;
    public final AppBarLayout$c G;
    public t p;
    public MusicFragment q;
    public AppBarLayout r;
    public View s;
    public View t;
    public View u;
    public View v;
    public View w;
    public View x;
    public int y;
    public int z;
    public static final int H;
    public static final int I;

    static {
       g.H = a1.e(16.00f);
       g.I = a1.e(32.00f);
    }
    public void g(){
       super();
       this.y = 0;
       this.G = new l0(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, g.class, "3")) {
          return;
       }
       j.g = j.b;
       this.t.addOnLayoutChangeListener(new g$a(this));
       this.v.addOnLayoutChangeListener(new g$b(this));
       this.r.c(this.G);
       this.X7(this.p.subscribe(new n0(this), new m0(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, g.class, "4")) {
          return;
       }
       this.r.o(this.G);
       return;
    }
    public final int P8(){
       return (((this.C - this.D) / 2) - g.H);
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a37a6);
       this.r = m1.f(p0, 0x7f0a2c5d);
       this.t = m1.f(p0, 0x7f0a1407);
       this.u = m1.f(p0, 0x7f0a3f7b);
       this.v = m1.f(p0, 0x7f0a1404);
       this.w = m1.f(p0, 0x7f0a37a8);
       this.x = m1.f(p0, 0x7f0a0ca8);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       this.p = this.r8("MUSIC_SEARCH_FRAGMENT");
       this.q = this.r8("MUSIC_FRAGMENT");
       return;
    }
}
