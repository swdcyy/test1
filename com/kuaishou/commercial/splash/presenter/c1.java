package com.kuaishou.commercial.splash.presenter.c1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import im8.f;
import com.kuaishou.commercial.splash.presenter.r0;
import wkd.b;
import tjc.c;
import com.kuaishou.commercial.splash.presenter.z0;
import erd.g;
import crd.b;
import brd.t;
import gz.s;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import yy.x0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.content.Context;
import mrd.c;

public class c1 extends PresenterV2	// class@0015e1
{
    public f p;
    public r0 q;
    public f r;
    public TextView s;
    public View t;
    public c u;
    public boolean v;
    public boolean w;

    public void c1(){
       super();
    }
    public void E8(){
       c1 uoc1 = c1.class;
       if (PatchProxy.applyVoid(null, this, uoc1, "3")) {
          return;
       }
       r0 or0 = this.p.get();
       this.q = or0;
       if (or0 == null) {
          return;
       }
       if (!b.a(-1608526086).S()) {
          return;
       }
       this.X7(this.u.subscribe(new z0(this)));
       if (!PatchProxy.applyVoid(null, this, uoc1, "6") && this.q.K != null) {
          uoc1 = this.t;
          if (uoc1 != null) {
             uoc1.setBackground(null);
          }
       }
       return;
    }
    public final void P8(TextView p0){
       c1 uoc1 = c1.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoc1, "8")) {
          return;
       }
       boolean b = true;
       if (!PatchProxy.applyVoid(null, this, uoc1, "7") && this.v == null) {
          this.v = b;
          x0 ox0 = this.r.get();
          if (ox0 != null) {
             ox0.k();
          }
       }
       p0.setEnabled(b);
       String str = (TextUtils.x(this.q.f))? this.getContext().getString(R.string.arg_RES_7f104838): this.q.f;
       p0.setText(str);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c1.class, "2")) {
          return;
       }
       this.s = p0.findViewById(0x7f0a3aff);
       this.t = p0.findViewById(0x7f0a3b06);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c1.class, "1")) {
          return;
       }
       this.p = this.x8("SPLASH_VIDEO_TYPE_PARAM");
       this.r = this.x8("SPLASH_AD_LOG");
       this.u = this.r8("SPLASH_VIEW_SHOW_EVENT");
       return;
    }
}
