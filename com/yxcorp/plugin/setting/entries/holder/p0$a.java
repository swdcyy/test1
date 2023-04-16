package com.yxcorp.plugin.setting.entries.holder.p0$a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.plugin.setting.entries.holder.p0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xgc.b;
import android.widget.ImageView;
import java.lang.CharSequence;
import android.widget.TextView;
import android.text.TextUtils;
import android.view.View;
import xgc.e;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import nc5.i;
import kgd.w1;
import wkd.b;
import com.kwai.component.menudot.b;
import nc5.c;
import lnc.j9;
import k2b.e0;
import ekd.m1;

public class p0$a extends PresenterV2	// class@000882
{
    public TextView p;
    public ImageView q;
    public TextView r;
    public View s;
    public TextView t;
    public View u;
    public e v;
    public boolean w;
    public c x;
    public final p0 y;

    public void p0$a(p0 p0){
       this.y = p0;
       super();
    }
    public void E8(){
       p0$a uoa = p0$a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "3")) {
          return;
       }
       int i = this.v.a();
       if (i) {
          this.q.setImageResource(i);
       }else {
          this.q.setVisibility(8);
       }
       this.p.setText(this.v.c());
       String str = this.v.b();
       if (TextUtils.isEmpty(str)) {
          this.r.setVisibility(8);
       }else {
          this.r.setVisibility(0);
          this.r.setText(str);
       }
       if (TextUtils.isEmpty(this.v.e)) {
          this.s.setVisibility(8);
       }else {
          this.t.setText(this.v.e);
       }
       this.u.setVisibility(8);
       if (!this.v.j - 15) {
          Object obj = PatchProxy.apply(objArray, this, uoa, "6");
          boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): i.c(1006);
          this.P8(b);
          this.x = new w1(this);
          b.a(0x34c80eb4).r(1006, this.x);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, p0$a.class, "5")) {
          return;
       }
       if (!this.v.j - 15) {
          b.a(0x34c80eb4).s(1006, this.x);
       }
       return;
    }
    public final void P8(boolean p0){
       p0$a uoa = p0$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "4")) {
          return;
       }
       j9.a(this.p, p0);
       i.e(1006, this.y.e);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p0$a.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a0d6d);
       this.u = m1.f(p0, 0x7f0a0d69);
       this.q = m1.f(p0, 0x7f0a0d65);
       this.r = m1.f(p0, 0x7f0a0d6a);
       this.t = m1.f(p0, 0x7f0a0d63);
       this.s = m1.f(p0, 0x7f0a0d64);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, p0$a.class, "1")) {
          return;
       }
       this.v = this.r8("entry_model");
       this.w = this.r8("show_entry_holder_spliter").booleanValue();
       return;
    }
}
