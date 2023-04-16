package com.kwai.nearby.local.tab.present.HomeLocalTopTabDisplayPresenter$a;
import android.view.GestureDetector$SimpleOnGestureListener;
import com.kwai.nearby.local.tab.present.HomeLocalTopTabDisplayPresenter;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import id7.o0;
import ld7.a;
import vc7.d0;
import qd7.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import hd7.e;
import java.util.Objects;
import lnc.i3;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import k2b.e0;
import android.text.TextUtils;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import android.view.View;
import k2b.u1;
import xl8.b;
import com.kwai.feature.api.social.nearby.model.roampanel.RoamPanelAction;
import mrd.a;

public class HomeLocalTopTabDisplayPresenter$a extends GestureDetector$SimpleOnGestureListener	// class@000fea
{
    public final HomeLocalTopTabDisplayPresenter b;

    public void HomeLocalTopTabDisplayPresenter$a(HomeLocalTopTabDisplayPresenter p0){
       this.b = p0;
       super();
    }
    public boolean onDoubleTap(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HomeLocalTopTabDisplayPresenter$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.onSingleTapConfirmed(p0);
    }
    public boolean onSingleTapConfirmed(MotionEvent p0){
       HomeLocalTopTabDisplayPresenter a;
       i3 oi3;
       o0 oo0 = o0.class;
       String str = "1";
       p0 = PatchProxy.applyOneRefs(p0, this, HomeLocalTopTabDisplayPresenter$a.class, str);
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       boolean b = false;
       if (this.b.V8()) {
          a.a();
          return b;
       }else if(this.b.t.e() && (!this.b.t.f() || !TextUtils.x(c.b()))){
          return b;
       }else {
          HomeLocalTopTabDisplayPresenter$a tb = this.b;
          a = tb.A;
          String str1 = tb.s.getText().toString();
          Objects.requireNonNull(a);
          if (!PatchProxy.applyVoidOneRefs(str1, a, oo0, str)) {
             oi3 = i3.f();
             oi3.d("name", str1);
             str1 = "306972";
             String str2 = "CLICK_NEARBY_TAB";
             String str3 = oi3.e();
             if (!PatchProxy.applyVoidThreeRefs(str1, str2, str3, null, o0.class, "5")) {
                ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
                uClickEvent.elementPackage = o0.a(str2, str3);
                uClickEvent.type = 1;
                b.a(0x4b316083).B(str1, uClickEvent, null);
             }
          }
          tb = this.b;
          a = tb.A;
          str1 = tb.s.getText().toString();
          Objects.requireNonNull(a);
          if (!PatchProxy.applyVoidOneRefs(str1, a, oo0, "3")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "NEARBY_TAB_SINGLE_SELECT_CITY_BTN";
             if (!TextUtils.isEmpty(str1)) {
                oi3 = i3.f();
                oi3.d("city_name", str1);
                uElementPack.params = oi3.e();
             }
             u1.v(true, uElementPack, null, null);
          }
          tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(null, tb, HomeLocalTopTabDisplayPresenter.class, "13")) {
             if (!tb.q.a().booleanValue()) {
                tb.r.onNext(RoamPanelAction.SMOOTH_EXPAND);
             }else {
                tb.r.onNext(RoamPanelAction.SMOOTH_COLLAPSE);
             }
          }
          return true;
       }
    }
}
