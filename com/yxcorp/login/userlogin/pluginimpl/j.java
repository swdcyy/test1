package com.yxcorp.login.userlogin.pluginimpl.j;
import erd.g;
import com.yxcorp.login.userlogin.pluginimpl.LoginPluginImpl;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import java.util.Map;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import com.yxcorp.retrofit.model.KwaiException;
import androidx.fragment.app.Fragment;
import njd.a;
import com.yxcorp.login.model.LogoutResponse;
import h3b.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.String;
import oe6.g;
import b3d.g0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import o1d.j;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import tkd.b;
import tkd.d;
import ou5.b;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import d2d.w;
import ov5.b;
import java.lang.Boolean;
import o1d.a;

public final class j implements g	// class@001b9c
{
    public final LoginPluginImpl b;
    public final ProgressFragment c;
    public final Map d;
    public final QCurrentUser e;
    public final g f;

    public void j(LoginPluginImpl p0,ProgressFragment p1,Map p2,QCurrentUser p3,g p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void accept(Object p0){
       SharedPreferences a;
       Object obj;
       j tb = this.b;
       j tc = this.c;
       j td = this.d;
       j te = this.e;
       j tf = this.f;
       Objects.requireNonNull(tb);
       if (p0 instanceof KwaiException) {
          if (tc.isAdded()) {
             tc.dismiss();
          }
          if (p0.mErrorCode == 721) {
             try{
                a = a.a;
                SharedPreferences$Editor uEditor = a.edit();
                uEditor.putBoolean("LogoutShownSetPasswordDialog", true);
                g.a(uEditor);
                SharedPreferences$Editor uEditor1 = a.edit();
                uEditor1.putString("reset_password_token", p0.mResponse.a().mResetToken);
                g.a(uEditor1);
                obj = null;
                if (!PatchProxy.applyVoidOneRefs(td, obj, g0.class, "1") && TextUtils.x(td.get("gifshow_api_service_token"))) {
                   g0.c();
                }
             }catch(java.lang.Exception e0){
                g0.c();
             }
             te.restoreUserPreferenceValues(td);
             int i = 4;
             int i1 = 1451;
             if (!PatchProxy.isSupport(j.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(i), Integer.valueOf(i1), null, null, j.class, "1")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action = i1;
                u1.u0(i, uElementPack, obj);
             }
             d.a(-1712118428).m50(ActivityContext.g().e(), new w(tb, tf));
          label_00c0 :
             return;
          }
       }
       tb.q0();
       tf.accept(Boolean.FALSE);
       a.e();
       goto label_00c0 ;
    }
}
