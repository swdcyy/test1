package com.yxcorp.login.userlogin.c;
import ov5.c;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import com.kwai.feature.api.social.login.model.BindPhoneParams;
import n3d.a;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import com.kwai.feature.api.social.login.model.PrePhoneNumModel;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.login.userlogin.fragment.PhoneOneKeyBindDialog;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import w1d.f;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.login.bind.fragment.BindPhoneDialog;
import w1d.e;

public final class c implements c	// class@001b22
{
    public final ProgressFragment a;
    public final BindPhoneParams b;
    public final a c;
    public final Context[] d;

    public void c(ProgressFragment p0,BindPhoneParams p1,a p2,Context[] p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final void a(boolean p0,Object p1,String p2){
       c tb = this.b;
       c tc = this.c;
       c td = this.d;
       p1 = PatchProxyResult.class;
       this.a.dismiss();
       if (p0) {
          PhoneOneKeyBindDialog phoneOneKeyB = PatchProxy.applyTwoRefs(tb, tc, null, PhoneOneKeyBindDialog.class, "1");
          if (phoneOneKeyB != p1) {
          }else {
             phoneOneKeyB = new PhoneOneKeyBindDialog();
             phoneOneKeyB.s = tb;
             phoneOneKeyB.v = tc;
          }
          k1.o(new f(phoneOneKeyB, td));
       }else {
          BindPhoneDialog uBindPhoneDi = PatchProxy.applyTwoRefs(tb, tc, null, BindPhoneDialog.class, "1");
          if (uBindPhoneDi != p1) {
          }else {
             uBindPhoneDi = new BindPhoneDialog();
             uBindPhoneDi.s = tb;
             uBindPhoneDi.u = tc;
          }
          k1.o(new e(uBindPhoneDi, td));
       }
       return;
    }
}
