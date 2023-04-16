package com.yxcorp.gifshow.music.cloudmusic.a;
import xob.f;
import lnc.a1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yob.b;
import lob.a;
import erd.g;
import crd.b;
import eoc.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import yob.a;
import lob.c;
import e46.a;
import lob.b;
import lob.d;
import lob.e;
import brd.t;
import java.lang.Boolean;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.music.cloudmusic.a$a;
import android.view.View$OnLayoutChangeListener;
import com.yxcorp.gifshow.music.cloudmusic.a$b;
import android.view.View$OnClickListener;

public class a extends f	// class@001fed
{
    public BaseFragment r;
    public t s;
    public View t;
    public View u;
    public View v;
    public boolean w;
    public static final int x;
    public static final int y;

    static {
       a.x = a1.e(63.00f);
       a.y = a1.e(13.00f);
    }
    public void a(){
       super();
       this.w = false;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       super.E8();
       this.X7(f.a(b.class, new a(this)));
       this.X7(f.a(a.class, new c(this)));
       this.X7(f.a(a.class, new b(this)));
       this.X7(this.s.subscribe(new d(this), new e(this)));
       return;
    }
    public void V8(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "9")) {
          return;
       }
       uoa = this.r;
       if (uoa != null) {
          a tu = this.u;
          if (tu != null) {
             int i = (p0 && (uoa.K0() && this.w == null))? 0: 8;
             tu.setVisibility(i);
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       super.doBindView(p0);
       this.t = p0;
       this.u = m1.f(p0, 0x7f0a076e);
       p0 = m1.f(p0, R.id.import_music_button);
       this.v = p0;
       if (p0 != null) {
          p0.addOnLayoutChangeListener(new a$a(this));
          this.v.setOnClickListener(new a$b(this, false, 2000));
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.s = this.r8("MUSIC_SEARCH_FRAGMENT");
       return;
    }
}
