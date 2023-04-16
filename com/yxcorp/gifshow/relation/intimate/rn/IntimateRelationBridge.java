package com.yxcorp.gifshow.relation.intimate.rn.IntimateRelationBridge;
import com.kuaishou.krn.base.KrnBridge;
import com.facebook.react.bridge.ReactApplicationContext;
import crd.a;
import com.yxcorp.gifshow.util.rx.RxBus;
import lx5.d;
import java.lang.Class;
import brd.t;
import com.yxcorp.gifshow.relation.intimate.rn.a;
import erd.r;
import com.yxcorp.gifshow.relation.intimate.rn.IntimateRelationBridge$b;
import com.facebook.react.bridge.ReactContext;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import lx5.c;
import com.yxcorp.gifshow.relation.intimate.rn.IntimateRelationBridge$c;
import lx5.f;
import com.yxcorp.gifshow.relation.intimate.rn.IntimateRelationBridge$d;
import lx5.b;
import com.yxcorp.gifshow.relation.intimate.rn.IntimateRelationBridge$a;
import com.yxcorp.gifshow.relation.intimate.rn.IntimateRNModel;
import com.facebook.react.bridge.Promise;
import java.lang.Boolean;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import com.yxcorp.gifshow.relation.intimate.model.IntimateDeleteResponse;
import android.app.Activity;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.relation.intimate.helper.i;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import a17.g;
import lnc.a1;
import com.kwai.library.widget.popup.sheet.SheetItemStatus;
import java.lang.CharSequence;
import a17.c$a;
import a17.f;
import com.yxcorp.utility.TextUtils;
import java.util.List;
import bbc.q;
import a17.b$b;
import bbc.b;
import com.kwai.library.widget.popup.common.PopupInterface$d;
import com.kwai.library.widget.popup.common.c$b;
import bbc.x;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import dbc.d;
import java.util.Objects;
import dbc.f;
import dbc.e;
import dbc.c;
import com.kwai.robust.PatchProxyResult;
import fg6.a;
import com.google.gson.Gson;
import java.lang.StringBuilder;
import cbc.a;
import dbc.b;
import com.facebook.react.bridge.BaseJavaModule;
import lnc.b9;
import dbc.g;
import java.lang.Runnable;
import ekd.k1;
import lj0.c;
import lj0.d;
import bi5.a;

public class IntimateRelationBridge extends KrnBridge	// class@00191d
{
    public final a mDisposable;

    public void IntimateRelationBridge(ReactApplicationContext p0){
       super(p0);
       a uoa = new a();
       this.mDisposable = uoa;
       RxBus f = RxBus.f;
       uoa.c(f.f(d.class).filter(a.b).subscribe(new IntimateRelationBridge$b(p0), Functions.d()));
       uoa.c(f.f(c.class).subscribe(new IntimateRelationBridge$c(p0), Functions.d()));
       uoa.c(f.f(f.class).subscribe(new IntimateRelationBridge$d(p0), Functions.d()));
       uoa.c(f.f(b.class).subscribe(new IntimateRelationBridge$a(p0), Functions.d()));
    }
    public static void a(IntimateRelationBridge p0,IntimateRNModel p1){
       p0.lambda$popup$1(p1);
    }
    public static void lambda$approve$2(Promise p0,Boolean p1){
       p0.resolve("success");
    }
    public static void lambda$approveChange$3(Promise p0,Boolean p1){
       p0.resolve("success");
    }
    public static void lambda$changeShowStatus$4(Promise p0,ActionResponse p1){
       p0.resolve("success");
    }
    public static void lambda$delete$5(Promise p0,IntimateDeleteResponse p1){
       p0.resolve("success");
    }
    public static boolean lambda$new$0(d p0){
       return p0.b;
    }
    private void lambda$popup$1(IntimateRNModel p0){
       int i;
       GifshowActivity currentActiv = this.getCurrentActivity();
       IntimateRNModel mUserId = p0.mUserId;
       IntimateRNModel mUserName = p0.mUserName;
       p0 = p0.mShowStatus;
       i oi = i.class;
       i = 2;
       if (PatchProxy.isSupport(oi)) {
          Object[] objArray = new Object[]{currentActiv,mUserId,mUserName,Boolean.valueOf(p0),Integer.valueOf(6)};
          if (!PatchProxy.applyVoid(objArray, null, oi, "11")) {
          label_003a :
             if (currentActiv != null) {
                ArrayList uArrayList = new ArrayList();
                String str = (p0 != null)? a1.p(R.string.arg_RES_7f10174b): a1.p(R.string.arg_RES_7f10174c);
                uArrayList.add(new g(str, SheetItemStatus.Enable));
                uArrayList.add(new g(a1.p(R.string.arg_RES_7f10174d), SheetItemStatus.Highlight));
                c$a uoa = f.a(new c$a(currentActiv));
                if (!TextUtils.x(mUserName)) {
                   Object[] objArray1 = new Object[i];
                   objArray1[0] = a1.p(0x7f101d1c);
                   objArray1[1] = mUserName;
                   uoa.n0(String.format(a1.p(R.string.arg_RES_7f104fc6), objArray1));
                }
                uoa.j0(uArrayList);
                uoa.h0(a1.p(R.string.cancel));
                uoa.i0(new q(p0, currentActiv, mUserId, 6));
                uoa.J(new b(currentActiv));
                uoa.p();
                uoa.Y(new x(currentActiv));
             }
          }
       }else {
          goto label_003a ;
       }
       return;
    }
    public void approve(String p0,Promise p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, IntimateRelationBridge.class, "2")) {
          return;
       }
       String name = this.getName();
       ReactApplicationContext reactApplica = this.getReactApplicationContext();
       String str = "approve";
       try{
          this.reportAndCheck(name, str, reactApplica);
          IntimateRNModel intimateRNMo = this.checkParams(p0, p1);
          if (intimateRNMo == null) {
             return;
          }else {
             IntimateRNModel mIntimateTyp = intimateRNMo.mIntimateType;
             if (mIntimateTyp <= null) {
                p1.reject("-2", "intimate type invalid");
                return;
             }else {
                Objects.requireNonNull(p1);
                i.c(intimateRNMo.mUserId, mIntimateTyp, intimateRNMo.mShowStatus, intimateRNMo.mProposeInfo, new d(p1), new f(p1));
             }
          }
       }catch(java.lang.Exception e0){
          p1.reject("-6", "parse params error");
       }
       return;
    }
    public void approveChange(String p0,Promise p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, IntimateRelationBridge.class, "3")) {
          return;
       }
       String name = this.getName();
       ReactApplicationContext reactApplica = this.getReactApplicationContext();
       String str = "approveChange";
       try{
          this.reportAndCheck(name, str, reactApplica);
          IntimateRNModel intimateRNMo = this.checkParams(p0, p1);
          if (intimateRNMo == null) {
             return;
          }else {
             IntimateRNModel mIntimateTyp = intimateRNMo.mIntimateType;
             if (mIntimateTyp <= null) {
                p1.reject("-2", "intimate type invalid");
                return;
             }else {
                Objects.requireNonNull(p1);
                i.a(intimateRNMo.mUserId, mIntimateTyp, intimateRNMo.mShowStatus, intimateRNMo.mSource, new e(p1), new f(p1));
             }
          }
       }catch(java.lang.Exception e0){
          p1.reject("-6", "parse params error");
       }
       return;
    }
    public void changeShowStatus(String p0,Promise p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, IntimateRelationBridge.class, "4")) {
          return;
       }
       String name = this.getName();
       ReactApplicationContext reactApplica = this.getReactApplicationContext();
       String str = "changeShowStatus";
       try{
          this.reportAndCheck(name, str, reactApplica);
          IntimateRNModel intimateRNMo = this.checkParams(p0, p1);
          if (intimateRNMo == null) {
             return;
          }else {
             Objects.requireNonNull(p1);
             i.d(intimateRNMo.mUserId, intimateRNMo.mShowStatus, intimateRNMo.mSource, new c(p1), new f(p1));
          }
       }catch(java.lang.Exception e0){
          p1.reject("-6", "parse params error");
       }
       return;
    }
    public final IntimateRNModel checkParams(String p0,Promise p1){
       IntimateRNModel obj = PatchProxy.applyTwoRefs(p0, p1, this, IntimateRelationBridge.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.a.h(p0, IntimateRNModel.class);
       a.a("approve params = "+p0+"; model = "+obj);
       if (obj == null) {
          p1.reject("-6", "parse params error");
          return null;
       }else if(TextUtils.x(obj.mUserId)){
          p1.reject("-1", "user id invalid");
          return null;
       }else {
          return obj;
       }
    }
    public void delete(String p0,Promise p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, IntimateRelationBridge.class, "5")) {
          return;
       }
       String name = this.getName();
       ReactApplicationContext reactApplica = this.getReactApplicationContext();
       String str = "delete";
       try{
          this.reportAndCheck(name, str, reactApplica);
          IntimateRNModel intimateRNMo = this.checkParams(p0, p1);
          if (intimateRNMo == null) {
             return;
          }else {
             Objects.requireNonNull(p1);
             i.h(intimateRNMo.mUserId, intimateRNMo.mSource, new b(p1), new f(p1));
          }
       }catch(java.lang.Exception e0){
          p1.reject("-6", "parse params error");
       }
       return;
    }
    public String getName(){
       return "KRNIntimateRelation";
    }
    public void onCatalystInstanceDestroy(){
       if (PatchProxy.applyVoid(null, this, IntimateRelationBridge.class, "8")) {
          return;
       }
       super.onCatalystInstanceDestroy();
       b9.a(this.mDisposable);
       return;
    }
    public void popup(String p0,Promise p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, IntimateRelationBridge.class, "1")) {
          return;
       }
       String name = this.getName();
       ReactApplicationContext reactApplica = this.getReactApplicationContext();
       String str = "popup";
       try{
          this.reportAndCheck(name, str, reactApplica);
          IntimateRNModel intimateRNMo = a.a.h(p0, IntimateRNModel.class);
          a.a("popup params = "+p0+"; model = "+intimateRNMo);
          if (intimateRNMo == null) {
             p1.reject("-6", "parse params error");
             return;
          }else if(TextUtils.x(intimateRNMo.mUserId)){
             p1.reject("-1", "user id invalid");
             return;
          }else if(this.getCurrentActivity() instanceof GifshowActivity){
             p1.resolve("success");
             k1.o(new g(this, intimateRNMo));
          }
       }catch(java.lang.Exception e0){
          p1.reject("-6", e0);
       }
       return;
    }
    public final void reportAndCheck(String p0,String p1,ReactApplicationContext p2){
       String str1;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, IntimateRelationBridge.class, "7")) {
          return;
       }
       c uoc = d.a(p2);
       String str = "";
       if (uoc != null) {
          str = uoc.b();
          str1 = uoc.f();
       }else {
          str1 = str;
       }
       a.a(p0, p1, str, str1);
       return;
    }
}
