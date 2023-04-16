package com.yxcorp.gifshow.activity.share.presenter.j;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import f66.i;
import jq.a;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.System;
import oa0.a;
import android.content.SharedPreferences;
import com.kwai.sdk.switchconfig.a;
import java.util.Objects;
import brd.t;
import cx8.h;
import cx8.g;
import cjd.e;
import erd.o;
import com.yxcorp.gifshow.activity.share.presenter.i;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.activity.share.presenter.g;
import com.yxcorp.gifshow.activity.share.presenter.h;
import erd.g;
import crd.b;
import android.view.View;
import ekd.m1;
import android.widget.Button;

public class j extends PresenterV2	// class@0013f6
{
    public String p;
    public Button q;

    public void j(){
       super();
    }
    public void E8(){
       int b;
       j oj = j.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oj, "3")) {
          return;
       }
       Object[] objArray1 = new Object[0];
       a.b().w("PublishRuleTipPresenter", "onBind: get editSession="+this.p, objArray1);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (!PatchProxy.applyVoid(objArray, this, oj, "4")) {
          j obj = PatchProxy.apply(objArray, this, oj, "8");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else if(TextUtils.x(this.p)){
             objArray1 = new Object[0];
             a.b().w("PublishRuleTipPresenter", "needGetWaterMarkResult: mEditSessionId is empty", objArray1);
          }else {
             b = a.t().a("publishRuleShowInterval", 2);
             float f = (float)(System.currentTimeMillis() - a.a.getLong("last_publish_rule_tip_show_time", 0)) / 3600000.00f;
             Object[] objArray3 = new Object[0];
             a.b().w("PublishRuleTipPresenter", "needGetWaterMarkResult: leftHour="+f+" interval="+b, objArray3);
             if (f - (float)b > 0) {
                b = true;
             }
          }
          b = false;
          if (b) {
             obj = this.p;
             Objects.requireNonNull(obj);
             t ot = PatchProxy.applyOneRefs(obj, objArray, oj, "7");
             if (ot != patchProxyRe) {
             }else {
                Object[] objArray2 = new Object[0];
                a.b().w("PublishRuleTipPresenter", "getWaterMarkResult\(\) called with: editSessionId = ["+obj+"]", objArray2);
                ot = g.a().i(obj).map(new e()).map(i.b);
             }
             this.X7(ot.observeOn(d.a).subscribe(new g(this), h.b));
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.b().w("PublishRuleTipPresenter", "doBindView: ", objArray);
       this.q = m1.f(p0, 0x7f0a3647);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, j.class, "1")) {
          return;
       }
       this.p = this.t8("EDIT_SESSION_ID");
       return;
    }
}
