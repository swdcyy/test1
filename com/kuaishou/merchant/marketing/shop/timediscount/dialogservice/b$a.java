package com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.b$a;
import z94.b;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.b;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.model.LiveMerchantContainerDataList;
import java.util.Objects;
import com.kuaishou.merchant.marketing.base.activitydispather.model.LiveMerchantPendentModel;
import fg6.a;
import com.google.gson.Gson;
import com.kuaishou.merchant.marketing.shop.MerchantMarketingShopLogBiz;
import p74.a;
import o74.a;
import y94.c;
import com.kwai.framework.model.user.User;
import fq5.b;
import da4.a;
import com.yxcorp.gifshow.model.CDNUrl;
import java.util.ArrayList;
import x94.a;
import java.util.List;
import java.lang.Integer;
import java.lang.Boolean;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.KwaiDialogFragment;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import ca4.a;
import androidx.lifecycle.ViewModel;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.LiveMerchantContainerServiceDialog;

public class b$a implements b	// class@001c15
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public void a(String p0){
       int len;
       int i;
       object oobject;
       b$a ta1;
       c uoc;
       b v;
       String str;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "4")) {
          return;
       }
       LiveMerchantContainerDataList liveMerchant = new LiveMerchantContainerDataList();
       b$a ta = this.a;
       Objects.requireNonNull(ta);
       Object obj = PatchProxy.applyOneRefs(p0, ta, uob, "9");
       if (obj != patchProxyRe) {
       }else {
          try{
             obj = a.a.h(p0, LiveMerchantPendentModel[].class);
          }catch(java.lang.Exception e0){
             obj = null;
          }
       }
    }
    public void b(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
          return;
       }
       b u = this.a.u;
       if (u == null) {
          return;
       }
       u.remove(p0);
       return;
    }
    public void c(LiveMerchantContainerDataList p0,c p1,int p2,boolean p3){
       if (PatchProxy.isSupport(b$a.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Boolean.valueOf(p3), this, b$a.class, "3")) {
          return;
       }
       this.a.P8(p0, p1, p2, p3);
       return;
    }
    public boolean d(){
       b obj = PatchProxy.apply(null, this, b$a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a.p;
       if (obj == null || obj.getDialog() == null) {
          return false;
       }
       return this.a.p.getDialog().isShowing();
    }
    public void dismiss(){
       if (PatchProxy.applyVoid(null, this, b$a.class, "7")) {
          return;
       }
       b p = this.a.p;
       if (p != null) {
          p.dismiss();
       }
       return;
    }
    public void e(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "2")) {
          return;
       }
       b$a ta = this.a;
       if (ta.u == null) {
          ta.u = new ArrayList();
       }
       if (this.a.u.contains(p0)) {
          return;
       }else {
          this.a.u.add(p0);
          return;
       }
    }
    public void f(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "8")) {
          return;
       }
       if (!this.d()) {
          return;
       }
       a uoa = ViewModelProviders.of(this.a.p).get(a.class);
       if (uoa.b.contains(p0)) {
          return;
       }
       uoa.b.add(p0);
       return;
    }
    public boolean g(int p0){
       b obj;
       b$a uoa = b$a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "6");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.a.p;
       boolean b = false;
       if (obj == null) {
          return b;
       }else if(obj.z == p0){
          b = true;
       }
       return b;
    }
}
