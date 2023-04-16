package com.yxcorp.plugin.setting.entries.holder.y$a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.plugin.setting.entries.holder.y;
import com.yxcorp.plugin.setting.entries.holder.y$a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import com.kwai.framework.model.user.QCurrentUser;
import android.view.View;
import android.view.View$OnClickListener;
import kgd.t0;
import erd.g;
import crd.b;
import brd.t;
import kgd.q0;
import android.widget.ImageView;
import com.yxcorp.plugin.setting.entries.holder.x;
import kgd.s0;
import kgd.r0;
import android.app.Activity;
import a17.b$b;
import a17.b$a;
import ghd.u;
import java.lang.Integer;
import ekd.m1;

public class y$a extends PresenterV2	// class@00089f
{
    public TextView p;
    public View$OnClickListener q;
    public final y r;

    public void y$a(y p0){
       this.r = p0;
       super();
       this.q = new y$a$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, y$a.class, "3")) {
          return;
       }
       this.p.setVisibility(0);
       QCurrentUser.ME.getOnlineStatusSetting();
       this.R8(this.r.f);
       this.m8().setOnClickListener(this.q);
       y$a tr = this.r;
       this.X7(tr.g.subscribe(new t0(this), tr.h));
       this.r.e.setOnClickListener(new q0(this));
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, y$a.class, "1")) {
          return;
       }
       this.r.h = x.b;
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, y$a.class, "5")) {
          return;
       }
       y$a tr = this.r;
       u.b(tr.a, tr.h, null, new s0(this), new r0(this));
       return;
    }
    public final void R8(int p0){
       y$a uoa = y$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "4")) {
          return;
       }
       if (p0 != 1) {
          if (p0 != 2) {
             if (p0 == 3) {
                this.p.setText(R.string.arg_RES_7f103ae1);
             }
          }else {
             this.p.setText(R.string.arg_RES_7f103afd);
          }
       }else {
          this.p.setText(R.string.arg_RES_7f1017e4);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y$a.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a0d6a);
       this.r.e = m1.f(p0, 0x7f0a0d61);
       return;
    }
}
