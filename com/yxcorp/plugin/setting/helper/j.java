package com.yxcorp.plugin.setting.helper.j;
import com.yxcorp.gifshow.permission.ContactPermissionHolder;
import xwb.b;
import xwb.c;
import xwb.d;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import android.widget.TextView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.reco.FeedMiscPojo;
import com.kwai.library.widget.button.SlipSwitchButton;
import u07.t$a;
import android.app.Activity;
import pgd.n;
import u07.u;
import com.yxcorp.plugin.setting.helper.b;
import com.kwai.library.widget.popup.common.c$b;
import u07.t;
import u07.j;
import com.kwai.library.widget.button.SlipSwitchButton$b;
import com.yxcorp.plugin.setting.helper.f;
import java.lang.Runnable;
import brd.t;
import h33.m;
import java.util.concurrent.Callable;
import com.yxcorp.plugin.setting.helper.e;
import erd.o;
import t45.d;
import brd.z;
import java.lang.Integer;
import pgd.l;
import com.yxcorp.plugin.setting.helper.i;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import pgd.r;
import pgd.s;
import erd.g;
import com.yxcorp.plugin.setting.helper.j$a;
import ok.h;
import com.yxcorp.plugin.setting.helper.j$e;
import com.yxcorp.plugin.setting.helper.a;
import oe6.a;
import pgd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import com.yxcorp.plugin.setting.helper.j$b;
import com.yxcorp.gifshow.bean.ContactInfo;
import com.yxcorp.gifshow.b;
import cjd.e;
import com.yxcorp.plugin.setting.helper.j$c;
import com.yxcorp.plugin.setting.helper.j$d;
import java.lang.Exception;

public class j	// class@0008c2
{
    public int a;
    public GifshowActivity b;
    public h c;
    public String d;
    public static final ContactPermissionHolder e;

    static {
       j.e = new ContactPermissionHolder(new b(new c()));
    }
    public void j(GifshowActivity p0){
       super();
       this.b = p0;
    }
    public static void d(TextView p0,boolean p1){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, oj, "4")) {
          return;
       }
       if (p1) {
          p0.setText(R.string.arg_RES_7f1046fd);
       }else {
          p0.setText(R.string.arg_RES_7f1046cf);
       }
       return;
    }
    public static boolean g(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, j.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (("personalise_reco").equals(p0)) {
          if (!FeedMiscPojo.isUserFeedRecommendEnabled() || !FeedMiscPojo.isDeviceFeedRecommendEnabled()) {
             b = false;
          }
          return b;
       }else if(("programmatic_ad").equals(p0)){
          if (!FeedMiscPojo.isUserCommercialRecommendEnabled() || !FeedMiscPojo.isDeviceCommercialRecommendEnabled()) {
             b = false;
          }
          return b;
       }else {
          return false;
       }
    }
    public final void a(SlipSwitchButton p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "13")) {
          return;
       }
       t$a uoa = new t$a(this.b);
       uoa.W0(R.string.arg_RES_7f1003a7);
       uoa.y0(R.string.arg_RES_7f104940);
       uoa.S0(R.string.arg_RES_7f1012ab);
       uoa.Q0(R.string.cancel);
       uoa.t0(new n(this, p0));
       uoa.u0(new b(this, p0));
       uoa.z(false);
       j.d(uoa);
       return;
    }
    public void b(SlipSwitchButton p0,boolean p1){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, oj, "9")) {
          return;
       }
       p0.setOnSwitchChangeListener(null);
       p0.setSwitch(p1);
       p0.setOnSwitchChangeListener(p0.getOnSwitchChangeListener());
       return;
    }
    public void c(SlipSwitchButton p0,boolean p1,TextView p2){
       if (PatchProxy.isSupport(j.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, this, j.class, "10")) {
          return;
       }
       if (p0 != null) {
          this.b(p0, p1);
       }
       if (p2 != null) {
          j.d(p2, p1);
       }
       return;
    }
    public final void e(SlipSwitchButton p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "15")) {
          return;
       }
       j.e.h(this.b, new f(this, p0));
       return;
    }
    public final t f(){
       Object obj = PatchProxy.apply(null, this, j.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.fromCallable(m.b).onErrorReturn(e.b).subscribeOn(d.c).observeOn(d.a);
    }
    public boolean h(int p0,SlipSwitchButton p1){
       j oj = j.class;
       if (PatchProxy.isSupport(oj)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, oj, "11");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       switch (p0){
           case 141:
             if (!PatchProxy.applyVoidOneRefs(p1, this, oj, "12")) {
                t$a uoa = new t$a(this.b);
                uoa.W0(R.string.arg_RES_7f104944);
                uoa.y0(R.string.arg_RES_7f104945);
                uoa.S0(R.string.arg_RES_7f104942);
                uoa.Q0(R.string.cancel);
                uoa.t0(new l(this, p1));
                uoa.u0(new i(this, p1));
                uoa.z(false);
                j.d(uoa);
             }
             break;
           case 142:
             this.e(p1);
             break;
           case 143:
             this.a(p1);
             break;
           default:
             return false;
       }
       return true;
    }
    public boolean i(){
       Object obj = PatchProxy.apply(null, this, j.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return TextUtils.n(this.d, "not_recommend_to_contacts");
    }
    public void j(SlipSwitchButton p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "18")) {
          return;
       }
       t$a uoa = new t$a(this.b);
       uoa.W0(R.string.arg_RES_7f104943);
       uoa.S0(R.string.arg_RES_7f1042cc);
       uoa.Q0(R.string.cancel);
       uoa.t0(new r(this, p0));
       uoa.u0(new s(this, p0));
       j.d(uoa);
       return;
    }
    public void k(SlipSwitchButton p0,String p1,boolean p2){
       if (PatchProxy.isSupport(j.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, j.class, "1")) {
          return;
       }
       this.l(p0, p1, p2, null);
       return;
    }
    public void l(SlipSwitchButton p0,String p1,boolean p2,g p3){
       if (PatchProxy.isSupport(j.class) && PatchProxy.applyVoidFourRefs(p0, p1, Boolean.valueOf(p2), p3, this, j.class, "2")) {
          return;
       }
       j$a uoa = new j$a(this, p1, p2, p0, p0.getSwitch(), p3);
       this.c = v0;
       v0.apply(null);
       return;
    }
    public void m(TextView p0,SlipSwitchButton p1,String p2,boolean p3){
       if (PatchProxy.isSupport(j.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, j.class, "19")) {
          return;
       }
       this.d = p2;
       j$e uoe = new j$e(this, p2, p3, p1, p0);
       this.c = v0;
       v0.apply(null);
       return;
    }
    public void n(SlipSwitchButton p0,String p1,boolean p2,TextView p3,g p4){
       Object[] objArray;
       j oj = this;
       object oobject = p0;
       object oobject1 = p1;
       if (PatchProxy.isSupport(j.class)) {
          objArray = new Object[]{oobject,oobject1,Boolean.valueOf(p2),p3,p4};
          if (PatchProxy.applyVoid(objArray, this, j.class, "7")) {
             return;
          }
       }
       oj.d = oobject1;
       a uoa = new a(this, p1, p2, p0, p0.getSwitch(), p3, p4);
       oj.c = v13;
       objArray = null;
       if (p2 && ("not_recommend_to_contacts").equals(oobject1)) {
          Object obj = PatchProxy.apply(objArray, this, j.class, "8");
          boolean obj1 = (obj != PatchProxyResult.class)? obj.booleanValue(): TextUtils.x(a.f()) ^ 1;
          if (!obj1) {
             oj.a = 143;
             this.a(p0);
          }else if(j.e.d()){
             this.f().subscribe(new g(this, p0), Functions.d());
          }else {
             oj.c.apply(objArray);
          }
       }else {
          oj.c.apply(objArray);
       }
       return;
    }
    public void o(TextView p0,String p1,boolean p2,g p3,boolean p4){
       Object[] objArray;
       j oj = j.class;
       if (PatchProxy.isSupport(oj)) {
          objArray = new Object[]{p0,p1,Boolean.valueOf(p2),null,Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, oj, "3")) {
             return;
          }
       }
       j$b uob = new j$b(this, p1, p2, p4, p0, null);
       this.c = PatchProxy.applyVoid(objArray, this, oj, "3");
       PatchProxy.applyVoid(objArray, this, oj, "3").apply(null);
       return;
    }
    public final void p(ContactInfo p0,SlipSwitchButton p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, j.class, "16")) {
          return;
       }
       if (!j.e.d()) {
          return;
       }
       try{
          b.e(p0).map(new e()).subscribe(new j$c(this), new j$d(this, p1));
       }catch(java.lang.Exception e3){
          e3.printStackTrace();
       }
       return;
    }
}
