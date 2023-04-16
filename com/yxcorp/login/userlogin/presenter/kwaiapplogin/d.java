package com.yxcorp.login.userlogin.presenter.kwaiapplogin.d;
import u45.a;
import com.yxcorp.login.userlogin.presenter.kwaiapplogin.e;
import java.lang.Object;
import com.kwai.auth.common.InternalResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import h3b.b;
import java.lang.StringBuilder;
import q87.c;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.HashMap;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.util.Objects;
import p1d.b;
import q1d.a;
import java.util.Map;
import brd.t;
import j2d.k;
import com.yxcorp.login.userlogin.presenter.kwaiapplogin.c;
import erd.g;
import crd.b;
import java.lang.Integer;
import com.yxcorp.gifshow.model.response.login.LoginUserResponse;
import k2b.e0;
import com.kwai.feature.api.social.login.model.LoginParams;
import o1d.h;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;

public class d implements a	// class@001bc5
{
    public final e a;

    public void d(e p0){
       this.a = p0;
       super();
    }
    public void a(InternalResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       String code = p0.getCode();
       Object[] objArray = new Object[0];
       b.C().s("KWAI_AUTH", "认证成功 code:"+code+"  token:"+p0.getAccessToken()+"command:"+p0.getCommand(), objArray);
       if (this.a.getActivity() == null) {
          return;
       }
       HashMap hashMap = new HashMap();
       hashMap.put("code", code);
       GifshowActivity activity = this.a.getActivity();
       d ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidTwoRefs(activity, hashMap, ta, e.class, "8")) {
          a.a(11).b(activity, hashMap).subscribe(new k(ta), new c(ta));
       }
       return;
    }
    public void b(String p0,int p1,String p2){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, d.class, "2")) {
          return;
       }
       this.a.b9();
       d ta = this.a;
       h.a(null, p1, p2, 8, ta.t, ta.s);
       Object[] objArray = new Object[0];
       b.C().t("KWAI_AUTH", "认证失败  code:"+p1+"  errorMsg:"+p2, objArray);
       return;
    }
    public void onCancel(){
       if (PatchProxy.applyVoid(null, this, d.class, "3")) {
          return;
       }
       this.a.b9();
       d ta = this.a;
       h.a(null, 0, "", 9, ta.t, ta.s);
       i.d(R.style.arg_RES_7f110668, a1.p(R.string.arg_RES_7f1040ad));
       Object[] objArray = new Object[0];
       b.C().s("KWAI_AUTH", "认证取消", objArray);
       return;
    }
}
