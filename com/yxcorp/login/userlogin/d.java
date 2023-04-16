package com.yxcorp.login.userlogin.d;
import w1d.h;
import q3d.a;
import android.content.Context;
import com.kwai.feature.api.social.login.model.BindPhoneParams;
import n3d.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import n3d.b;
import w1d.g;
import android.content.Intent;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import android.app.Activity;
import com.kwai.framework.activitycontext.ActivityContext;
import com.kwai.feature.api.social.login.model.BindPhoneParams$FirstStepPageStyle;
import java.lang.Enum;
import o56.a;
import com.yxcorp.login.userlogin.c;
import ov5.c;
import z2d.f;
import com.yxcorp.login.bind.OriginBindPhoneActivity;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import w1d.d;

public class d extends a implements h	// class@001b23
{

    public void d(){
       super();
    }
    public final h Z(Context p0,BindPhoneParams p1,a p2){
       Activity uActivity;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, d.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       this.h0();
       obj = this.b;
       obj.a = p0;
       Intent intent = PatchProxy.applyThreeRefs(p0, p1, p2, null, g.class, "1");
       if (intent != patchProxyRe) {
       }else {
          ProgressFragment progressFrag = new ProgressFragment();
          if (p0 == null || !p0 instanceof Activity) {
             uActivity = ActivityContext.g().e();
          }
          Context[] uContextArra = new Context[]{uActivity};
          if (BindPhoneParams$FirstStepPageStyle.PHONE_ONEKEY_BIND_DIALOG_FIRST.equals(p1.mFirstStepPageStyle)) {
             g.a(uActivity, progressFrag, "bindpage_loading");
             f.s(a.B, new c(progressFrag, p1, p2, uContextArra), 0);
          }else if(BindPhoneParams$FirstStepPageStyle.ORIGIN_BIND_PAGE_FIRST.equals(p1.mFirstStepPageStyle)){
             intent = new Intent(uActivity, OriginBindPhoneActivity.class);
             SerializableHook.putExtra(intent, "bind_phone_params", p1);
          }else {
             g.a(uActivity, progressFrag, "binddialog_loading");
             f.s(a.B, new d(progressFrag, uContextArra, p1, p2), 0);
          }
          intent = null;
       }
       obj.e = intent;
       return this;
    }
}
