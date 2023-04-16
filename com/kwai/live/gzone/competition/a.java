package com.kwai.live.gzone.competition.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import k47.a;
import h47.b;
import j47.d;
import android.view.View;
import android.widget.TextView;
import e57.a;

public class a extends PresenterV2	// class@000cc2
{
    public b p;
    public TextView q;
    public a r;
    public d s;

    public void a(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       a ts = this.s;
       if (ts != null) {
          a uoa = new a(this);
          this.p = uoa;
          ts.Q1(uoa);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       a ts = this.s;
       if (ts != null) {
          a tp = this.p;
          if (tp != null) {
             ts.H8(tp);
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.q = p0.findViewById(0x7f0a1ecd);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.r = this.s8(a.class);
       this.s = this.s8(d.class);
       return;
    }
}
