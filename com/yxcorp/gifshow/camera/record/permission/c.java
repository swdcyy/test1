package com.yxcorp.gifshow.camera.record.permission.c;
import ml8.d;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import com.tbruyelle.rxpermissions2.g;
import android.app.Activity;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import oe6.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import android.content.Context;
import com.yxcorp.gifshow.util.PermissionUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import java.lang.CharSequence;
import android.view.View;
import com.yxcorp.utility.n;
import brd.t;
import bn.a;
import gg9.w;
import erd.o;
import gg9.r;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import gg9.x;
import gg9.s;
import lnc.s6;
import gg9.y;
import gg9.t;
import gg9.v;
import gg9.u;
import ekd.m1;
import android.widget.ImageView;
import android.widget.Button;
import gg9.q;
import android.view.View$OnClickListener;

public class c implements d	// class@000e9e
{
    public ViewGroup b;
    public TextView c;
    public TextView d;
    public TextView e;
    public Button f;
    public ImageView g;
    public ImageView h;
    public boolean i;
    public boolean j;
    public final g k;
    public GifshowActivity l;

    public void c(GifshowActivity p0){
       super();
       this.k = new g(p0);
       this.l = p0;
    }
    public void a(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "4")) {
          return;
       }
       if (p0) {
          this.b(824);
       }
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putBoolean("camera_permission_guide_show", true);
       g.a(uEditor);
       this.l.finish();
       this.l.overridePendingTransition(0, 0);
       return;
    }
    public final void b(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "6")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action = p0;
       uElementPack.type = 1;
       uElementPack.name = "camera_permission";
       u1.u(p0, uElementPack, new ClientContent$ContentPackage());
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       this.d(true, false);
       return;
    }
    public final void d(boolean p0,boolean p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoc, "5")) {
          return;
       }
       String str = "android.permission.CAMERA";
       p0 = PermissionUtils.a(this.l, str);
       boolean b = PermissionUtils.a(this.l, "android.permission.RECORD_AUDIO");
       c uoc1 = 1;
       if (!p0 || (!b && (!p1 || (!p0 && (!b && (this.j == null || this.i == null)))))) {
          uoc1 = null;
       }
    label_0041 :
       int i = 8;
       if (uoc1) {
          this.b.setVisibility(i);
          this.a(false);
          return;
       }else {
          this.b.setVisibility(false);
          this.c.setEnabled((p0 ^ 0x01));
          uoc1 = this.c;
          String str1 = (p0)? this.l.getString(R.string.arg_RES_7f1001c4): this.l.getString(R.string.arg_RES_7f1001bb);
          uoc1.setText(str1);
          uoc1 = this.g;
          int i1 = (p0)? 0: 8;
          n.Y(uoc1, i1, false);
          this.d.setEnabled((b ^ 0x01));
          uoc1 = this.d;
          str1 = (b)? this.l.getString(R.string.arg_RES_7f1001c5): this.l.getString(R.string.arg_RES_7f1001bc);
          uoc1.setText(str1);
          uoc1 = this.h;
          if (b) {
             i = 0;
          }
          n.Y(uoc1, i, false);
          if (!p0) {
             a.b(this.c).flatMap(new w(this)).subscribe(new r(this), Functions.d());
          }
          if (!b) {
             a.b(this.d).flatMap(new x(this)).subscribe(new s(this), Functions.d());
          }
          if (s6.x() == 2) {
             a.b(this.f).flatMap(new y(this)).subscribe(new t(this), Functions.d());
          }else {
             a.b(this.f).flatMap(new v(this)).subscribe(new u(this, PermissionUtils.l(this.l, str), PermissionUtils.l(this.l, "android.permission.RECORD_AUDIO")), Functions.d());
          }
          return;
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       this.c = m1.f(p0, 0x7f0a110a);
       this.g = m1.f(p0, 0x7f0a1503);
       this.f = m1.f(p0, 0x7f0a110c);
       this.d = m1.f(p0, 0x7f0a110d);
       this.e = m1.f(p0, 0x7f0a1109);
       this.b = m1.f(p0, 0x7f0a110b);
       this.h = m1.f(p0, 0x7f0a14ef);
       m1.a(p0, new q(this), R.id.permission_button_close);
       return;
    }
}
