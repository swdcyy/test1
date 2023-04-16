package com.kuaishou.live.core.show.wealthgrade.privilegedetail.r;
import k51.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.wealthgrade.privilegedetail.p;
import java.lang.CharSequence;
import android.widget.TextView;
import android.text.TextUtils;
import qm2.e0;
import android.view.View$OnClickListener;
import android.view.View;
import com.kwai.library.widget.button.SlipSwitchButton;
import com.kuaishou.live.core.show.wealthgrade.privilegedetail.q;
import com.kuaishou.live.core.show.wealthgrade.privilegedetail.p$a;
import java.lang.Boolean;
import brd.t;
import t45.d;
import brd.z;
import qm2.g0;
import qm2.h0;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ekd.m1;

public class r extends c	// class@001282
{
    public TextView p;
    public TextView q;
    public SlipSwitchButton r;
    public p s;
    public static String sLivePresenterClassName = "LiveWealthGradeSettingItemViewPresenter";

    public void r(){
       super();
    }
    public void E8(){
       r or = r.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, or, "2")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, or, "4")) {
          this.p.setText(this.s.a);
          if (TextUtils.isEmpty(this.s.b)) {
             this.q.setVisibility(8);
          }else {
             this.q.setVisibility(0);
             this.q.setText(this.s.b);
             this.q.setOnClickListener(new e0(this));
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, or, "5")) {
          if (this.s.d != null) {
             this.r.setVisibility(8);
          }else {
             this.r.setVisibility(0);
             this.r.setSwitch(this.s.c);
             if (this.s.e != null) {
                this.r.setOnlyResponseClick(true);
                this.r.setOnClickListener(new q(this));
             }
          }
       }
       return;
    }
    public final void P8(p$a p0,boolean p1){
       r or = r.class;
       if (PatchProxy.isSupport(or) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, or, "6")) {
          return;
       }
       this.r.setSwitch(p1);
       t ot = p0.b(p1);
       if (ot == null) {
          this.r.setEnabled(true);
          return;
       }else {
          this.X7(ot.observeOn(d.a).subscribe(new g0(this, p1), new h0(this, p1)));
          return;
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "3")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a2826);
       this.q = m1.f(p0, 0x7f0a2824);
       this.r = m1.f(p0, 0x7f0a2825);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, r.class, "1")) {
          return;
       }
       this.s = this.q8(p.class);
       return;
    }
}
