package com.yxcorp.login.initModule.d;
import java.lang.Runnable;
import androidx.fragment.app.FragmentActivity;
import java.lang.Object;
import v0d.i;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Intent;
import android.app.Activity;
import android.net.Uri;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.buildconfig.BuildConfig;
import java.util.Set;
import java.util.List;
import com.kwai.framework.model.user.QCurrentUser;
import java.util.HashMap;
import fg6.a;
import com.google.gson.Gson;
import tkd.b;
import tkd.d;
import ou5.b;
import com.kwai.feature.api.social.login.model.LoginParams$a;
import com.kwai.feature.api.social.login.model.LoginParams;
import v0d.h;
import android.content.Context;
import n3d.a;

public final class d implements Runnable	// class@001ae0
{
    public final FragmentActivity b;

    public void d(FragmentActivity p0){
       this.b = p0;
    }
    public final void run(){
       d tb = this.b;
       i oi = i.class;
       String obj = null;
       if (PatchProxy.applyVoidOneRefs(tb, obj, oi, "1")) {
       }else {
          Uri data = tb.getIntent().getData();
          if (data != null) {
             HashMap obj1 = PatchProxy.applyOneRefs(data, obj, oi, "2");
             boolean b = false;
             if (obj1 != PatchProxyResult.class) {
                b = obj1.booleanValue();
             }else {
                String str = TextUtils.I(data.getHost());
                obj = TextUtils.I(data.getScheme());
                String str1 = TextUtils.I(data.getPath());
                str1 = (("/required").equals(str1) || ("/optional").equals(str1))? 1: 0;
                QCurrentUser qCurrentUser = (BuildConfig.a.contains(obj) && i.a.contains(str))? 1: null;
                if (qCurrentUser && (QCurrentUser.me().isLogined() || !str1)) {
                   b = true;
                }
             }
             if (!b) {
                obj1 = new HashMap();
                obj1.put("login_extra", data.getQueryParameter("login_extra"));
                obj1.put("url", data.getQueryParameter("url"));
                LoginParams$a uoa = new LoginParams$a();
                uoa.b(TextUtils.I(a.a.q(obj1)));
                LoginParams loginParams = uoa.a();
                d.a(-1712118428).x00(tb, 141, loginParams, new h(tb, data));
             }
          }
       }
       return;
    }
}
