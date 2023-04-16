package com.kuaishou.merchant.transaction.purchase.presenter.a0$a;
import com.kuaishou.merchant.transaction.purchase.presenter.a0$f;
import com.kuaishou.merchant.transaction.purchase.presenter.a0;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.util.Objects;
import android.view.View;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.merchant.transaction.purchase.model.FollowingInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import jga.f$a;
import jga.f;
import com.yxcorp.gifshow.entity.helper.FollowHelper;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import p74.a;
import o74.a;
import com.google.gson.JsonObject;
import java.lang.Integer;
import java.lang.Number;
import java.lang.System;
import ha0.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;

public class a0$a implements a0$f	// class@00095d
{
    public final a0 a;

    public void a0$a(a0 p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       a0$a obj = PatchProxy.apply(objArray, this, a0$a.class, "2");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.a;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, a0.class, "10");
       boolean b = true;
       if (obj1 != patchProxyRe) {
          b1 = obj1.booleanValue();
       }else {
          a0 t = obj.t;
          b1 = (t != null && !t.getVisibility())? true: false;
       }
       if (!b1 || this.a.y == null) {
          b = false;
       }
       return b;
    }
    public void b(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a0$a.class, "1")) {
          return;
       }
       a0$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, a0.class, "8")) {
          Activity activity = ta.getActivity();
          if (activity instanceof GifshowActivity) {
             a0 r = ta.r;
             if (r == null || TextUtils.x(r.mUID)) {
                a.s(MerchantTransactionLogBiz.PURCHASE, "FollowBarPresenter", "follow: uid null");
             }else {
                f$a uoa = new f$a(ta.r.mUID, activity.Q2());
                uoa.p(true);
                FollowHelper.b(uoa.b());
             }
          }
       }
       return;
    }
    public JsonObject c(){
       Object[] objArray = null;
       JsonObject obj = PatchProxy.apply(objArray, this, a0$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.a.R8()) {
          return objArray;
       }
       obj = new JsonObject();
       obj.a0("is_focus_show", Integer.valueOf(this.a.C));
       obj.a0("is_focus_default", Integer.valueOf(this.a.P8()));
       return obj;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, a0$a.class, "3")) {
          return;
       }
       if (this.a.P8() && this.a.y == null) {
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putLong("merchant_uncheck_follow_shop_time", System.currentTimeMillis());
          g.a(uEditor);
       }
       return;
    }
}
