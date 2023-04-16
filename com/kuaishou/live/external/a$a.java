package com.kuaishou.live.external.a$a;
import k51.c;
import com.kuaishou.live.external.a;
import com.kuaishou.live.external.a$a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.button.SlipSwitchButton$b;
import com.kwai.library.widget.button.SlipSwitchButton;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import wg3.a;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;
import o02.f;
import o02.e;
import brd.t;
import cjd.e;
import erd.o;
import com.kuaishou.live.external.b;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import java.lang.Boolean;
import ekd.m1;
import android.widget.TextView;

public class a$a extends c	// class@001b6c
{
    public SlipSwitchButton p;
    public TextView q;
    public View r;
    public SlipSwitchButton$b s;
    public final a t;
    public static String sLivePresenterClassName = "AnchorWeeklyReportEntryHolder$DisablePresenter";

    public void a$a(a p0){
       this.t = p0;
       super();
       this.s = new a$a$a(this);
    }
    public void F8(){
       a$a uoa = a$a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "3")) {
          return;
       }
       a$a tp = this.p;
       if (tp != null) {
          tp.setOnSwitchChangeListener(this.s);
       }
       if (!PatchProxy.applyVoid(objArray, this, uoa, "2")) {
          this.m8().setVisibility(8);
          if (!a.a.getBoolean(b.d("user")+"disableAuthorWeeklyReportSubscribe", true)) {
             e.a().v0().map(new e()).subscribe(new b(this), Functions.d());
          }
       }
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "6")) {
          return;
       }
       a$a tp = this.p;
       if (tp != null) {
          tp.setEnabled(true);
       }
       return;
    }
    public void R8(boolean p0){
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "4")) {
          return;
       }
       uoa = this.p;
       if (uoa != null) {
          uoa.setSwitch(p0);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a3c49);
       this.p = m1.f(p0, 0x7f0a3c3f);
       this.r = m1.f(p0, 0x7f0a0d64);
       return;
    }
}
