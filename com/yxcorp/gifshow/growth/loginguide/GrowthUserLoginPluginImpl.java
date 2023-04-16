package com.yxcorp.gifshow.growth.loginguide.GrowthUserLoginPluginImpl;
import com.yxcorp.gifshow.plugin.impl.growth.GrowthUserLoginPlugin;
import com.yxcorp.gifshow.growth.loginguide.GrowthUserLoginPluginImpl$a;
import nsd.u;
import java.lang.Object;
import com.yxcorp.gifshow.plugin.impl.growth.GrowthUserLoginPlugin$LoginShowType;
import java.util.ArrayList;
import com.yxcorp.gifshow.growth.loginguide.GrowthUserLoginPluginImpl$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.switchconfig.a;
import io7.f;
import com.google.gson.JsonElement;
import fg6.a;
import fpa.b;
import java.lang.reflect.Type;
import el.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.plugin.impl.growth.GrowthUserLoginPlugin$UserGrowthLoginConfig;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import fpa.d;
import com.yxcorp.gifshow.util.rx.RxBus;
import zca.b;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.growth.loginguide.GrowthUserLoginPluginImpl$disposable$1;
import fpa.c;
import msd.l;
import erd.g;
import crd.b;
import tkd.b;
import tkd.d;
import pv5.c;
import ov5.a;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.gifshow.plugin.impl.growth.GrowthUserLoginPlugin$a;
import androidx.fragment.app.FragmentActivity;
import java.lang.Integer;
import qe6.b;
import q2b.h$b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import k2b.u1;
import java.util.Objects;
import vsd.d;
import nsd.m0;
import ou5.b;
import fpa.e;
import com.kwai.feature.api.social.login.model.LoginParams;
import ou5.a;
import fpa.h;
import cra.b0;
import fpa.a;
import java.lang.Enum;
import java.lang.System;
import vma.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import wq6.l;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import hpa.f;
import com.yxcorp.gifshow.util.DateUtils;
import com.kwai.library.widget.popup.common.c;
import hpa.d;

public class GrowthUserLoginPluginImpl implements GrowthUserLoginPlugin	// class@001427
{
    public GrowthUserLoginPlugin$LoginShowType b;
    public boolean c;
    public long d;
    public long e;
    public ArrayList f;
    public GrowthUserLoginPlugin$UserGrowthLoginConfig g;
    public boolean h;
    public d i;
    public boolean j;
    public a k;
    public static final GrowthUserLoginPluginImpl$a l;

    static {
       GrowthUserLoginPluginImpl.l = new GrowthUserLoginPluginImpl$a(null);
    }
    public void GrowthUserLoginPluginImpl(){
       super();
       GrowthUserLoginPlugin$LoginShowType oNE_DAY = GrowthUserLoginPlugin$LoginShowType.ONE_DAY;
       this.b = oNE_DAY;
       this.f = new ArrayList();
       this.k = new GrowthUserLoginPluginImpl$b(this);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, GrowthUserLoginPluginImpl.class, "13")) {
       }else {
          f uof = a.t().f("xinHuiUserRegisterPopupConfig");
          if (uof != null) {
             JsonElement jsonElement = uof.c();
             if (jsonElement != null) {
                this.h = true;
                this.g = a.a.i(jsonElement.toString(), new b().getType());
                GrowthUserLoginPlugin$UserGrowthLoginConfig userGrowthLo = this.uT();
                if (userGrowthLo != null) {
                   objArray = Boolean.valueOf(userGrowthLo.getShowEveryDay());
                }
                a.m(objArray);
                if (!objArray.booleanValue()) {
                   oNE_DAY = GrowthUserLoginPlugin$LoginShowType.THREE_DAY;
                }
                this.b = oNE_DAY;
             }
          }
          this.n();
          this.i = new d();
       }
       RxBus.f.f(b.class).observeOn(d.a).subscribe(new c(new GrowthUserLoginPluginImpl$disposable$1(this)));
       d.a(0x6154d94e).xI(this.k);
       return;
    }
    public boolean BH(){
       QCurrentUser obj = PatchProxy.apply(null, this, GrowthUserLoginPluginImpl.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = QCurrentUser.me();
       a.o(obj, "QCurrentUser.me\(\)");
       return (obj.isLogined() ^ 0x01);
    }
    public boolean Ck(){
       return this.h;
    }
    public void Cs(ArrayList p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthUserLoginPluginImpl.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.f = p0;
       return;
    }
    public void H8(GrowthUserLoginPlugin$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthUserLoginPluginImpl.class, "8")) {
          return;
       }
       a.p(p0, "strategy");
       this.RA().remove(p0);
       return;
    }
    public void HA(FragmentActivity p0,int p1,GrowthUserLoginPlugin$a p2){
       boolean b1;
       int i3;
       GrowthUserLoginPluginImpl growthUserLo = this;
       int i = p0;
       Object obj = p2;
       GrowthUserLoginPluginImpl growthUserLo1 = GrowthUserLoginPluginImpl.class;
       if (PatchProxy.isSupport(growthUserLo1) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, GrowthUserLoginPluginImpl.class, "4")) {
          return;
       }
       String str = "activity";
       a.p(p0, str);
       String str1 = "strategy";
       a.p(obj, str1);
       SharedPreferences$Editor obj1 = PatchProxy.apply(null, this, growthUserLo1, "12");
       boolean b = false;
       if (obj1 != PatchProxyResult.class) {
          b1 = obj1.booleanValue();
       }else if(growthUserLo.j == null && growthUserLo.c == null){
          QCurrentUser mE = QCurrentUser.ME;
          a.o(mE, "QCurrentUser.ME");
          if (!mE.isLogined() && (b.a() && this.Ck())) {
             b1 = true;
          }
       }
    label_0060 :
       b1 = false;
       if (b1) {
          if (!PatchProxy.applyVoidTwoRefs(p0, obj, this, growthUserLo1, "3")) {
             h$b uob = h$b.d(7, b);
             ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
             if (i instanceof GifshowActivity) {
                urlPackage.page2 = i.o();
             }
             uob.u(urlPackage);
             ClientEvent$ElementPackage urlPackage1 = new ClientEvent$ElementPackage();
             urlPackage1.action2 = "NEW_BACK_GUIDE_TO_LOGIN_STRATEGY";
             i3 oi3 = i3.f();
             String str2 = p2.n();
             i3 = str2.hashCode();
             if (i3 != -2135445462) {
                if (i3 != -2050220621) {
                   if (i3 == 0x799d89ea && str2.equals("label_growth_single_feed_strategy")) {
                      str2 = String.valueOf(3);
                   }else {
                   label_00d5 :
                      str2 = String.valueOf(b);
                   }
                }else if(str2.equals("label_growth_double_feed_strategy")){
                   str2 = String.valueOf(true);
                }else {
                   goto label_00d5 ;
                }
             }else if(str2.equals("label_growth_double_profile_strategy")){
                str2 = String.valueOf(2);
             }else {
                goto label_00d5 ;
             }
             oi3.d(str1, str2);
             urlPackage1.params = oi3.e();
             uob.k(urlPackage1);
             u1.r0(uob);
          }
          GrowthUserLoginPluginImpl i1 = growthUserLo.i;
          if (i1 == null) {
             a.S("loginBehaviorHelper");
          }
          Objects.requireNonNull(i1);
          d uod = d.class;
          if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), i1, uod, "2")) {
             a.p(p0, str);
             i1.a = true;
             i1.b = b;
             i1.c = b;
             i1.d = b;
             i1.f = m0.d(p0.getClass()).N5();
             d.a(-1712118428).W00(p0, p1, false, null, new e(i1)).subscribe(new h(i1));
          }
          Objects.requireNonNull(b0.c);
          b0.b = true;
          int i2 = a.a[growthUserLo.b.ordinal()];
          if (i2 != 1) {
             if (i2 == 2) {
                obj1 = a.a.edit();
                obj1.putLong("lastUserGrowthLoginTsEveryOneDay", System.currentTimeMillis());
                g.a(obj1);
             }
          }else {
             obj1 = a.a.edit();
             obj1.putLong("lastUserGrowthLoginTsEveryThreeDays", System.currentTimeMillis());
             g.a(obj1);
          }
          this.n();
          p2.reset();
       }
       return;
    }
    public ArrayList RA(){
       return this.f;
    }
    public PresenterV2 RG(l p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, GrowthUserLoginPluginImpl.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "tree");
       PatchProxy.onMethodExit(GrowthUserLoginPluginImpl.class, "11");
       return new f(p0);
    }
    public boolean SD(GrowthUserLoginPlugin$a p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, GrowthUserLoginPluginImpl.class, "5");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       a.p(p0, "strategy");
       this.n();
       GrowthUserLoginPluginImpl ti = this.i;
       if (ti == null) {
          a.S("loginBehaviorHelper");
       }
       Objects.requireNonNull(ti);
       Object obj1 = PatchProxy.applyOneRefs(p0, ti, d.class, "3");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          a.p(p0, "strategy");
          Objects.requireNonNull(b0.c);
          b = (b0.a)? false: p0.g0();
       }
       return b;
    }
    public void U10(boolean p0){
       this.h = p0;
    }
    public boolean hH(){
       return true;
    }
    public void iN(GrowthUserLoginPlugin$UserGrowthLoginConfig p0){
       this.g = p0;
    }
    public boolean isAvailable(){
       return true;
    }
    public final void n(){
       if (PatchProxy.applyVoid(null, this, GrowthUserLoginPluginImpl.class, "14")) {
          return;
       }
       int i = a.b[this.b.ordinal()];
       boolean b = false;
       long l = 0;
       if (i != 1) {
          if (i == 2) {
             l = a.a.getLong("lastUserGrowthLoginTsEveryThreeDays", l);
             this.e = l;
             i = DateUtils.r(l, System.currentTimeMillis());
             if (i < 3) {
                b = true;
             }
             this.c = b;
          }
       }else {
          l = a.a.getLong("lastUserGrowthLoginTsEveryOneDay", l);
          this.d = l;
          if (DateUtils.r(l, System.currentTimeMillis()) < 1) {
             b = true;
          }
          this.c = b;
       }
       return;
    }
    public boolean or(int p0){
       GrowthUserLoginPluginImpl growthUserLo = GrowthUserLoginPluginImpl.class;
       if (PatchProxy.isSupport(growthUserLo)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, growthUserLo, "6");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       growthUserLo = this.i;
       if (growthUserLo == null) {
          a.S("loginBehaviorHelper");
       }
       boolean b = (growthUserLo.a == null || (p0 != 120 && p0 != 119))? true: false;
       return b;
    }
    public void pG(GrowthUserLoginPlugin$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthUserLoginPluginImpl.class, "7")) {
          return;
       }
       a.p(p0, "strategy");
       if (!this.RA().contains(p0)) {
          this.RA().add(p0);
       }
       return;
    }
    public void sI(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, GrowthUserLoginPluginImpl.class, "2")) {
          return;
       }
       GrowthUserLoginPluginImpl ti = this.i;
       if (ti == null) {
          a.S("loginBehaviorHelper");
       }
       Objects.requireNonNull(ti);
       if (!PatchProxy.applyVoid(objArray, ti, d.class, "1")) {
          d e = ti.e;
          if (e != null) {
             e.o();
          }
          ti.d = true;
       }
       return;
    }
    public PresenterV2 uE(String p0,int p1){
       if (PatchProxy.isSupport2(GrowthUserLoginPluginImpl.class, "9")) {
          Object obj = PatchProxy.applyTwoRefsWithListener(p0, Integer.valueOf(p1), this, GrowthUserLoginPluginImpl.class, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "tabID");
       PatchProxy.onMethodExit(GrowthUserLoginPluginImpl.class, "9");
       return new d(p0, p1);
    }
    public GrowthUserLoginPlugin$UserGrowthLoginConfig uT(){
       return this.g;
    }
}
