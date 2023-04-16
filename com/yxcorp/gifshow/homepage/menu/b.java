package com.yxcorp.gifshow.homepage.menu.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.QCurrentUser;
import lnc.u1;
import com.yxcorp.gifshow.util.rx.RxBus;
import jsa.l;
import brd.t;
import t45.d;
import brd.z;
import qta.w;
import erd.g;
import crd.b;
import tt5.a;
import qta.x;
import xl8.b;
import qta.u;
import qta.v;
import com.yxcorp.gifshow.homepage.menu.b$a;
import android.view.View$OnClickListener;
import android.view.View;
import java.lang.CharSequence;
import androidx.appcompat.widget.AppCompatTextView;
import tra.a;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.yxcorp.gifshow.homepage.menu.g;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import qta.y;
import com.kwai.robust.PatchProxyResult;
import wh5.c;
import tkd.b;
import tkd.d;
import vt5.g;
import android.widget.TextView;
import ekd.m1;
import com.kwai.library.widget.textview.SizeAdjustableTextView;
import com.yxcorp.gifshow.homepage.menu.a;
import b66.k$a;

public class b extends PresenterV2	// class@001771
{
    public View p;
    public View q;
    public SizeAdjustableTextView r;
    public a s;
    public g t;
    public b u;
    public b v;

    public void b(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       if (!QCurrentUser.ME.isLogined()) {
          return;
       }
       u1.a(this);
       RxBus f = RxBus.f;
       z a = d.a;
       this.X7(f.f(l.class).observeOn(a).subscribe(new w(this)));
       this.X7(f.f(a.class).observeOn(a).subscribe(new x(this)));
       this.R8();
       this.X7(this.u.observable().subscribe(new u(this)));
       this.X7(this.v.observable().subscribe(new v(this)));
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       b tp = this.p;
       if (tp == null) {
          return;
       }
       tp.setOnClickListener(new b$a(this));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "5")) {
          return;
       }
       u1.b(this);
       return;
    }
    public final void P8(){
       b uob = b.class;
       if (PatchProxy.applyVoid(null, this, uob, "11")) {
          return;
       }
       b tp = this.p;
       if (tp != null && !tp.getVisibility()) {
          String str = "";
          String str1 = this.r.getText().toString();
          int i = a.b() ^ 0x01;
          if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidThreeRefs(str, str1, Boolean.valueOf(i), this, b.class, "12")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "MENU_BUTTON";
             uElementPack.params = this.t.d(str, str1, i, 0, "home").e();
             u1.u0(3, uElementPack, new ClientContent$ContentPackage());
          }
       }
       return;
    }
    public final void R8(){
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "10")) {
          return;
       }
       if (this.p == null || (this.q != null && this.r != null)) {
          Object obj = PatchProxy.apply(objArray, objArray, y.class, "4");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(!c.b() && d.a(0x348c642a).Wx()){
             b = true;
          }else {
             b = false;
          }
          int i = 8;
          if (b) {
             this.p.setVisibility(0);
          }else {
             this.p.setVisibility(i);
          }
          if (a.b()) {
             this.q.setVisibility(i);
          }else {
             this.q.setVisibility(0);
          }
          if (d.a(0x348c642a).EL()) {
             this.r.setText(R.string.arg_RES_7f1031fc);
          }else {
             this.r.setText(R.string.arg_RES_7f1031fd);
          }
       }
    label_0082 :
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a3c7d);
       this.q = m1.f(p0, 0x7f0a078e);
       this.r = m1.f(p0, 0x7f0a078f);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.s = this.r8("HOME_MENU_CLOSE_HELPER");
       this.t = this.r8("HOME_MENU_LOGGER_V3");
       this.u = this.r8("HOME_SLIDE_PANEL_STATE");
       this.v = this.r8("MENU_EDITOR_OPEN_STATE");
       return;
    }
    public void onEventMainThread(k$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "6")) {
          return;
       }
       if (p0.a == 2) {
          this.R8();
       }
       return;
    }
}
