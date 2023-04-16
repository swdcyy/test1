package com.kuaishou.live.merchant.falsepublicity.d;
import jz6.a;
import android.app.Activity;
import com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$SurveyClientPushInfoSignal;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import android.content.Context;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import oz1.b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import vf3.b;
import vf3.a;
import brd.t;
import t45.d;
import brd.z;
import cjd.e;
import erd.o;
import com.kuaishou.live.merchant.falsepublicity.a;
import com.kuaishou.live.merchant.falsepublicity.c;
import erd.g;
import crd.b;
import android.app.Dialog;
import lnc.b9;
import android.os.Bundle;
import android.view.Window;
import android.view.View;
import android.view.WindowManager$LayoutParams;
import lnc.a1;
import ekd.m1;
import android.widget.TextView;
import dg3.b;
import android.view.View$OnClickListener;
import java.lang.CharSequence;
import com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$SurveyChoice;
import dg3.d;
import dg3.e;
import java.util.concurrent.TimeUnit;
import io.reactivex.android.schedulers.a;
import dg3.c;
import com.kuaishou.live.merchant.falsepublicity.b;
import dg3.a;
import android.content.DialogInterface$OnCancelListener;

public class d extends a	// class@000cb0
{
    public TextView b;
    public TextView c;
    public TextView d;
    public TextView e;
    public TextView f;
    public LiveRoomSignalMessage$SurveyClientPushInfoSignal g;
    public ClientContent$LiveStreamPackage h;
    public b i;
    public b j;
    public static final int k;

    public void d(Activity p0,LiveRoomSignalMessage$SurveyClientPushInfoSignal p1,ClientContent$LiveStreamPackage p2){
       super(p0, 0x7f110366);
       this.g = p1;
       this.h = p2;
    }
    public void d(int p0){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, d.class, "6")) {
          return;
       }
       d th = this.h;
       b uob = b.class;
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidTwoRefs(th, Integer.valueOf(p0), null, uob, "13")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "QUESTIONAIRE";
          i3 oi3 = i3.f();
          oi3.c("is_exist", Integer.valueOf(p0));
          uElementPack.params = oi3.e();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = th;
          u1.u(1, uElementPack, uContentPack);
       }
       th = this.g;
       th = this.h;
       this.j = a.a().d(th.id, p0, th.researchId, th.anchorUserId, th.liveStreamId).observeOn(d.a).map(new e()).subscribe(a.b, c.b);
       if (this.isShowing()) {
          this.dismiss();
          b.d(this.h, 1);
       }
       return;
    }
    public void dismiss(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       super.dismiss();
       b9.a(this.i);
       return;
    }
    public void onCreate(Bundle p0){
       Window window;
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.setContentView(R.layout.arg_RES_7f0d02fa);
       Object[] objArray = null;
       int i = 0;
       if (!PatchProxy.applyVoid(objArray, this, d.class, "3")) {
          window = this.getWindow();
          if (window != null) {
             window.setGravity(80);
             window.getDecorView().setPadding(i, i, i, i);
             WindowManager$LayoutParams attributes = window.getAttributes();
             attributes.y = a1.e(60.00f);
             attributes.width = -1;
             attributes.height = -2;
             window.setAttributes(attributes);
          }
       }
       window = this.getWindow();
       if (window == null) {
          return;
       }else {
          View decorView = window.getDecorView();
          if (!PatchProxy.applyVoidOneRefs(decorView, this, d.class, "4") && decorView != null) {
             this.b = m1.f(decorView, 0x7f0a0994);
             this.c = m1.f(decorView, 0x7f0a3f2c);
             this.d = m1.f(decorView, 0x7f0a0945);
             this.e = m1.f(decorView, 0x7f0a05a5);
             this.f = m1.f(decorView, 0x7f0a05a6);
             m1.a(decorView, new b(this), R.id.close);
          }
          if (!PatchProxy.applyVoid(objArray, this, d.class, "5")) {
             this.c.setText(this.g.title);
             this.d.setText(this.g.description);
             LiveRoomSignalMessage$SurveyClientPushInfoSignal choice = this.g.choice;
             d uod = 8;
             int i1 = 1;
             if (choice != null && (choice.length >= i1 && choice[i] != null)) {
                this.e.setVisibility(i);
                this.e.setText(this.g.choice[i].choiceDesc);
                this.e.setOnClickListener(new d(this));
             }else {
                this.e.setVisibility(uod);
             }
             choice = this.g.choice;
             if (choice != null && (choice.length >= 2 && choice[i1] != null)) {
                this.f.setVisibility(i);
                this.f.setText(this.g.choice[i1].choiceDesc);
                this.f.setOnClickListener(new e(this));
             }else {
                this.f.setVisibility(uod);
             }
             if (this.g.closeDuration > null) {
                this.i = t.interval(0, 1, TimeUnit.SECONDS).subscribeOn(d.c).observeOn(a.c()).subscribe(new c(this), b.b);
             }
          }
          this.setOnCancelListener(new a(this));
          return;
       }
    }
}
